package projecte;

import java.util.Arrays;

/**
 * Proves addicionals executables amb java projecte.ProvesAutomatiques.
 * No necessiten JUnit ni cap dependencia externa.
 */
public class ProvesAutomatiques {

    private static int proves = 0;

    public static void main(String[] args) {
        provarUnitatsIMedicions();
        provarSensorsILlindars();
        provarHistoricPerUnitatIErrors();
        provarSetLecturaIManteniment();
        provarLimitHistoricIObsolescencia();
        System.out.println("OK: " + proves + " comprovacions superades.");
    }

    private static void comprovar(boolean condicio, String missatge) {
        proves++;
        if (!condicio) {
            throw new AssertionError("ERROR a la prova: " + missatge);
        }
    }

    private static void proper(double actual, double esperat, String missatge) {
        comprovar(Math.abs(actual - esperat) < 1e-9, missatge
                + " (actual=" + actual + ", esperat=" + esperat + ")");
    }

    private static void provarUnitatsIMedicions() {
        UnitatMesura altraCelsius = new UnitatMesura("Graus Celsius", "ºC");
        comprovar(UnitatMesura.CELSIUS.equals(altraCelsius), "Igualtat per contingut de les unitats");
        comprovar(UnitatMesura.CELSIUS.hashCode() == altraCelsius.hashCode(),
                "Hash coherent amb equals de les unitats");
        Medicio m = new Medicio(20.5, altraCelsius);
        proper(m.getValor(), 20.5, "Valor de la medicio");
        comprovar(m.getDataMedicio() != null, "Moment de la medicio");
        comprovar(m.toString().contains("ºC"), "toString mostra el simbol");
    }

    private static void provarSensorsILlindars() {
        SensorTemperatura t = new SensorTemperatura(12);
        SensorHumitat h = new SensorHumitat(13);
        SensorCO2 c = new SensorCO2(14);

        proper(t.getLimMin(), -25.0, "Limit minim de temperatura");
        proper(t.getLimMax(), 100.0, "Limit maxim de temperatura");
        proper(h.getLimMax(), 100.0, "Limit maxim d'humitat");
        proper(c.getLimMax(), 10000.0, "Limit maxim de CO2");
        comprovar(t.foraLlindars(90.1) && !t.foraLlindars(90),
                "Llindar superior de temperatura");
        comprovar(t.foraLlindars(-22.6) && !t.foraLlindars(-22.5),
                "Llindar inferior de temperatura");
        comprovar(h.foraLlindars(80.1) && !h.foraLlindars(80), "Llindar humitat");
        comprovar(c.foraLlindars(1000.1) && !c.foraLlindars(1000), "Llindar CO2");
        comprovar(t.getTipusSensor().equals("SensorTemperatura"), "Nom de la classe de sensor");
        comprovar(t.equals(new SensorCO2(12)), "Sensors iguals per ID encara que tinguin diferent tipus");
        comprovar(t.hashCode() == new SensorCO2(12).hashCode(), "HashCode coherent");
        Medicio lectura = t.novaMesura();
        comprovar(lectura != null && lectura.getUnitatMesura().equals(UnitatMesura.CELSIUS),
                "Nova lectura conserva la unitat");
        comprovar(t.getUltimaMedicio() == lectura, "Ultima lectura del sensor");
        comprovar(t.toString().contains(lectura.toString()), "toString sensor conte ultima lectura");
    }

    private static void provarHistoricPerUnitatIErrors() {
        UnitatMesura a = new UnitatMesura("Prova A", "A");
        UnitatMesura b = new UnitatMesura("Prova B", "B");
        SensorProva sa = new SensorProva(100, a, 90, 10, 10, 10, 10, 10, 10, 10, 15);
        SensorProvaB sb = new SensorProvaB(101, b, 100, 200, 150, 100, 200, 150, 100, 200, 150);
        PuntControl pc = new PuntControl(1, new Localitzacio("Proves", 0, 0, 0),
                new Sensor[] { sa, sb });

        comprovar(pc.getSensor(100) == sa, "Consulta del sensor per ID");
        comprovar(pc.getSensor(999) == null, "Consulta d'ID inexistent");
        comprovar(pc.getSensorsEstacio().length == 2, "Nombre de sensors");
        for (int i = 0; i < 8; i++) {
            ResultatMesura[] resultats = pc.ferMedicioiGuardar();
            comprovar(resultats.length == 2 && resultats[0].getMedicio() != null,
                    "Resultat per sensor i ordre original");
        }
        comprovar(pc.getTotalMesuresUnitat(a) == 8, "8 lectures de la unitat A");
        comprovar(pc.getTotalMesuresUnitat(b) == 8, "8 lectures de la unitat B");
        proper(pc.mitjanaMesuresEstacio(a), 20.0, "Mitjana de les 8 lectures de A");
        proper(pc.mitjanaMesuresEstacio(7, a), 10.0, "Ultimes 7 lectures de A, intercalades");
        proper(pc.valorMaxMedicio(a), 90.0, "Maxim per unitat A");
        proper(pc.mitjanaMesuresEstacio(b), 150.0, "Mitjana per unitat B independent");
        comprovar(pc.ferMedicioiGuardar()[0].getError() == 1,
                "Error 1 quan supera ultimes 7 pero no la mitjana total");

        SensorProva error2 = new SensorProva(200, a, 10, 20, 17);
        PuntControl pc2 = new PuntControl(2, new Localitzacio("E2", 0, 0, 0),
                new Sensor[] { error2 });
        comprovar(pc2.ferMedicioiGuardar()[0].getError() == 0, "Error 0 primera lectura");
        comprovar(pc2.ferMedicioiGuardar()[0].getError() == 3, "Error 3 nou maxim");
        comprovar(pc2.ferMedicioiGuardar()[0].getError() == 2, "Error 2 supera mitjana");

        SensorProva error4 = new SensorProva(300, a, 10, 95);
        PuntControl pc4 = new PuntControl(4, new Localitzacio("E4", 0, 0, 0),
                new Sensor[] { error4 });
        pc4.ferMedicioiGuardar();
        comprovar(pc4.ferMedicioiGuardar()[0].getError() == 4,
                "Error 4 prioritari davant del maxim historic");
        comprovar(pc4.ferMedicioiGuardar()[0].getError() == 5,
                "Error 5 quan no es pot llegir");
        comprovar(pc4.getTotalMesuresFetes() == 2, "L'error 5 no suma lectures fetes");
        comprovar(pc4.getTotalMesuresGuardades() == 2, "L'error 5 no ocupa historic");

        boolean capturaDuplicat = false;
        try {
            new PuntControl(8, new Localitzacio("Duplicat", 0, 0, 0),
                    new Sensor[] { new SensorTemperatura(1), new SensorTemperatura(2) });
        } catch (IllegalArgumentException correcte) {
            capturaDuplicat = true;
        }
        comprovar(capturaDuplicat, "No admet dos sensors del mateix tipus");
    }

    private static void provarSetLecturaIManteniment() {
        SensorTemperatura t = new SensorTemperatura(1);
        SensorHumitat h = new SensorHumitat(2);
        SensorCO2 c = new SensorCO2(3);
        PuntControl pc1 = new PuntControl(1, new Localitzacio("U", 0, 0, 0),
                new Sensor[] { t, h });
        PuntControl pc2 = new PuntControl(2, new Localitzacio("V", 0, 0, 0),
                new Sensor[] { c });
        PlantaIndustrial planta = new PlantaIndustrial("P", new PuntControl[] { pc1, pc2 });

        comprovar(Arrays.equals(planta.manteniment(), new boolean[] { true, true }),
                "Manteniment inicial");
        int[] comptadors = planta.medir();
        int suma = 0;
        for (int v : comptadors) {
            suma += v;
        }
        comprovar(suma == 3, "Medir compta tots els sensors dels diferents punts");
        comprovar(planta.getUltimsResultats().length == 2
                && planta.getUltimsResultats()[0].length == 2,
                "Consulta de detalls de l'ultima ronda");

        t.setFunciona(false);
        comprovar(Arrays.equals(planta.manteniment(), new boolean[] { false, true }),
                "Un sensor avariat fa fallar l'estat del PC");
        comprovar(!planta.canviSensorPC(1, 1, new SensorHumitat(4)),
                "No es permet canviar un tipus per un altre");
        comprovar(planta.canviSensorPC(1, 1, new SensorTemperatura(4)),
                "Permet substituir per un del mateix tipus");
        comprovar(Arrays.equals(planta.manteniment(), new boolean[] { true, true }),
                "Manteniment recuperat despres del canvi");
        comprovar(planta.canviLocalitzacioPC(2, new Localitzacio("Nou", 0, 0, 0)),
                "Canvi de localitzacio");
        comprovar(!planta.canviLocalitzacioPC(50, new Localitzacio("Nou", 0, 0, 0)),
                "No es permet canviar PC inexistent");
    }

    private static void provarLimitHistoricIObsolescencia() {
        SensorHumitat sensor = new SensorHumitat(50);
        PuntControl pc = new PuntControl(3, new Localitzacio("Historics", 0, 0, 0),
                new Sensor[] { sensor });
        for (int i = 0; i < 366; i++) {
            comprovar(pc.ferMedicioiGuardar()[0].getMedicio() != null,
                    "Es pot continuar llegint en omplir l'historic");
        }
        comprovar(pc.getTotalMesuresFetes() == 366, "Total real de lectures");
        comprovar(pc.getTotalMesuresGuardades() == 365, "Historic limitat a 365");
        comprovar(pc.getMesuresEstacio().length == 365, "Getter historic no inclou buits");
        comprovar(sensor.getFunciona(), "Un sensor amb 366 mesures encara funciona");

        for (int i = 366; i < Sensor.getMesuresMax(); i++) {
            comprovar(pc.ferMedicioiGuardar()[0].getMedicio() != null,
                    "Sensor encara pren mesures abans de l'obsolescencia");
        }
        comprovar(!sensor.getFunciona(), "Sensor s'avaria en arribar a 1000 lectures");
        comprovar(pc.ferMedicioiGuardar()[0].getError() == 5,
                "En esgotar l'obsolescencia el sensor retorna error 5");
        comprovar(pc.getTotalMesuresFetes() == 1000, "Recompte final 1000 lectures");
        comprovar(pc.getTotalMesuresGuardades() == 365, "Historic segueix en 365");
    }

    /** Sensor de prova amb lectures fixes per verificar els codis d'error. */
    private static class SensorProva extends Sensor {
        private final double[] valors;
        private int index;

        SensorProva(int id, UnitatMesura unitat, double... valors) {
            super(id, 0.0, 100.0, unitat);
            this.valors = valors;
        }

        @Override
        public Medicio novaMesura() {
            if (index >= valors.length) {
                return null;
            }
            return new Medicio(valors[index++], getUnitatMesura());
        }

        @Override
        public boolean foraLlindars(double valor) {
            return valor > 90;
        }
    }

    /** Tipus diferent per comprovar dos historics amb unitats intercalades. */
    private static class SensorProvaB extends Sensor {
        private final double[] valors;
        private int index;

        SensorProvaB(int id, UnitatMesura unitat, double... valors) {
            super(id, 0.0, 300.0, unitat);
            this.valors = valors;
        }

        @Override
        public Medicio novaMesura() {
            if (index >= valors.length) {
                return null;
            }
            return new Medicio(valors[index++], getUnitatMesura());
        }

        @Override
        public boolean foraLlindars(double valor) {
            return false;
        }
    }
}

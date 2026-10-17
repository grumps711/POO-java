
import java.util.Arrays;

public class PuntControl {

    private static final int MESURES_ESTACIO_MAX = 365;

    private final int id;
    private Localitzacio localitzacioEstacio;
    private Sensor sensorEstacio;
    private final Medicio[] mesuresEstacio;
    private int totalMesuresFetes;
    private int totalMesuresGuardades;

    public PuntControl(int id, Localitzacio localitzacio, Sensor sensor) {
        if (localitzacio == null || sensor == null) {
            throw new IllegalArgumentException("La localitzacio i el sensor son obligatoris");
        }
        this.id = id;
        this.localitzacioEstacio = localitzacio;
        this.sensorEstacio = sensor;
        this.mesuresEstacio = new Medicio[MESURES_ESTACIO_MAX];
        this.totalMesuresFetes = 0;
        this.totalMesuresGuardades = 0;
    }

    public int getId() {
        return id;
    }

    public Localitzacio getLocalitzacioEstacio() {
        return localitzacioEstacio;
    }

    public void setLocalitzacioEstacio(Localitzacio localitzacioEstacio) {
        if (localitzacioEstacio == null) {
            throw new IllegalArgumentException("La localitzacio no pot ser null");
        }
        this.localitzacioEstacio = localitzacioEstacio;
    }

    public Sensor getSensorEstacio() {
        return sensorEstacio;
    }

    public void setSensorEstacio(Sensor sensorEstacio) {
        if (sensorEstacio == null) {
            throw new IllegalArgumentException("El sensor no pot ser null");
        }
        this.sensorEstacio = sensorEstacio;
    }

    public int getTotalMesuresFetes() {
        return totalMesuresFetes;
    }

    public int getTotalMesuresGuardades() {
        return totalMesuresGuardades;
    }

    public static int getMesuresEstacioMax() {
        return MESURES_ESTACIO_MAX;
    }

    public Medicio[] getMesuresEstacio() {
        return Arrays.copyOf(mesuresEstacio, totalMesuresGuardades);
    }

    // Mitjana de tot l'historic desat.
    public double mitjanaMesuresEstacio() {
        return mitjanaMesuresEstacio(totalMesuresGuardades);
    }

    // Mitjana de les ultimes N mesures desades; si no n'hi ha N, usa totes.
    public double mitjanaMesuresEstacio(int n) {
        if (n <= 0 || totalMesuresGuardades == 0) {
            return 0.0; // Convencio quan no hi ha cap mesura per calcular.
        }

        int quantitat = Math.min(n, totalMesuresGuardades);
        double suma = 0;
        for (int i = totalMesuresGuardades - quantitat; i < totalMesuresGuardades; i++) {
            suma += mesuresEstacio[i].getValor();
        }
        return suma / quantitat;
    }

    // Retorna el valor mes gran (double), seguint la correccio de la professora.
    public double valorMaxMedicio() {
        if (totalMesuresGuardades == 0) {
            return Double.NaN; // No existeix cap maxim si l'historic es buit.
        }

        double maxim = mesuresEstacio[0].getValor();
        for (int i = 1; i < totalMesuresGuardades; i++) {
            if (mesuresEstacio[i].getValor() > maxim) {
                maxim = mesuresEstacio[i].getValor();
            }
        }
        return maxim;
    }

    // Retorna un codi entre 0 i 5. Els codis mes alts tenen prioritat.
    public int ferMedicioiGuardar() {
        Medicio novaMedicio = sensorEstacio.novaMesura();
        if (novaMedicio == null) {
            return 5; // El sensor no pot prendre cap nova lectura.
        }

        totalMesuresFetes++;
        double valor = novaMedicio.getValor();
        int tipusError = 0;

        // IMPORTANT: comparar amb l'historic ANTERIOR a desar aquesta lectura.
        if (totalMesuresGuardades >= 7 && valor > mitjanaMesuresEstacio(7)) {
            tipusError = 1;
        }
        if (totalMesuresGuardades > 0 && valor > mitjanaMesuresEstacio()) {
            tipusError = 2;
        }
        if (totalMesuresGuardades > 0 && valor > valorMaxMedicio()) {
            tipusError = 3;
        }
        if (valor > 0.90 * sensorEstacio.getLimMax()) {
            tipusError = 4;
        }

        // Si l'historic es ple, la lectura existeix i compta,
        // pero no es desa a l'array del punt de control.
        if (totalMesuresGuardades < MESURES_ESTACIO_MAX) {
            mesuresEstacio[totalMesuresGuardades] = novaMedicio;
            totalMesuresGuardades++;
        }

        return tipusError;
    }

    @Override
    public String toString() {
        return "PuntControl{id=" + id + ", localitzacio=" + localitzacioEstacio
                + ", sensor=" + sensorEstacio + ", totalMesuresFetes=" + totalMesuresFetes
                + ", mesuresGuardades=" + totalMesuresGuardades + "/" + MESURES_ESTACIO_MAX + "}";
    }
}

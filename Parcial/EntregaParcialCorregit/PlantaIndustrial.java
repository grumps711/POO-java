
import java.util.Arrays;

public class PlantaIndustrial {

    private final String nom;
    private final PuntControl[] pcs;

    public PlantaIndustrial(String nom, PuntControl[] pcs) {
        if (pcs == null) {
            throw new IllegalArgumentException("Cal indicar els punts de control");
        }
        this.nom = nom;
        this.pcs = Arrays.copyOf(pcs, pcs.length);
    }

    public String getNom() {
        return nom;
    }

    public PuntControl[] getPcs() {
        return Arrays.copyOf(pcs, pcs.length);
    }

    public boolean canviLocalitzacioPC(int id, Localitzacio localitzacio) {
        if (localitzacio == null) {
            return false;
        }
        for (int i = 0; i < pcs.length; i++) {
            if (pcs[i] != null && pcs[i].getId() == id) {
                pcs[i].setLocalitzacioEstacio(localitzacio);
                return true;
            }
        }
        return false;
    }

    public boolean canviSensorPC(int id, Sensor sensor) {
        if (sensor == null) {
            return false;
        }
        for (int i = 0; i < pcs.length; i++) {
            if (pcs[i] != null && pcs[i].getId() == id) {
                pcs[i].setSensorEstacio(sensor);
                return true;
            }
        }
        return false;
    }

    // Comptadors de lectures per tipus: posicions 0, 1, 2, 3, 4 i 5.
    public int[] medir() {
        int[] comptadors = new int[6];
        for (int i = 0; i < pcs.length; i++) {
            int tipusError = pcs[i] == null ? 5 : pcs[i].ferMedicioiGuardar();
            comptadors[tipusError]++;
        }
        return comptadors;
    }

    // true si el sensor encara funciona; false si cal substituir-lo.
    public boolean[] manteniment() {
        boolean[] funcionen = new boolean[pcs.length];
        for (int i = 0; i < pcs.length; i++) {
            funcionen[i] = pcs[i] != null && pcs[i].getSensorEstacio() != null
                    && pcs[i].getSensorEstacio().getFunciona();
        }
        return funcionen;
    }

    public String informeDiari() {
        int[] comptadors = medir();
        StringBuilder informe = new StringBuilder("Errors lectura:\n");

        for (int i = 5; i >= 0; i--) {
            informe.append("Errors tipus ").append(i).append(": ")
                   .append(comptadors[i]).append('\n');
        }

        boolean[] funcionen = manteniment();
        informe.append("\nCanvi de sensors:\n");
        for (int i = 0; i < pcs.length; i++) {
            if (!funcionen[i]) {
                int id = pcs[i] == null ? i : pcs[i].getId();
                informe.append("Canviar sensor del punt de control ")
                       .append(id).append('\n');
            }
        }
        return informe.toString();
    }

    @Override
    public String toString() {
        return "PlantaIndustrial{nom='" + nom + "', puntsControl=" + pcs.length + "}";
    }
}

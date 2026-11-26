import java.util.Arrays;

public class NegociMobilitat {

    private static int MAX_SERVEIS = 50;


    private ServeiMobilitat[] llistaServeis;
    private int numeroServeis;

    public NegociMobilitat() {
        this.llistaServeis = new ServeiMobilitat[MAX_SERVEIS];
        this.numeroServeis = 0;
    }

    public boolean afegirNouServei(ServeiMobilitat v) {
        if (v == null || numeroServeis >= llistaServeis.length) return false;
        llistaServeis[numeroServeis] = v;
        numeroServeis++; // Correccio: sense doble increment.
        return true;
    }

    public int calcularTotalOperacionsMensualsRealitzades() {
        int totalOperacionsRealitzades = 0;
        for (int i = 0; i < numeroServeis; i++) {
            totalOperacionsRealitzades += llistaServeis[i].getOperacionsMensuals();
        }
        return totalOperacionsRealitzades;
    }

    public double calcularTotalIngressosMensuals() {
        double totalIngressosMensuals = 0;
        for (int i = 0; i < numeroServeis; i++) {
            totalIngressosMensuals += llistaServeis[i].getIngressosMensuals();
        }
        return totalIngressosMensuals;
    }

    public ServeiMobilitat obtenirMaxServeiIngressosMensuals() {
        if (numeroServeis == 0) {
            return null;
        }
        ServeiMobilitat serveiMaxIngressos = llistaServeis[0];
        for (int i = 1; i < numeroServeis; i++) {
            if (llistaServeis[i].getIngressosMensuals() > serveiMaxIngressos.getIngressosMensuals()) {
                serveiMaxIngressos = llistaServeis[i];
            }
        }
        return serveiMaxIngressos;
    }

    public static int getMAX_SERVEIS() {
        return MAX_SERVEIS;
    }

    public static void setMAX_SERVEIS(int MAX_SERVEIS) {
        NegociMobilitat.MAX_SERVEIS = MAX_SERVEIS;
    }

    @Override
    public String toString() {
        return "NegociMobilitat [llistaServeis="
                + Arrays.toString(Arrays.copyOf(llistaServeis, numeroServeis))
                + ", numeroServeis=" + numeroServeis + "]";
    }
}

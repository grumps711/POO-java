import java.util.Arrays;

public class GestorRecarrega {

    private static final int MAX_ESTACIONS = 30; // Correccio: mida fixa.
    private EstacioRecarrega[] llistaEstacions;
    private int numeroEstacions;

    public GestorRecarrega() {
        this.llistaEstacions = new EstacioRecarrega[MAX_ESTACIONS];
        this.numeroEstacions = 0;
    }

    public boolean afegirEstacio(EstacioRecarrega e) {
        if (e == null || numeroEstacions >= llistaEstacions.length
                || buscarEstacio(e.getCodi()) != null) {
            return false;
        }
        llistaEstacions[numeroEstacions] = e;
        numeroEstacions++; // Correccio: incrementar una sola vegada.
        return true;
    }

    public int getNombreEstacions() {
        return numeroEstacions; // Ja tenim la variable amb el recompte.
    }

    public EstacioRecarrega buscarEstacio(String id) {
        for (int i = 0; i < numeroEstacions; i++) {
            if (llistaEstacions[i] != null && llistaEstacions[i].getCodi().equals(id)) {
                return llistaEstacions[i];
            }
        }
        return null;
    }

    public EstacioRecarrega buscarEstacioPerPosicio(int j) {
        if (j < 0 || j >= numeroEstacions) return null;
        return llistaEstacions[j];
    }

    public int nombreTotalPuntsOperatius() {
        int totalPuntsOperatius = 0;
        for (int i = 0; i < numeroEstacions; i++) {
            totalPuntsOperatius += llistaEstacions[i].calcularTotalPuntsOperatius();
        }
        return totalPuntsOperatius;
    }

    // L'ordre correcte dels parametres es: estacio, punt, nou estat.
    public boolean modificaEstat(String idestacio, String idpunt, boolean nouEstat) {
        EstacioRecarrega estacio = buscarEstacio(idestacio);
        if (estacio == null) return false;
        return estacio.modificaEstat(idpunt, nouEstat);
    }

    public double calcularCost(String idestacio, String idpunt, double energiaSolicitada) {
        EstacioRecarrega estacio = buscarEstacio(idestacio);
        if (estacio == null) return -1.0;
        return estacio.calcularCost(idpunt, energiaSolicitada);
    }

    @Override
    public String toString() {
        return "GestorRecarrega [llistaEstacions="
                + Arrays.toString(Arrays.copyOf(llistaEstacions, numeroEstacions))
                + ", numeroEstacions=" + numeroEstacions + "]";
    }
}

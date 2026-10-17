
import java.util.Arrays;
import java.util.Random;

public class Sensor {

    private static final int MESURES_MAX = 1000;

    private final int id;
    private boolean funciona;
    private final Medicio[] mesuresRegistrades;
    private int mesuresFetes;
    private final double limMin;
    private final double limMax;

    // L'ordre dels limits segueix el Test original: minim, maxim.
    public Sensor(int id, double limMin, double limMax) {
        if (limMin > limMax) {
            throw new IllegalArgumentException("El limit minim supera el maxim");
        }
        this.id = id;
        this.limMin = limMin;
        this.limMax = limMax;
        this.funciona = true;
        this.mesuresFetes = 0;
        this.mesuresRegistrades = new Medicio[MESURES_MAX];
    }

    public int getId() {
        return id;
    }

    public boolean getFunciona() {
        return funciona;
    }

    public int getMesuresFetes() {
        return mesuresFetes;
    }

    public static int getMesuresMax() {
        return MESURES_MAX;
    }

    public double getLimMin() {
        return limMin;
    }

    public double getLimMax() {
        return limMax;
    }

    // Retornem una copia de les mesures existents, no l'array intern modificable.
    public Medicio[] getMesuresRegistrades() {
        return Arrays.copyOf(mesuresRegistrades, mesuresFetes);
    }

    public Medicio novaMesura() {
        // Primer comprovar si encara es poden fer mesures.
        if (!funciona || mesuresFetes >= MESURES_MAX) {
            funciona = false;
            return null;
        }

        Random r = new Random();
        double valor = r.nextDouble() * (limMax - limMin) + limMin;
        Medicio novaMedicio = new Medicio(valor);

        // L'array te espai per a MESURES_MAX mesures.
        mesuresRegistrades[mesuresFetes] = novaMedicio;
        mesuresFetes++;

        if (mesuresFetes == MESURES_MAX) {
            funciona = false;
        }

        return novaMedicio;
    }

    @Override
    public String toString() {
        return "Sensor{id=" + id + ", funciona=" + funciona
                + ", mesuresFetes=" + mesuresFetes + "/" + MESURES_MAX
                + ", limMin=" + limMin + ", limMax=" + limMax + "}";
    }
}

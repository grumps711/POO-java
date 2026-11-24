import java.util.Objects;

public class PuntRecarrega {

    // Atributs: l'identificador i la potencia no es poden modificar.
    private final String id;
    private final double maxPotencia;
    private boolean operatiu;

    public PuntRecarrega(String id, double maxPotencia, boolean operatiu) {
        this.id = id;
        this.maxPotencia = maxPotencia;
        this.operatiu = operatiu;
    }

    public String getId() {
        return id;
    }

    public String getIdentificador() {
        return id;
    }

    public double getMaxPotencia() {
        return maxPotencia;
    }

    public double getPotenciaKW() {
        return maxPotencia;
    }

    public boolean isOperatiu() {
        return operatiu;
    }

    public void setOperatiu(boolean operatiu) {
        this.operatiu = operatiu;
    }

    @Override
    public String toString() {
        return "PuntRecarrega{" + id + ", " + maxPotencia
                + " kW, operatiu=" + operatiu + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PuntRecarrega)) return false;
        PuntRecarrega other = (PuntRecarrega) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

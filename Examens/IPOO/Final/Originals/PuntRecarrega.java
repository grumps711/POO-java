public class PuntRecarrega{

    //atributs

    private String id; // no set
    private double maxPotencia; // no set
    private boolean operatiu;
    private double energiaSolicitada;//******************************** no
    private double potenciaPunt;//******************************** no
    
    

    //constructor

    public PuntRecarrega(String id, double maxPotencia, boolean operatiu, double energiaSolicitada,
            double potenciaPunt) {
        this.id = id;
        this.maxPotencia = maxPotencia;
        this.operatiu = operatiu;
        this.energiaSolicitada = energiaSolicitada;
        this.potenciaPunt = potenciaPunt;
    }

    //getters i setters

    public String getId() {
        return id;
    }

    public double getEnergiaSolicitada() {
        return energiaSolicitada;
    }

    public void setEnergiaSolicitada(double energiaSolicitada) {
        this.energiaSolicitada = energiaSolicitada;
    }

    public double getPotenciaPunt() {
        return potenciaPunt;
    }

    public void setPotenciaPunt(double potenciaPunt) {//******************************** no
        this.potenciaPunt = potenciaPunt;
    }

    public double getMaxPotencia() {
        return maxPotencia;
    }

    public boolean isOperatiu() {
        return operatiu;
    }

    public void setOperatiu(boolean operatiu) {
        this.operatiu = operatiu;
    }


    //metodes

    public double calcularTempsBase(){//******************************** no
        return this.energiaSolicitada / this.getMaxPotencia() * 60;
    }

    @Override
    public String toString() {
        return "PuntRecarrega [id=" + id + ", maxPotencia=" + maxPotencia + ", operatiu=" + operatiu
                + ", energiaSolicitada=" + energiaSolicitada + ", potenciaPunt=" + potenciaPunt + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PuntRecarrega other = (PuntRecarrega) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

   
    

    
}

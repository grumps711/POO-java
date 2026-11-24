public class EstacioACconvencional extends EstacioAC{

	//************************************* statics
    private String id; // no set//************************************* no
    private double maxPotencia; // no set//************************************* no
    private boolean operatiu;//************************************* no

    public double calcularCostPerSessio(){//************************************* no
        return super.getPreuBase() + 0.5;
    }

    public EstacioACconvencional(String id, String nom, String descripcio, int numRecarreguesMensuals,
            double totalIngressosMensuals, PuntRecarrega[] llistaPuntsRecarrega, double preuBase, String id2,
            double maxPotencia, boolean operatiu) {
        super(id, nom, descripcio, numRecarreguesMensuals, totalIngressosMensuals, llistaPuntsRecarrega, preuBase);
        id = id2;
        this.maxPotencia = maxPotencia;
        this.operatiu = operatiu;
    }


    @Override
    public String toString() {
        return "EstacioACconvencional [id=" + id + ", maxPotencia=" + maxPotencia + ", operatiu=" + operatiu
                + ", toString()=" + super.toString() + "]";
    }


}

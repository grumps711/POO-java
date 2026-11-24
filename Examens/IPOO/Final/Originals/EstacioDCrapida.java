public class EstacioDCrapida extends EstacioDC{
    
	//************************************* statics
    private String id; // no set//************************************* no
    private double maxPotencia; // no set//************************************* no
    private boolean operatiu;//************************************* no




    public EstacioDCrapida(String id, String nom, String descripcio, int numRecarreguesMensuals,
            double totalIngressosMensuals, PuntRecarrega[] llistaPuntsRecarrega, double preuBase, String id2,
            double maxPotencia, boolean operatiu) {
        super(id, nom, descripcio, numRecarreguesMensuals, totalIngressosMensuals, llistaPuntsRecarrega, preuBase);
        id = id2;
        this.maxPotencia = maxPotencia;
        this.operatiu = operatiu;
    }


    public double calcularCostPerSessio(){//************************************* no
        return super.getPreuBase() + (0.05);
    }


    @Override
    public String toString() {
        return "EstacioDCrapida [id=" + id + ", maxPotencia=" + maxPotencia + ", operatiu=" + operatiu + ", toString()="
                + super.toString() + "]";
    }

}

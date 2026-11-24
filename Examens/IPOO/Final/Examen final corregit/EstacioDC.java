public abstract class EstacioDC extends EstacioRecarrega {

    private static final double FACTOR_EFICIENCIA = 1.05;

    public EstacioDC(String id, String nom, String descripcio, PuntRecarrega[] punts, double preuBase) {
        super(id, nom, descripcio, punts, preuBase);
    }

    public EstacioDC(String id, String nom, String descripcio, int numRecarreguesMensuals, double totalIngressosMensuals, PuntRecarrega[] punts, double preuBase) {
        super(id, nom, descripcio, numRecarreguesMensuals, totalIngressosMensuals, punts, preuBase);
    }

    @Override
    protected double getFactorEficiencia() {
        return FACTOR_EFICIENCIA;
    }
}

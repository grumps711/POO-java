public abstract class EstacioAC extends EstacioRecarrega {

    private static final double FACTOR_EFICIENCIA = 1.10;

    public EstacioAC(String id, String nom, String descripcio,
            PuntRecarrega[] punts, double preuBase) {
        super(id, nom, descripcio, punts, preuBase);
    }

    public EstacioAC(String id, String nom, String descripcio,
            int numRecarreguesMensuals, double totalIngressosMensuals,
            PuntRecarrega[] punts, double preuBase) {
        super(id, nom, descripcio, numRecarreguesMensuals,
                totalIngressosMensuals, punts, preuBase);
    }

    @Override
    protected double getFactorEficiencia() {
        return FACTOR_EFICIENCIA;
    }
}

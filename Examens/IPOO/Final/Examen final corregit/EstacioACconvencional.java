public class EstacioACconvencional extends EstacioAC {

    // Correccio: sense id, maxPotencia ni operatiu duplicats.
    public EstacioACconvencional(String id, String nom, String descripcio, PuntRecarrega[] punts, double preuBase) {
        super(id, nom, descripcio, punts, preuBase);
    }

    public EstacioACconvencional(String id, String nom, String descripcio, int numRecarreguesMensuals, double totalIngressosMensuals, PuntRecarrega[] punts, double preuBase) {
        super(id, nom, descripcio, numRecarreguesMensuals, totalIngressosMensuals, punts, preuBase);
    }

    @Override
    public double calcularCost(String id, double energiaSolicitada) {
        if (calcularTemps(id, energiaSolicitada) == -1.0) return -1.0;
        return energiaSolicitada * getPreuBaseKWh() + 0.50;
    }
}

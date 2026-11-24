public class EstacioDCultrarapida extends EstacioDC {

    public EstacioDCultrarapida(String id, String nom, String descripcio, PuntRecarrega[] punts, double preuBase) {
        super(id, nom, descripcio, punts, preuBase);
    }

    public EstacioDCultrarapida(String id, String nom, String descripcio, int numRecarreguesMensuals, double totalIngressosMensuals, PuntRecarrega[] punts, double preuBase) {
        super(id, nom, descripcio, numRecarreguesMensuals, totalIngressosMensuals, punts, preuBase);
    }

    @Override
    public double calcularCost(String id, double energiaSolicitada) {
        double temps = calcularTemps(id, energiaSolicitada);
        if (temps == -1.0) return -1.0;
        return (energiaSolicitada * getPreuBaseKWh() + 0.10 * temps) * 1.15;
    }
}

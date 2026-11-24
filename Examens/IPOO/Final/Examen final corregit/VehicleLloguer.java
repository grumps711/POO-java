public class VehicleLloguer implements ServeiMobilitat {

    private String matricula;
    private String model;
    private int numLloguersMensuals;
    private double preuMitjaLloguer;

    // Correccio: ingresos i operacions es calculen; no cal duplicar-los com atributs.
    public VehicleLloguer(String matricula, String model, int numLloguersMensuals,
            double preuMitjaLloguer) {
        this.matricula = matricula;
        this.model = model;
        this.numLloguersMensuals = numLloguersMensuals;
        this.preuMitjaLloguer = preuMitjaLloguer;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumLloguersMensuals() {
        return numLloguersMensuals;
    }

    public void setNumLloguersMensuals(int numLloguersMensuals) {
        this.numLloguersMensuals = numLloguersMensuals;
    }

    public double getPreuMitjaLloguer() {
        return preuMitjaLloguer;
    }

    public void setPreuMitjaLloguer(double preuMitjaLloguer) {
        this.preuMitjaLloguer = preuMitjaLloguer;
    }

    @Override
    public int getOperacionsMensuals() {
        return numLloguersMensuals;
    }

    @Override
    public double getIngressosMensuals() {
        return numLloguersMensuals * preuMitjaLloguer;
    }

    @Override
    public String toString() {
        return "VehicleLloguer [matricula=" + matricula + ", model=" + model
                + ", numLloguersMensuals=" + numLloguersMensuals
                + ", preuMitjaLloguer=" + preuMitjaLloguer + "]";
    }
}

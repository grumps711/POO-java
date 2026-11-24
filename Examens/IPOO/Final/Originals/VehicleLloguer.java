public class VehicleLloguer {
    

    private String matricula;
    private String model;
    private int numLloguersMensuals;
    private double preuMitjaLloguer;
    private double ingresMensual;
    private int numOperacionsRealitzades;


    public VehicleLloguer(String matricula, String model, int numLloguersMensuals, double preuMitjaLloguer,
            double ingresMensual, int numOperacionsRealitzades) {
        this.matricula = matricula;
        this.model = model;
        this.numLloguersMensuals = numLloguersMensuals;
        this.preuMitjaLloguer = preuMitjaLloguer;
        this.ingresMensual = ingresMensual;
        this.numOperacionsRealitzades = numOperacionsRealitzades;
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


    public double getIngresMensual() {
        return ingresMensual;
    }


    public void setIngresMensual(double ingresMensual) {
        this.ingresMensual = ingresMensual;
    }


    public int getNumOperacionsRealitzades() {
        return numOperacionsRealitzades;
    }


    public void setNumOperacionsRealitzades(int numOperacionsRealitzades) {
        this.numOperacionsRealitzades = numOperacionsRealitzades;
    }



    


}

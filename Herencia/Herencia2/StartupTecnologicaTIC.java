public class StartupTecnologicaTIC extends StartupTecnologica{
    
    
    private static int costoPuesto;
    
    public StartupTecnologicaTIC(String cif, String nombre, int capitalSocial, int importeInversiones, int numTrabajadores, String descripcionNegocio, int numPatentesSoftwares, int valorMedio){
        super(cif, nombre, capitalSocial, importeInversiones, numTrabajadores, descripcionNegocio, numPatentesSoftwares, valorMedio);
        this.costoPuesto = 2300;
    }


    //Getters i setters

    public int getCostoPuesto() {
        return costoPuesto;
    }

    public void setCostoPuesto(int costoPuesto) {
        this.costoPuesto = costoPuesto;
    }
    
    //interesa el costo de cada puesto
    //de trabajo, que actualmente es de 2300 euros pero puede variar en el tiempo.


    @Override 
    public double calcularInmobilitzatMaterial(){
        return getNumTrabajadores() * getCostoPuesto(); 
    }

    @Override
    public String toString() {
        return super.toString()
            + "\nCosto puesto: " + costoPuesto;
    }
}

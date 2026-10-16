public class StartupTecnologica extends Startup{
    

    private int numPatentesSoftwares;
    private int valorMedio;



    public StartupTecnologica(String cif, String nombre, int capitalSocial, int importeInversiones, int numTrabajadores, String descripcionNegocio, int numPatentesSoftwares, int valorMedio){
        super(cif, nombre, capitalSocial, importeInversiones, numTrabajadores, descripcionNegocio);
        this.numPatentesSoftwares = numPatentesSoftwares;
        this.valorMedio = valorMedio;
    }


    @Override 
    public double calcularInmobilitzatInmaterial(){
        return getNumPatentesSoftwares() * getValorMedio();
    }


    //Getters i setters

    public int getNumPatentesSoftwares() {
        return numPatentesSoftwares;
    }

    public int getValorMedio() {
        return valorMedio;
    }

    public void setNumPatentesSoftwares(int numPatentesSoftwares) {
        this.numPatentesSoftwares = numPatentesSoftwares;
    }

    public void setValorMedio(int valorMedio) {
        this.valorMedio = valorMedio;
    }

    //toString

    @Override
    public String toString() {
        return super.toString()
            + "\nNúmero de patentes y/o softwares registrados: " + numPatentesSoftwares
            + "\nValor medio: " + valorMedio;
    }

}

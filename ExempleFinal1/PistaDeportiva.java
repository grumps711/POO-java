public class PistaDeportiva extends InstalacionDeportiva{
    

    private int totalPistas;
    private boolean sePuedeAlquilarANoSocios;
    private double precioAlquiler1HoraPista;


    public PistaDeportiva(String id, String nombre, double superficieTotal, double numHoresDiariesApertura,
            int numTotalEmpleats, int numTotalSocis, double importCuotaSoci, String descripcio, int totalPistas,
            boolean sePuedeAlquilarANoSocios, double precioAlquiler1HoraPista) {
        super(id, nombre, superficieTotal, numHoresDiariesApertura, numTotalEmpleats, numTotalSocis, importCuotaSoci,
                descripcio);
        this.totalPistas = totalPistas;

        if(sePuedeAlquilarANoSocios==true){
            this.precioAlquiler1HoraPista = precioAlquiler1HoraPista;
        }
        this.sePuedeAlquilarANoSocios = false;
    }




    public int getTotalPistas() {
        return totalPistas;
    }

    public void setTotalPistas(int totalPistas) {
        this.totalPistas = totalPistas;
    }

    public boolean isSePuedeAlquilarANoSocios() {
        return sePuedeAlquilarANoSocios;
    }

    public void setSePuedeAlquilarANoSocios(boolean sePuedeAlquilarANoSocios) {
        this.sePuedeAlquilarANoSocios = sePuedeAlquilarANoSocios;
    }

    public double getPrecioAlquiler1HoraPista() {
        return precioAlquiler1HoraPista;
    }

    public void setPrecioAlquiler1HoraPista(double precioAlquiler1HoraPista) {
        this.precioAlquiler1HoraPista = precioAlquiler1HoraPista;
    }




    @Override
    public String toString() {
        return "PistaDeportiva [totalPistas=" + totalPistas + ", sePuedeAlquilarANoSocios=" + sePuedeAlquilarANoSocios
                + ", precioAlquiler1HoraPista=" + precioAlquiler1HoraPista + ", toString()=" + super.toString() + "]";
    }




    @Override 
    public double calcularIngresosExtrasDiarios(){
        if(this.sePuedeAlquilarANoSocios==true){
            return (this.getTotalPistas()*10/100) * super.getNumHoresDiariesApertura() * this.getPrecioAlquiler1HoraPista();

        }
        return this.getTotalPistas() * super.getNumHoresDiariesApertura() * this.getPrecioAlquiler1HoraPista();
    }

}

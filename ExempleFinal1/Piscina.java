public class Piscina extends InstalacionDeportiva{
    

    private int totalPiscinas;
    private double totalSizePiscinas;
    private boolean tieneClimatizacion;

    
    public Piscina(String id, String nombre, double superficieTotal, int horasApertura, int numeroEmpleados,
        int numeroMiembros, double cuotaMiembro, String descripcion, int totalPiscinas, double totalSizePiscinas,
        boolean tieneClimatizacion) {
    super(id, nombre, superficieTotal, horasApertura, numeroEmpleados, numeroMiembros, cuotaMiembro, descripcion);
    this.totalPiscinas = totalPiscinas;
    this.totalSizePiscinas = totalSizePiscinas;
    this.tieneClimatizacion = tieneClimatizacion;
    }

    //getters i setters

    public int getTotalPiscinas() {
        return totalPiscinas;
    }

  
    public void setTotalPiscinas(int totalPiscinas) {
        this.totalPiscinas = totalPiscinas;
    }

    public double getTotalSizePiscinas() {
        return totalSizePiscinas;
    }

    public void setTotalSizePiscinas(double totalSizePiscinas) {
        this.totalSizePiscinas = totalSizePiscinas;
    }

    public boolean isTieneClimatizacion() {
        return tieneClimatizacion;
    }

    public void setTieneClimatizacion(boolean tieneClimatizacion) {
        this.tieneClimatizacion = tieneClimatizacion;
    }




    //devolverá la superficie total de las instalaciones menos el
    //tamaño total de las piscinas. Para las piscinas climatizadas, incrementar un 15% el tamaño
    //total de las piscinas para tener en cuenta el espacio necesario para las instalaciones de
    //climatización.


    @Override 
    public double calcularAreaTotalPracticable(){
        if(this.isTieneClimatizacion()==true){
            this.setTotalSizePiscinas(this.getTotalSizePiscinas()*15/100);
        }
        return super.getSuperficieTotalInstalacion() - this.getTotalSizePiscinas();
    }



    @Override
    public String toString() {
        return "Piscina [totalPiscinas=" + totalPiscinas + ", totalSizePiscinas=" + totalSizePiscinas
                + ", tieneClimatizacion=" + tieneClimatizacion + ", toString()=" + super.toString() + "]";
    }


}

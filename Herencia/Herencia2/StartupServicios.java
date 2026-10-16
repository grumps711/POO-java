public class StartupServicios extends Startup{
    
    private boolean tieneCallCenter;


    public StartupServicios(String cif, String nombre, int capitalSocial, int importeInversiones, int numTrabajadores, String descripcionNegocio, boolean tieneCallCenter){
        super(cif, nombre, capitalSocial, importeInversiones, numTrabajadores, descripcionNegocio);
        this.tieneCallCenter = tieneCallCenter;
    }

    //Getters i setters

    public boolean getTieneCallCenter() {
        return tieneCallCenter;
    }

    public void setTieneCallCenter(boolean tieneCallCenter) {
        this.tieneCallCenter = tieneCallCenter;
    }

    // interesa saber si disponen de un call center.


    //ToString
    @Override
    public String toString(){
        return super.toString() + 
        "\nTiene call center: " + tieneCallCenter;
    }
}

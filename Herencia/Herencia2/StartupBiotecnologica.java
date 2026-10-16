public class StartupBiotecnologica extends StartupTecnologica{
    
    private String ambito;
    private int valoracionLaboratorios;

    public StartupBiotecnologica(String cif, String nombre, int capitalSocial, int importeInversiones, int numTrabajadores, String descripcion, int numPatentesSoftwares, int valorMedio, String ambito, int valoracion){
        super(cif, nombre, capitalSocial, importeInversiones, numTrabajadores, descripcion, numPatentesSoftwares, valorMedio);
        this.valoracionLaboratorios = valoracion;
        setAmbito(ambito);
    }


    //Getters i setters

    public String getAmbito() {
        return ambito;
    }
    public int getValoracionLaboratorios() {
        return valoracionLaboratorios;
    }

    public void setAmbito(String ambito) {
        if ("blanca".equals(ambito) ||
            "verde".equals(ambito) ||
            "azul".equals(ambito) ||
            "blau".equals(ambito) ||
            "gris".equals(ambito)) {

            this.ambito = ambito;
        }
    }

    public void setValoracionLaboratorios(int valoracionLaboratorios) {
        this.valoracionLaboratorios = valoracionLaboratorios;
    }


    //toString

    @Override
    public String toString() {
        return super.toString()
            + "\nÁmbito: " + ambito
            + "\nValoracion de laboratorios: " + valoracionLaboratorios;
    }


    @Override
    public double calcularInmobilitzatMaterial(){
        return getValoracionLaboratorios(); 
    }

    //interesa saber en qué ámbito trabajan: biotecnología blanca
    //(industrial), verde (agrícola), azul (marina) o gris (medio ambiente) y la valoración de sus laboratorios.


    //Se  deberá verificar el ámbito para el caso de las startup biotecnológicas, en caso de valor 
    //incorrecto la información del ámbito no se modificará. 
}

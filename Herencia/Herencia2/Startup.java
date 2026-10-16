public class Startup {
    


    private final String CIF;
    private final String nombre;
    private int capitalSocial;
    private int importeInversiones;
    private int numTrabajadores;
    private String descripcionNegocio;


    public Startup (String cif, String nombre, int capitalSocial, int importeInversiones, int numTrabajadores, String descripcionNegocio){
        this.CIF = cif;
        this.nombre = nombre;
        this.capitalSocial = capitalSocial;
        this.importeInversiones = importeInversiones;
        this.numTrabajadores = numTrabajadores;
        this.descripcionNegocio = descripcionNegocio;
    }


    //Alta de trabajadores. El método incrementará en uno el número de trabajadores de la startup.
    public void altaTrabajador(){
        numTrabajadores++;
    }


    //Baja de trabajadores. El método decrementará en uno el número de trabajadores
    //de  la  startup.  Este  método  devolverá  un  booleano  indicando  si  se  ha  podido
    //realizar la actualización. Se puede actualizar el número de trabajadores siempre
    //que al menos quede un trabajador en la startup.
    public boolean bajaTrabajador(){
        if(numTrabajadores > 1){
            numTrabajadores--;
            return true;
        }
        return false;
    }


    //Cálculo del inmovilizado inmaterial. Devolverá el valor total de las patentes y/o
    //aplicaciones de la startup. Para el resto de las startups el valor será 0.
    public double calcularInmobilitzatInmaterial(){
        return 0; 
    }


    //Cálculo del inmovilizado material. En el caso de las startups del ámbito de la
    //biotecnología el valor se corresponde con la valoración de sus laboratorios. Para
    //las startups del ámbito de las TIC el valor se corresponde con el coste del total
    //de los puestos de trabajo. Para el resto de las startups el valor será 0.
    public double calcularInmobilitzatMaterial(){
        return 0; 
    }


    //Cálculo del inmovilizado. Se corresponde con la suma del inmovilizado material, el inmaterial y las inversiones.
    public double calcularInmobilitzat(){
        return (calcularInmobilitzatInmaterial() + calcularInmobilitzatMaterial() + importeInversiones);
    }


    //Getters i setters

    public String getCif() {
        return CIF;
    }

    public double getCapitalSocial() {
        return capitalSocial;
    }

    public String getDescripcionNegocio() {
        return descripcionNegocio;
    }

    public double getImporteInversiones() {
        return importeInversiones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setCapitalSocial(int capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public void setDescripcionNegocio(String descripcionNegocio) {
        this.descripcionNegocio = descripcionNegocio;
    }

    public void setImporteInversiones(int importeInversiones) {
        this.importeInversiones = importeInversiones;
    }

    public void setNumTrabajadores(int numTrabajadores) {
        if (numTrabajadores >= 1) {
            this.numTrabajadores = numTrabajadores;
        }
    }


    //ToString
    @Override
    public String toString(){
        return "CIF: " + CIF
             + "\nNombre: " + nombre
             + "\nCapital social: " + capitalSocial
             + "\nInversiones: " + importeInversiones
             + "\nTrabajadores: " + numTrabajadores
             + "\nDescripcion: " + descripcionNegocio;
    }

    //Equals
    @Override
    public boolean equals(Object o){

        if (this == o) return true;
        if (!(o instanceof Startup)) return false;
        Startup otra = (Startup) o;
        return CIF.equals(otra.CIF);
    }

}

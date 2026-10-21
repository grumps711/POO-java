public abstract class InstalacionDeportiva implements Negocio{
    

    private String id;
    private String nombre;
    private double superficieTotalInstalacion;
    private double numHoresDiariesApertura;
    private int numTotalEmpleats;
    private int numTotalSocis;
    private double importCuotaSoci;
    private String descripcio;


    //constructor

    public InstalacionDeportiva(String id, String nombre, double superficieTotal, double numHoresDiariesApertura,
            int numTotalEmpleats, int numTotalSocis, double importCuotaSoci, String descripcio) {
        this.id = id;
        this.nombre = nombre;
        this.superficieTotalInstalacion = superficieTotal;
        this.numHoresDiariesApertura = numHoresDiariesApertura;
        this.numTotalEmpleats = numTotalEmpleats;
        this.numTotalSocis = numTotalSocis;
        this.importCuotaSoci = importCuotaSoci;
        this.descripcio = descripcio;
    }


    //getters i setters

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSuperficieTotalInstalacion(double superficieTotal) {
        this.superficieTotalInstalacion = superficieTotal;
    }

    public void setNumHoresDiariesApertura(double numHoresDiariesApertura) {
        this.numHoresDiariesApertura = numHoresDiariesApertura;
    }

    public void setNumTotalEmpleats(int numTotalEmpleats) {
        this.numTotalEmpleats = numTotalEmpleats;
    }

    public void setNumTotalSocis(int numTotalSocis) {
        this.numTotalSocis = numTotalSocis;
    }

    public void setImportCuotaSoci(double importCuotaSoci) {
        this.importCuotaSoci = importCuotaSoci;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public double getSuperficieTotalInstalacion() {
        return superficieTotalInstalacion;
    }

    public double getNumHoresDiariesApertura() {
        return numHoresDiariesApertura;
    }

    public int getNumTotalEmpleats() {
        return numTotalEmpleats;
    }

    public int getNumTotalSocis() {
        return numTotalSocis;
    }

    public double getImportCuotaSoci() {
        return importCuotaSoci;
    }

    public String getDescripcio() {
        return descripcio;
    }





    public void altaMiembro(){
        this.setNumTotalSocis(getNumTotalSocis()+1);
    }

    public boolean bajaMiembro(){
        if(this.getNumTotalSocis()>1){
            this.setNumTotalSocis(getNumTotalSocis()-1);
            return true;
        }
        return false;
    }

    public double calcularAreaTotalPracticable(){
        return 0;
    }

    public double calcularIngresosExtrasDiarios(){
        return 0;
    }

    public boolean hayEntrenadoresPersonales(){
        return false;
    }


    @Override
    public int calcularTotalPublico() {
        return this.getNumTotalSocis();
    }

    @Override 
    public double calcularFacturacionMensual(){
        return this.getNumTotalSocis() * this.getImportCuotaSoci();
    }


    @Override
    public String toString() {
        return "InstalacionDeportiva [id=" + id + ", nombre=" + nombre + ", superficieTotalInstalacion="
                + superficieTotalInstalacion + ", numHoresDiariesApertura=" + numHoresDiariesApertura
                + ", numTotalEmpleats=" + numTotalEmpleats + ", numTotalSocis=" + numTotalSocis + ", importCuotaSoci="
                + importCuotaSoci + ", descripcio=" + descripcio + ", calcularAreaTotalPracticable()="
                + calcularAreaTotalPracticable() + ", calcularIngresosExtrasDiarios()="
                + calcularIngresosExtrasDiarios() + ", hayEntrenadoresPersonales()=" + hayEntrenadoresPersonales()
                + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InstalacionDeportiva other = (InstalacionDeportiva) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}

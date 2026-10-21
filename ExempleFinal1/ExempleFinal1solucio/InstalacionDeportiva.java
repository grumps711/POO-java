package ex_InstalacionesDeportivas;

public abstract class  InstalacionDeportiva implements Negocio {
    private String id;
    private String nombre;
    private double superficieTotal;
    private int horasApertura;
    private int numeroEmpleados;
    private int numeroMiembros;
    private double cuotaMiembro;
    private String descripcion;

    // Constructor
    public InstalacionDeportiva(String id, String nombre, double superficieTotal, int horasApertura, int numeroEmpleados, int numeroMiembros, double cuotaMiembro, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.superficieTotal = superficieTotal;
        this.horasApertura = horasApertura;
        this.numeroEmpleados = numeroEmpleados;
        this.numeroMiembros = numeroMiembros;
        this.cuotaMiembro = cuotaMiembro;
        this.descripcion = descripcion;
    }

    // M�todos getter y setter



	public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getSuperficieTotal() { return superficieTotal; }//*********** set
    public int getHorasApertura() { return horasApertura; }//*********** set
    public int getNumeroEmpleados() { return numeroEmpleados; }//*********** set
    public int getNumeroMiembros() { return numeroMiembros; }
    public double getCuotaMiembro() {return cuotaMiembro;}//*********** set
    public String getDescripcion() { return descripcion; }//*********** set
      
    public void setSuperficieTotal(double superficieTotal) {this.superficieTotal = superficieTotal;}
	public void setHorasApertura(int horasApertura) {this.horasApertura = horasApertura;}
	public void setNumeroEmpleados(int numeroEmpleados) {this.numeroEmpleados = numeroEmpleados;}
	public void setCuotaMiembro(double cuotaMiembro) {this.cuotaMiembro = cuotaMiembro;}
	public void setDescripcion(String descripcion) {this.descripcion = descripcion;	}

	// M�todo para alta de miembros
    public void altaMiembro() {
        numeroMiembros++;
    }

    // M�todo para baja de miembros
    public boolean bajaMiembro() {
        if (numeroMiembros > 1) {
            numeroMiembros--;
            return true;
        }
        return false;
    }

    // M�todos que ser�n sobreescritos en las subclases
    public double  calcularAreaTotalPracticable() {
        return 0;  // Ser� sobrescrito en las subclases
    }

    public double calcularIngresosExtrasDiarios() {
        return 0;  // Ser� sobrescrito en las subclases
    }

    public boolean hayEntrenadoresPersonales() {
        return false;  // Por defecto ser� false, solo se sobrescribir� en las subclases adecuadas
    }

    // M�todo toString
    @Override
    public String toString() {
        return "InstalacionDeportiva{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", superficieTotal=" + superficieTotal +
                ", horasApertura=" + horasApertura +
                ", numeroEmpleados=" + numeroEmpleados +
                ", numeroMiembros=" + numeroMiembros +
                ", cuotaMiembro=" + cuotaMiembro +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    // M�todo equals basado en el ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstalacionDeportiva that = (InstalacionDeportiva) o;
        return id.equals(that.id);
    }
    
    //Metodos de la interface
    public int calcularTotalPublico() {  // N�mero de usuarios registrados o socios
    	return numeroMiembros;
    }
    public double calcularFacturacionMensual() {
    	return numeroMiembros*cuotaMiembro; 
    }
}

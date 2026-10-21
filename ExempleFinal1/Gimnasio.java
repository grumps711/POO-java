public class Gimnasio extends InstalacionDeportiva{
    

    private int totalMaquinas;
    private boolean entrenadorDisponible;

    
    public Gimnasio(String id, String nombre, double superficieTotal, int horasApertura, int numeroEmpleados,
            int numeroMiembros, double cuotaMiembro, String descripcion, int totalMaquinas,
            boolean entrenadorDisponible) {
        super(id, nombre, superficieTotal, horasApertura, numeroEmpleados, numeroMiembros, cuotaMiembro, descripcion);
        this.totalMaquinas = totalMaquinas;
        this.entrenadorDisponible = entrenadorDisponible;
    }

    public int getTotalMaquinas() {
        return totalMaquinas;
    }

    public void setTotalMaquinas(int totalMaquinas) {
        this.totalMaquinas = totalMaquinas;
    }

    public boolean isEntrenadorDisponible() {
        return entrenadorDisponible;
    }

    public void setEntrenadorDisponible(boolean entrenadorDisponible) {
        this.entrenadorDisponible = entrenadorDisponible;
    }



    @Override 
    public double calcularAreaTotalPracticable(){
        double tamañoMaquina = 1.5;
        return super.getSuperficieTotalInstalacion() - (this.getTotalMaquinas()*tamañoMaquina);
    }
    

    public boolean hayEntrenadoresPersonales(){
        if (this.isEntrenadorDisponible()==true){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Gimnasio [totalMaquinas=" + totalMaquinas + ", entrenadorDisponible=" + entrenadorDisponible
                + ", toString()=" + super.toString() + "]";
    }
}

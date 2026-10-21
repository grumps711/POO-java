package ex_InstalacionesDeportivas;

public class Gimnasio extends InstalacionDeportiva {
    private int numeroMaquinas;
    private boolean entrenadoresPersonales;

    public Gimnasio(String id, String nombre, double superficieTotal, int horasApertura, int numeroEmpleados, int numeroMiembros,double cuotaMiembro, String descripcion,
                    int numeroMaquinas, boolean entrenadoresPersonales) {
        super(id, nombre, superficieTotal, horasApertura, numeroEmpleados, numeroMiembros, cuotaMiembro,descripcion);
        this.numeroMaquinas = numeroMaquinas;
        this.entrenadoresPersonales = entrenadoresPersonales;
    }

    // Sobrescribimos el c�lculo del �rea total practicable
    @Override
    public double calcularAreaTotalPracticable() {
        return getSuperficieTotal() - (numeroMaquinas * 1.5);
    }

    // Sobrescribimos para indicar si hay entrenadores personales
    @Override
    public boolean hayEntrenadoresPersonales() {
        return entrenadoresPersonales;
    }

    @Override
    public String toString() {
        return super.toString() + ", numeroMaquinas=" + numeroMaquinas + ", entrenadoresPersonales=" + entrenadoresPersonales;
    }
}
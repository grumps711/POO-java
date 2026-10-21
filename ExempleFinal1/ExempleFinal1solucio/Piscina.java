package ex_InstalacionesDeportivas;

public class Piscina extends InstalacionDeportiva {
    private int numeroPiscinas;
    private double areaTotalPiscinas;
    private boolean climatizada;

    public Piscina(String id, String nombre, double superficieTotal, int horasApertura, int numeroEmpleados, int numeroMiembros, double cuotaMiembro,String descripcion,
                   int numeroPiscinas, double areaTotalPiscinas, boolean climatizada) {
        super(id, nombre, superficieTotal, horasApertura, numeroEmpleados, numeroMiembros, cuotaMiembro,descripcion);
        this.numeroPiscinas = numeroPiscinas;
        this.areaTotalPiscinas = areaTotalPiscinas;
        this.climatizada = climatizada;
    }

    // Sobrescribimos el cálculo del área total practicable
    @Override
    public double calcularAreaTotalPracticable() {
        double areaPiscinas = climatizada ? areaTotalPiscinas * 1.15 : areaTotalPiscinas;
        return getSuperficieTotal() - areaPiscinas;
    }

    @Override
    public String toString() {
        return super.toString() + ", numeroPiscinas=" + numeroPiscinas + ", areaTotalPiscinas=" + areaTotalPiscinas + ", climatizada=" + climatizada;
    }
}
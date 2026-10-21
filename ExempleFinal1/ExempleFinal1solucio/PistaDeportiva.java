package ex_InstalacionesDeportivas;

public class PistaDeportiva extends InstalacionDeportiva {
    private int numeroPistas;
    private boolean alquilableANoSocios;
    private double tarifaAlquiler;

    public PistaDeportiva(String id, String nombre, double superficieTotal, int horasApertura, int numeroEmpleados, int numeroMiembros, double cuotaMiembro,String descripcion,
                          int numeroPistas, boolean alquilableANoSocios, double tarifaAlquiler) {
        super(id, nombre, superficieTotal, horasApertura, numeroEmpleados, numeroMiembros, cuotaMiembro,descripcion);
        this.numeroPistas = numeroPistas;
        this.alquilableANoSocios = alquilableANoSocios;
        this.tarifaAlquiler = tarifaAlquiler;
    }

    // Sobrescribimos el cálculo de ingresos extras diarios por alquiler de pistas
    @Override
    public double calcularIngresosExtrasDiarios() {
        if (alquilableANoSocios) {
            int pistasParaAlquilar = (int) Math.ceil(numeroPistas * 0.1); // Máximo el 10% de las pistas para no socios
            return pistasParaAlquilar * tarifaAlquiler * getHorasApertura();
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", numeroPistas=" + numeroPistas + ", alquilableANoSocios=" + alquilableANoSocios + ", tarifaAlquiler=" + tarifaAlquiler;
    }
}

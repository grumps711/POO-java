package Herencia.Herencia1ClassesTaules;

public class SocioMax10Actividades extends Socio {

    private int numeroActividades;

    private static final double CUOTA_ACTIVIDAD = 2.0;
    private static final double COSTE_ADICIONAL_MENSUAL = 6.0;
    private static final double COSTE_ADICIONAL_ACTIVIDAD = 1.0;

    public SocioMax10Actividades(String dni, String nombreApellidos, int numeroActividades) {

        super(dni, nombreApellidos);

        if (numeroActividades < 0 || numeroActividades > 10) {
            throw new IllegalArgumentException("Un socio Max10 puede realizar entre 0 y 10 actividades");
        }

        this.numeroActividades = numeroActividades;
    }

    @Override 
    public double cuotaMensual() {
        return getCuotaBaseMensual() + COSTE_ADICIONAL_MENSUAL + numeroActividades * CUOTA_ACTIVIDAD + numeroActividades * COSTE_ADICIONAL_ACTIVIDAD;
    }

    @Override
    public String toString() {
        return "Socio maximo 10 actividades" + "\nNumero de actividades: " + numeroActividades + "\n" + super.toString();
    }
}
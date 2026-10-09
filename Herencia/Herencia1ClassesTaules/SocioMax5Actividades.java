package Herencia.Herencia1ClassesTaules;

public class SocioMax5Actividades extends Socio {

    private int numeroActividades;

    private static final double CUOTA_ACTIVIDAD = 2.0;
    private static final double COSTE_ADICIONAL_ACTIVIDAD = 2.0;

    public SocioMax5Actividades(String dni, String nombreApellidos,int numeroActividades) {

        super(dni, nombreApellidos);

        if (numeroActividades < 0 || numeroActividades > 5) {
            throw new IllegalArgumentException(
                "Un socio Max5 puede realizar entre 0 y 5 actividades"
            );
        }

        this.numeroActividades = numeroActividades;
    }

    @Override 
    public double cuotaMensual() {
        return getCuotaBaseMensual() + numeroActividades * CUOTA_ACTIVIDAD + numeroActividades * COSTE_ADICIONAL_ACTIVIDAD;
    }

    @Override
    public String toString() {
        return "Socio maximo 5 actividades" + "\nNumero de actividades: " + numeroActividades + "\n" + super.toString();
    }
}
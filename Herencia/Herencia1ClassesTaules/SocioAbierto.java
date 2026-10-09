package Herencia.Herencia1ClassesTaules;

public class SocioAbierto extends Socio {

    private static final double COSTE_ADICIONAL_MENSUAL = 38.0;

    public SocioAbierto(String dni, String nombreApellidos) {
        super(dni, nombreApellidos);
    }

    @Override
    public double cuotaMensual() {
        return getCuotaBaseMensual() + COSTE_ADICIONAL_MENSUAL;
    }

    @Override
    public String toString() {
        return "Socio Abierto" + "\n" + super.toString();
    }
}
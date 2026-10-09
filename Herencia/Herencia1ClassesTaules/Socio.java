package Herencia.Herencia1ClassesTaules;

public abstract class Socio {

    private String dni;
    private String nombreApellidos;
    private static final double CUOTA_BASE_MENSUAL = 10.0;

    public Socio(String dni, String nombreApellidos) {
        this.dni = dni;
        this.nombreApellidos = nombreApellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public abstract double cuotaMensual();

    @Override
    public String toString() {
        return "DNI: " + dni + "\nNombre y Apellidos: " + nombreApellidos;
    }

    public double getCuotaBaseMensual() {
        return CUOTA_BASE_MENSUAL;
    }
}
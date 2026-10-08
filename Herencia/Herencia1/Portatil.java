package Herencia.Herencia1;
public class Portatil extends Ordenador {
    
    private double peso;
    private int horasAutonomia;


    public Portatil(String cpu, double vel, int ram, double peso, int horasAutonomia) {
        super(cpu, vel, ram);
        this.peso = peso;
        this.horasAutonomia = horasAutonomia;

    }


    @Override 
    public String toString() {
        return super.toString() + "Peso: " + peso + " kg" + "\n" +
                "Horas de autonomía: " + horasAutonomia + " horas" + "\n";
    }
}

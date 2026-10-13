package Herencia.Herencia1;
public class Portatil extends Ordenador {
    
    private double peso;
    private int horasAutonomia;


    public Portatil(String cpu, double vel, int ram, double peso, int horasAutonomia) {
        super(cpu, vel, ram);
        this.peso = peso;
        this.horasAutonomia = horasAutonomia;
    }


    //  PER CRIDAR AL CONSTRUCTOR PARE FAS GETTERS I PER EL PROPI OBJECTE NORMAL AIXO EN CAS
    //  DE JA TENIR EL CONSTRUCTOR!! PER REAPROFITARLO

    public int getHorasAutonomia() {
        return horasAutonomia;
    }

    public void setHorasAutonomia(int horasAutonomia) {
        this.horasAutonomia = horasAutonomia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override 
    public String toString() {
        return super.toString() + "Peso: " + peso + " kg" + "\n" + "Horas de autonomía: " + horasAutonomia + " horas" + "\n";
    }

    //RECORDA AIXÓ EH, SUPER.TOSTRING() VOLENT DIR QUE AGAFES EL TOSTRING DE LA CLASSE PARE.

}
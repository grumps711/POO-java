package Herencia.Herencia1;

public class Vehiculo {
    

    private String matricula;
    private int numPlazas;

    private static int horaIni = 22;
    private static int horaFi = 6;

    public Vehiculo(String matricula, int numPlazas) {
        this.matricula = matricula;
        this.numPlazas = numPlazas;
    }
    
    public boolean potCircular(int hora, int ocupacio){
        return hora>=horaIni || hora<=horaFi;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static int getHoraFi() {
        return horaFi;
    }

    public static void setHoraFi(int horaFi) {
        Vehiculo.horaFi = horaFi;
    }

    public static int getHoraIni() {
        return horaIni;
    }

    public static void setHoraIni(int horaIni) {
        Vehiculo.horaIni = horaIni;
    }

    public String toString() {
        return "Matricula: " + matricula + "\n" + "NumPlazas: " + numPlazas + "\n";
    }

}

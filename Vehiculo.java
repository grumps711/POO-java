
public class Vehiculo {
    

    private String matricula;
    private int numPlazas;

    public Vehiculo(String matricula, int numPlazas) {
        this.matricula = matricula;
        this.numPlazas = numPlazas;
    }

   

    
    public boolean potCircular(int hora, int ocupacio){
        return false;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

}

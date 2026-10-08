package Herencia.Herencia1;
public class Sobremesa extends Ordenador {
    
    private String tipoMonitor;


    public Sobremesa(String cpu, double velocidad, int ram, String tipoMonitor){
        super(cpu, velocidad, ram);
        this.tipoMonitor = tipoMonitor;
    }


    @Override 
    public String toString() {
        return super.toString() + "Monitor: " + tipoMonitor + "\n";
    }

}

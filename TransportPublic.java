public class TransportPublic extends Vehiculo {
    

    public TransportPublic(String matricula, int numPlazas) {
        super(matricula, numPlazas);
    }

    
    public boolean potCircular(int hora, int ocupacio) {
       return true;
    }

    public String toString() {
        return "Tipo: TransportPublic\n" + super.toString();
    }
}
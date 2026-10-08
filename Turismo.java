public class Turismo extends Vehiculo{
    

    public Turismo(String matricula, int numPlazas) {
        super(matricula, numPlazas);
    }

    @Override
    public boolean potCircular(int hora, int ocupacio) {
        if (hora >= 22 || hora < 6) {
            return true;
        } else {
            return ocupacio >= getNumPlazas() * 0.5;
        }
    }
}

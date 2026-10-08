public class Carga extends Vehiculo {
    

    private boolean permiso;

    public Carga(String matricula, int numPlazas, boolean permiso) {
        super(matricula, numPlazas);
        this.permiso = permiso;
    }


    //Los vehículos de carga necesitan una autorización especial para poder circular por el carril VAO entre las 6 horas y las 22 horas.
    @Override
    public boolean potCircular(int hora, int ocupacio) {
        if (hora >= 22 || hora < 6) {
            return true;
        } else {
            return permiso;
        }
    }

    public String toString() {
        return "Tipo: Carga\n" + super.toString() + "Permiso: " + permiso + "\n";
    }
}


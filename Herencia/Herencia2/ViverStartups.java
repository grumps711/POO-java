
public class ViverStartups {

    private Startup[] locales;

    // Constructor
    public ViverStartups(int numLocales) {
        if (numLocales < 0) {
            throw new IllegalArgumentException("Numero de locales incorrecto");
        }

        locales = new Startup[numLocales];
    }

    // Asignar el primer local libre a una startup
    public int assignarLocal(Startup startup) {

        if (startup == null) {
            return -1;
        }

        for (int i = 0; i < locales.length; i++) {

            if (locales[i] == null) {
                locales[i] = startup;
                return i;
            }
        }

        return -1;
    }

    // Numero de locales libres
    public int numLocalsLliures() {

        int libres = 0;

        for (int i = 0; i < locales.length; i++) {
            if (locales[i] == null) {
                libres++;
            }
        }

        return libres;
    }

    // Buscar el numero de local mediante el CIF
    public int getLocal(String cif) {

        if (cif == null) {
            return -1;
        }

        for (int i = 0; i < locales.length; i++) {

            if (locales[i] != null && locales[i].getCif().equals(cif)) {

                return i;
            }
        }

        return -1;
    }

    // Obtener la startup que ocupa un local
    public Startup getStartup(int numLocal) {

        if (numLocal >= 0 && numLocal < locales.length) {
            return locales[numLocal];
        }

        return null;
    }

    // Mostrar la informacion de los locales
    @Override
    public String toString() {

        String resultado = "Vivero de Startups\n";

        for (int i = 0; i < locales.length; i++) {

            resultado += "\nLocal " + i + ":\n";

            if (locales[i] == null) {
                resultado += "Libre\n";
            } else {
                resultado += locales[i].toString() + "\n";
            }
        }

        return resultado;
    }
}

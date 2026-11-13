package projecte;

/** Parella formada per la medicio i el seu codi d'error (0..5). */
public class ResultatMesura {

    private final Medicio medicio;
    private final int error;

    public ResultatMesura(Medicio medicio, int error) {
        if (error < 0 || error > 5) {
            throw new IllegalArgumentException("El codi d'error ha d'estar entre 0 i 5");
        }
        if ((error == 5) != (medicio == null)) {
            throw new IllegalArgumentException(
                    "L'error 5 correspon a una medicio null, i nomes en aquest cas");
        }
        this.medicio = medicio;
        this.error = error;
    }

    public Medicio getMedicio() {
        return medicio;
    }

    public int getError() {
        return error;
    }

    public String getDescripcioError() {
        switch (error) {
            case 0: return "Lectura normal";
            case 1: return "Supera la mitjana de les ultimes 7 lectures";
            case 2: return "Supera la mitjana de l'historic";
            case 3: return "Supera el maxim de l'historic";
            case 4: return "Fora dels llindars de risc";
            case 5: return "No s'ha pogut fer la lectura";
            default: throw new IllegalStateException("Codi d'error desconegut");
        }
    }

    @Override
    public String toString() {
        return "ResultatMesura{medicio=" + (medicio == null ? "null" : medicio)
                + ", error=" + error + " (" + getDescripcioError() + ")}";
    }
}

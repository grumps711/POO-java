package projecte;

import java.util.Objects;

/** Una unitat de mesura, identificada pel seu nom i simbol. */
public final class UnitatMesura {

    public static final UnitatMesura CELSIUS =
            new UnitatMesura("Graus Celsius", "ºC");
    public static final UnitatMesura HUMITAT_RELATIVA =
            new UnitatMesura("Humitat Relativa", "%HR");
    public static final UnitatMesura PPM_CO2 =
            new UnitatMesura("Parts Per Milio de CO2", "ppmCO2");

    private final String nom;
    private final String simbol;

    public UnitatMesura(String nom, String simbol) {
        if (nom == null || nom.trim().isEmpty()
                || simbol == null || simbol.trim().isEmpty()) {
            throw new IllegalArgumentException("Cal indicar nom i simbol de la unitat");
        }
        this.nom = nom;
        this.simbol = simbol;
    }

    public String getNom() {
        return nom;
    }

    public String getSimbol() {
        return simbol;
    }

    // Dues instancies amb el mateix nom i simbol representen la mateixa unitat.
    @Override
    public boolean equals(Object objecte) {
        if (this == objecte) {
            return true;
        }
        if (!(objecte instanceof UnitatMesura)) {
            return false;
        }
        UnitatMesura altra = (UnitatMesura) objecte;
        return nom.equals(altra.nom) && simbol.equals(altra.simbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, simbol);
    }

    @Override
    public String toString() {
        return nom + " (" + simbol + ")";
    }
}

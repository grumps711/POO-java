
package refugis;

import java.time.LocalDate;

public class TestJerarquia {

    public static void main(String[] args) {

        ServeiPublic publicRefugi = new ServeiPublic(
            "PUB-001",
            "Biblioteca Central",
            "Terrassa",
            "Biblioteca",
            "Passeig de les Lletres",
            "Sí",
            "Generalitat de Catalunya"
        );

        ServeiPrivat privatRefugi = new ServeiPrivat(
            "PRIV-001",
            "Local climatitzat",
            "Terrassa",
            "Local",
            "Carrer Major, 10",
            "Sí",
            5.0,
            LocalDate.of(2027, 7, 1),
            LocalDate.of(2027, 8, 31)
        );

        System.out.println(publicRefugi);
        System.out.println("Font: " + publicRefugi.getFontDades());

        System.out.println();

        System.out.println(privatRefugi);
        System.out.println("Preu per dia: " + privatRefugi.getPreuPerDia());
        System.out.println("Data inici: " + privatRefugi.getDataInici());
        System.out.println("Data fi: " + privatRefugi.getDataFi());
    }
}

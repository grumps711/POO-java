
package refugis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;

public class ControladorRefugis {

    private VistaRefugis vista;
    private LlistaRefugis modelo;

    public ControladorRefugis(VistaRefugis vista, LlistaRefugis modelo) {

        this.vista = vista;
        this.modelo = modelo;

        this.vista.addOyenteAlta(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                altaRefugi();
            }
        });

        this.vista.addOyenteResetear(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.resetearFormulario();
            }
        });
    }

    private void altaRefugi() {

        String nom = vista.getNom().trim();
        String municipi = vista.getMunicipi().trim();
        String tipologia = vista.getTipologia().trim();
        String adreca = vista.getAdreca().trim();
        String aigua = vista.getAiguaPotable().trim();

        if (nom.isEmpty() || municipi.isEmpty()) {
            System.out.println("Cal indicar el nom i el municipi.");
            return;
        }

        // Generem un identificador unic per al nou refugi
        String identificador = "MANUAL-" + UUID.randomUUID();

        RefugiClimatic nouRefugi = new RefugiClimatic(
            identificador,
            nom,
            municipi,
            tipologia,
            adreca,
            aigua
        );

        modelo.altaRefugiClimatic(nouRefugi);

        System.out.println("Refugi donat d'alta:");
        System.out.println("Identificador: " + nouRefugi.getIdentificador());
        System.out.println(nouRefugi);

        vista.resetearFormulario();
    }
}


package refugis;

import java.io.IOException;
import javax.swing.SwingUtilities;

public class AplicacioRefugisClimatics {

    public static void main(String[] args) {

        LlistaRefugis refugis;

        try {
            refugis = LlistaRefugis.carregar();

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error carregant els refugis: "
                    + e.getMessage());
            return;
        }

        SwingUtilities.invokeLater(() -> {

            VistaRefugis vista = new FinestraRefugisClimatics();

            new ControladorRefugis(vista, refugis);

            vista.setVisible(true);
        });
    }
}

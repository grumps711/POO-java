package refugis;

import java.io.IOException;
import javax.swing.SwingUtilities;

public class AplicacioRefugisClimatics {

    public static void main(String[] args) {

        // Carreguem els refugis des del JSON o del fitxer serialitzat
        try {
            LlistaRefugis refugis = LlistaRefugis.carregar();
            refugis.mostrarPrimers(5);

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error carregant els refugis: " + e.getMessage());
            return;
        }

        // Iniciem la interfície gràfica
        SwingUtilities.invokeLater(() -> {
            FinestraRefugisClimatics finestra = new FinestraRefugisClimatics();
            finestra.setVisible(true);
        });
    }
}

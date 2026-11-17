import javax.swing.SwingUtilities;

public class AplicacioRefugisClimatics {
        
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            FinestraRefugisClimatics finestra = new FinestraRefugisClimatics();
            finestra.setVisible(true);
        });
    }
}

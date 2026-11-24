import javax.swing.SwingUtilities;

public class AplicacionCalculadora {

    // Crea i connecta els components del MVC i inicia l'aplicació
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            // Inicialitza i mostra la calculadora
            @Override
            public void run() {
                VistaCalculadora vista = new VentanaCalculadora();
                ModeloCalculadora modelo = new Calculadora();
                ControladorCalculadora controlador = new ControladorCalculadora(vista, modelo);
                vista.setVisible(true);
            }
        });
    }
}

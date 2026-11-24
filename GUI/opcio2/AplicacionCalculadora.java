import javax.swing.SwingUtilities;

public class AplicacionCalculadora {
    public static void main(String[] args) {


        VistaCalculadora vista = new VentanaCalculadora();
        ModeloCalculadora modelo = new Calculadora();
        ControladorCalculadora controlador = new ControladorCalculadora(vista,modelo);

        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                vista.setVisible(true);
            }
        });

        VentanaCalculadora ventana = new VentanaCalculadora();
        ventana.setVisible(true);



    }
}

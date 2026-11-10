import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;

public class VentanaCalculadora extends JFrame{
    
    private JTextField pantalla;
    private JButton botonC;

    public VentanaCalculadora() {
        super("Calculadora");
        this.init();
    }

    private void init() {
        this.setSize(230, 230);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(1000,500);
        this.setResizable(false);

   
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(crearPanelDisplay(), BorderLayout.NORTH);
        this.setContentPane(panelPrincipal);

        panelPrincipal.add(crearPanelClear(), BorderLayout.EAST);


    }

    private JPanel crearPanelDisplay() {

        JPanel panelDisplay = new JPanel();
        JTextField cuadroTexto = new JTextField(10);

        cuadroTexto.setText("0");
        cuadroTexto.setEditable(false);
        cuadroTexto.setHorizontalAlignment(JTextField.RIGHT);
        cuadroTexto.setFont(new Font("Arial", Font.BOLD, 25));
        cuadroTexto.setBackground(Color.WHITE);
        cuadroTexto.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
        panelDisplay.add(cuadroTexto);

        return panelDisplay;
    }

    private JPanel crearPanelClear() {
        JPanel panelClear = new JPanel();

        botonC = new JButton("C");
        botonC.setBackground(Color.RED);
        botonC.setForeground(Color.WHITE);

        panelClear.add(botonC);

        return panelClear;
    }


}

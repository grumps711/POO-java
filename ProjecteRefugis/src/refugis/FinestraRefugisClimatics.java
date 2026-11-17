package refugis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FinestraRefugisClimatics extends JFrame {

    // Botones de la ventana
    private JButton botonC;
    private JButton botonOk;

    // Campos donde el usuario introducira los datos
    private JTextField campoNom;
    private JTextField campoTipologia;
    private JTextField campoMunicipi;
    private JTextField campoAdreca;
    private JTextField campoAigua;

    public FinestraRefugisClimatics() {
        super("App Refugis Climatics");
        this.init();
    }

    private void init() {

        // Configuracion de la ventana
        this.setSize(500, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // Panel principal que organiza toda la ventana
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        panelPrincipal.add(crearPanelInfo(), BorderLayout.NORTH);
        panelPrincipal.add(crearPanelBotones(), BorderLayout.SOUTH);

        this.setContentPane(panelPrincipal);
    }

    private JPanel crearPanelInfo() {

        // Panel que organiza les 5 files verticalment
        JPanel panelInfo = new JPanel(new GridLayout(5, 1, 0, 10));

        campoNom = new JTextField(20);
        campoTipologia = new JTextField(20);
        campoMunicipi = new JTextField(20);
        campoAdreca = new JTextField(20);
        campoAigua = new JTextField(20);

        // Cada fila conte un JLabel i un JTextField
        panelInfo.add(crearFila("Nom del refugi:", campoNom));
        panelInfo.add(crearFila("Tipus del refugi:", campoTipologia));
        panelInfo.add(crearFila("Municipi:", campoMunicipi));
        panelInfo.add(crearFila("Adreça:", campoAdreca));
        panelInfo.add(crearFila("Aigua potable:", campoAigua));

        return panelInfo;
    }

    // Crea una fila amb FlowLayout: etiqueta seguida del camp de text
    private JPanel crearFila(String text, JTextField camp) {

        JPanel fila = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));

        fila.add(new JLabel(text));
        fila.add(camp);

        return fila;
    }


    private JPanel crearPanelBotones() {

        // Distribuimos los botones a izquierda y derecha
        JPanel panelBotones = new JPanel(new BorderLayout());

        botonOk = new JButton("OK");
        botonC = new JButton("Clear");

        panelBotones.add(botonOk, BorderLayout.WEST);
        panelBotones.add(botonC, BorderLayout.EAST);

        return panelBotones;
    }
}

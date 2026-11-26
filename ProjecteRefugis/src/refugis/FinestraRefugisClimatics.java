package refugis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


//Vista: Es lo que el usuario ve y utiliza para pedir algo. (ventanas, botones, campos de texto.)

public class FinestraRefugisClimatics extends JFrame implements VistaRefugis {

    // Botones de la ventana
    private JButton botonC;
    private JButton botonOk;

    // Campos donde el usuario introducira los datos
    private JTextField campoNom;
    private JTextField campoTipologia;
    private JTextField campoMunicipi;
    private JTextField campoAdreca;
    private JTextField campoAigua;

    private JPanel panelAlta;

    public FinestraRefugisClimatics() {
        super("App Refugis Climatics");
        this.init();
    }

    
    private void init() {

        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel(new BorderLayout());

        panelPrincipal.setBorder(
            BorderFactory.createEmptyBorder(15, 15, 15, 15)
        );

        // Contenidor del formulari d'alta
        panelAlta = new JPanel(new BorderLayout());

        panelAlta.add(crearPanelInfo(), BorderLayout.NORTH);
        panelAlta.add(crearPanelBotones(), BorderLayout.SOUTH);

        // Inicialment el formulari està ocult
        panelAlta.setVisible(false);

        panelPrincipal.add(panelAlta, BorderLayout.CENTER);

        setContentPane(panelPrincipal);
        setJMenuBar(crearMenuBar());
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


    private JMenuBar crearMenuBar() {

        JMenuBar menuBar = new JMenuBar();

        JMenu menuRefugis = new JMenu("Refugis");

        JMenuItem itemAlta = new JMenuItem("Alta");
        JMenuItem itemCerca = new JMenuItem("Cerca");

        itemAlta.addActionListener(e -> {
            panelAlta.setVisible(true);
            campoNom.requestFocusInWindow();
        });

        // Encara no hem implementat la cerca
        itemCerca.setEnabled(false);

        menuRefugis.add(itemAlta);
        menuRefugis.add(itemCerca);

        menuBar.add(menuRefugis);

        return menuBar;
    }



    private void addOyentesBotones() {

        botonC.addActionListener(new ActionListener() {  //registra un oyente en el botón Clear!

            @Override
            public void actionPerformed(ActionEvent e) {
                resetearFormulario();       //metodo que hará el botón Clear!
            }
        });
    }


    @Override
    public void addOyenteResetear(ActionListener listener) {
        botonC.addActionListener(listener);
    }


    @Override
    public String getNom() {
        return campoNom.getText();
    }

    @Override
    public String getMunicipi() {
        return campoMunicipi.getText();
    }

    @Override
    public String getTipologia() {
        return campoTipologia.getText();
    }

    @Override
    public String getAdreca() {
        return campoAdreca.getText();
    }

    @Override
    public String getAiguaPotable() {
        return campoAigua.getText();
    }

    @Override
    public void resetearFormulario() {
        campoNom.setText("");
        campoTipologia.setText("");
        campoMunicipi.setText("");
        campoAdreca.setText("");
        campoAigua.setText("");
    }

    @Override
    public void addOyenteAlta(ActionListener listener) {
        botonOk.addActionListener(listener);
    }


}

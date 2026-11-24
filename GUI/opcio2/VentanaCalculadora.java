import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;

public class VentanaCalculadora extends JFrame implements VistaCalculadora {

    private JTextField pantalla;
    private JButton botonC;
    private JButton[] botonesNumeros;
    private JButton botonPuntoDecimal = new JButton(".");
    private JButton botonIgual = new JButton("=");
    private JButton botonSuma = new JButton("+");
    private JButton botonResta = new JButton("-");
    private JButton botonMultiplicacion = new JButton("*");
    private JButton botonDivision = new JButton("/");

    // Crea la finestra de la calculadora i inicialitza els seus components
    public VentanaCalculadora() {
        super("Calculadora");
        this.init();
    }

    // Configura la finestra i distribueix els panells principals
    private void init() {
        this.setSize(240, 240);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(1000, 500);
        this.setResizable(false);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(crearPanelDisplay(), BorderLayout.NORTH);
        this.setContentPane(panelPrincipal);

        panelPrincipal.add(crearPanelClear(), BorderLayout.EAST);
        panelPrincipal.add(crearPanelTeclas(), BorderLayout.SOUTH);
    }

    // Crea i configura la pantalla on es mostren els valors
    private JPanel crearPanelDisplay() {

        JPanel panelDisplay = new JPanel();

        pantalla = new JTextField(10);

        pantalla.setText("0");
        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setFont(new Font("Arial", Font.BOLD, 25));
        pantalla.setBackground(Color.WHITE);
        pantalla.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));

        panelDisplay.add(pantalla);

        return panelDisplay;
    }

    // Crea el panell que conté el botó d'esborrament
    private JPanel crearPanelClear() {
        JPanel panelClear = new JPanel();

        botonC = new JButton("C");
        botonC.setBackground(Color.RED);
        botonC.setForeground(Color.WHITE);

        panelClear.add(botonC);

        return panelClear;
    }

    // Crea els botons numèrics i d'operacions en una graella de 4x4
    private JPanel crearPanelTeclas() {

        JPanel panelNumeros = new JPanel();

        panelNumeros.setLayout(new GridLayout(4, 4, 5, 5));
        panelNumeros.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));

        botonesNumeros = new JButton[10];

        for (int i = 9; i >= 0; i--) {
            botonesNumeros[i] = new JButton(String.valueOf(i));
            //panelNumeros.add(botonesNumeros[i]);
        }

        JButton botonSiete = botonesNumeros[7];
        JButton botonOcho = botonesNumeros[8];
        JButton botonNueve = botonesNumeros[9];
        JButton botonCuatro = botonesNumeros[4];
        JButton botonCinco = botonesNumeros[5];
        JButton botonSeis = botonesNumeros[6];
        JButton botonUno = botonesNumeros[1];
        JButton botonDos = botonesNumeros[2];
        JButton botonTres = botonesNumeros[3];
        JButton botonCero = botonesNumeros[0];

        panelNumeros.add(botonSiete);
        panelNumeros.add(botonOcho);
        panelNumeros.add(botonNueve);
        panelNumeros.add(botonDivision);

        panelNumeros.add(botonCuatro);
        panelNumeros.add(botonCinco);
        panelNumeros.add(botonSeis);
        panelNumeros.add(botonMultiplicacion);

        panelNumeros.add(botonUno);
        panelNumeros.add(botonDos);
        panelNumeros.add(botonTres);
        panelNumeros.add(botonResta);

        panelNumeros.add(botonCero);
        panelNumeros.add(botonPuntoDecimal);
        panelNumeros.add(botonIgual);
        panelNumeros.add(botonSuma);

        return panelNumeros;
    }

    // Actualitza el text que apareix a la pantalla
    @Override
    public void setDisplay(String s) {
        this.pantalla.setText(s);
    }

    // Retorna el text que apareix a la pantalla
    @Override
    public String getDisplay() {
        return this.pantalla.getText();
    }

    // Registra un oient per al botó numèric indicat
    @Override
    public void addOyenteTeclaDigito(int digito, ActionListener l) {
        botonesNumeros[digito].addActionListener(l);
    }

    // Registra un oient per al botó decimal
    @Override
    public void addOyenteTeclaDecimal(ActionListener l) {
        botonPuntoDecimal.addActionListener(l);
    }

    // Registra un oient per al botó de suma
    @Override
    public void addOyenteTeclaMas(ActionListener l) {
        botonSuma.addActionListener(l);
    }

    // Registra un oient per al botó de resta
    @Override
    public void addOyenteTeclaMenos(ActionListener l) {
        botonResta.addActionListener(l);
    }

    // Registra un oient per al botó de multiplicació
    @Override
    public void addOyenteTeclaPor(ActionListener l) {
        botonMultiplicacion.addActionListener(l);
    }

    // Registra un oient per al botó de divisió
    @Override
    public void addOyenteTeclaDiv(ActionListener l) {
        botonDivision.addActionListener(l);
    }

    // Registra un oient per al botó d'igual
    @Override
    public void addOyenteTeclaIgual(ActionListener l) {
        botonIgual.addActionListener(l);
    }

    // Registra un oient per al botó d'esborrament
    @Override
    public void addOyenteTeclaClear(ActionListener l) {
        botonC.addActionListener(l);
    }
}

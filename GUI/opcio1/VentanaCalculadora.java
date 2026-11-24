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

public class VentanaCalculadora extends JFrame implements VistaCalculadora{
    
    private JTextField pantalla;
    private JButton botonC;
    private JButton[] botonesNumeros;
    private JButton botonPuntoDecimal =  new JButton(".");
    private JButton botonIgual = new JButton("=");
    private JButton botonSuma = new JButton("+");
    private JButton botonResta = new JButton("-");
    private JButton botonMultiplicacion = new JButton("*");
    private JButton botonDivision = new JButton("/");

    public VentanaCalculadora() {
        super("Calculadora");
        this.init();
    }

    private void init() {
        this.setSize(240, 240);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(1000,500);
        this.setResizable(false);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(crearPanelDisplay(), BorderLayout.NORTH);
        this.setContentPane(panelPrincipal);

        panelPrincipal.add(crearPanelClear(), BorderLayout.EAST);
        panelPrincipal.add(crearPanelTeclas(), BorderLayout.SOUTH);

    }

    private JPanel crearPanelDisplay() {

        JPanel panelDisplay = new JPanel();

        pantalla = new JTextField(10);

        pantalla.setText("0");
        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setFont(new Font("Arial", Font.BOLD, 25));
        pantalla.setBackground(Color.WHITE);
        pantalla.setBorder(BorderFactory.createLineBorder(
            Color.LIGHT_GRAY, 1, true));

        panelDisplay.add(pantalla);

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

    private JPanel crearPanelTeclas() {

        JPanel panelNumeros = new JPanel();


        panelNumeros.setLayout(new GridLayout(4, 4, 5, 5));
        panelNumeros.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));

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
        
        panelNumeros.add(botonesNumeros[7]);
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

    @Override
    public void setDisplay(String s) {
        this.pantalla.setText(s);
    }

    @Override
    public String getDisplay() {
        return this.pantalla.getText();
    }

    @Override
    public void addOyenteTeclaDigito(int digito, ActionListener l) {
       botonesNumeros[digito].addActionListener(l);
    }

    @Override
    public void addOyenteTeclaDecimal(ActionListener l) {
       botonPuntoDecimal.addActionListener(l);
    }

    @Override
    public void addOyenteTeclaMas(ActionListener l) {
        botonSuma.addActionListener(l);
    }

    @Override
    public void addOyenteTeclaMenos(ActionListener l) {
      botonResta.addActionListener(l);
    }

    @Override
    public void addOyenteTeclaPor(ActionListener l) {
        botonMultiplicacion.addActionListener(l);
    }

    @Override
    public void addOyenteTeclaDiv(ActionListener l) {
       botonDivision.addActionListener(l);
    }

    @Override
    public void addOyenteTeclaIgual(ActionListener l) {
       botonIgual.addActionListener(l);
    }

    @Override
    public void addOyenteTeclaClear(ActionListener l) {
       botonC.addActionListener(l);
    }


}

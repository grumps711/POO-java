import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class MiVentanaRefugisClimatics extends JFrame{
    
    private JButton botonC;
    private JButton botonOk;

    public MiVentanaRefugisClimatics() {
        super("App Refugis Climatics");
        this.init();
    }

    private void init() {
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(1000,500);
        this.setResizable(true);

        this.addComponentsPanelContenido();


        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(crearPanelDisplay(), BorderLayout.NORTH);
        this.setContentPane(panelPrincipal);

        panelPrincipal.add(crearPanelClear(), BorderLayout.EAST);
        panelPrincipal.add(crearPanelOk(), BorderLayout.WEST);

    }

    private JPanel crearPanelDisplay() {

        JPanel panelDisplay = new JPanel(new GridLayout(5,1));

        //label 1 Nom

        JTextField cuadroTextoNom = new JTextField(10);
        JLabel labelNom = new JLabel("Nom del refugi: ");

        cuadroTextoNom.setEditable(true);
        cuadroTextoNom.setHorizontalAlignment(JTextField.LEFT);
        cuadroTextoNom.setFont(new Font("Arial", Font.BOLD, 15));
        cuadroTextoNom.setBackground(Color.WHITE);
        cuadroTextoNom.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
        
        panelDisplay.add(labelNom);
        panelDisplay.add(cuadroTextoNom);

        //Label 2 Tipologia

        JTextField cuadroTextoTipologia = new JTextField(10);
        JLabel labelTipologia = new JLabel("Tipus del refugi: ");

        cuadroTextoTipologia.setEditable(true);
        cuadroTextoTipologia.setHorizontalAlignment(JTextField.LEFT);
        cuadroTextoTipologia.setFont(new Font("Arial", Font.BOLD, 15));
        cuadroTextoTipologia.setBackground(Color.WHITE);
        cuadroTextoTipologia.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));

        panelDisplay.add(labelTipologia);
        panelDisplay.add(cuadroTextoTipologia);


        return panelDisplay;
    }

    private JPanel crearPanelClear() {
        JPanel panelClear = new JPanel();

        botonC = new JButton("C");
        botonC.setBackground(Color.GRAY);
        botonC.setForeground(Color.BLACK);

        panelClear.add(botonC);

        return panelClear;
    }

    private JPanel crearPanelOk() {

        JPanel panelOkay = new JPanel();

        botonOk = new JButton("Ok");
        botonC.setBackground(Color.GRAY);
        botonC.setForeground(Color.BLACK);

        panelOkay.add(botonOk);

        return panelOkay;
    }

    private void addComponentsPanelContenido() {

        JPanel panelContenido = new JPanel(new GridLayout(5, 0));

        panelContenido.setPreferredSize(new Dimension(475, 300));

        JPanel p1 = new JPanel(), p2 = new JPanel(), p3 = new JPanel(), p4 = new JPanel(), p5 = new JPanel();

        p1.setBackground(Color.GRAY);
        p1.setPreferredSize(new Dimension(0, 50));
        p2.setBackground(Color.BLACK);
        p2.setPreferredSize(new Dimension(0, 50));
        p3.setBackground(Color.WHITE);
        p3.setPreferredSize(new Dimension(0, 50));
        p4.setBackground(Color.GREEN);
        p4.setPreferredSize(new Dimension(0, 50));
        p5.setBackground(Color.BLUE);
        p5.setPreferredSize(new Dimension(0, 50));

        panelContenido.add(p1);
        panelContenido.add(p2);
        panelContenido.add(p3);
        panelContenido.add(p4);
        panelContenido.add(p5);

        this.setContentPane(panelContenido); 

    }

}

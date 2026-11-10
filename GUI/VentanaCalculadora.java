import javax.swing.JFrame;

public class VentanaCalculadora extends JFrame{
    

    public VentanaCalculadora() {
        super("Calculadora");
        this.init();
    }

    private void init() {
        this.setSize(230, 230);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(1000,500);
        this.setResizable(false);
    }


}

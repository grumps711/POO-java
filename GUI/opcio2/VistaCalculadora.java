import java.awt.event.ActionListener;

public interface VistaCalculadora {

    // Modifica el text de la pantalla
    public void setDisplay(String s);

    // Retorna el text de la pantalla
    public String getDisplay();

    // Mostra o amaga la finestra
    public void setVisible(boolean v);

    // Registra un oient per a un botó numèric
    public void addOyenteTeclaDigito(int digito, ActionListener l);

    // Registra un oient per al punt decimal
    public void addOyenteTeclaDecimal(ActionListener l);

    // Registra un oient per a la suma
    public void addOyenteTeclaMas(ActionListener l);

    // Registra un oient per a la resta
    public void addOyenteTeclaMenos(ActionListener l);

    // Registra un oient per a la multiplicació
    public void addOyenteTeclaPor(ActionListener l);

    // Registra un oient per a la divisió
    public void addOyenteTeclaDiv(ActionListener l);

    // Registra un oient per a la tecla d'igual
    public void addOyenteTeclaIgual(ActionListener l);

    // Registra un oient per a la tecla d'esborrament
    public void addOyenteTeclaClear(ActionListener l);
}

package refugis;

import java.awt.event.ActionListener;



public interface VistaRefugis {

    void setVisible(boolean visible);

    void resetearFormulario();

    void addOyenteResetear(ActionListener listener);
}
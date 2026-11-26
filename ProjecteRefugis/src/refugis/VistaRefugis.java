
package refugis;

import java.awt.event.ActionListener;

public interface VistaRefugis {

    void setVisible(boolean visible);

    String getNom();
    String getMunicipi();
    String getTipologia();
    String getAdreca();
    String getAiguaPotable();

    void resetearFormulario();

    void addOyenteAlta(ActionListener listener);
    void addOyenteResetear(ActionListener listener);
}

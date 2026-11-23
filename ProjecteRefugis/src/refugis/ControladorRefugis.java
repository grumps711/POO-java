
package refugis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Controlador: gestiona lo que sucede cuando pulsamos un botón. Actúa como intermediario entre Vista y Modelo. Modelo busca tal, Vista muestra tal.

public class ControladorRefugis {

    private VistaRefugis vista;
    private LlistaRefugis modelo;

    public ControladorRefugis(VistaRefugis vista, LlistaRefugis modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.addOyenteResetear(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetear();
            }
        });
    }

    private void resetear() {
        vista.resetearFormulario();
    }
}

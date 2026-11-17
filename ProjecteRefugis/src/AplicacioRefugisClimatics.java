import javax.swing.SwingUtilities;

public class AplicacioRefugisClimatics {
        public static void main(String[] args) {

       /*  LlistaRefugis refugis = new LlistaRefugis();
        refugis.llegir();
        refugis.mostrarPrimers(5); */


        MiVentanaRefugisClimatics ventana = new MiVentanaRefugisClimatics();
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				ventana.setVisible(true);			
			}
		});
    }
}

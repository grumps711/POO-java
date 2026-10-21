

public class Test3 {
	
	    public static void main(String[] args) {
	        // Crear algunas instalaciones deportivas de ejemplo
	        Piscina piscina1 = new Piscina("P001", "Centro Acu�tico", 1000, 10, 15, 300, 50,"Piscinas ol�mpicas", 3, 400, true);
	        Gimnasio gimnasio1 = new Gimnasio("G001", "Gimnasio Fitness", 800, 12, 20, 200, 65, "Gimnasio con pesas", 50, true);
	        PistaDeportiva pista1 = new PistaDeportiva("PD001", "Club de P�del", 600, 8, 10, 150,43, "Pistas de p�del", 4, true, 50);

	        // Crear la lista inicial de instalaciones
	        InstalacionDeportiva[] instalacionesIniciales = { piscina1, gimnasio1 };

	        // Crear la cadena de centros deportivos con un m�ximo de 1000 instalaciones
	        CadenaCentrosDeportivos cadenaMIR = new CadenaCentrosDeportivos(instalacionesIniciales, 1000);

	        // Dar de alta una nueva instalaci�n
	        boolean altaExitosa = cadenaMIR.darAltaInstalacion(pista1);
	        
	        
	        // Test Problema 3 Afegir sentencies ******************************************
	        
	        // Crear NegocioDeportivo con las instalaciones deportivas anteriores
	        
	        
	        // Calcular el total de p�blico atendido
	        

	        // Calcular la facturaci�n mensual


			
	        
			// Test Problema 3 ******************************************

			// Crear NegocioDeportivo con las instalaciones anteriores
			Negocio[] listaNegocios = {piscina1, gimnasio1, pista1};

			NegocioDeportivo negocioMIR = new NegocioDeportivo(listaNegocios);

			// Calcular el total de público atendido
			System.out.println("Total público: " + negocioMIR.calcularTotalPublico());

			// Calcular la facturación mensual
			System.out.println("Facturación mensual: " + negocioMIR.calcularFacturacionMensual());
	        
	    }

}

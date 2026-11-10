package Examens.ExempleFinal1.ExempleFinal1solucio;

public class Test_Final {
	
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
	        System.out.println("Alta de instalaci�n: " + (altaExitosa ? "Exitosa" : "Fallida"));

	        // Contar el n�mero de instalaciones gestionadas
	        System.out.println("N�mero de instalaciones gestionadas: " + cadenaMIR.contarInstalaciones());

	        // Buscar una instalaci�n por ID
	        InstalacionDeportiva buscada = cadenaMIR.buscarInstalacionPorId("G001");
	        System.out.println("Instalaci�n buscada: " + (buscada != null ? buscada.toString() : "No encontrada"));

	        // Calcular la superficie total practicable
	        //System.out.println("Superficie total practicable: " + cadenaMIR.calcularSuperficieTotalPracticable());

	        // Contar instalaciones con entrenadores personales
	        System.out.println("Instalaciones con entrenadores personales: " + cadenaMIR.contarInstalacionesConEntrenadoresPersonales());

	        // Imprimir la informaci�n completa de la cadena
	        System.out.println(cadenaMIR.toString());
	        
	        // Test Problema 3
	        //Crear la cadena de negocios MIR
	        CadenaNegocio cadenaNegocioMIR = new CadenaNegocio(100);

	        // Agregar negocios
	        cadenaNegocioMIR.agregarNegocio(gimnasio1);
	        cadenaNegocioMIR.agregarNegocio(piscina1);
	        cadenaNegocioMIR.agregarNegocio(pista1);

	        // Calcular el total de p�blico atendido
	        System.out.println("Total de p�blico atendido: " + cadenaNegocioMIR.calcularTotalPublico());

	        // Calcular la facturaci�n mensual
	        System.out.println("Facturaci�n mensual total: " + cadenaNegocioMIR.calcularFacturacionMensual());
	    }

}

package ex_InstalacionesDeportivas;

public class Test_Final {
	
	    public static void main(String[] args) {
	        // Crear algunas instalaciones deportivas de ejemplo
	        Piscina piscina1 = new Piscina("P001", "Centro Acuático", 1000, 10, 15, 300, 50,"Piscinas olímpicas", 3, 400, true);
	        Gimnasio gimnasio1 = new Gimnasio("G001", "Gimnasio Fitness", 800, 12, 20, 200, 65, "Gimnasio con pesas", 50, true);
	        PistaDeportiva pista1 = new PistaDeportiva("PD001", "Club de Pádel", 600, 8, 10, 150,43, "Pistas de pádel", 4, true, 50);

	        // Crear la lista inicial de instalaciones
	        InstalacionDeportiva[] instalacionesIniciales = { piscina1, gimnasio1 };

	        // Crear la cadena de centros deportivos con un máximo de 1000 instalaciones
	        CadenaCentrosDeportivos cadenaMIR = new CadenaCentrosDeportivos(instalacionesIniciales, 1000);

	        // Dar de alta una nueva instalación
	        boolean altaExitosa = cadenaMIR.darAltaInstalacion(pista1);
	        System.out.println("Alta de instalación: " + (altaExitosa ? "Exitosa" : "Fallida"));

	        // Contar el número de instalaciones gestionadas
	        System.out.println("Número de instalaciones gestionadas: " + cadenaMIR.contarInstalaciones());

	        // Buscar una instalación por ID
	        InstalacionDeportiva buscada = cadenaMIR.buscarInstalacionPorId("G001");
	        System.out.println("Instalación buscada: " + (buscada != null ? buscada.toString() : "No encontrada"));

	        // Calcular la superficie total practicable
	        //System.out.println("Superficie total practicable: " + cadenaMIR.calcularSuperficieTotalPracticable());

	        // Contar instalaciones con entrenadores personales
	        System.out.println("Instalaciones con entrenadores personales: " + cadenaMIR.contarInstalacionesConEntrenadoresPersonales());

	        // Imprimir la información completa de la cadena
	        System.out.println(cadenaMIR.toString());
	        
	        // Test Problema 3
	        //Crear la cadena de negocios MIR
	        CadenaNegocio cadenaNegocioMIR = new CadenaNegocio(100);

	        // Agregar negocios
	        cadenaNegocioMIR.agregarNegocio(gimnasio1);
	        cadenaNegocioMIR.agregarNegocio(piscina1);
	        cadenaNegocioMIR.agregarNegocio(pista1);

	        // Calcular el total de público atendido
	        System.out.println("Total de público atendido: " + cadenaNegocioMIR.calcularTotalPublico());

	        // Calcular la facturación mensual
	        System.out.println("Facturación mensual total: " + cadenaNegocioMIR.calcularFacturacionMensual());
	    }

}

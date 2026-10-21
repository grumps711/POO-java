

public class Test1 {

	    public static void main(String[] args) {
	        // Crear una instalación con piscina
	        Piscina piscina1 = new Piscina("P001", "Centro Acuático", 1000, 12, 15, 300, 50, "Piscinas olímpicas", 3, 500, true);
	        System.out.println(piscina1);
	        System.out.println("Área total practicable: " + piscina1.calcularAreaTotalPracticable());

	        // Crear una instalación con gimnasio
	        Gimnasio gimnasio1 = new Gimnasio("G001", "Gimnasio Fit", 800, 10, 10, 200, 65, "Gimnasio con pesas y máquinas", 50, true);
	        System.out.println(gimnasio1);
	        System.out.println("Área total practicable: " + gimnasio1.calcularAreaTotalPracticable());
	        System.out.println("¿Tiene entrenadores personales? " + gimnasio1.hayEntrenadoresPersonales());

	        // Crear una instalación con pistas deportivas
	        PistaDeportiva pista1 = new PistaDeportiva("PD001", "Club de Pádel", 600, 8, 8, 150,43, "Pistas de pádel y tenis", 4, true, 50);
	        System.out.println(pista1);
	        System.out.println("Ingresos extras diarios por alquiler: " + pista1.calcularIngresosExtrasDiarios());
	    }
	
}

package Examens.ExempleFinal1.ExempleFinal1solucio;

public class Test {

	    public static void main(String[] args) {
	        // Crear una instalaci�n con piscina
	        Piscina piscina1 = new Piscina("P001", "Centro Acu�tico", 1000, 12, 15, 300, 50, "Piscinas ol�mpicas", 3, 500, true);
	        System.out.println(piscina1);
	        System.out.println("�rea total practicable: " + piscina1.calcularAreaTotalPracticable());

	        // Crear una instalaci�n con gimnasio
	        Gimnasio gimnasio1 = new Gimnasio("G001", "Gimnasio Fit", 800, 10, 10, 200, 65, "Gimnasio con pesas y m�quinas", 50, true);
	        System.out.println(gimnasio1);
	        System.out.println("�rea total practicable: " + gimnasio1.calcularAreaTotalPracticable());
	        System.out.println("�Tiene entrenadores personales? " + gimnasio1.hayEntrenadoresPersonales());

	        // Crear una instalaci�n con pistas deportivas
	        PistaDeportiva pista1 = new PistaDeportiva("PD001", "Club de P�del", 600, 8, 8, 150,43, "Pistas de p�del y tenis", 4, true, 50);
	        System.out.println(pista1);
	        System.out.println("Ingresos extras diarios por alquiler: " + pista1.calcularIngresosExtrasDiarios());
	    }
	
}

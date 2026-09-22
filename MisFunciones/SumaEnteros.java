// código de la clase SumaEnteros
// La sentencia import es similar al #include de C++.
// En este caso importamos la clase Scanner que nos
// permite realizar lecturas de diferentes flujos de entrada


import java.util.Scanner;


public class SumaEnteros {
	public static void main(String[] args) {
		
		int x,y;
		 // Declaramos una variable de la clase Scanner y
		 // le asignamos la creación de un objeto de la clase Scanner
		 // asociado al canal estándar de entrada (System.in)
		 
		 Scanner scanner = new Scanner(System.in);
		 // Escribimos en el canal estándar de salida (System.out)
		 // utilizando el método println
		 
		 System.out.println("Escribe un entero:");
		 // Leemos un entero del flujo de entrada asociado al
		 // objeto scanner (es decir, del canal estándar de entrada)
		
		 x = scanner.nextInt();
		 System.out.println("Escribe otro entero:");
		
		 y = scanner.nextInt();
		 System.out.println(x + " + " + y + " = " + (x + y));
 }
}
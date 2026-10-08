import java.util.Scanner;



public class LongCalculoFactorial {

	public static void main(String[] args) {
		
		int x,i;	
		
		long factor = 1;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe un entero pequeño:");
		x = scanner.nextInt();
		
		
		for(i = 0; i<x; i++) {
			
			factor*=(x-i);
		}
		
		System.out.println("El factorial es "+factor);
	}

}

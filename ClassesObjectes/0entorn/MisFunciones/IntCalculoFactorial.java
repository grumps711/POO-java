import java.util.Scanner;



public class IntCalculoFactorial {

	public static void main(String[] args) {
		
		int n;	
		int fact = 1;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe un entero pequeño:");
		n = scanner.nextInt();
		
		
		for(int i = 0; i<n; i++) {
			
			fact*=(n-i);
		}
		
		System.out.println("El factorial de "+n+" es "+fact);

		scanner.close();
	}

}

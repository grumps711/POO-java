import java.util.Scanner;



public class DividirReales {

	public static void main(String[] args) {
		double num,den;
		
		 Scanner scanner = new Scanner(System.in);
 
		 System.out.println("Escribe un Real:");
		 num = scanner.nextDouble(); 
		 
		 System.out.println("Escribe otro Real:");
		 den = scanner.nextDouble();
		 
		 if(den!=0) {
			 System.out.println("El resultado es "+num/den);
		 }
		 else {
			 System.out.println("División no correcta");
		 }
		 
	
		 
	}

}

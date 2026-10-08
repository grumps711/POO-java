import java.util.Scanner;

public class MaxDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int x,y,max;
		
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 
		 System.out.println("Escribe un entero:");
		 x = scanner.nextInt();
		 
		 System.out.println("Escribe otro entero:");
		 y = scanner.nextInt();
		 
		 if(x>=y) {
			 max=x;
		 }
		 else{
			 max=y;
		 }

		 System.out.println("El número "+max + " es mayor");
	}
}

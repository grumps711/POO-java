import java.util.Scanner;

public class MaxTres {

	public static void main(String[] args) {

		int x,y,z,max;
		
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 
		 System.out.println("Escribe un entero:");
		 x = scanner.nextInt();
		 
		 System.out.println("Escribe otro entero:");
		 y = scanner.nextInt();
		 
		 System.out.println("Escribe otro entero:");
		 z = scanner.nextInt();
		 
		 
		 //x es major
		 if(x>y && x>z) {
			 max=x;
		 }
		 
		 //y es major
		 else if (y>z){
			 max=y;
		 }
		 
		 //z es major
		 else {
			 max=z;
		}
		 
		 System.out.println("El número "+max + " es mayor");

	}

}

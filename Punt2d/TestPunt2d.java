package Punt2d;

import java.util.Scanner;

public class TestPunt2d {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Punt2d punt1 = new Punt2d();
        Punt2d punt2 = new Punt2d();

        System.out.println("Escribe la coordenada x del primer punto:");
        punt1.x = scanner.nextDouble();

        System.out.println("Escribe la coordenada y del primer punto:");
        punt1.y = scanner.nextDouble();


        System.out.println("Escribe la coordenada x del segundo punto:");
        punt2.x = scanner.nextDouble();

        System.out.println("Escribe la coordenada y del segundo punto:");
        punt2.y = scanner.nextDouble();

        System.out.println("Els punts agafats són: " + punt1.toString() + " i " + punt2.toString());
        System.out.println("La distancia entre els dos punts és: " +punt1.distancia2punts(punt2));


        
        scanner.close();
    }
        
}

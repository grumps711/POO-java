package ClassesObjectes3i4;

import java.util.Scanner;

public class TestPunt2d {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //prova del constructor sense paràmetres
        Punt2d punt1 = new Punt2d();

        System.out.println("Escriu la coordenada x del primer punt:");
        punt1.setX(scanner.nextDouble());

        System.out.println("Escriu la coordenada y del primer punt:");
        punt1.setY(scanner.nextDouble());



        //prova del constructor amb coordenades com a paràmetres
        System.out.println("Escriu la coordenada x del segon punt:");
        double x = scanner.nextDouble();

        System.out.println("Escriu la coordenada y del segon punt:");
        double y = scanner.nextDouble();

        Punt2d punt2 = new Punt2d(x, y);

        System.out.println("Els punts són:");
        System.out.println("Punt 1: " + punt1);
        System.out.println("Punt 2: " + punt2);



        //prova del constructor de copia
        Punt2d punt3 = new Punt2d(punt1);

        System.out.println("Punt 3 creat com a copia dle punt1 està a " + punt3);
        
        
        //prova del mètode distanciaDosPunts amb un Punt2d com a paràmetre
        System.out.println("La distancia entre els dos punts és: " +punt1.distanciaDosPunts(punt2));


        //prova del mètode distanciaDosPunts amb coordenades com a paràmetres
        System.out.println("La distancia entre els dos punts és: " +punt1.distanciaDosPunts(x, y));


        

        scanner.close();
    }
        
}

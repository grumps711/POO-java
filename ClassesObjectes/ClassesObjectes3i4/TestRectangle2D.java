

import java.util.Scanner;

public class TestRectangle2D {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Primer punt:");

        System.out.print("x: ");
        double x1 = scanner.nextDouble();

        System.out.print("y: ");
        double y1 = scanner.nextDouble();


        System.out.println("Segon punt:");

        System.out.print("x: ");
        double x2 = scanner.nextDouble();

        System.out.print("y: ");
        double y2 = scanner.nextDouble();


        //prova del constructor amb dos punts com a paràmetres

        Punt2d punt1 = new Punt2d(x1, y1);
        Punt2d punt2 = new Punt2d(x2, y2);

        Rectangle2D rectangle1 = new Rectangle2D(punt1, punt2);

        System.out.println("\nRectangle 1:");
        System.out.println(rectangle1);

        System.out.println("Àrea: " + rectangle1.area());
        System.out.println("Perímetre: " + rectangle1.perimetre());


        //prova del constructor de còpia
        Rectangle2D rectangle2 =new Rectangle2D(rectangle1);

        System.out.println("\nRectangle 2 (còpia):");
        System.out.println(rectangle2);

        System.out.println("Àrea: " + rectangle2.area());
        System.out.println("Perímetre: " + rectangle2.perimetre());


        scanner.close();
    }
}
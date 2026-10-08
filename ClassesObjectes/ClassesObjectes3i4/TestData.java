

import java.util.Scanner;

public class TestData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Data d1 = new Data();
        Data d2 = new Data();
  

        System.out.println("Primera data:");

        System.out.print("Dia: ");
        d1.setDia(scanner.nextInt());

        System.out.print("Mes: ");
        d1.setMes(scanner.nextInt());

        System.out.print("Any: ");
        d1.setAny(scanner.nextInt());


        System.out.println("Segona data:");

        System.out.print("Dia: ");
        d2.setDia(scanner.nextInt());

        System.out.print("Mes: ");
        d2.setMes(scanner.nextInt());

        System.out.print("Any: ");
        d2.setAny(scanner.nextInt());



        //prova del mètode amb un objecte Data com a paràmetre
        int resultat = d1.anteriorPosteriorIgual(d2);


        if (resultat == -1) {
            
            System.out.println("Dates ordenades:");
            System.out.println(d1);
            System.out.println(d2);

        } else if (resultat == 1) {
           
            System.out.println("Dates ordenades:");
            System.out.println(d2);
            System.out.println(d1);

        } else {

            System.out.println("Les dues dates són iguals: " + d1);
        }


        //prova del mètode sobrecarregat amb tres paràmetres
        System.out.println("\nProvem el mètode sobrecarregat amb el dia, mes i any:");


        int resultat2 = d1.anteriorPosteriorIgual(d2.getDia(), d2.getMes(), d2.getAny());

        System.out.println("Resultat del mètode sobrecarregat: " + resultat2);

        
        
        //prova del constructor de copia
        Data d3 = new Data(d1);
        
        System.out.println("\nProva del constructor de copia:");
        System.out.println("Data original (data1): " + d1);
        System.out.println("Data copiada (data3): " + d3);


        scanner.close();
    }
}
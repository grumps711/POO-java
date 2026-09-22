package Punt2d;

import java.util.Scanner;

public class TestData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Data d1 = new Data();
        Data d2 = new Data();

        Data d3 = new Data();
        Data d4 = new Data();
    


        //test del primer metode
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

        System.out.println("Provem segon mètode:");
        System.out.println("Tercera data:");

        System.out.print("Dia: ");
        d3.setDia(scanner.nextInt());

        System.out.print("Mes: ");
        d3.setMes(scanner.nextInt());

        System.out.print("Any: ");
        d3.setAny(scanner.nextInt());


        System.out.println("Quarta data:");

        System.out.print("Dia: ");
        d4.setDia(scanner.nextInt());

        System.out.print("Mes: ");
        d4.setMes(scanner.nextInt());

        System.out.print("Any: ");
        d4.setAny(scanner.nextInt());





        int resultat2 = d3.anteriorPosteriorIgual(d4.dia, d4.mes, d4.any);

        if (resultat2 == -1) {

            System.out.println("Dates ordenades:");
            System.out.println(d3);
            System.out.println(d4);

        } else if (resultat2 == 1) {

            System.out.println("Dates ordenades:");
            System.out.println(d4);
            System.out.println(d3);

        } else {

            System.out.println("Les dues dates són iguals: " + d3);
        }
        


        scanner.close();
    }
}
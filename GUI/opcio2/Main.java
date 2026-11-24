import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ModeloCalculadora calc = new Calculadora();

        System.out.print("Introdueix el primer operand: ");
        double a = sc.nextDouble();

        System.out.print("Introdueix l'operador: ");
        char c = sc.next().charAt(0);

        System.out.print("Introdueix el segon operand: ");
        double b = sc.nextDouble();

        OperadorBinario operacio;

        switch (c) {
            case '+':
                operacio = (x, y) -> x + y;
                break;

            case '-':
                operacio = (x, y) -> x - y;
                break;

            case '*':
                operacio = (x, y) -> x * y;
                break;

            case '/':
                operacio = (x, y) -> x / y;
                break;

            default:
                System.out.println("Operador incorrecte");
                sc.close();
                return;
        }

        calc.nuevoOperando(a);
        calc.nuevaOperacion(operacio);
        calc.nuevoOperando(b);

        System.out.println("Resultat: " + calc.getResultado());

        sc.close();
    }
}
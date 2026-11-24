import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ModeloCalculadora calc = new Calculadora();

        System.out.print("Introduce el primer operando: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        System.out.print("Introduce el segundo operando: ");
        double b = sc.nextDouble();

        calc.nuevoOperando(a);

        if(operador=='+'){
            calc.nuevaOperacion(new Suma());
        }

        else if(operador == '-'){
            calc.nuevaOperacion(new Resta());
        }

        else if(operador == '*'){
            calc.nuevaOperacion(new Multiplicacion());
        }

        else if(operador == '/'){
            calc.nuevaOperacion(new Division());
        }

        else{
            System.out.println("Operador incorrecto");
            sc.close();
        }

        
        calc.nuevoOperando(b);

        System.out.println("Resultado: "+calc.getResultado());

        sc.close();
    }
}
package rocketeam.matias__ac.mac_java.mod04;

import java.util.Scanner;

//modulo 4 ejercicio 15
public class Calculadora {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int operando1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int operando2 = scanner.nextInt();

        System.out.print("Ingrese la funcion a realizar (+, -, x, :, /): ");
        String signo = scanner.next();

        int resultado = 0;

        switch (signo) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "x":
                resultado = operando1 * operando2;
                break;
            case ":":
                resultado = operando1 / operando2;
                break;
            case "/":
                resultado = operando1 % operando2;
                break;
            default:
                System.out.println("Signo aritmético inválido.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
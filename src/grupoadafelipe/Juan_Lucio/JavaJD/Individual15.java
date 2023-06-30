package Calculadora;

import java.util.Scanner;

public class Individual15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer operando:");
        int operando1 = scanner.nextInt();

        System.out.println("Ingrese el segundo operando:");
        int operando2 = scanner.nextInt();

        System.out.println("Ingrese el signo aritmético (+, -, x, :, /):");
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
                System.out.println("Signo aritmético no válido.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
package bytemaster.osvaldo_toro.javaotm;

import java.util.Scanner;

public class individual15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer operando: ");
        int operando1 = scanner.nextInt();

        System.out.print("Ingrese el segundo operando: ");
        int operando2 = scanner.nextInt();

        System.out.print("Ingrese el signo aritmético (+, -, x, :, /): ");
        String signo = scanner.next();

        int resultado = 0;

        switch (signo){
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
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    return;
                }
                break;
            case "/":
                if (operando2 != 0) {
                    resultado = operando1 % operando2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Signo aritmético inválido.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
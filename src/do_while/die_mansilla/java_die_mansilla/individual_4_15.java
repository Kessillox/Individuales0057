package do_while.die_mansilla.java_die_mansilla;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class individual_4_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        out.println("Ingrese que operacion desea realizar entre los 2 numeros (+, -, x, :, /): ");
        String signo = scanner.next();

        out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();


        int resultado;

        switch (signo) {
            case "+" -> resultado = num1 + num2;
            case "-" -> resultado = num1 - num2;
            case "*" -> resultado = num1 * num2;
            case ":" -> resultado = num1 / num2;
            case "/" -> resultado = num1 % num2;
            default -> {
                out.println("Signo Aricmetico Invalido, favor ingresar uno de los siguientes signos (+, -, x, :, /): ");
                return;
            }
        }
        out.println("El resultado es: " + resultado);
    }

}

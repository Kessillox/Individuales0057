package los_malvekexxxx.gabriel_cordero.java_gcm;

import java.util.Scanner;

public class TareaIndividual15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Bienvenido a tu calculadora JAVA");
        System.out.println("---------------------------------");
        System.out.println();

        double numero1, numero2, resultado;
        String signo;

        System.out.print("Ingrese el primer número: ");
        numero1 = sc.nextDouble();
        System.out.println();
        System.out.print("Ingrese el segundo número: ");
        numero2 = sc.nextDouble();
        System.out.println();

        boolean signoValido = false;

        while (!signoValido) {
            System.out.print("Ingrese el signo aritmético (+ (Suma), - (Resta), x (Multiplicación), / (División)): ");
            signo = sc.next();
            System.out.println();
            if (signo.equals("+")) {
                resultado = numero1 + numero2;
                System.out.println("El resultado de la Suma es: " + resultado);
                signoValido = true;
            } else if (signo.equals("-")) {
                resultado = numero1 - numero2;
                System.out.println("El resultado de la Resta es: " + resultado);
                signoValido = true;
            } else if (signo.equals("x")) {
                resultado = numero1 * numero2;
                System.out.println("El resultado de la Multiplicación es: " + resultado);
                signoValido = true;
            } else if (signo.equals("/")) {
                resultado = numero1 / numero2;
                System.out.println("El resultado de la División es: " + resultado);
                signoValido = true;
            } else {
                System.out.println("El signo aritmético no es válido, ingreselo nuevamente.");
            }
        }

        System.out.println();
        System.out.println("Gracias por ocupar nuestra calculadora");
    }
}

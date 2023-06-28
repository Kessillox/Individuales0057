    package rocketeam.alejandro_quinones.java_alejandro;

import java.util.Scanner;

public class Individual15 {
    public static void main(String[] args) {
        int primero;
        int segundo;
        String operador;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número para realizar una operación");
        primero = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingresa la operación que deseas efectuar");
        System.out.println("sumar (+)");
        System.out.println("restar (-)");
        System.out.println("multiplar (*)");
        System.out.println("dividir (/)");
        operador = sc.nextLine().toLowerCase();

        System.out.println("Ingresa el segundo número");
        segundo = sc.nextInt();


        switch (operador) {
            case "+":
            case "sumar":
                System.out.println("El resultado es: " + (primero + segundo));
                break;
            case "-":
            case "restar":
               System.out.println("El resultado es: " + (primero - segundo));
               break;
            case "*":
            case "multiplicar":
                System.out.println("El resultado es: " + (primero * segundo));
                break;
            case "/":
            case "dividir":
                System.out.println("El resultado es: " + (primero / segundo));
                break;
            default:
                System.out.println("Ingresa un operador de las opciones.");
                break;
        }
    }
}

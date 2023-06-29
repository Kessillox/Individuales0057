package codingclub.andrealopez.java;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        String strElementoUno = scanner.nextLine();
        int elementoUno = Integer.parseInt(strElementoUno);

        System.out.println("Ingrese el segundo numero");
        String strElementoDos = scanner.nextLine();
        int elementoDos = Integer.parseInt(strElementoDos);

        System.out.println("Operador [(+)suma,(-)resta,(x)multiplicación,(:)división,(/)modulo)");
        String strOperador = scanner.nextLine();

        switch (strOperador) {
            case "+":
                int suma = elementoUno + elementoDos;
                System.out.println("El Resultado de la suma es:");
                System.out.println(suma);
                break;
            case "-":
                int resta = elementoUno - elementoDos;
                System.out.println("El Resultado de la resta es:");
                System.out.println(resta);
                break;
            case "x":
                int multiplicacion = elementoUno * elementoDos;
                System.out.println("El Resultado de la Multiplicación es:");
                System.out.println(multiplicacion);
                break;
            case ":":
                int division = elementoUno / elementoDos;
                System.out.println("El Resultado de la División es:");
                System.out.println(division);
                break;
            case "/":
                int modulo = elementoUno % elementoDos;
                System.out.println("El Resultado del Módulo es:");
                System.out.println(modulo);
                break;
            default:
                System.out.println("Ingrese una operación válida");
        }
    }
}

package codingclub.carlosmeneses.modulo4.individual15;

import java.util.Scanner;

public class M4_Indv15_CM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primer numero");
        String strElementoUno = scanner.nextLine();
        int elementoUno = Integer.parseInt(strElementoUno);

        System.out.println("Segundo numero");
        String strElementoDos = scanner.nextLine();
        int elementoDos = Integer.parseInt(strElementoDos);

        System.out.println("Operador [(+)suma,(-)resta,(x)multiplicación,(:)división,(/)modulo)");
        String strOperador = scanner.nextLine();

        switch (strOperador) {
            case "+":
                int suma = elementoUno + elementoDos;
                System.out.println("Suma. Resultado:");
                System.out.println(suma);
                break;
            case "-":
                int resta = elementoUno - elementoDos;
                System.out.println("Resta. Resultado:");
                System.out.println(resta);
                break;
            case "x":
                int multiplicacion = elementoUno * elementoDos;
                System.out.println("Multiplicación. Resultado:");
                System.out.println(multiplicacion);
                break;
            case ":":
                int division = elementoUno / elementoDos;
                System.out.println("División. Resultado:");
                System.out.println(division);
                break;
            case "/":
                int modulo = elementoUno % elementoDos;
                System.out.println("Modulo. Resultado:");
                System.out.println(modulo);
                break;
            default:
                System.out.println("Operación inválida");
        }
    }
}

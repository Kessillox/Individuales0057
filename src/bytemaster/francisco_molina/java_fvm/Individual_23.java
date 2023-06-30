package bytemaster.francisco_molina.java_fvm;

import java.util.Scanner;

public class Individual_23 {
    public static void main(String[] args) {
        Scanner INDV23 = new Scanner(System.in);
        int menu;
        String palabra;

        do {
            System.out.println("**************************************************");
            System.out.println("*                                                *");
            System.out.println("*          ¡Bienvenidos al sistema de procesos   *");
            System.out.println("*                    byteMaster                  *");
            System.out.println("*                                                *");
            System.out.println("**************************************************");

            System.out.println("Digite 1 para entrar al programa");
            System.out.println("Digite 2 para salir");
            System.out.print("Su opcion: ");

            while (!INDV23.hasNextInt()) {
                System.out.println("Opción inválida. Por favor, ingrese un número.");
                System.out.print("Su opcion: ");
                INDV23.next(); // Descarta la entrada no válida del usuario
            }
            menu = INDV23.nextInt();

            if (menu == 1) {
                System.out.println("Digite una palabra o numero para inicializar la transformacion: ");
                INDV23.nextLine(); // Descarta la nueva línea después del número
                palabra = INDV23.nextLine();
                String transformed = transformString(palabra);
                System.out.println("Resultado: " + transformed);
            }
        } while (menu != 2);

        System.out.println("**************************************************");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("* Muchas gracias por utilizar Software bytemaster *");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("**************************************************");
    }

    private static String transformString(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isDigit(c) || Character.isWhitespace(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
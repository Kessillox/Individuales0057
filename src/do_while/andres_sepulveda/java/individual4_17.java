package do_while.andres_sepulveda.java;
import java.util.Scanner;

public class individual4_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("----- MENU -----");
            System.out.println("1. Ejecutar el código");
            System.out.println("2. Salir del programa");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opcion) {
                case 1:
                    ejecutarCodigo(scanner);
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
                    break;
            }
        }
    }

    public static void ejecutarCodigo(Scanner scanner) {
        String input = "";

        while (input.isEmpty() || contieneNumeros(input)) {
            System.out.print("Ingresa una palabra: ");
            input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("La palabra ingresada está vacía. Por favor, ingresa una palabra válida.");
            } else if (contieneNumeros(input)) {
                System.out.println("La palabra ingresada contiene números. Por favor, ingresa una palabra válida.");
            }
        }

        int vocales = 0;
        int consonantes = 0;

        System.out.println("Caracteres ingresados:");

        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));

            if (Character.isLetter(c)) {
                System.out.println(c);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("\nCantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);
    }

    public static boolean contieneNumeros(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}

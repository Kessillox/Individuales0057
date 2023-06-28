package do_while.die_mansilla.java_die_mansilla;

import java.util.Scanner;

public class individual_4_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (input.isEmpty()) {
            System.out.println("ingrese una palabra: ");
            input = scanner.nextLine().trim();
        }

        int vocales = 0;
        int consonantes = 0;

        System.out.println("Caracteres Ingresados: ");

        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase((input.charAt(i)));

            if (Character.isLetter(c)) {
                System.out.println(c);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }

        }
        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);

    }
}

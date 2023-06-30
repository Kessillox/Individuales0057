package los_malvekexxxx.javierasanchez.java;

import java.util.Scanner;

public class Ejercicioindividual23byjavi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        String resultado = convertirTexto(texto);
        System.out.println("Resultado: " + resultado);
    }

    public static String convertirTexto(String texto) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isWhitespace(c) || Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}


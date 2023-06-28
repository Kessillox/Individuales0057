package los_malvekexxxx.gabriel_cordero.java_gcm;

import java.util.Scanner;
public class TareaIndividual19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Ingresa una frase: ");
            input = scanner.nextLine().trim();
        } while (input.isEmpty());

        char[] caracteres = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            caracteres[i] = input.charAt(i);
        }

        int[] contadorLetras = new int[26];

        for (char caracter : caracteres) {
            if (Character.isLetter(caracter)) {
                caracter = Character.toLowerCase(caracter);
                contadorLetras[caracter - 'a']++;
            }
        }

        System.out.println("Letras encontradas:");
        for (int i = 0; i < 26; i++) {
            char letra = (char) ('a' + i);
            int cantidad = contadorLetras[i];
            System.out.println(letra + ": " + cantidad);
        }
    }
}



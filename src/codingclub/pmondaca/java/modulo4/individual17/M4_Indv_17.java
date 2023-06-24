package codingclub.carlosmeneses.modulo4.individual17;

import java.util.Scanner;

public class M4_Indv_17 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

        int numVowels = 0;
        int numConsonants = 0;

        String input;
        do {
            System.out.println("Ingrese un string no vacío");
            input = scanner.nextLine();
        } while (input.equals(""));

        char letter;
        boolean found;
        for (int i = 0; i < input.length(); i++) {
            letter = input.charAt(i);
            System.out.println(letter);

            letter = Character.toLowerCase(letter);
            found = false;
            for (int j = 0; j < vowels.length; j++) {
                if (letter == vowels[j]) {
                    numVowels++;
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            for (int j = 0; j < consonants.length; j++) {
                if (letter == consonants[j]) {
                    numConsonants++;
                    break;
                }
            }
        }

        System.out.println("Cantidad de vocales:");
        System.out.println(numVowels);
        System.out.println("Cantidad de consonantes:");
        System.out.println(numConsonants);
    }
}

package los_malvekexxxx.javierasanchez.java;

import java.util.Scanner;
public class Ejercicioindovidual17byjavi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input;

            do {
                System.out.println("Ingresa una frase: ");
                input = scanner.nextLine().trim();
            } while (input.isEmpty());

            int vocalCount = 0;
            int consonantCount = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = Character.toLowerCase(input.charAt(i));

                if (Character.isLetter(ch)) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vocalCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }

            System.out.println("Cantidad de vocales: " + vocalCount);
            System.out.println("Cantidad de consonantes: " + consonantCount);
        }
    }


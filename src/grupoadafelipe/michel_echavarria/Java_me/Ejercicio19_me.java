package grupoadafelipe.michel_echavarria.Java_me;
import java.util.Scanner;

public class Ejercicio19_me {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Ingrese una cadena de texto: ");
            input = scanner.nextLine();
        } while (input.isEmpty());

        char[] caracteres = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            caracteres[i] = input.charAt(i);
            System.out.println(caracteres[i]);
        }

        int[] Ejercicio19_me = new int[26];

        for (char c : caracteres) {
            if (Character.isLetter(c)) {
                char letra = Character.toLowerCase(c);
                Ejercicio19_me[letra - 'a']++;
            }
        }

        System.out.println("Cantidad de letras encontradas:");

        for (char letra = 'a'; letra <= 'z'; letra++) {
            int indice = letra - 'a';
            int cantidad = Ejercicio19_me[indice];
            System.out.println(letra + ": " + cantidad);
        }
    }
}

package rocketeam.matias__ac.mac_java.mod04;
import java.util.Scanner;
public class SwapperTxt {

    public class ContadorLetras {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String cadena = "";

            while (cadena.isEmpty()) {
                System.out.print("Ingrese una cadena de texto: ");
                cadena = scanner.nextLine();
            }

            int tamaño = cadena.length();
            char[] letras = new char[tamaño];

            for (int i = 0; i < tamaño; i++) {
                letras[i] = cadena.charAt(i);
            }

            int[] contadorLetras = new int[26];

            for (char letra : letras) {
                if (Character.isLetter(letra)) {
                    letra = Character.toLowerCase(letra);
                    contadorLetras[letra - 'a']++;
                }
            }

            System.out.println("Letras encontradas:");
            for (int i = 0; i < 26; i++) {
                char letra = (char) ('a' + i);
                int cantidad = contadorLetras[i];
                System.out.println(letra + ": " + cantidad);
            }

            scanner.close();
        }
    }
}



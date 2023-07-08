package do_while.die_mansilla.java_die_mansilla;
import java.util.Scanner;

public class individual4_19 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String texto;

            do {
                System.out.print("Ingrese una cadena de texto: ");
                texto = scanner.nextLine();

                if (texto.isEmpty()) {
                    System.out.println("La cadena ingresada está vacía. Por favor, ingrese una cadena válida.");
                }
            } while (texto.isEmpty());

            // Crear arreglo de caracteres del mismo tamaño que la cadena
            char[] caracteres = new char[texto.length()];

            // Recorrer la cadena y guardar cada carácter en el arreglo
            for (int i = 0; i < texto.length(); i++) {
                caracteres[i] = texto.charAt(i);
            }

            // caracteres ingresados
            System.out.println("Caracteres ingresados:");
            for (char c : caracteres) {
                System.out.print(c + " ");
            }
            System.out.println();

            // Contar las letras
            int[] contadorLetras; // Un contador para cada letra del abecedario
            contadorLetras = new int[26];

            for (char c : caracteres) {
                if (Character.isLetter(c)) { // Validar si es una letra
                    char letraMinuscula = Character.toLowerCase(c); // Convertir a minúscula
                    int indice = letraMinuscula - 'a'; // Obtener el índice correspondiente al contador

                    if (indice >= 0 && indice < 26) { // Validar que esté en el rango de letras
                        contadorLetras[indice]++; // Incrementar el contador correspondiente
                    }
                }
            }

            // Desplegar las letras c/cantidad
            System.out.println("Letras del abecedario encontradas:");
            for (char c = 'a'; c <= 'z'; c++) {
                int indice = c - 'a';
                System.out.println(c + ": " + contadorLetras[indice]);
            }
        }
    }

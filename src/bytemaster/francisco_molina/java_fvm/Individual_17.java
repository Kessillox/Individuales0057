package bytemaster.francisco_molina.java_fvm;

import java.util.Scanner;

public class Individual_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        int countC = 0;
        int countV = 0;

        do {
            System.out.print("Ingrese una palabra: ");
            palabra = sc.nextLine();
            if (!esPalabraValida(palabra) || contieneEspacios(palabra)) {
                System.out.println("No ha escrito una palabra válida. Vuelva a intentarlo.");
            }
        } while (!esPalabraValida(palabra) || contieneEspacios(palabra));

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if (esVocal(caracter)) {
                countV++;
            } else {
                countC++;
            }
            System.out.println(caracter);
        }
        System.out.println("El número de vocales es: " + countV);
        System.out.println("El número de consonantes es: " + countC);
    }

    private static boolean esPalabraValida(String palabra) {
        return palabra.matches("[a-zA-Z]+");
    }

    private static boolean contieneEspacios(String palabra) {
        return palabra.contains(" ");
    }

    private static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U';
    }
}

import java.util.Scanner;

public class Individual17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena;
        int vocales = 0;
        int consonantes = 0;

        do {
            System.out.print("Ingrese una cadena de texto: ");
            cadena = scanner.nextLine();
        } while (cadena.isEmpty());

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = Character.toLowerCase(cadena.charAt(i));

            if (Character.isLetter(caracter)) {
                if (esVocal(caracter)) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);
    }

    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}

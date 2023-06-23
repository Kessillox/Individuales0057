package rocketeam.matias__ac.mac_java.mod04;

import java.util.Scanner;

//modulo 4 ejercicio 17

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = "";

        while (cadena.isEmpty()) {
            System.out.print("Ingresar texto: ");
            cadena = scanner.nextLine();
        }

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (Character.isLetter(caracter)) {
                caracter = Character.toLowerCase(caracter);

                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("La palabra ingresada contiene:");
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);

        scanner.close();
    }


}

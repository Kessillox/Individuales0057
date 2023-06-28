package rocketeam.diegoortiz.javado;

import java.util.Scanner;
public class EjIndividual17_do {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = "";
        int cantidadVocales = 0, cantidadConsonantes = 0;
        String vocales = "aeiou";

        while (cadena.length() == 0) {

            System.out.println("Ingrese el texto a evaluar: ");
            cadena = sc.nextLine().trim().replace(" ", "").toLowerCase();

            for (int i = 0; i < cadena.length(); i++) {
                if (vocales.contains(String.valueOf(cadena.charAt(i)))) {
                    cantidadVocales += 1;
                } else {
                    cantidadConsonantes += 1;
                }
            }
        }

        System.out.println("El texto contiene " + cantidadVocales + " vocales y " + cantidadConsonantes + " consonantes.");
    }

}

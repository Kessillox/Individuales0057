package rocketeam.matias__ac.mac_java.mod04;

import java.util.Scanner;

//modulo 4 ejercicio 23
public class SwaperTxt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = sc.nextLine();

        String resultado = convertirTexto(cadena);
        System.out.println("Resultado: " + resultado);

        sc.close();
    }

    public static String convertirTexto(String cadena) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            System.out.print(cadena);

            if (Character.isLowerCase(caracter)) {
                resultado.append(Character.toUpperCase(caracter));
            } else if (Character.isUpperCase(caracter)) {
                resultado.append(Character.toLowerCase(caracter));
            } else if (caracter == ' ' || Character.isDigit(caracter)) {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }
}

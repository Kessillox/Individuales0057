package codingclub.carlosmeneses.modulo4.individual23;
import java.util.Scanner;

public class M4_Indv23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena de texto:");
        String cadena = scanner.nextLine();
        String resultado = convertirCadena(cadena);
        System.out.println("Resultado: " + resultado);
    }

    public static String convertirCadena(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.isLowerCase(caracter)) {
                resultado.append(Character.toUpperCase(caracter));
            } else if (Character.isUpperCase(caracter)) {
                resultado.append(Character.toLowerCase(caracter));
            } else if (caracter == ' ') {
                continue;
            } else {
                resultado.append(caracter);
            }
        }
        return resultado.toString();
    }
}
package individual23.grupoada;

import java.util.Scanner;

public class In23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto a su gusto");

        String texto = sc.nextLine();
        String textoAcumulado = "";

        for (int incremental = 0; incremental < texto.length(); incremental++) {

            System.out.println(texto.charAt(incremental));

            char caracter = texto.charAt(incremental);

            if (Character.isWhitespace(caracter) || Character.isLetterOrDigit(caracter)) {

                if (Character.isLowerCase(caracter))

                    caracter = Character.toUpperCase(caracter);
                else

                    caracter = Character.toLowerCase(caracter);

                textoAcumulado += caracter;
            }
        }

        System.out.println(textoAcumulado);

    }
}

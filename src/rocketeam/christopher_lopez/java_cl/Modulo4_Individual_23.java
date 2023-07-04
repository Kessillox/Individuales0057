package rocketeam.christopher_lopez.java_cl;

import java.util.Scanner;

public class Modulo4_Individual_23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String textoUsuario = "";
        String txtResultado = "";
        System.out.println("Ingrese una cadena de texto a su gusto");

        textoUsuario = scanner.nextLine();


        for (int indice = 0; indice < textoUsuario.length(); indice++){

            System.out.println(textoUsuario.charAt(indice));

            char caracterActual = textoUsuario.charAt(indice);

            if(Character.isWhitespace(caracterActual) || Character.isLetterOrDigit(caracterActual) ){

                if (Character.isLowerCase(caracterActual))

                    caracterActual = Character.toUpperCase(caracterActual);
                else

                    caracterActual = Character.toLowerCase(caracterActual);

                txtResultado = txtResultado + caracterActual;
            }
        }

        System.out.println(txtResultado);

    }

}

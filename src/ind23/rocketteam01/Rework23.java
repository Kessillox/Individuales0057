package individual23.rocketteam01;

import java.util.Scanner;
// Team Rocket M4E23
public class Rework23 {

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

     /*
     Escritura de bloque de texto con tres "
     texto = """
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,
                and more recently with desktop publishing software like Aldus
                PageMaker including versions of Lorem Ipsum.
                """;*/


}



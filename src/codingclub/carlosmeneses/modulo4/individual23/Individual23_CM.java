package codingclub.carlosmeneses.modulo4.individual23;

import java.util.Scanner;

public class Individual23_CM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = "";
        String outpuLine = "";

        System.out.println("Ingrese una cadena de texto a su gusto");
        inputLine = scanner.nextLine();

        for (int iterIndex = 0; iterIndex < inputLine.length(); iterIndex++){

            System.out.println(inputLine.charAt(iterIndex));
            char iterCharacter = inputLine.charAt(iterIndex);
            if(Character.isWhitespace(iterCharacter) || Character.isLetterOrDigit(iterCharacter) ){
                if (Character.isLowerCase(iterCharacter))
                    iterCharacter = Character.toUpperCase(iterCharacter);
                else
                    iterCharacter = Character.toLowerCase(iterCharacter);
                outpuLine += iterCharacter;
            }
        }
        System.out.println(outpuLine);
    }

     /*
     Escritura de bloque de texto con tres "
     texto = """
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,
                and more recently with desktop publishing software like Aldus
                PageMaker including versions of Lorem Ipsum.
                """;*/


}

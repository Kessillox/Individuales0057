package los_malvekexxxx;

import java.util.Scanner;

public class los_Malvekexxxx_23 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase = "";
        String fraseCompuesta = "";

        System.out.println("Ingresa una frase que te guste: ");

        frase = sc.nextLine();

        for (int x = 0; x < frase.length(); x++){
            System.out.println(frase.charAt(x));
            char letra = frase.charAt(x);

            if (Character.isWhitespace(letra) || Character.isLetterOrDigit(letra)){
                if (Character.isLowerCase(letra)){ letra = Character.toUpperCase(letra); }
                else { letra = Character.toLowerCase(letra);}
                fraseCompuesta += letra;
            }
        }
        System.out.println(fraseCompuesta);
    }

}

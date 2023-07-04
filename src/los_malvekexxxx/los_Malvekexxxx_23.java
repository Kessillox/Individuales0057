package los_malvekexxxx;

import java.util.Scanner;
public class los_Malvekexxxx_23 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String texto = "";
        String txt = "";

        System.out.println("Ingrese la cadena de texto a gusto: ");

        texto = sc.nextLine();

        for (int x = 0; x < texto.length();x++){
            System.out.println(texto.charAt(x));
            char c = texto.charAt(x);

            if (Character.isWhitespace(c) || Character.isLetterOrDigit(c)){
                if (Character.isLowerCase(c)){ c = Character.toUpperCase(c); }
                else { c = Character.toLowerCase(c);}
                txt += c;
            }
        }
        System.out.println(txt);
    }

}

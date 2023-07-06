package do_while.diego_aedo.java_daedo;

import java.util.Scanner;

public class M4Individual23DAedo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = "";
        System.out.println("Ingrese un texto");
        texto = sc.nextLine();
        //String resultado = "";
        StringBuilder bld = new StringBuilder();

        /*for(int i = 0; i < texto.length(); i++){
            System.out.println(texto.charAt(i));
            char c = texto.charAt(i);
            if(Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                if (Character.isUpperCase(c)) c = Character.toLowerCase(c);
                else c = Character.toUpperCase(c);
                resultado+=c;
            }
        }*/

        for(int i = 0; i < texto.length(); i++){
            System.out.println(texto.charAt(i));
            char c = texto.charAt(i);
            if(Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                if (Character.isUpperCase(c)) c = Character.toLowerCase(c);
                else c = Character.toUpperCase(c);
                bld.append(c);
            }
        }
        String resultado = bld.toString();
        System.out.println(resultado);
    }
}

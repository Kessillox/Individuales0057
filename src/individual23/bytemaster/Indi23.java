package individual23.bytemaster;

import java.util.Scanner;

public class Indi23 {
    public static void main(String[] args) {
        
        Scanner lectorTeclado = new Scanner(System.in);
        String inicialTexto = "";
        String textoSalida = "";
        
        System.out.println("Ingrese una cadena de texto a su gusto");
        inicialTexto = lectorTeclado.nextLine();

        for (int posicionLetra = 0; posicionLetra < inicialTexto.length(); posicionLetra++){

            System.out.println(inicialTexto.charAt(posicionLetra));
            char caracter = inicialTexto.charAt(posicionLetra);
            
            if(Character.isWhitespace(caracter) || Character.isLetterOrDigit(caracter) ){
                if (Character.isLowerCase(caracter))
                    caracter = Character.toUpperCase(caracter);
                else
                    caracter = Character.toLowerCase(caracter);
                textoSalida += caracter;
            }
        }
        
        System.out.println(textoSalida);
    }
}

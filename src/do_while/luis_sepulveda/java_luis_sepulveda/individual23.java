package do_while.luis_sepulveda.java_luis_sepulveda;
import java.util.Scanner;

public class individual23 {

    public static void main(String[] args) {
        //Instancia del Scanner
        Scanner sc = new Scanner(System.in);
        //Variable texto y txt String inicializada en vacío
        String texto = "";
        String txt = "";
        System.out.println("Ingrese una cadena de texto a su gusto");
        //solicitud de ingreso por teclado
        texto = sc.nextLine();

        //Inicio del ciclo que recorre el texto
        for (int x = 0; x < texto.length(); x++) {

            System.out.println(texto.charAt(x));
            //Asignación de cada caracter del string en la variable c
            char c = texto.charAt(x);
            //Condicional para ver si c tiene un dígito, una letra o un espacio en blanco
            if (Character.isWhitespace(c) || Character.isLetterOrDigit(c)) {
                //Condicional para evaluar si c es letra minuscula.
                if (Character.isLowerCase(c))
                    //transformación del caracter minusculo en mayusc.
                    c = Character.toUpperCase(c);
                else
                    //transformacion del char mayus. a minuscula
                    c = Character.toLowerCase(c);
                //suma de caracteres en el String txt (concatenación)
                txt += c;
            }
        }
        //impresión final del String con los cambios
        System.out.println(txt);

    }
}

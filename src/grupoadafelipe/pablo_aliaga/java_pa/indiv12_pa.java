package grupoadafelipe.pablo_aliaga.java_pa;

import java.util.Scanner;

public class indiv12_pa {
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
        for (int x = 0; x < texto.length(); x++){

            System.out.println(texto.charAt(x));
            //Asignación de cada caracter del string en la variable c
            char c = texto.charAt(x);
            //Condicional para ver si c tiene un dígito, una letra o un espacio en blanco
            if(Character.isWhitespace(c) || Character.isLetterOrDigit(c) ){
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

     /*
     Escritura de bloque de texto con tres "
     texto = """
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,
                and more recently with desktop publishing software like Aldus
                PageMaker including versions of Lorem Ipsum.
                """;*/


}

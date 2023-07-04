package los_malvekexxxx.javierasanchez.java;

import java.util.Scanner;

public class Ejercicioindividual23byjavi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //abro clase scanner para pedir palabras por consola

        System.out.print("Ingrese una cadena de texto: "); //muestro en consola
        String texto = scanner.nextLine(); //almaceno en variable "texto" lo que escribo por consola

        String resultado = convertirTexto(texto); //creo una variable resultado que recibe la salida del metodo
        System.out.println("Resultado: " + resultado); //muestro en consola la respuesta
    }
// metodo que uso para cambiar mayusculas y minusculas
    //el metodo recibe un parametro de la clase String
    public static String convertirTexto(String texto) {

        StringBuilder sb = new StringBuilder(); //creo una variable que crea un string de cero

        for (int i = 0; i < texto.length(); i++) {   //recorro el parametro del metodo
            char c = texto.charAt(i);   // creo una variable de clase char "char"

            if (Character.isLowerCase(c)) { //crea condicional if, verifica si el char almacenado es minuscula
                sb.append(Character.toUpperCase(c));//si es minuscula, lo sube a mayuscula
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isWhitespace(c) || Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}


package rocketeam.diegoortiz.javado;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EjIndividual19_do {

    public static void main(String[] args) {

        //Inicialización de variables
        String cadena="";
        String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);

        //Validación de que String ingresado no sea nulo
        while (cadena.length() == 0) {
            System.out.println("Ingrese el texto a evaluar: ");
            cadena = sc.nextLine().trim().replace(" ", "").toLowerCase();
        }

        //Mostrar y llenar arreglo de caracteres de la cadena
        char[] caracteres = new char[cadena.length()];
        for(int i=0; i<cadena.length();i++){
            System.out.println(cadena.charAt(i));
            caracteres[i] = cadena.charAt(i);
        }

        //Contador de elementos iguales y creación de arreglo con las cantidades por caracter
        String[] cantCaracteres = new String[alfabeto.length()];

        for(int i=0; i<alfabeto.length(); i++){
            int contador = 0;
            char letra = alfabeto.charAt(i);

            for(int j=0; j<caracteres.length; j++){
                if(letra==caracteres[j])
                    contador++;
            }

            cantCaracteres[i] = alfabeto.charAt(i) + " = " + contador;

        }

        //Resultado
        System.out.println(Arrays.toString(cantCaracteres));

    }

}

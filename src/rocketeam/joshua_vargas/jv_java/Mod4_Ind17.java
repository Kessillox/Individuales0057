package rocketeam.joshua_vargas.jv_java;

import java.util.Scanner;

public class Mod4_Ind17 {

    public static void main(String[] args) {

        String palabra;
        int vocales =0;
        int consonantes =0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese una palabra");
            palabra = sc.next();
        }while (palabra.isEmpty());


        for (int i = 0;i< palabra.length();i++){
            System.out.println(palabra.charAt(i));
            char caracter = palabra.toLowerCase().charAt(i);
            if (Character.isLetter(caracter) && caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                    caracter == 'á' || caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú' || caracter == 'ü'){
                vocales++;
            }else if(Character.isLetter(caracter) && caracter != 'a' && caracter !=  'e' && caracter !=  'i' && caracter !=  'o' && caracter !=  'u' &&
                    caracter !=  'á' && caracter !=  'é' && caracter !=  'í' && caracter !=  'ó' && caracter !=  'ú' && caracter !=  'ü'){
                consonantes++;
            }

        }

        System.out.println("La palabra ingresada tiene "+vocales+" vocales y "+consonantes+" consonantes");


    }
}


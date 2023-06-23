package rocketeam.christopher_lopez.java_cl;

import java.util.Scanner;

public class Modulo4_individual_17 {

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
            }else{
                consonantes++;
            }

        }

        System.out.println("La palabra ingresada tiene "+vocales+" vocales y "+consonantes+" consonantes");


    }
}

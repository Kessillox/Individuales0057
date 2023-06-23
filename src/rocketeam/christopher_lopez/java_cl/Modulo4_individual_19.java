package rocketeam.christopher_lopez.java_cl;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Modulo4_individual_19 {

    public static void main(String[] args) {

        String palabra;
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese una palabra");
            palabra = sc.next();
        }while (palabra.isEmpty());

        char[] arregloPalabra = new char[palabra.length()];

        for (int i = 0;i< palabra.length();i++){
            System.out.println(palabra.charAt(i));
            arregloPalabra[i] = palabra.charAt(i);
        }
        System.out.println("======== Coincidencias ========");

        char[][] coincidencias = new char[27][2];
        for (int j=0; j<coincidencias.length;j++) {
            coincidencias[j][1] = '0';
        }

        char letra = 'a';

        for (int i=0; i<14 ; i++) {
            
        coincidencias[i][0] = letra;
            
            for(int h=0;h<palabra.length();h++){
                if(letra == Character.toLowerCase(arregloPalabra[h]) ){
                    contador = coincidencias[i][1] + 1;
                    coincidencias[i][1] =  (char) contador;
                }
            }
            contador =0;
            letra++;
        }

        coincidencias[14][0] = 'ñ';
        for(int h=0;h<palabra.length();h++) {
            if('ñ' == Character.toLowerCase(arregloPalabra[h])){
                contador = coincidencias[14][1] + 1;
                coincidencias[14][1] =  (char) contador;
            }
        }

        for (int i=15; i<27 ; i++) {

            coincidencias[i][0] = letra;

            for(int h=0;h<palabra.length();h++){
                if(letra == Character.toLowerCase(arregloPalabra[h])){
                    contador = coincidencias[i][1] + 1;
                    coincidencias[i][1] =  (char) contador;
                }
            }
            contador =0;
            letra++;
        }

        for (int i =0;i<coincidencias.length;i++){
            System.out.print(coincidencias[i][0]);
            System.out.println("      "+coincidencias[i][1]+" coincidencia(s)");
        }


    sc.close();

    }
}

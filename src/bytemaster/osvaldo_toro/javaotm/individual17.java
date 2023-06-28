package bytemaster.osvaldo_toro.javaotm;
import java.util.Scanner;

public class individual17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        int countC = 0;
        int countV = 0;

        do {
            System.out.println("Ingrese la palabra");
            palabra = sc.next();

        }
        while(palabra.equals(null));

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if (caracter == 'a'|| caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                    caracter == 'A'|| caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
                countV++;
            }else {
                countC++;
            }
            System.out.println(caracter);
        }
        System.out.println("el numero de Vocales es :"+countV);
        System.out.println("el numero de consonantes es :"+countC);
    }
}
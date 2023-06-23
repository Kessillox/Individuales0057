package grupoadafelipe.pablo_aliaga.java_pa.individialu9_pa;

import java.util.Scanner;

public class individialu9_pa {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String name = myObj.nextLine();

        if (name.equals("")) {
            name = myObj.nextLine();
            // bloque de código a ejecutar si la condición es verdadera
        } else {
            System.out.println("Se ha admitido el valor");
            // bloque de código a ejecutar si la condición es falsa
        }

        int vcount = 0, ccount = 0;

        // convertir todos los caracteres a minúsculas
        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++;
            } else if (Character.isLetter(ch)) {
                ccount++;
            }
        }

        System.out.println("Número de vocales: " + vcount);
        System.out.println("Número de consonantes: " + ccount);
    }
}

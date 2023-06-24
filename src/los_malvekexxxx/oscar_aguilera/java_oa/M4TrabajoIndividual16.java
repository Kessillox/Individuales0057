package los_malvekexxxx.oscar_aguilera.java_oa;

import java.util.Scanner;

public class M4TrabajoIndividual16 {
    public static void main(String[] args) {
        String clave = "qwerty123";
        int intentos = 3;

        Scanner sc = new Scanner(System.in);

        while (intentos > 0) {
            System.out.print("Introduzca su contraseña: ");
            String contraseña = sc.nextLine();

            if (contraseña.equals(clave)) {
                System.out.println("La contraseña ingresada es correcta");
                System.out.println("**Bienvenido**");
                break; // Sale del bucle while si la clave es correcta
            } else {
                intentos--;
                System.out.println("La contraseña ingresada es incorrecta. Le quedan " + intentos + " intentos.");
            }
        }
        System.out.println();
        if (intentos == 0) {
            System.out.println("Ha excedido los intentos posibles, acceso bloqueado.");
        }

    }
}

package grupoadafelipe.Juan_Lucio.JavaJD;

import java.util.Scanner;

public class Individual16 {
    public static void main(String[] args) {
        String clave = "hola";

        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Introduce la contraseña: ");
            String entrada = scanner.nextLine();

            if (entrada.equals(clave)) {
                System.out.println("La clave ingresada es correcta");
                break;
            } else {
                intentos--;
                System.out.println("La clave ingresada es incorrecta. Intentos restantes: " + intentos);
            }
        }

        if (intentos == 0) {
            System.out.println("Se han agotado los intentos. Programa terminado.");
        }

        scanner.close();
    }
}

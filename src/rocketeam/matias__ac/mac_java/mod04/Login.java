package rocketeam.matias__ac.mac_java.mod04;


import java.util.Scanner;

//modulo 4 ejercicio 16
public class Login {

        public static void main(String[] args) {
            String Password = "asd1234"; // Contraseña definida por el coder
            int intentos = 3;

            Scanner scanner = new Scanner(System.in);

            while (intentos > 0) {
                System.out.print("Introduce la contraseña: ");
                String entrada = scanner.nextLine();

                if (entrada.equals(Password)) {
                    System.out.println("La clave ingresada es correcta");
                    break;
                } else {
                    intentos--;
                    System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intento(s).");

                    if (intentos == 0) {
                        System.out.println("Has agotado tus intentos. Acceso denegado.");
                    }
                }
            }

            scanner.close();
        }
    }

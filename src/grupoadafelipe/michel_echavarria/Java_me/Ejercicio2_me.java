package mechavarria.Java;

import java.util.Scanner;
public class Ejercicio2_me {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Inicio Proceso 'Ingreso a Portal Web'\n");

            System.out.print("Ingrese su nombre de usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();

            if (!existeUsuario(usuario)) {
                System.out.println("Usuario no encontrado. Por favor, inténtelo nuevamente.\n");
                main(args); // Volver al paso 1
                return;
            }

            if (!verificarContrasena(usuario, contrasena)) {
                System.out.println("Contraseña incorrecta. Por favor, inténtelo nuevamente.\n");
                main(args); // Volver al paso 1
                return;
            }

            System.out.println("Ingreso exitoso. Redirigiendo al usuario a la página principal del portal.\n");

            System.out.println("Fin del Proceso 'Ingreso a Portal Web'");
        }

        public static boolean existeUsuario(String usuario) {
            // Buscar usuario en la base de datos
            return false;
        }

        public static boolean verificarContrasena(String usuario, String contrasena) {
            // Verificar contraseña del usuario
            return true;
        }
    }
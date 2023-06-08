package los_malvekexxxx;


import java.util.Scanner;
public class TrabajoGrupal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese su RUT: ");
        int rut = input.nextInt();

        System.out.print("Ingrese su nombre: ");
        String nombres = input.next();

        System.out.print("Ingrese su apellido: ");
        String apellidos = input.next();

        System.out.print("Ingrese su teléfono: ");
        String telefono = input.next();

        System.out.print("Ingrese su AFP: ");
        String afp = input.next();

        System.out.print("Ingrese su sistema de salud (1 para Fonasa, 2 para Isapre): ");
        int sistemaSalud = input.nextInt();

        System.out.print("Ingrese su dirección: ");
        input.nextLine(); // nextLine Soporta datos con espacios
        String direccion = input.nextLine(); //Evita que se junte la entrada al formulario

        System.out.print("Ingrese su comuna: ");
        String comuna = input.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        // Validar datos ingresados
        if (rut <= 10000000) {
            System.out.println("Error: El RUT ingresado no es válido.");
            return;
        }

        if (nombres.isEmpty()) {
            System.out.println("Error: Debe ingresar sus nombres.");
            return;
        }

        if (apellidos.isEmpty()) {
            System.out.println("Error: Debe ingresar sus apellidos.");
            return;
        }

        if (telefono.length() > 15) {
            System.out.println("Error: El número de teléfono ingresado no es válido.");
            return;
        }

        if (afp.isEmpty()) {
            System.out.println("Error: Debe ingresar su AFP.");
            return;
        }

        if (sistemaSalud != 1 && sistemaSalud != 2) {
            System.out.println("Error: El sistema de salud ingresado no es válido.");
            return;
        }

        if (direccion.length() > 50) {
            System.out.println("Error: La dirección ingresada no es válida.");
            return;
        }

        if (comuna.isEmpty()) {
            System.out.println("Error: Debe ingresar su comuna.");
            return;
        }

        if (edad >= 120) {
            System.out.println("Error: La edad ingresada no es válida.");
            return;
        }
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.println("LOS DATOS DEL USUARIO SON");
        System.out.println("");

        // Desplegar datos del cliente
        System.out.println(  "RUT: " + rut + "\n" +
                "Nombre: " + nombres + "\n" +
                "Apellido: " + apellidos + "\n" +
                "Teléfono: " + telefono + "\n" +
                "AFP: " + afp + "\n" +
                "Sistema de salud: " + (sistemaSalud == 1 ? "Fonasa" : "Isapre") + "\n" +
                "Dirección: " + direccion + "\n" +
                "Comuna: " + comuna + "\n" +
                "Edad: " + edad + "\n");







    }
}

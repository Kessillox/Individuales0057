package los_malvekexxxx;

import java.util.Scanner;
public class TrabajoGrupal4 {

    public static void main(String [] args){

        String nombre;
        //String fechaNacimiento;
        //String run;
        int diaNac;
        int mesNac;
        int anioNac;
        String run;
        int contador = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor indica la cantidad de usuarios a ingresar: ");
        int cantUsuarios = sc.nextInt();

        while (cantUsuarios > 0) {

            System.out.println("Ingresa el nombre del Usuario");
            nombre = sc.next();

            System.out.println("Ingresa la fecha de nacimiento del Usuario");
            System.out.println("Dia: ");
            diaNac = sc.nextInt();
            System.out.println("Mes: ");
            mesNac = sc.nextInt();
            System.out.println("Año: ");
            anioNac = sc.nextInt();

            System.out.println("Ingresa el RUN del Usuario (Sin puntos ni guion)");
            run = sc.next();

            System.out.println("Indica el tipo de Usuario:\n" +
                    "Nombre: " + nombre + "\n" +
                    "Fecha de Nacimiento: " + diaNac + "/" + mesNac + "/" + anioNac + "\n" +
                    "Run: " + run);

            System.out.println("El usuario ingresado es\n" +
                    "Nombre: " + nombre + "\n" +
                    "Fecha de Nacimiento: " + diaNac + "/" + mesNac + "/" + anioNac + "\n" +
                    "Run: " + run);

            cantUsuarios--;
        }
    }
}

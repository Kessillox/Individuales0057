package los_malvekexxxx;

import java.util.Scanner;
public class TrabajoGrupal4 {

    public static void main(String [] args){

        String nombre;
        int diaNac;
        int mesNac;
        int anioNac;
        String run;
        int tipoUser;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor indica la cantidad de usuarios a ingresar: ");
        int cantUsuarios = sc.nextInt();
        sc.nextLine();
        while (cantUsuarios > 0) {

            System.out.println("Ingresa el nombre del Usuario");
            nombre = sc.nextLine();

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
                    "1 - Cliente.\n" +
                    "2 - Profesional.\n" +
                    "3 - Adminitrativo.\n");
            tipoUser = sc.nextInt();
            sc.nextLine();

            if (tipoUser == 1){

                String nomUser = "Cliente";
                String direccion;
                int telefono;
                int cantEmpleados;

                System.out.println("Ingresa la direccion del Usuario");
                direccion = sc.nextLine();


                System.out.println("Ingresa el telefono del Usuario");
                telefono = sc.nextInt();


                System.out.println("Ingresa la cantidad de empleados del Usuario");
                cantEmpleados = sc.nextInt();
                System.out.println("************************************************");
                System.out.println("************************************************");
                System.out.println("El usuario ingresado es\n" +
                        "Nombre: " + nombre + "\n" +
                        "Fecha de Nacimiento: " + diaNac + "/" + mesNac + "/" + anioNac + "\n" +
                        "Run: " + run + "\n" +
                        "Perfil: " + nomUser + "\n" +
                        "Direccion: " + direccion + "\n" +
                        "Telefono: " + telefono + "\n" +
                        "Cantidad de Empleados: " + cantEmpleados);

            } else if (tipoUser == 2){

                String nomUser = "Profesional";
                int anioExp;
                String departamento;

                System.out.println("Ingresa los años de experiencia del Usuario");
                anioExp = sc.nextInt();

                System.out.println("Ingresa el departamento del Usuario");
                departamento = sc.next();
                System.out.println("************************************************");
                System.out.println("************************************************");
                System.out.println("El usuario ingresado es\n" +
                        "Nombre: " + nombre + "\n" +
                        "Fecha de Nacimiento: " + diaNac + "/" + mesNac + "/" + anioNac + "\n" +
                        "Run: " + run + "\n" +
                        "Perfil: " + nomUser + "\n" +
                        "Años de Experiencia: " + anioExp + "\n" +
                        "Departamento: " + departamento);

            } else if (tipoUser == 3){

                String nomUser = "Administrativo";
                String funcion;
                String nomSuperior;

                System.out.println("Ingresa la funcion del Usuario");
                funcion = sc.next();

                System.out.println("Ingresa el Nombre de Superior del Usuario");
                nomSuperior = sc.next();
                System.out.println("************************************************");
                System.out.println("************************************************");
                System.out.println("El usuario ingresado es\n" +
                        "Nombre: " + nombre + "\n" +
                        "Fecha de Nacimiento: " + diaNac + "/" + mesNac + "/" + anioNac + "\n" +
                        "Run: " + run + "\n" +
                        "Perfil: " + nomUser + "\n" +
                        "Funcion: " + funcion + "\n" +
                        "Nombre Superior: " + nomSuperior);

            }

            cantUsuarios--;
        }
    }
}

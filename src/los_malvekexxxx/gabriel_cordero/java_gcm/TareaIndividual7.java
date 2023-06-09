package los_malvekexxxx.gabriel_cordero.java_gcm;

import java.util.Scanner;
public class TareaIndividual7 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);    //variable que solicita datos por consola


            System.out.println("Ingrese la cantidad de usuarios para agregar : "); //escribo en consola

            int cantidad_usuario = 0;               //variable para capturar cantidad de usuarios
            int dias_semanales = 5;                 //variable que almacena los dias semanales

            cantidad_usuario = sc.nextInt();        //pido ingresar el valor por consola
            sc.nextLine();

            System.out.println("Ingrese el monto pagado por hora trabajada : "); //escribo en consola
            int precio_por_hora = sc.nextInt();                    //valor de la hora por trabajo
            sc.nextLine();

            while (cantidad_usuario > 0){

                System.out.print("Ingrese el nombre del usuario :");

                String nombre= sc.nextLine();                    //variable que almacena el nombre

                System.out.print("Ingrese la edad del usuario :");
                int edad = sc.nextInt();                           //variable que almacena la edad

                System.out.print("Ingrese la cantidad de horas trabajadas del usuario :");
                int horas_trabajadas = sc.nextInt();              //variable que almacena las horas trabajadas
                sc.nextLine();

                int dinero_semanal = horas_trabajadas*precio_por_hora;

                System.out.println("************************************************");
                System.out.println("************************************************");

                System.out.println("El trabajador(a) "+nombre+" cuya edad es "+ edad +
                        "\nTrabajo " + horas_trabajadas +" horas en la semana "+ "\n"
                        + "Correspondiendole un monto de "+"$" +
                        +dinero_semanal+" pesos como pago semanal \n");

                cantidad_usuario--;
            }




        }


}

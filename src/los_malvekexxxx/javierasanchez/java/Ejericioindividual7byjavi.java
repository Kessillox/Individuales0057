package los_malvekexxxx.javierasanchez.java;

import java.util.Scanner;
public class Ejericioindividual7byjavi {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);    //variable que solicita datos por consola


            System.out.println("Ingrese la cantidad de usuarios para agregar : "); //escribo en consola

            int cantidad_usuario = 0;               //variable para capturar cantidad de usuarios
            int dias_semanales = 5;                 //variable que almacena los dias semanales

            cantidad_usuario = sc.nextInt();        //pido ingresar el valor por consola

            System.out.println("Ingrese el monto pagado por hora trabajada : "); //escribo en consola
            int precio_por_hora = sc.nextInt();                    //valor de la hora por trabajo

            while (cantidad_usuario > 0){

                System.out.print("Ingrese el nombre del usuario :");

                String nombre= sc.next();                    //variable que almacena el nombre

                System.out.print("Ingrese la edad del usuario :");
                int edad = sc.nextInt();                           //variable que almacena la edad

                System.out.print("Ingrese la cantidad de horas trabajadas del usuario :");
                int horas_trabajadas = sc.nextInt();              //variable que almacena las horas trabajadas

                int dinero_semanal = horas_trabajadas*precio_por_hora;

                System.out.println("El usuario "+nombre+" de la edad "+ edad +
                        "\nTrabajo " + horas_trabajadas +" horas en la semana\npor lo que le corresponde el monto de "+
                        dinero_semanal+" pesos chilenos\n");

                cantidad_usuario--;
            }

            sc.close();


        }
    }



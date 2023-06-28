
package do_while.katy_cordero.java_katy_cordero;

import java.util.Scanner;

public class SueldoSemanal {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar valor de pago por hora
            System.out.print("Ingrese el valor a pagar por hora de trabajo: ");
            double valorPagoHora = scanner.nextDouble();

            // Solicitar cantidad de trabajadores
            System.out.print("Ingrese la cantidad de trabajadores: ");
            int cantidadTrabajadores = scanner.nextInt();

            for (int i = 1; i <= cantidadTrabajadores; i++) {
                System.out.println("Ingrese los datos del trabajador " + i);

                // Solicitar nombre y edad del trabajador
                System.out.print("Nombre: ");
                String nombre = scanner.next();
                System.out.print("Edad: ");
                int edad = scanner.nextInt();

                // Solicitar horas trabajadas en cada día de la semana
                int totalHorasSemana = 0;
                for (int dia = 1; dia <= 5; dia++) {
                    System.out.print("Horas trabajadas en el día " + dia + ": ");
                    int horasTrabajadas = scanner.nextInt();
                    totalHorasSemana += horasTrabajadas;
                }

                // Calcular sueldo semanal
                double sueldoSemanal = totalHorasSemana * valorPagoHora;

                // Mostrar los datos del trabajador y su sueldo semanal
                System.out.println("Datos del trabajador:");
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
                System.out.println("Horas trabajadas en la semana: " + totalHorasSemana);
                System.out.println("Sueldo semanal: " + sueldoSemanal);

                System.out.println(); // Línea en blanco para separar los resultados
            }

            scanner.close();
        }
    }


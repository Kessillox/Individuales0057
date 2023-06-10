package bytemaster.alex.java_ac;

import java.util.Scanner;
public class Individual7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Paso 1: Leer el valor a pagar por hora de trabajo
        System.out.print("Ingrese el valor a pagar por hora de trabajo: ");
        double valorHora = sc.nextDouble();

        // Paso 2: Leer la cantidad de trabajadores
        System.out.print("Ingrese la cantidad de trabajadores: ");
        int cantidadTrabajadores = sc.nextInt();

        // Paso 3: Repetir por cada trabajador
        for (int i = 1; i <= cantidadTrabajadores; i++) {
            // Paso 4: Leer los datos del trabajador
            System.out.print("Ingrese el nombre del trabajador " + i + ": ");
            String nombre = sc.next();

            System.out.print("Ingrese la edad del trabajador " + i + ": ");
            int edad = sc.nextInt();

            // Paso 5: Leer las horas trabajadas en cada día de la semana
            int horasTotales = 0;
            for (int dia = 1; dia <= 5; dia++) {
                System.out.print("Ingrese las horas trabajadas por " + nombre + " el día " + dia + ": ");
                int horasDia = sc.nextInt();
                horasTotales += horasDia;
            }

            // Paso 6: Calcular el sueldo semanal
            double sueldoSemanal = horasTotales * valorHora;

            // Paso 7: Mostrar los datos del trabajador y su sueldo semanal
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Horas trabajadas totales: " + horasTotales);
            System.out.println("Sueldo semanal: " + sueldoSemanal);
        }

        sc.close();
    }
}

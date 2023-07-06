package rocketeam.matias__ac.mac_java.mod04;

//modulo 4 ejercicio 18

import java.util.Scanner;

public class Alumnos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        double calificacion;

        int totalAlumnos = 0;
        double sumaCalificaciones = 0;
        double menorNota = Double.MAX_VALUE;
        double mayorNota = Double.MIN_VALUE;
        String nombreMenorNota = "";
        String nombreMayorNota = "";

        while (true) {
            System.out.print("Ingrese el nombre del alumno (o 'SALIR' para terminar): ");
            nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("SALIR")) {
                break;
            }

            while (true) {
                System.out.print("Ingrese la nota del alumno (entre 1.1 y 7.0): ");
                String calificacionString = scanner.nextLine();

                try {
                    calificacion = Double.parseDouble(calificacionString.replace(',', '.'));
                    if (calificacion >= 1.1 && calificacion <= 7.0) {
                        break;
                    } else {
                        System.out.println("Error: La nota debe estar entre 1.1 y 7.0");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Formato de ingresado inválido. Debe ser un número decimal.");
                }
            }

            if (calificacion < menorNota) {
                menorNota = calificacion;
                nombreMenorNota = nombre;
            }

            if (calificacion > mayorNota) {
                mayorNota = calificacion;
                nombreMayorNota = nombre;
            }

            sumaCalificaciones += calificacion;
            totalAlumnos++;
        }

        if (totalAlumnos > 0) {
            double promedio = sumaCalificaciones / totalAlumnos;

            System.out.println("Promedio de calificaciones del curso: " + promedio);
            System.out.println("Cantidad de alumnos ingresados: " + totalAlumnos);
            System.out.println("Alumno con la menor nota: " + nombreMenorNota + " (Nota: " + menorNota + ")");
            System.out.println("Alumno con la mayor nota: " + nombreMayorNota + " (Nota: " + mayorNota + ")");
        } else {
            System.out.println("No se ingresaron alumnos.");
        }

        scanner.close();
    }
}



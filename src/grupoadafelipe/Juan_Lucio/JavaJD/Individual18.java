package grupoadafelipe.Juan_Lucio.JavaJD;

import java.util.Scanner;

public class Individual18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nombreAlumno;
        int calificacion;
        int totalCalificaciones = 0;
        int contadorAlumnos = 0;
        int menorNota = Integer.MAX_VALUE;
        int mayorNota = Integer.MIN_VALUE;
        String nombreMenorNota = "";
        String nombreMayorNota = "";
        
        System.out.println("Ingrese el nombre del alumno (o 'SALIR' para terminar):");
        nombreAlumno = scanner.nextLine();
        
        while (!nombreAlumno.equalsIgnoreCase("SALIR")) {
            System.out.println("Ingrese la calificación del alumno:");
            calificacion = scanner.nextInt();
            
            totalCalificaciones += calificacion;
            contadorAlumnos++;
            
            if (calificacion < menorNota) {
                menorNota = calificacion;
                nombreMenorNota = nombreAlumno;
            }
            
            if (calificacion > mayorNota) {
                mayorNota = calificacion;
                nombreMayorNota = nombreAlumno;
            }
            
            scanner.nextLine(); // Limpiar el búfer de entrada
            
            System.out.println("Ingrese el nombre del siguiente alumno (o 'SALIR' para terminar):");
            nombreAlumno = scanner.nextLine();
        }
        
        if (contadorAlumnos > 1) {
            double promedio = (double) totalCalificaciones / contadorAlumnos;
            
            System.out.println("Promedio del curso: " + promedio);
            System.out.println("Alumno con la menor nota: " + nombreMenorNota + " (" + menorNota + ")");
            System.out.println("Alumno con la mayor nota: " + nombreMayorNota + " (" + mayorNota + ")");
        } else {
            System.out.println("Debe ingresar al menos dos alumnos para obtener resultados.");
        }
        
        scanner.close();
    }
}

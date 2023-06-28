import java.util.Scanner;

public class Individual7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitud del valor de la hora de trabajo
        System.out.println("Ingrese el valor de la hora de trabajo:");
        double valorHoraTrabajo = scanner.nextDouble();

        // Solicitud de la cantidad de trabajadores
        System.out.println("Ingrese la cantidad de trabajadores:");
        int cantidadTrabajadores = scanner.nextInt();

        for (int i = 1; i <= cantidadTrabajadores; i++) {
            System.out.println("Trabajador " + i + ":");

            // Solicitud de los datos del trabajador
            System.out.println("Ingrese el nombre:");
            String nombre = scanner.next();

            System.out.println("Ingrese la edad:");
            int edad = scanner.nextInt();

            // Solicitud de las horas trabajadas por día
            System.out.println("Ingrese las horas trabajadas del lunes:");
            int horasLunes = scanner.nextInt();

            System.out.println("Ingrese las horas trabajadas del martes:");
            int horasMartes = scanner.nextInt();

            System.out.println("Ingrese las horas trabajadas del miércoles:");
            int horasMiercoles = scanner.nextInt();

            System.out.println("Ingrese las horas trabajadas del jueves:");
            int horasJueves = scanner.nextInt();

            System.out.println("Ingrese las horas trabajadas del viernes:");
            int horasViernes = scanner.nextInt();

            // Cálculo del total de horas trabajadas y del sueldo semanal
            int totalHorasTrabajadas = horasLunes + horasMartes + horasMiercoles + horasJueves + horasViernes;
            double sueldoSemanal = totalHorasTrabajadas * valorHoraTrabajo;

            // Mostrar los datos del trabajador y su sueldo semanal
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Total horas trabajadas: " + totalHorasTrabajadas);
            System.out.println("Sueldo semanal: " + sueldoSemanal);
            System.out.println();
        }
    }
}

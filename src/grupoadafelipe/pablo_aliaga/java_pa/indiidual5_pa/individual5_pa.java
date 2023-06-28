package grupoadafelipe;
import java.util.Scanner;

public class individual5_pa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int i, j;
        double[][] datos;
        String[] nombres;

        System.out.println("Ingresar la cantidad de trabajadores que desea ingresar");
        n = input.nextInt();

        datos = new double[n][4];
        nombres = new String[n];

        for (i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la persona");
            nombres[i] = input.next();

            for (j = 0; j < 4; j++) {
                System.out.println("Ingrese la edad, horas trabajadas a la semana y valor hora");
                datos[i][j] = input.nextDouble();
            }
        }

        System.out.println("Datos:");
        for (i = 0; i < n; i++) {
            System.out.println("Nombre: " + nombres[i]);

            for (j = 0; j < 4; j++) {
                System.out.println("Dato " + (j + 1) + ": " + datos[i][j]);
            }

            double remuneracion = datos[i][2] * datos[i][3];
            System.out.println("Remuneración por semana: " + remuneracion);
            System.out.println();
        }

        input.close();
    }
}

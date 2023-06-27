package los_malvekexxxx.javierasanchez.java;
import java.util.Scanner;

public class EjercicioIndividual9byjavi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            System.out.println("Los divisores del número " + numero + " son:");
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.println(i);
                }
            }
        }
}

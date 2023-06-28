package grupo_ada;

import java.util.Scanner;

public class EjemploIf {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero < 10) {
                System.out.println("El número es menor a 10.");
            } else {
                System.out.println("El número es mayor o igual a 10.");
            }
        }
}

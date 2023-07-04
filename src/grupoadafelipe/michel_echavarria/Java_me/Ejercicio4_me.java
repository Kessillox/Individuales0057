package mechavarria.Java;

import java.util.Scanner;

public class Ejercicio4_me {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int precio_inicial_A_tam1, precio_inicial_A_tam2, precio_inicial_B_tam1, precio_inicial_B_tam2;
                int cantidad_A_tam2, cantidad_B_tam1;
                int ganancia_A_tam2, ganancia_B_tam1, ganancia_total;

                System.out.print("Ingrese el precio inicial por kilo de lana tipo A y tamaño 1: ");
                precio_inicial_A_tam1 = scanner.nextInt();

                System.out.print("Ingrese el precio inicial por kilo de lana tipo A y tamaño 2: ");
                precio_inicial_A_tam2 = scanner.nextInt();

                System.out.print("Ingrese el precio inicial por kilo de lana tipo B y tamaño 1: ");
                precio_inicial_B_tam1 = scanner.nextInt();

                System.out.print("Ingrese el precio inicial por kilo de lana tipo B y tamaño 2: ");
                precio_inicial_B_tam2 = scanner.nextInt();

                System.out.print("Ingrese la cantidad de lana tipo A y tamaño 2 entregada: ");
                cantidad_A_tam2 = scanner.nextInt();

                System.out.print("Ingrese la cantidad de lana tipo B y tamaño 1 entregada: ");
                cantidad_B_tam1 = scanner.nextInt();

                ganancia_A_tam2 = (precio_inicial_A_tam2 + 300) * cantidad_A_tam2;
                ganancia_B_tam1 = (precio_inicial_B_tam1 - 50) * cantidad_B_tam1;

                ganancia_total = ganancia_A_tam2 + ganancia_B_tam1;

                System.out.println("La ganancia obtenida por la entrega de lana es: " + ganancia_total);

                scanner.close();
        }
}

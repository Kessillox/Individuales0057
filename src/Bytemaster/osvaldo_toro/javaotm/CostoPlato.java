package Bytemaster.osvaldo_toro.javaotm;

import java.util.Scanner;

public class CostoPlato {
    public static void main(String[] args) {
        // Paso 1: Leer el número de personas
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de personas: ");
        int personas = scanner.nextInt();

        // Paso 2: Calcular el costo por persona según las tarifas
        int costoPorPersona;
        if (personas > 300) {
            costoPorPersona = 4000;
        } else if (personas > 200) {
            costoPorPersona = 4200;
        } else {
            costoPorPersona = 4500;
        }

        // Paso 3: Calcular el costo total del banquete
        int costoTotal = personas * costoPorPersona;

        // Paso 4: Mostrar el resultado
        System.out.println("El costo por persona es: " + costoPorPersona);
        System.out.println("El costo total del banquete es: " + costoTotal);

        scanner.close();
    }
}
package grupoadafelipe.michel_echavarria.Java_me;

import java.util.Scanner;

public class Ejercicio10_me {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[8];

        System.out.println("Ingrese los elementos del vector:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            int temp = vector[i];
            vector[i] = vector[7 - i];
            vector[7 - i] = temp;
        }

        System.out.println("Vector con elementos intercambiados:");

        for (int i = 0; i < 8; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }
    }
}

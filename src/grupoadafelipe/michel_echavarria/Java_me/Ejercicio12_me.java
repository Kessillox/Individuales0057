package mechavarria.Java;

import java.util.Random;

public class Ejercicio12_me {
    public static void main(String[] args) {
        int[][] matrizOriginal = new int[5][3];
        int[][] matrizTraspuesta = new int[3][5];
        int fila, columna;

        Random random = new Random();

        for (fila = 0; fila < 5; fila++) {
            for (columna = 0; columna < 3; columna++) {
                matrizOriginal[fila][columna] = random.nextInt(100) + 1;
            }
        }

        for (fila = 0; fila < 5; fila++) {
            for (columna = 0; columna < 3; columna++) {
                matrizTraspuesta[columna][fila] = matrizOriginal[fila][columna];
            }
        }

        System.out.println("Matriz Original:");
        for (fila = 0; fila < 5; fila++) {
            for (columna = 0; columna < 3; columna++) {
                System.out.print(matrizOriginal[fila][columna] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz Traspuesta:");
        for (fila = 0; fila < 3; fila++) {
            for (columna = 0; columna < 5; columna++) {
                System.out.print(matrizTraspuesta[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}

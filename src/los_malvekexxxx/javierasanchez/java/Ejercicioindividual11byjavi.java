package los_malvekexxxx.javierasanchez.java;
import java.util.Scanner;

public class Ejercicioindividual11byjavi {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner scanner = new Scanner(System.in);

            // Ingresar valores en la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                }
        }
            // Imprimir la matriz
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        System.out.println();
        }

        int centro = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3];
        System.out.println("La suma diagonal del medio es :"+centro);

        int superior = matriz[0][1] + matriz[1][2] + matriz[2][3];
        System.out.println("La suma diagonal superior es :"+superior);

        int inferior = matriz[1][0] + matriz[2][1] + matriz[3][2];
        System.out.println("La suma diagonal de al inferior es :"+inferior);

        int suma = inferior + superior;

        if(suma < centro){
            System.out.println("La suma de las diagonales inferior y superior son menor a la diagonal central");
        }else {
            System.out.println("La suma de las diagonales inferior y superior NO son menor a la diagonal central");

        }

    }
}



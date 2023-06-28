package do_while.andres_sepulveda.java;

import java.util.Scanner;

/**
 * @author Andres Sepulveda
 */
   /*
    * Escriba un algoritmo que, dada una matriz de 4x4, permita saber:

        - Su diagonal principal: la suma de todas las celdas que conforman la diagonal principal, esto
          es, aquellas en las que el indicador de fila es igual que el de la columna.
        - Diagonal superior: la suma de todas las celdas que están sobre la diagonal principal
        - Diagonal inferior: la suma de todas las celdas que están bajo la diagonal principal

        Finalmente, debe indicar si la suma de la diagonal superior y la diagonal inferior es menor que la
        diagonal principal. Debe indicar un mensaje, ya sea para el éxito de la validación como en caso que
        ésta no se cumpla.

        Para probar el problema, debe tener declarada la matriz con las dimensiones correspondientes, y
        tiene que asignarle valores (lo puede hacer directo, o bien solicitando al usuario que ingrese un
        dato).
    *
    */
public class Individual4_11 {
    private static void diagonalPrincipal(int elemento, int[][] matriz) {
        // Diagonal principal //
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz.length; j ++) {
                if (i == j) {
                    elemento += matriz[i][j];
                }
            }
        }
        System.out.println("El valor de la diagonal principal vale: " + elemento);
    }
    private static void diagonalSuperior(int elemento, int[][] matriz) {
        // Diagonal superior //
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz.length; j ++) {
                if (i < j) {
                    elemento += matriz[i][j];
                }
            }
        }
        System.out.println("El valor de la diagonal superior vale: " + elemento);
    }
    private static void diagonalInferior(int elemento, int[][] matriz) {
        // Diagonal superior //
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz.length; j ++) {
                if (i > j) {
                    elemento += matriz[i][j];
                }
            }
        }
        System.out.println("El valor de la diagonal inferior vale: " + elemento);
    }
    private static int[][] crearMatriz(int n) {
        // Creamos la matriz bidimensional //
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz.length; j ++) {
                matriz[i][j] = i + j;
                //System.out.print(matriz[i][j] + " ");
            }
            //System.out.println();
        }
        return matriz;
    }
    private static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz.length; j ++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elemento = 0;
        boolean funcionando = true;

        System.out.println("Que dimension del arreglo prefiere: ");
        int n = sc.nextInt();

        crearMatriz(n);
        System.out.println("La matriz creada es la siguiente: ");
        mostrarMatriz(crearMatriz(n));

        while (funcionando) {
            System.out.println("""
            
            Que desea obtener:
            
            1. Diagonal Principal.
            2. Diagonal Superior.
            3. Diagonal Inferior.
            4. Salir
                    """);
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    diagonalPrincipal(elemento, crearMatriz(n));
                break;
                case 2:
                    diagonalSuperior(elemento, crearMatriz(n));
                break;
                case 3:
                    diagonalInferior(elemento, crearMatriz(n));
                break;
                case 4:
                    System.out.println("Usted a salido del programa");
                    funcionando = false;
                break;
                default:
                    System.out.println("Error en digitar la opcion, seleccione una correcta.");
                break;
            }
        }
    }
}

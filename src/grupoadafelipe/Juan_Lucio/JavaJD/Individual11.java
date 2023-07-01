package grupoadafelipe.Juan_Lucio.JavaJD;

public class Individual11 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSuperior = 0;
        int sumaDiagonalInferior = 0;

        // Inicializar la matriz con valores

        // Cálculo de las sumas de las diagonales
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {  // Diagonal principal
                    sumaDiagonalPrincipal += matriz[i][j];
                } else if (i < j) {  // Diagonal superior
                    sumaDiagonalSuperior += matriz[i][j];
                } else {  // Diagonal inferior
                    sumaDiagonalInferior += matriz[i][j];
                }
            }
        }

        // Comparación de las sumas de las diagonales
        if (sumaDiagonalSuperior + sumaDiagonalInferior < sumaDiagonalPrincipal) {
            System.out.println("La suma de la diagonal superior y la diagonal inferior es menor que la diagonal principal.");
        } else {
            System.out.println("La suma de la diagonal superior y la diagonal inferior es igual o mayor que la diagonal principal.");
        }
    }
}

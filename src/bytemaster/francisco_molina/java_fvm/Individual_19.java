package bytemaster.francisco_molina.java_fvm;
import java.util.Scanner;

public class Individual_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] matriz = new char[26][2];

        for (int i = 0; i < matriz.length ; i++) {
            matriz[i][0]= (char)('a'+i);
            matriz[i][1]= '0';
        }

        System.out.print("Ingrese la palabra: ");
        String palabra = sc.nextLine();

        // Validar si se ha ingresado una palabra válida
        while (palabra.trim().isEmpty() || !palabra.matches("[a-zA-Z]+")) {
            System.out.println("No ha escrito algo correcto. Vuelva a hacerlo.");
            palabra = sc.nextLine();
        }

        String palabraSinEspacios = palabra.replaceAll("\\s+", "");
        palabra = palabraSinEspacios.toLowerCase();

        char[] arreglo = palabra.toCharArray();

        for (int i = 0; i < arreglo.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (arreglo[i] == matriz[j][0] ){
                    int contador = (int) matriz[j][1] + 1;
                    matriz[j][1]= (char) contador;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("-------------");
            System.out.println(matriz[i][0] + ": " + matriz[i][1]);

        }
    }
}

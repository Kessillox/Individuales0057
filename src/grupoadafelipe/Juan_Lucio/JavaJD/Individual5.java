package grupoadafelipe.Juan_Lucio.JavaJD;

import java.util.Scanner;

public class Individual5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Ha salido del país? 1 para sí, 2 para no");
        int salida = scanner.nextInt();
        
        System.out.println("¿Ha presentado contagios cercanos? 1 para sí, 2 para no");
        int contagio = scanner.nextInt();
        
        System.out.println("¿Se ha hecho un PCR? 1 para sí, 2 para no");
        int pecerre = scanner.nextInt();
        
        int resultado = 0;
        if (pecerre == 1) {
            System.out.println("Si se efectuó un PCR, ¿Cómo fue el resultado? 1 para negativo, 2 para positivo");
            resultado = scanner.nextInt();
        }
        
        if (salida == 1) {
            if (pecerre == 1) {
                if (resultado == 2) {
                    System.out.println("Debe hacer cuarentena por 14 días");
                } else {
                    System.out.println("No debe hacer cuarentena");
                }
            } else {
                System.out.println("Debe hacer cuarentena por 14 días");
            }
        } else {
            if (contagio == 1) {
                System.out.println("Debe hacer cuarentena por 14 días");
            } else {
                System.out.println("No debe hacer cuarentena");
            }
        }
        
        scanner.close();
    }
}

package do_while.andres_sepulveda.java;

import java.util.Scanner;

/**
 * @author Andres Sepulveda
 */
public class Individual4_13 {
    private static void cambioDolar(int pesos) {
        double dolar = pesos * 0.0012;
        System.out.println("El cambio te retorna: " + dolar + " dolares.");
    }
    private static void cambioEuro(int pesos) {
        double euro = pesos * 0.0011;
        System.out.println("El cambio te retorna: " + euro + " euros.");
    }
    private static void cambioYen(int pesos) {
        double yen = pesos * 0.18;
        System.out.println("El cambio te retorna: " + yen + " yenes.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean funcionando = true;


        while (funcionando) {

            System.out.println("""
            Que cantidad posee en pesos chilenos desea convertir: 
                    """);
            int pesos = sc.nextInt();
            System.out.println("""
            
            Que tipo de cambio desea usar:
            
            - DOLAR.
            - EURO.
            - YEN.
            - SALIR.
                    """);
            String tipoDivisa = sc.next();

            switch (tipoDivisa.toUpperCase()) {
                case "DOLAR":
                    cambioDolar(pesos);
                    break;
                case "EURO":
                    cambioEuro(pesos);
                    break;
                case "YEN":
                    cambioYen(pesos);
                    break;
                case "SALIR":
                    System.out.println("Usted a salido del programa");
                    funcionando = false;
                    break;
                default:
                    System.out.println("Error en escribir la opcion.");
                    break;
            }
        }
    }


}

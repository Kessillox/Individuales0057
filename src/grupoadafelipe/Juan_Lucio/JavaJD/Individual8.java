package grupoadafelipe.Juan_Lucio.JavaJD;

import java.util.Scanner;

public class Individual8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int moda = 0;
        int electronica = 0;
        int telefonia = 0;
        int muebles = 0;
        int ventas_mayores_1000 = 0;
        int ventas_entre_500_1000 = 0;
        int ventas_menores_igual_500 = 0;
        int total_ventas = 0;
        String categoria = "";

        while (!categoria.equals("SALIR")) {
            System.out.println("Ingrese una categoría (moda, electrónica, telefonía, muebles o SALIR para salir):");
            categoria = scanner.nextLine();

            if (!categoria.equals("SALIR")) {
                System.out.println("Ingrese el monto de la venta:");
                int venta = scanner.nextInt();
                scanner.nextLine();

                if (venta > 1000) {
                    ventas_mayores_1000++;
                } else if (venta > 500) {
                    ventas_entre_500_1000++;
                } else {
                    ventas_menores_igual_500++;
                }

                switch (categoria) {
                    case "moda":
                        moda += venta;
                        break;
                    case "electrónica":
                        electronica += venta;
                        break;
                    case "telefonía":
                        telefonia += venta;
                        break;
                    case "muebles":
                        muebles += venta;
                        break;
                }
            }
        }

        total_ventas = moda + electronica + telefonia + muebles;

        System.out.println("Cantidad de ventas mayores a $1000: " + ventas_mayores_1000);
        System.out.println("Cantidad de ventas entre $500 y $1000: " + ventas_entre_500_1000);
        System.out.println("Cantidad de ventas menores o iguales a $500: " + ventas_menores_igual_500);
        System.out.println("Monto de ventas en moda: " + moda);
        System.out.println("Monto de ventas en electrónica: " + electronica);
        System.out.println("Monto de ventas en telefonía: " + telefonia);
        System.out.println("Monto de ventas en muebles: " + muebles);
        System.out.println("Monto de ventas total: " + total_ventas);
    }
}

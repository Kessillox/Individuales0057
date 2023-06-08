package Grupo_Ada.Juan_Lucio.JavaJD;

public class Ejercicio4 {

    public static void main(String[] args) {
            // Definir las constantes
            final int PRECIO_INICIAL_A = 1000;
            final int PRECIO_INICIAL_B = 800;
            final int CARGO_TIPO_A_TAM_1 = 200;
            final int CARGO_TIPO_A_TAM_2 = 300;
            final int DESCUENTO_TIPO_B_TAM_1 = 50;
            final int DESCUENTO_TIPO_B_TAM_2 = 60;

            // Definir las variables
            int tipo_a_tam_2 = 300; // Cantidad de kilos de tipo A tamaño 2
            int tipo_b_tam_1 = 200; // Cantidad de kilos de tipo B tamaño 1

            int precio_kilo_tipo_a_tam_2 = PRECIO_INICIAL_A + CARGO_TIPO_A_TAM_2;
            int monto_tipo_a_tam_2 = precio_kilo_tipo_a_tam_2 * tipo_a_tam_2;

            int precio_kilo_tipo_b_tam_1 = PRECIO_INICIAL_B - DESCUENTO_TIPO_B_TAM_1;
            int monto_tipo_b_tam_1 = precio_kilo_tipo_b_tam_1 * tipo_b_tam_1;

            int monto_total = monto_tipo_a_tam_2 + monto_tipo_b_tam_1;

            System.out.println("El productor recibirá un total de $" + monto_total + " por la venta de "
                    + tipo_a_tam_2 + " kilos de lana tipo A tamaño 2 y " + tipo_b_tam_1 + " kilos de lana tipo B tamaño 1.");
        }
    }

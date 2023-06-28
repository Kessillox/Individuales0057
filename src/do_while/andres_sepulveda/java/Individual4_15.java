package do_while.andres_sepulveda.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Individual4_15 {
    /*
     * Consideraciones preliminares
        Se te solicita desarrollar una calculadora en Java que muestre el siguiente menú:
        *** Menú ***
        1. Suma
        2. Resta
        3. Multiplicación
        4. División
        5. Cálculo ecuación de segundo grado
        6. Salir
        El programa solo terminará cuando se ingrese en número 6. Esta calculadora debe solicitar al
        usuario dos valores (1, 2, 3, 4) y tres valores (a, b, c), en el caso de ingresar la opción 5, para
        luego realizar la operación correspondiente. Es importante considerar que una división por cero
        no existe, por lo que deberás evaluar tal caso y enviar un mensaje de error.
        La solución de una ecuación de segundo grado está dada por la fórmula, donde a, b y c son
        números conocidos y con ellos se calcula el resultado.
     */
    private static void Calculo() {
        Scanner scanner = new Scanner(System.in);
        Boolean realizarCalculos = true;

        while(realizarCalculos) {
            System.out.println("""

            Bienvenido a la calculadora.
                1. Suma
                2. Resta
                3. Multipliacion
                4. Division
                5. Ecuacion de Segundo Grado
                6. Salir

            que operacion requiere:    """);

            int option = scanner.nextInt();

            if ( option >= 1 && option <= 6 ) {

                Map<Integer, BiFunction<Integer, Integer, Integer>> operaciones = new HashMap<>();
                operaciones.put(1, (a, b) -> a + b);
                operaciones.put(2, (a, b) -> a - b);
                operaciones.put(3, (a, b) -> a * b);
                operaciones.put(4, (a, b) -> a / b);
                operaciones.put(5, Individual4_15::EcuacionCuadratica); // Metodo por referencia, no lo conocia.___
                if( option == 6 ) {
                    realizarCalculos = false;
                    System.out.println("Usted ha salido de la calculadora.");
                    break;
                }

                System.out.println("Valor de a: ");
                int a = scanner.nextInt();
                System.out.println("Valor de b: ");
                int b = scanner.nextInt();

                int resultado = operaciones.get(option).apply(a, b);
                if(option == 1 || option == 2 || option == 3 || option == 4) {
                    System.out.println("El valor resultante de su operacion es: " + resultado);
                }
            }
            else {
                System.out.println("Ingrese una opcion valida");
            }
        }
        scanner.close();
    }
    private static int EcuacionCuadratica(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor de c: ");
        int c = scanner.nextInt();
        scanner.close();

        double discriminante = Math.pow(b, 2) - (4 * a * c);
        if( discriminante < 0) {
            System.out.println("La ecuacion cuadratica no tiene soluciones reales.");
            return 0;
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("X1 tiene valor de: " + x1 + " y X2 tiene valor de: " + x2);
            return 1;
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Individual4_15.Calculo();
        scanner.close();
    }
}

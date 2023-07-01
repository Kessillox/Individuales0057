package grupoadafelipe.Juan_Lucio.JavaJD;

import java.util.ArrayList;
import java.util.Scanner;

public class Individual20 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ingreso de números
        System.out.println("Ingrese números enteros (0 para finalizar):");
        int numero;
        do {
            numero = scanner.nextInt();
            if (numero != 0) {
                numeros.add(numero);
            }
        } while (numero != 0);

        // Validar cantidad de números ingresados
        if (numeros.size() < 3) {
            System.out.println("Se deben ingresar al menos tres números.");
            return;
        }

        // Cálculos iniciales
        double promedio = calcularPromedio(numeros);
        int menor = encontrarMenor(numeros);
        int mayor = encontrarMayor(numeros);

        // Mostrar resultados iniciales
        System.out.println("Promedio: " + promedio);
        System.out.println("Menor valor: " + menor);
        System.out.println("Mayor valor: " + mayor);

        // Eliminar números pares
        eliminarPares(numeros);

        // Cálculos después de eliminar pares
        promedio = calcularPromedio(numeros);
        menor = encontrarMenor(numeros);
        mayor = encontrarMayor(numeros);

        // Mostrar resultados después de eliminar pares
        System.out.println("Promedio después de eliminar pares: " + promedio);
        System.out.println("Menor valor después de eliminar pares: " + menor);
        System.out.println("Mayor valor después de eliminar pares: " + mayor);
    }

    // Calcular promedio de una lista de números
    public static double calcularPromedio(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return (double) suma / numeros.size();
    }

    // Encontrar el valor menor en una lista de números
    public static int encontrarMenor(ArrayList<Integer> numeros) {
        int menor = numeros.get(0);
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    // Encontrar el valor mayor en una lista de números
    public static int encontrarMayor(ArrayList<Integer> numeros) {
        int mayor = numeros.get(0);
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

    // Eliminar números pares de una lista
    public static void eliminarPares(ArrayList<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);
                i--; // Retroceder el índice después de eliminar un elemento
            }
        }
    }
}

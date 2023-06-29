package rocketeam.diegoortiz.javado;

import java.util.Scanner;
public class EjIndividual15_do {

    public static void main(String[] args) {

        String operador, valor1, valor2, total;

        operador = "";
        total = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("=============  Calculadora  ==============");
        System.out.println("==========================================");

        while(operador.equals("")) {

            System.out.println("Ingrese el primer número: ");
            valor1 = sc.nextLine();

            try
            {
                Integer.parseInt(valor1);
            }
            catch (NumberFormatException e)
            {
                System.out.println(valor1 + " no es un entero válido");
                continue;
            }

            System.out.println("Ingrese el segundo número: ");
            valor2 = sc.nextLine();

            try
            {
                Integer.parseInt(valor2);
            }
            catch (NumberFormatException e)
            {
                System.out.println(valor2 + " no es un entero válido");
                continue;
            }


            System.out.println(
                    "Escriba el símbolo de la operación que desea realizar a los valores " +
                            valor1 + " y " + valor2 + ":\n" +
                            "-Suma (+)\n" +
                            "-Resta (-)\n" +
                            "-Multiplicación (x)\n" +
                            "-División (:)\n" +
                            "-Módulo (/)"
            );

            operador = sc.nextLine();

            switch (operador) {
                case "+" -> total = String.format("%.0f", Float.parseFloat(valor1) + Float.parseFloat(valor2));
                case "-" -> total = String.format("%.0f", Float.parseFloat(valor1) - Float.parseFloat(valor2));
                case "x" -> total = String.format("%.0f", Float.parseFloat(valor1) * Float.parseFloat(valor2));
                case ":" -> total = String.format("%.2f", Float.parseFloat(valor1) / Float.parseFloat(valor2));
                case "/" -> total = String.format("%.0f", Float.parseFloat(valor1) % Float.parseFloat(valor2));
                default -> {
                    System.out.println(operador + " no es un operador válido.");
                    operador = "";
                }
            }

        }

        System.out.println("El resultado es: " + total);

    }

}

package rocketeam.matias__ac.mac_java.mod04;
import java.util.Scanner
public class calculadora {

    public static void main(string[] args) {
        Scanner scanner = new Scaner(System.in);
        System.out.print("Ingrese el primer número ");
        double num1 = scanner.nextDouble();

        System.out.print("ingrese el segundo numero");
        double num2 = scanner.nextDouble();

        double resultado;

        System.out.println("Operaciones disponibles:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Seleccione la operación (1-4): ");
        int operacion = scanner.nextInt();

        switch (operacion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }

        scanner.close();
    }


    }
}

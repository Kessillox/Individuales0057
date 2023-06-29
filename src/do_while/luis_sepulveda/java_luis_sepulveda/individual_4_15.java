/**
 *

package do_while.luis_sepulveda.java_luis_sepulveda;
import java.util.Scanner;

public class individual_4_15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese que operacion desea realizar entre los 2 numeros (+, -, x, :, /): ");
        String signo = scanner.next();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();



        int resultado = 0;

        switch (signo){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
            break;
            case ":":
                resultado = num1 / num2;
                break;
            case "/":
                resultado = num1 % num2;
                break;
            default:
                System.out.println("Signo Aricmetico Invalido, favor ingresar uno de los siguientes signos (+, -, x, :, /): ");
                return;
        }
        System.out.println("El resultado es: " + resultado);
    }
}

 */
package do_while.luis_sepulveda.java_luis_sepulveda;
import java.util.Scanner;
public class individual_4_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = obtenerNum(scanner, "ingrese el primer valor: ");

        String signo = obtenerSigno(scanner);

        while (!esSignoValido(signo)) {
            System.out.println("Ingrese un signo valido, favor intentelo denuevo utilizando (+, -, x, :, /): ");
            signo = obtenerSigno(scanner);
        }

        int num2 = obtenerNum(scanner, "ingrese el segundo valor: ");




        int resultado = resultado(num1, num2, signo);
        System.out.println("El resultado es: " + resultado);
    }
    public static int obtenerNum(Scanner scanner, String mensaje){
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida){
            System.out.println(mensaje);

            if (scanner.hasNextInt()){
                numero = scanner.nextInt();
                entradaValida = true;
            } else{
                System.out.println("Error: Debe ingresar un numero entero.");
                scanner.next();
            }
        }
        return numero;
    }


    public static String obtenerSigno(Scanner scanner){
        System.out.println("Ingrese el signo aritmetico (+, -, x, :, /): ");
        return scanner.next();
    }

    public static boolean esSignoValido(String signo){
        return signo.equals("+") || signo.equals("-") || signo.equals("x") || signo.equals(":") || signo.equals("/");
    }

    public static int resultado(int num1, int num2, String signo){
        switch(signo){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
                return num1 * num2;
            case ":":
                return num1 / num2;
            case "/":
                return num1 % num2;
            default:
                return 0;
        }
    }

    }

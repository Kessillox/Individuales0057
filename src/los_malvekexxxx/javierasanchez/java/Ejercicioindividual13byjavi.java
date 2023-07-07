package los_malvekexxxx.javierasanchez.java;
import java.util.Scanner;

public class Ejercicioindividual13byjavi {

 public static double ConversionMoneda(double monto, String tipodivisa) {
//Valores de las divisas dia 11 junio
        double resultado = 0.0;
        if (tipodivisa.equals("DOLAR")) {
            resultado = monto * 788.3;  // Supongamos que 1 Dólar equivale a 805 pesos chilenos
        } else if (tipodivisa.equals("EURO")) {
            resultado = monto * 846.5;  // Supongamos que 1 Euro equivale a 935 pesos chilenos
        } else if (tipodivisa.equals("YEN")) {
            resultado = monto * 5.7;  // Supongamos que 1 Yen equivale a 7.5 pesos chilenos
        }else {
            resultado = 0;
        }
        return resultado;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double monto;
        double resultado;
        String tipodivisa;

        System.out.print("Ingrese el monto: ");
        monto = scanner.nextDouble();

        System.out.print("Ingrese el tipo de divisa (DOLAR, EURO, YEN): ");
        tipodivisa = scanner.next();

        resultado = ConversionMoneda(monto, tipodivisa);

        if (resultado>0){
            System.out.println("El monto equivalente en pesos chilenos es: " + resultado);
        }else {
            System.out.println("Ingrese el tipo de divisa de manera correcta y con mayuscula ");
        }
    }
}

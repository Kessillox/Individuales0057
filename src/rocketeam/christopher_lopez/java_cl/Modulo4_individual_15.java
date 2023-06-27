package rocketeam.christopher_lopez.java_cl;

import java.util.Scanner;

public class Modulo4_individual_15 {

    public static void main(String[] args) {

        int n1,n2;
        String operador;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        n1 = sc.nextInt();

        System.out.println("Ingrese el segundo número");
        n2 = sc.nextInt();

        System.out.println("Ingrese el operador suma(+), resta(-), multiplicación(x), división(:), módulo(/) ");
        operador = sc.next();

        System.out.print("Resultado:");
        switch (operador){
            case "+":
                System.out.println(sumar(n1,n2));
                break;
            case "-":
                System.out.println(restar(n1,n2));
                break;
            case "x":
                System.out.println(multiplicar(n1,n2));
                break;
            case ":":
                System.out.println(dividir(n1,n2));
                break;
            case "/":
                System.out.println(modulo(n1,n2));
                break;
            default:
                System.out.println("Operador incorrecto");
                break;
        }

        sc.close();

    }

    public static int sumar(int num1,int num2){
        int resultado;
        resultado = num1+num2;
        return resultado;
    }

    public static int restar(int num1,int num2){
        int resultado;
        resultado = num1-num2;
        return resultado;
    }
    public static int multiplicar(int num1,int num2){
        int resultado;
        resultado = num1*num2;
        return resultado;
    }
    public static float dividir(float num1,float num2){
        float resultado;
        resultado = num1/num2;
        return resultado;
    }
    public static int modulo(int num1,int num2){
        int resultado;
        resultado = num1%num2;
        return resultado;
    }


}

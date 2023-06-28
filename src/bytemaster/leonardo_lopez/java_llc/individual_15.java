package bytemaster.leonardo_lopez.java_llc;
import java.util.Scanner;
public class individual_15 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3=0;
        String operacion;
        Scanner calculadora=new Scanner(System.in);
        System.out.println("ingrese numero para calcular");
        numero1=calculadora.nextInt();

        System.out.println("ingrese segundo numero");
        numero2=calculadora.nextInt();
        System.out.println("ingrese operacion");
        System.out.println("• Suma (+)\n" +
                "• Resta (-)\n" +
                "• Multiplicación (x)\n" +
                "• División (:)\n" +
                "• Módulo (/)");
        operacion=calculadora.next();
        switch(operacion) {
            case "+":
                numero3=numero1 + numero2;
                break;
            case"-":
                numero3=numero1 - numero2;
                break;
            case"x":
                numero3=numero1 * numero2;
                break;
            case":":
                numero3=numero1 / numero2;
                break;
            case"/":
                numero3=numero1 % numero2;
                break;
        }
        System.out.println("su resultado es "+numero3);













    }
























}
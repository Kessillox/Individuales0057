package bytemaster.francisco_molina.java_fvm;

import java.util.Scanner;

public class Individual_15 {
    public static void main(String[] args) {
        int primernumero;
        int segundoNumero;
        int resultado=0;
        String operacion;

        Scanner preguntas = new Scanner(System.in);
        System.out.print("Digite un numero para la calculadora: ");
        primernumero = preguntas.nextInt();
        System.out.println("Digite el segundo numero para la calculadora");
        segundoNumero = preguntas.nextInt();
        System.out.println("Ahora digite la operacion a realizar");
        System.out.println("las opciones son las siguientes: ");
        System.out.println("" +
                "• Suma (+)\n" +
                "• Resta (-)\n" +
                "• Multiplicación (x)\n" +
                "• División (:)\n" +
                "• Módulo (/)");
        operacion = preguntas.next();

        switch (operacion){
            case "+":
                resultado = primernumero + segundoNumero;
                break;
            case "-":
                resultado = primernumero - segundoNumero;
                break;
            case "x":
                resultado = primernumero * segundoNumero;
                break;
            case ":":
                resultado = primernumero / segundoNumero;
                break;
            case "/":
                resultado = primernumero % segundoNumero;
                break;

        }
        System.out.println("El resultado de su operacion es: "+resultado);

    }
}

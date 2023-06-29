package primerproyecto;

import java.util.Scanner;

public class PrimeraClase {
    public static void main(String[] args) {
        //comentario por culpa del pablo
        //comentario por culpa de Carlos
        String variableA;
        char caracter;
        Integer numerosEnteros;
        int variableB;
        Long numerosGrandesLib;
        long numerosGrandes;
        Float decimalesLib;
        float decimales;
        Double decimalesGrandesLib;
        double decimaleGrandes;
        Boolean logicoLib;
        boolean logico;

        caracter = 'c';
        variableA = "test 1";
        variableB = 4;
        numerosGrandes = 32874353l;
        decimaleGrandes = 233.243243255234d;
        decimales = 84.234734f;
        decimales = 1f;
        logico = true;
        decimaleGrandes = 123.23d;

        System.out.println("Hola Mundo!!! " + variableA + " " + caracter);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu edad");
        variableB = sc.nextInt();
        System.out.println("tu tienes "+variableB+" años");


    }
}

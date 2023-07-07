package los_malvekexxxx.javierasanchez.java;

import java.util.Scanner;

public class Ejercicioindividual3byjavi {
    public Ejercicioindividual3byjavi() {
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidad_personas;
        int precio = 4500;
        int total = 0;

        System.out.println("ingrese la cantidad de clientes: ");

        cantidad_personas = entrada.nextInt();

        if(cantidad_personas >= 1 && cantidad_personas < 200){

            total = cantidad_personas*precio;

            System.out.println("El valor corresponde a :"+total);

        }else if(cantidad_personas > 200 && cantidad_personas <= 300){

            precio = 4200;

            total = cantidad_personas*precio;

            System.out.println("El valor corresponde a :"+total);

        }else if(cantidad_personas > 300){

            precio = 4000;

            total = cantidad_personas*precio;

            System.out.println("El valor corresponde a :"+total);

        }else {

            System.out.println("Solo ingresar numeros positivos");

        }

    }
}

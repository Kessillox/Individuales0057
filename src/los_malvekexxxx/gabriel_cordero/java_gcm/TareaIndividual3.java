package los_malvekexxxx.gabriel_cordero.java_gcm;

import java.util.Scanner;

public class TareaIndividual3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("************************************************");
        System.out.println("*Bienvenido al Sistema De Cotizacion De Eventos*");
        System.out.println("************************************************");
        System.out.println("");

        System.out.println("Por favor ingresa cuantas personas asisitiran al evento: ");
        int Personas = sc.nextInt();

        int costoPorPersona;

        if (Personas > 300) {
            costoPorPersona = 4000;
        }

        else if (Personas > 200) {
            costoPorPersona = 4200;
        }

        else {
            costoPorPersona = 4500;
        }

        int costoTotal = Personas * costoPorPersona;

        System.out.println("El valor total del banquete es de: $" +costoTotal+ " pesos");
        System.out.println("Para las " +Personas+ " personas" );

    }

}

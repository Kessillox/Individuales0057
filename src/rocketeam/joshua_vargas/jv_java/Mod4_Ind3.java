package rocketeam.joshua_vargas.jv_java;

import java.util.Scanner;

public class Mod4_Ind3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");

        int numeroPersonas = scanner.nextInt();
        int costoPorPersona;

        if (numeroPersonas > 300) {
            costoPorPersona = 4000;
            System.out.println("El número de personas es mayor a 300, el costo por persona es 4000");
        } else if (numeroPersonas >= 200 && numeroPersonas <= 300) {
            costoPorPersona = 4200;
            System.out.println("El número de personas es entre 200 y 300, el costo por persona es 4200");
        } else {
            costoPorPersona = 4500;
            System.out.println("El número de personas es menor a 300, el costo por persona es 4500");
        }
        int presupuesto = numeroPersonas * costoPorPersona;
        System.out.println("El presupuesto para " + numeroPersonas + " personas es de: $" + presupuesto);
        scanner.close();
    }
}

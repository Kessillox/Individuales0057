package grupoadafelipe.Juan_Lucio.JavaJD;

import java.util.Scanner;

public class Ejercicio3 {
        public static void main(String[] args) {
            int precioPersona = 4500;
            int precioEspecial = 4200;
            int precioMaximo = 4000;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el número de personas del evento: ");
            int cantidadPersonas = scanner.nextInt();

            int presupuesto;

            if (cantidadPersonas <= 200) {
                presupuesto = cantidadPersonas * precioPersona;
            } else if (cantidadPersonas > 200 && cantidadPersonas <= 300) {
                presupuesto = cantidadPersonas * precioEspecial;
            } else {
                presupuesto = cantidadPersonas * precioMaximo;
            }

            System.out.println("El presupuesto total es de $" + presupuesto);
        }
    }

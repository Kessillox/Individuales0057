package CodingClub.AndreaLopez.javacodigos;

import java.util.Scanner;

public class calculoPresupuesto {

    public static int presupuesto (int cantidadPersonas, int precioPlato) {
        int totalPresupuesto = cantidadPersonas * precioPlato;

        return totalPresupuesto;
    };

    public static void main (String[] args){
        int precioPlato = 4500;

        Scanner entradaScanner = new Scanner (System.in);
        System.out.println ("Ingrese cantidad de personas");
        String cantidad = entradaScanner.nextLine();
        int cantidadInt = Integer.parseInt(cantidad);

        if (cantidadInt > 200 && cantidadInt < 301) {
            precioPlato = 4200;
        }
        else if (cantidadInt > 300){
            precioPlato = 4000;
        }

        int resultado = presupuesto(cantidadInt, precioPlato);
        System.out.println("El presupuesto para " + cantidadInt + " personas es: $" + resultado);
    }
}

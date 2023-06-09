package do_while.die_mansilla.java_die_mansilla;

import java.util.Scanner;

public class ejercicio_individual4_3 {
    public static void main(String[] args) {
        int costo_persona = 4500;
        int num_personas;
        int costo_total;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el numero de personas que participaran en el Evento:");
        num_personas = input.nextInt();

        if(num_personas > 200 && num_personas <= 300){
            costo_total = num_personas*4200;
        }
        else if (num_personas > 300){
            costo_total = num_personas*4000;
        }
        else{
            costo_total = num_personas * costo_persona;
        }
        System.out.println("El total del evento para " + num_personas + " personas, es de $" + costo_total);
    }
}
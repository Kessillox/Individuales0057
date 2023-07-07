package grupoadafelipe.michel_echavarria.Java_me;;

import java.util.Scanner;

public class Calculapresupuesto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de personas: ");
        int numPersonas = scanner.nextInt();
        int costoPorPersona;
        
        
        if (numPersonas < 200) {
            costoPorPersona = 4500;
        } else if (numPersonas >= 200 && numPersonas <= 300){
            costoPorPersona = 4200;
        } else {
            costoPorPersona = 4000;
        }
        
        int costoTotal = numPersonas * costoPorPersona;
        System.out.println("El costo por persona es de $"+ costoPorPersona +"$, por lo tanto el presupuesto total para el evento es de $" + costoTotal );
        scanner.close();
    }
}


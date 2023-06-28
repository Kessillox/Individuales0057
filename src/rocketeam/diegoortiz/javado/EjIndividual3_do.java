package rocketeam.diegoortiz.javado;

import java.util.Scanner;

public class EjIndividual3_do {

    public static void main(String[] args) {
        int cant_personas = 0, costo_plato;
        Scanner leer = new Scanner(System.in);

        while (cant_personas == 0){
            try{
                System.out.println("Ingrese cantidad de personas:");
                cant_personas = leer.nextInt();
            } catch (Exception e){
                System.out.println("Ingrese un número válido");
                leer.nextLine();
            }
        }

        if (cant_personas <= 200){
            costo_plato = 4500;
        } else if (cant_personas <= 300){
            costo_plato = 4200;
        } else{
            costo_plato = 4000;
        }

        String respuesta = String.format("El costo total para %d personas será de $%,d",cant_personas, (costo_plato*cant_personas));

        System.out.println(respuesta);
    }

}

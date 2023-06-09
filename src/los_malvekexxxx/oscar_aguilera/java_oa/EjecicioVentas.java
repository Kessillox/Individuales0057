package los_malvekexxxx.oscar_aguilera.java_oa;

import java.util.Scanner;
public class EjecicioVentas {

    /* Tarea Individual 1 */

    public static void main(String[] args) {

        /* Inicializamos las variables para contabizar el valor de los platos y el total del evento*/
        /* Se define por defecto el valor de $4.500 por plato*/
        int precioPlato = 4500;
        int Total = 0;

        /* Utilizamos el Scanner para obtener datos*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas que asistirán al evento: ");
        int cantPersonas = sc.nextInt();

        /* Validamos mediante If la cantidad de personas que ingresaron al evento y dependiendo de ello modificamos el precio del plato*/
        if (cantPersonas <= 200) {
            /* Si la cantidad de personas es de 200 o menor, el valor del plato queda con el valor por defecto, $4.500*/
            Total = cantPersonas * precioPlato;
        } else if (cantPersonas > 200 && cantPersonas <= 300) {
            /* Si la cantidad de personas es de mayor a 200 o menor o igual a 300, el valor del plato cambia a $4.200*/
            precioPlato = 4200;
            Total = cantPersonas * precioPlato;
        } else if (cantPersonas > 300) {
            /* Si la cantidad de personas es de mayor a 300, el valor del plato cambia a $4.000*/
            precioPlato = 4000;
            Total = cantPersonas * precioPlato;
        }

        /* Se imprime la informacion respecto de:
            -- La cantidfad de personas que asistieron.
            -- El precio del plato.
            -- El total del presupuesto del Evento.
        */
        System.out.println("La cantidad de Personas que asistieron al evento es de: "+cantPersonas+". \n"+
                "El presupuesto por persona es: $"+precioPlato+". \n"+
                "El presupuesto Total del Evento es: $"+Total);
    }
}

package rocketeam.christopher_lopez.java_cl;

import java.util.Scanner;

public class Modulo4_individual_3 {

    public static void main(String[] args) {
        int precio,personas;
        System.out.println("Ingrese número de personas");

        Scanner sc = new Scanner(System.in);
        personas = sc.nextInt();

        if (personas>200 && personas <=300){
            precio = 4200;
        } else if (personas>300) {
            precio = 4000;
        }else{
            precio = 4500;
        }

        System.out.println("El precio de cada plato es: "+precio);

    }




}

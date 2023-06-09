package Bytemaster.alex.java_ac;
import java.util.Scanner;
public class Individual3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int cantidad_p, total=0;

            System.out.print("Ingrese la cantidad de personas: ");
            cantidad_p = sc.nextInt();

            if (cantidad_p > 0){
                if (cantidad_p <= 200){
                    total = cantidad_p * 4500;}
                else if (cantidad_p <= 300 ){
                    total = cantidad_p * 4200;
                } else {
                    total = cantidad_p * 4000;
                }
                System.out.print("el valor del evento es $" + total +" para "+ cantidad_p +" personas");
            }
            else{
                System.out.print("ingrese un catidad positiva");
            }
        }
}

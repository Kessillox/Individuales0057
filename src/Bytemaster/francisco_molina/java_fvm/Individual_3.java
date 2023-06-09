package bytemaster.francisco_molina.java_fvm;

import java.util.Scanner;

public class Individual_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int numeropersonas = scanner.nextInt();

        int costo;

        if (numeropersonas <= 200) {
            costo = 4500;
        } else if (numeropersonas <= 300) {
            costo = 4200;
        } else {
            costo = 4000;
        }

        int total = costo * numeropersonas;

        System.out.println("Presupuesto para " + numeropersonas + " personas: $" + total);
    }
}

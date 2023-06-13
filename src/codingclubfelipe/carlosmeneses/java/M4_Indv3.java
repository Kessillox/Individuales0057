package codingclubfelipe.CarlosMeneses.java;

import java.util.Scanner;

public class M4_Indv3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cuantas personas?");
        
        String strPersonas = scanner.nextLine();
        int personas = Integer.parseInt(strPersonas);
        
        if (personas <= 200) {
            System.out.println("$4500 por persona. En total:");
            System.out.println(4500 * personas);
        } else {
            if (personas <= 300) {
            System.out.println("$4200 por persona. En total:");
            System.out.println(4200 * personas);
            } else {
                System.out.println("$4000 por persona. En total:");
                System.out.println(4000 * personas);
            }
        }
    }
}
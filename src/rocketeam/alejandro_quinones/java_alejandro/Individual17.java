package rocketeam.alejandro_quinones.java_alejandro;

import java.util.Scanner;

public class Individual17 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String str;
     System.out.println("Ingresa una cadena strings");
     str = sc.nextLine();
     while(str.isEmpty()) {
         System.out.println("Ingresa un string por favor");
         str = sc.nextLine();
     }
     for(int i = 0; i < str.length(); i ++) {
         char message = str.charAt(i);
         System.out.println(message);
     }
    }
}

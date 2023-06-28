package rocketeam.alejandro_quinones.java_alejandro;

import java.util.Scanner;

public class Individual19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Ingresa un string por favor");
        str = sc.nextLine();
        while (str.isEmpty()) {
            System.out.println("Ingresa un string por favor");
            str = sc.nextLine();
        }
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char message = str.charAt(i);
            System.out.println(message);
            arr[i] = str.charAt(i);
        }
        String abecedario = "abecedefghijklmnopqrstuvwxyz";
        System.out.println("==REPETICIONES==");

        for (int i = 0; i < abecedario.length(); i++) {
            char letra = abecedario.charAt(i);
            int contador = 0;

            for (int j = 0; j < arr.length; j++) {
                if (Character.toLowerCase(arr[j]) == Character.toLowerCase(letra)) {
                    contador++;
                }
            }

            System.out.println("Letra " + letra + ": " + contador + " repeticiones");
        }

    }
}
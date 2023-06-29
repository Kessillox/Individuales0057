package codingclub.carlosmeneses.modulo4.individual19;

import java.util.Scanner;

public class M4_Indv_19_CM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        String input;
        do {
            System.out.println("Ingrese un string no vacío");
            input = scanner.nextLine();
        } while (input.equals(""));

        int arrLength = input.length();

        char[] arrInput = new char[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arrInput[i] = input.charAt(i);
        }

        char abcLetter;
        int abcLetterNum;
        char inputLetter;
        for (int i = 0; i < abc.length; i++) {
            abcLetter = abc[i];
            abcLetter = Character.toLowerCase(abcLetter);
            abcLetterNum = 0;
            for (int j = 0; j < arrInput.length; j++) {
                inputLetter = arrInput[j];
                if (inputLetter == abcLetter) {
                    abcLetterNum++;
                }
            }
            System.out.println(abcLetter + " : " + abcLetterNum);
        }
    }
}

package grupoadafelipe;
import java.util.Scanner;

public class individual5_pa_origin9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i;

        System.out.println("Ingresar un numero");
        num = input.nextInt();

        for (i = 1; i <= num; i++) {

            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}

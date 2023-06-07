
import java.util.Scanner;

public class Switchcase {

    public static void main(String args[]) {
        System.out.println("Ingrese un color de semaforo");
        Scanner scanner = new Scanner(System.in);
        String colorDeSemaforo = scanner.nextLine();
        switch (colorDeSemaforo) {
            case "verde":
                System.out.println("Avanzar");
                break;
            case "amarillo":
                System.out.println("Frenar");
                break;
            case "rojo":
                System.out.println("Detenerse");
                break;
            default:
                System.out.println("Color invalido");
        }
    }
}

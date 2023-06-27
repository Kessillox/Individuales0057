import java.util.Scanner;
public class individual3_pa {
    public static void main(String[] args) {
        // Código de tu programa
        int invitados;
        int total;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESAR EL NUMERO DE INVITADOS");
        invitados = sc.nextInt();

        if (invitados > 300) {
            total = invitados * 4000;
        } else if (invitados <= 200) {
            total = invitados * 4500;
        } else {
            total = invitados * 4200;
        }

        System.out.println("El total del presupuesto del evento es: " + total);
    }
}
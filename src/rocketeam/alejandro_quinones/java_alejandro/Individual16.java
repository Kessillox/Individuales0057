package rocketeam.alejandro_quinones.java_alejandro;

import java.util.Scanner;

public class Individual16 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "awaker";
        String verificacion;

        System.out.println("Ingresa la contraseña por favor...");
        for(int i = 0; i < 3; i ++) {
            verificacion = sc.nextLine();
            if(password.equals(verificacion)) {
                System.out.println("La contraseña ingresada es correcta!");
                System.exit(0);
            }
           System.out.println(  i < 1 ? "Te quedan 2 intentos... Ingresala nuevamente": "Te queda 1 intento... Ingresala nuevamente");
        }
    }
}

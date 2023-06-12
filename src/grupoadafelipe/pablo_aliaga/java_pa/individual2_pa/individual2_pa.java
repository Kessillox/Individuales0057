import java.util.Scanner;
public class individual2_pa {
    public static void main(String[] args) {
        System.out.println("Bienvenido estimado usuario");
        System.out.println("******************** MAC OS 14 SONOMA AND GOMORRAH ********************");
        String username;
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar usuario:");//username:user
        username = sc.nextLine();
        System.out.print("Ingresar contrasena:");//password:user
        password = sc.nextLine();
        if(username.equals("user") && password.equals("user"))
        {
            System.out.println("Authentication Successful");
        }
        else
        {
            System.out.println("Authentication Failed");
        }
    }
}
package grupoadafelipe.nelson_carvajal.java_nc.Individual25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Trabajador prole1 = new Trabajador();
        String rut;
        boolean validarPunto = false;
        prole1.setNombre("juanito");
        prole1.setApellido1("perez");
        prole1.setApellido2("gonzalez");
        System.out.println(prole1.nombreCompleto());
        System.out.println(prole1.nombreCompleto2());

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese rut");
        rut = sc.nextLine();
        prole1.setRut(rut);
        System.out.println(prole1.procesarRut());
    }
}

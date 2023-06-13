package codingclubfelipe.andrealopez.java;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valido = true;

        int rut = 0, sist_salud = 0, edad = 0;
        String nombres = "", apellidos = "", telefono = "", afp = "", direccion = "", comuna = "";


        System.out.println("Ingrese RUT sin puntos, guion ni número verificador");
        rut = Integer.parseInt(scanner.nextLine());
        if (rut >= 100000000) {
            System.out.println("RUT muy largo");
            valido = false;
        }

        if (valido) {
            System.out.println("Ingrese nombres (no apellidos)");
            nombres = scanner.nextLine();
            if (nombres.equals("")) {
                System.out.println("Campo obligatorio");
                valido = false;
            }
        }

        if (valido) {
            System.out.println("Ingrese apellidos");
            apellidos = scanner.nextLine();
            if (apellidos.equals("")) {
                System.out.println("Campo obligatorio");
                valido = false;
            }
        }

        if (valido) {
            System.out.println("Ingrese telefono");
            telefono = scanner.nextLine();
            if (telefono.length() > 15) {
                System.out.println("Telefono muy largo");
                valido = false;
            }
        }

        if (valido) {
            System.out.println("Ingrese AFP");
            afp = scanner.nextLine();
            if (afp.equals("")) {
                System.out.println("Campo obligatorio");
                valido = false;
            }
        }

        if (valido) {
            System.out.println("Ingrese sistema de salud, 1 para Fonasa, 2 para Isapre");
            sist_salud = Integer.parseInt(scanner.nextLine());
            if (sist_salud != 1 && sist_salud != 2) {
                System.out.println("Valores validos son 1 o 2");
                valido = false;
            }
        }

        if (valido) {
            System.out.println("Ingrese dirección");
            direccion = scanner.nextLine();
            if (direccion.length() > 50) {
                System.out.println("Direccion muy larga");
                valido = false;
            }
        }

        if (valido) {
            System.out.println("Ingrese comuna");
            comuna = scanner.nextLine();
            if (comuna.equals("")) {
                System.out.println("Campo obligatorio");
                valido = false;
            }
        }

        if (valido) {
            System.out.println("Ingrese edad");
            edad = Integer.parseInt(scanner.nextLine());
            if (edad >= 120) {
                System.out.println("Edad muy grande");
                valido = false;
            }
        }

        if (valido) {
            System.out.println("Sus datos son:");
            System.out.println("RUT: " + rut);
            System.out.println("Nombres: " + nombres);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Teléfono: " + telefono);
            System.out.println("AFP: " + afp);
            if (sist_salud == 1) {
                System.out.println("Sistema de salud: Fonasa");
            } else {
                System.out.println("Sistema de salud: Isapre");
            }

            System.out.println("Dirección: " + direccion);
            System.out.println("Comuna: " + comuna);
            System.out.println("Edad: " + edad);
        }
    }
}

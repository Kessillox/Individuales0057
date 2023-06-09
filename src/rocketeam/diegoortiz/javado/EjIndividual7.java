package rocketeam.diegoortiz.javado;

import java.util.Scanner;

public class EjIndividual7 {
    public static void main(String[] args) {
        int cant_trabajadores;
        int pago_por_hora;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de trabajadores: ");
        cant_trabajadores = sc.nextInt();

        System.out.println("Ingrese el pago por hora: ");
        pago_por_hora = sc.nextInt();

        String nombre;
        int edad;
        int horas_trabajadas;
        int sueldo;

        String[][] trabajadores;
        trabajadores = new String[cant_trabajadores][4];

        for(int i=0; i<cant_trabajadores; i++){

            sc.nextLine();
            System.out.println("Ingrese nombre: ");
            nombre = sc.nextLine();

            System.out.println("Ingrese edad: ");
            edad = sc.nextInt();

            System.out.println("Ingrese horas trabajadas: ");
            horas_trabajadas = sc.nextInt();

            sueldo = horas_trabajadas * pago_por_hora;

            trabajadores[i][0] = nombre;
            trabajadores[i][1] = String.valueOf(edad);
            trabajadores[i][2] = String.valueOf(horas_trabajadas);
            trabajadores[i][3] = String.valueOf(sueldo);

        }

        for(int i=0; i<cant_trabajadores; i++){
            for(int j=0; j < 4; j++){
                System.out.print(trabajadores[i][j]);
                if (j!=trabajadores[i].length-1) System.out.print("\t");
            }
            System.out.println();
        }
    }
}

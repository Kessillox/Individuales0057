package rocketeam.christopher_lopez.java_cl;

import java.util.Scanner;

public class Modulo4_individual_7 {

    public static void main(String[] args) {
        int valorHora,n,edad,horasTrabajadas, horasTrabajadas1, sueldoSemanal;
        sueldoSemanal = 0;
        String nombre;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese valor de hora trabajada");
        valorHora = sc.nextInt();

        System.out.println("Ingrese cantidad de trabajadores");
        n = sc.nextInt();

        String[][] trabajadores = new String[n][3];
        String[] campos = new String[3];
        campos[0]="Nombre: ";
        campos[1]="Edad: ";
        campos[2]="Horas diarias trabajadas: ";

        for (int i=0; i<= n-1;i++){

            System.out.println("Ingrese nombre de trabajador "+(i+1));
            nombre = sc.next();
            trabajadores[i][0] = nombre;

            System.out.println("Ingrese edad de trabajador "+(i+1));
            edad = sc.nextInt();
            trabajadores[i][1] =  Integer.toString(edad) ;

            System.out.println("Ingrese horas trabajadas dia 1 de trabajador "+(i+1));
            horasTrabajadas = sc.nextInt();
            System.out.println("Ingrese horas trabajadas dia 2 de trabajador "+(i+1));
            horasTrabajadas1 = sc.nextInt();
            horasTrabajadas = horasTrabajadas1 + horasTrabajadas;
            System.out.println("Ingrese horas trabajadas dia 3 de trabajador "+(i+1));
            horasTrabajadas1 = sc.nextInt();
            horasTrabajadas = horasTrabajadas1 + horasTrabajadas;
            System.out.println("Ingrese horas trabajadas dia 4 de trabajador "+(i+1));
            horasTrabajadas1 = sc.nextInt();
            horasTrabajadas = horasTrabajadas1 + horasTrabajadas;
            System.out.println("Ingrese horas trabajadas dia 5 de trabajador "+(i+1));
            horasTrabajadas1 = sc.nextInt();
            horasTrabajadas = horasTrabajadas1 + horasTrabajadas;
            trabajadores[i][2] = Integer.toString(horasTrabajadas);

        }

        System.out.println("\n");
        System.out.println("Informe");
        System.out.println("\n");

        for (int j=0; j<= n-1;j++){

            System.out.println("Trabajadormalvekex "+(j+1));

            for (int k=0; k <= 2;k++){

                System.out.println(campos[k]+trabajadores[j][k]);

            }


            sueldoSemanal = Integer.parseInt(trabajadores[j][2]) *valorHora;
            System.out.println("Sueldo semanal: "+sueldoSemanal);
            System.out.println("\n");
        }


    }
}

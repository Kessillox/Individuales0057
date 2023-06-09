package rocketeam.alejandro_quinones.java_alejandro;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Individual7 {
    public static void main(String[] args) {
        Trabajador[] trabajadores = new Trabajador[1];
        Scanner sc = new Scanner(System.in);

        int hora = 0;
        System.out.println("Ingresa el valor hora de trabajo para los empleados de AwakeLab");
        hora = sc.nextInt();
        sc.nextLine();

        String firstName = "";

        if(hora != 0) {
            System.out.println("Ingresa el nombre del primer trabajador...");
            firstName = sc.nextLine();
        }
        int edadFirstName = 0;

        if(firstName != "") {
            System.out.println("Ingresa la edad del primer trabajador...");
            edadFirstName = sc.nextInt();
            sc.nextLine();
        }
        int lunesFirstWorker = 0;

        if(edadFirstName != 0) {
            System.out.println("Ingresa la cantidad de horas que trabajó el día lunes...");
            lunesFirstWorker = sc.nextInt();
            sc.nextLine();
        }

        int martesFirstWorker = 0;

        if(lunesFirstWorker != 0) {
            System.out.println("Ingresa la cantidad de horas que trabajó el día martes...");
            martesFirstWorker = sc.nextInt();
            sc.nextLine();
        }

        int miercolesFirstWorker = 0;

       if(martesFirstWorker != 0) {
           System.out.println("Ingresa la cantidad de horas que trabajó el día miercoles...");
           miercolesFirstWorker = sc.nextInt();
           sc.nextLine();
       }

        int juevesFirstWorker = 0;

       if(miercolesFirstWorker != 0) {
           System.out.println("Ingresa la cantidad de horas que trabajó el día Jueves...");
           juevesFirstWorker = sc.nextInt();
           sc.nextLine();
       }

        int viernesFirstWorker = 0;

        if(juevesFirstWorker != 0){
            System.out.println("Ingresa la cantidad de horas que trabajó el día Viernes...");
            viernesFirstWorker = sc.nextInt();
            sc.nextLine();
        }


        if(viernesFirstWorker != 0) {
            trabajadores[0] = new Trabajador(firstName, edadFirstName, new int[]{
                    lunesFirstWorker,
                    martesFirstWorker,
                    miercolesFirstWorker,
                    juevesFirstWorker,
                    viernesFirstWorker
            });

            int totalFirstWorker = 0;
            for(int i = 0; i < trabajadores[0].horas_diarias.length; i ++) {
                totalFirstWorker += trabajadores[0].horas_diarias[i] * hora;
            };

            NumberFormat nf = DecimalFormat.getInstance(Locale.ENGLISH);
            String firstResultado = nf.format(totalFirstWorker);
            firstResultado = "$" + firstResultado.replace(",", ".");

            System.out.println("El sueldo del trabajador " + trabajadores[0].nombre + " es de: " + firstResultado);
        }

    };
};
    class Trabajador {
        String nombre;
        int edad;
        int[] horas_diarias;

        public Trabajador(String nombre, int edad, int[] horas_diarias) {
            this.nombre = nombre;
            this.edad = edad;
            this.horas_diarias = horas_diarias;
        }
    };


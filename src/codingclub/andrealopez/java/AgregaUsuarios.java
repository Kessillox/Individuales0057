package codingclub.andrealopez.java;

import java.util.Scanner;

public class AgregaUsuarios {

    public static void main (String[] args){

        String nombre,fecha_nacimiento,rut,perfil;
        int contador=1;

        Scanner entradaScanner = new Scanner (System.in);
        System.out.println ("Ingrese cantidad de Usuarios");
        String cantidad = entradaScanner.nextLine();
        int cantidadInt = Integer.parseInt(cantidad);

        while (contador <=cantidadInt)
        {
            System.out.println ("Ingrese Nombre");
            nombre = entradaScanner.nextLine();
            System.out.println ("Ingrese Fecha de Nacimiento");
            fecha_nacimiento = entradaScanner.nextLine();
            System.out.println ("Ingrese rut");
            rut = entradaScanner.nextLine();
            System.out.println ("Ingrese Perfil");
            perfil = entradaScanner.nextLine();

            if(perfil.equals("cliente"))
            {
                System.out.println ("Ingrese direccion");
                String direccion = entradaScanner.nextLine();
                System.out.println ("Ingrese Telefono");
                String telefono = entradaScanner.nextLine();
                System.out.println ("Ingrese Cantidad de Empleados");
                String cont_empledos = entradaScanner.nextLine();

                System.out.println ("Nombre " +nombre+" fecha de nacimiento "+fecha_nacimiento+" Rut "+ "direccion "+
                        direccion+" telefono "+telefono+" empleados "+cont_empledos);


            }
            if(perfil.equals("profesional"))
            {
                System.out.println ("Ingrese Años de Experiencia");
                String expe = entradaScanner.nextLine();
                System.out.println ("Ingrese Departamento");
                String depa = entradaScanner.nextLine();


                System.out.println ("Nombre " +nombre+" fecha de nacimiento "+fecha_nacimiento+" Rut "
                        + "Experiencia"+expe+" Departamento "+depa);


            }
            if(perfil.equals("administrativo"))
            {
                System.out.println ("Ingrese Funcion");
                String fun = entradaScanner.nextLine();
                System.out.println ("Ingrese Nombre del Superior");
                String jefe = entradaScanner.nextLine();


                System.out.println ("Nombre " +nombre+" fecha de nacimiento "+fecha_nacimiento+" Rut "
                        + "Funcion"+fun+" Superior "+jefe);


            }

            contador++;

        }

    }

}

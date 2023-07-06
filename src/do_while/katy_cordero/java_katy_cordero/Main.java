package do_while.katy_cordero.java_katy_cordero;

import do_while.katy_cordero.java_katy_cordero.individual25.Trabajador;

public class Main {
    public static void main(String[] args){
        Trabajador tr1 = new Trabajador();

        tr1.setNombres("Layla");
        tr1.setApellidos("Barranco");
        tr1.setRun("27009022-2");
        tr1.setEdad("34");
        tr1.setTelefono("999943266");

        System.out.println(tr1.toString());
        System.out.println(tr1.nombreCompleto());
        System.out.println(tr1.descomponerRun());
    }

}

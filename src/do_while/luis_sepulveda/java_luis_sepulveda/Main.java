package do_while.luis_sepulveda.java_luis_sepulveda;

import do_while.luis_sepulveda.java_luis_sepulveda.individual25.Trabajador;

public class Main {
    public static void main(String[] args) {
        Trabajador tr1 = new Trabajador();

        tr1.setNombres("Luis");
        tr1.setApellidos("Sepulveda");
        tr1.setRun("18.242.624-5");
        tr1.setEdad(31);
        tr1.setTelefono("123123123");

        System.out.println(tr1.toString());
        System.out.println(tr1.nombreCompleto());
        System.out.println(tr1.descomponerRun());
    }
}

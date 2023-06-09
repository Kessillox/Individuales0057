package grupoadafelipe.nelson_carvajal.java_nc.individual27;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Trabajador prole1 = new Trabajador("Juanito","Perez","Gonzalez","16664053-3",36, LocalDate.of(1985,5,17),276322518);
        Trabajador prole2 = new Trabajador("Loreto","Faundes","Aravena","16168425-8",35,LocalDate.of(1973,9,11),272896679);
        TrabajadorHonorario honorario1 = new TrabajadorHonorario("Juan","Aravena","Risopeon","15540453-2",26,LocalDate.of(1999,11,5),292545836,"Obras Menores",2019);
        TrabajadorContratado contratado1 = new TrabajadorContratado("Tómas","Rojas","Lara","14548789-8",33,LocalDate.of(1998,12,26),45879874,LocalDate.of(2014,8,1),258987);
        TrabajadorEventual evntual1 = new TrabajadorEventual("Sebastián","Lafurcade","Exploit", "16898745-4", 45, LocalDate.of(2013,4,13),98766415,"Miercoles, jueves y viernes","pocotiempo@eventual.net");

        /*String rut;
        //boolean validarPunto = false;
        prole1.setNombre("juanito");
        prole1.setApellido1("perez");
        prole1.setApellido2("gonzalez");
        prole1.setTelefono(936235987);
        prole1.setEdad(36);**/
        System.out.println(prole1.nombreCompleto());
        System.out.println(prole1.mostrarDatos());
        System.out.println(prole2.nombreCompleto());
        System.out.println(honorario1.mostrarDatos());
        System.out.println(contratado1.mostrarDatos());
        System.out.println(evntual1.mostrarDatos());


        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese rut");
        rut = sc.nextLine();
        prole1.setRut(rut);
        System.out.println(prole1.procesarRut());**/
    }
}

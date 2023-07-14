package rocketeam.christopher_lopez.java_cl.corredorapropiedades;

import java.time.LocalDate;

public class CorrredoraPropiedadesMain {

    public static void main(String[] args) {

        Trabajador t1 = new Trabajador("Juan","Perez","123456-7",22331144,30);
        System.out.println(t1.nombreCompleto());
        System.out.println(t1.descomponerRun());
        System.out.println(t1);

        CargaFamiliar carga1 = new CargaFamiliar("111-1","Juan","Perez",t1,'1',50);
        System.out.println(carga1.toString());

        Contratado c1 = new Contratado("Andres","Caceres","12345678-6",223344115,40, LocalDate.of(2015,10,25),1000000);
        Honorario h1 = new Honorario("Carla","Diaz","12342432-7",887766553,35,"Contabilidad",2014);
        Eventual e1 = new Eventual("Patricio","Ramirez","16485639-8",44552273,60,"Lunes a Jueves","pramirez@yimeil.kom");

        System.out.println(t1.mostrarDatos());
        System.out.println(c1.mostrarDatos());
        System.out.println(h1.mostrarDatos());
        System.out.println(e1.mostrarDatos());

    }


}

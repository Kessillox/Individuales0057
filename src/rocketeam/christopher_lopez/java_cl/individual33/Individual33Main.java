package rocketeam.christopher_lopez.java_cl.individual33;

import java.time.LocalDate;

public class Individual33Main {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Juan","Garcés",31,800000, LocalDate.of(2015,05,20));
        System.out.println(v1);
        System.out.println();

        Vendedor v2 = new Vendedor("Andrea","Tapia",51,800000, LocalDate.of(2010,05,20));
        System.out.println(v2);
        System.out.println();

        Repartidor r1 = new Repartidor("Rorigo","Muñoz",20,600000,"9 - 18 hrs");
        System.out.println(r1);
        System.out.println();

        Repartidor r2 = new Repartidor("Andres","Perez",30,600000,"9 - 18 hrs");
        System.out.println(r2);







    }

}

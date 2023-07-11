package rocketeam.diegoortiz.javado.EjIndividual33_do;

import java.time.LocalDate;
import java.time.Month;

public class EjIndividual33_do_main {

    public static void main(String[] args) {
        Vendedor_do ven1 = new Vendedor_do("juan", "perez", 50, 600000, LocalDate.of(2002, Month.MAY, 15));
        System.out.println(ven1);
    }
}

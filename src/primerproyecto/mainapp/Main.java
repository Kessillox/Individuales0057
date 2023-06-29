package primerproyecto.mainapp;

import primerproyecto.poo.Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {

        Logger log = Logger.getLogger(Main.class.getName());

        Persona pers1 = new Persona();
        LocalDate fNac = LocalDate.now();
        System.out.println(pers1);
        pers1.setNombre("Andres");
        pers1.setApellido("Sepúlveda");
        pers1.setEdad(28);
        pers1.setFechaNac(fNac);


        //System.out.println(pers1);
        log.info(pers1.toString());

        //System.out.println(pers1.getNombre());
        log.info(pers1.getNombre());

        //System.out.println("LocalDate = " + LocalDate.now());
        log.info("LocalDate = " + LocalDate.now());

        //System.out.println("LocalDateTime = " + LocalDateTime.now());
        log.info("LocalDateTime = " + LocalDateTime.now());

        //System.out.println("LocalTime = " + LocalTime.now());
        log.info("LocalTime = " + LocalTime.now());

        //System.out.println("El Cumpleaños de Andrés es = " + LocalDate.of(1995, Month.MARCH, 4));
        log.info("El cumpleaños de Andres es = " + LocalDate.of(1995, Month.MARCH, 4));
    }
}

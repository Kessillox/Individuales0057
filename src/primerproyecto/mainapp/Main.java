package primerproyecto.mainapp;

import primerproyecto.poo.Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        Persona pers1 = new Persona();
        LocalDate fNac = LocalDate.now();
        System.out.println(pers1.toString());
         pers1.setNombre("Andres");
         pers1.setApellido("Sepúlveda");
         pers1.setEdad(28);
         pers1.setFechaNac(fNac);


        System.out.println(pers1.toString());
        System.out.println(pers1.getNombre());
        System.out.println("LocalDate = " + LocalDate.now());
        System.out.println("LocalDateTime = "+ LocalDateTime.now());
        System.out.println("LocalTime = "+ LocalTime.now());
        System.out.println("El Cumpleaños de Andrés es = " + LocalDate.of(1995, Month.MARCH, 4));

    }
}

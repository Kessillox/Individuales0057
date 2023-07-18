package codingclub.andrealopez.java.ind31;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Contratado trabajador1 = new Contratado(
                "Armando", "Código", "Seguro", "7421046-5", 2245789, 35, LocalDate.of(2022, 1, 1), 1500000
        );

        Eventual trabajador2 = new Eventual("Mariah", "Carey", "Carey", "94997321-1", 78954212, 50, "Inmediata", "mcarey@gmail.com");

        Honorario trabajador3 = new Honorario("Brad", "Pitt", "Pitt", "17958202-3", 98742586, 59, "Servicios profesionales", 1985);


        trabajador1.mostrarDatos();
        trabajador2.mostrarDatos();
        trabajador3.mostrarDatos();
    }

}

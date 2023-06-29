package primerproyecto.mainapp;

import primerproyecto.poo.Curso;
import primerproyecto.poo.Persona;
import primerproyecto.poo.Profesor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Main de MiPrimerProyecto
 * @author felipekessibustos
 * @author NelsonCarvajal
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //Instancia Objeto pers1 de tipo Persona, con su constructor vacío
        Persona pers1 = new Persona();
        //Instancia Obeto fNac de tipo LocalDate con valor .now()
        LocalDate fNac = LocalDate.now();
        //Imprimir pers1 vacía
        System.out.println(pers1.toString());

        //Seteando o asignando valores al objeto pers1
        pers1.setNombre("Andres");
        pers1.setApellido("Sepúlveda");
        pers1.setEdad(28);
        pers1.setFechaNac(fNac);

        //Instacia de objetos curso1, curso2, curso3 de tipo Curso
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Curso curso3 = new Curso();
        //Instancia Lista de Cursos
        List<Curso> listaCursosProf1 = new ArrayList<>();
        //Seteo de datos de los objetos curso
        curso1.setLetra("A");
        curso1.setNumAlumnos(25);
        curso2.setLetra("B");
        curso2.setNumAlumnos(30);
        curso3.setLetra("C");
        curso3.setNumAlumnos(40);

        //Añadiendo los cursos 1, 2 y 3 a la lista
        listaCursosProf1.add(curso1);
        listaCursosProf1.add(curso2);
        listaCursosProf1.add(curso3);

        //Instanciando objeto prof1 de tipo Profesor y seteando sus datos
        Profesor prof1 = new Profesor("Marcos", "Hanson", 33, LocalDate.of(1989, Month.AUGUST, 27), "JavaScript", listaCursosProf1);
        Profesor prof2 = new Profesor("Felipe", "Kessi", 32, LocalDate.of(1990, Month.OCTOBER, 19), "Java", listaCursosProf1);

        //Impresiones por pantalla
        System.out.println("*******************Persona*******************");
        System.out.println(pers1);
        System.out.println(pers1.getNombre());
        System.out.println("*******************Profesor*******************");
        System.out.println(prof1);
        System.out.println("El profesor "+prof1.getNombre()+" hace clases en los cursos "+ prof1.getListaCursos());
        System.out.println("********************Metodo presentacion******************");
        System.out.println(prof1.presentacion());
        System.out.println(prof2.presentacion());

        System.out.println("**************************************");
        System.out.println("LocalDate = " + LocalDate.now());
        System.out.println("LocalDateTime = "+ LocalDateTime.now());
        System.out.println("LocalTime = "+ LocalTime.now());
        System.out.println("El Cumpleaños de Andrés es = " + LocalDate.of(1995, Month.MARCH, 4));

    }
}

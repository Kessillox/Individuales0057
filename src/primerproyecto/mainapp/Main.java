package primerproyecto.mainapp;


import primerproyecto.poo.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Clase Main de MiPrimerProyecto
 * @author felipekessibustos
 * @author NelsonCarvajal
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        Logger log = Logger.getLogger(Main.class.getName());

        //Instancia Objeto pers1 de tipo Persona, con su constructor vacío
        Persona pers1 = new Persona();

        //Instancia Obeto fNac de tipo LocalDate con valor .now()
        LocalDate fNac = LocalDate.now();

        String fechaTexto;
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(fecha.format(formato));

        /***************Guardado de Fecha *********/
        //se recibe por teclado
        fechaTexto = "21/08/2003";
        //se transforma en LOCALDATE
        fecha = LocalDate.parse(fechaTexto, DateTimeFormatter.ofPattern("d/M/yyyy") );
        //Se guarda en el objeto
        pers1.setFechaNac(fecha);

        /***************Imprimir Fecha *********/
        System.out.println(fechaTexto);
        System.out.println(fecha);
        System.out.println(fecha.format(formato));

        //Imprimir pers1 vacía
        System.out.println(pers1.toString());
        System.out.println(pers1);
        System.out.println("");

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
        //System.out.println(pers1);
        log.info(pers1.toString());
        log.info(pers1.presentacion());


        //Añadiendo los cursos 1, 2 y 3 a la lista
        listaCursosProf1.add(curso1);
        listaCursosProf1.add(curso2);
        listaCursosProf1.add(curso3);


        //System.out.println("LocalTime = " + LocalTime.now());
        log.info("LocalTime = " + LocalTime.now());

        //System.out.println("El Cumpleaños de Andrés es = " + LocalDate.of(1995, Month.MARCH, 4));
        log.info("El cumpleaños de Andres es = " + LocalDate.of(1995, Month.MARCH, 4));

        //Instancia Lista de Cursos

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

        AnotacionPositiva anotacionPositiva1 = new AnotacionPositiva("Conoce el idioma");
        AnotacionNegativa anotacionNegativa1 = new AnotacionNegativa("Falta a Clases reiteradas veces");
        AnotacionNegativa anotacionNegativa2 = new AnotacionNegativa("No sube las tareas a la plataforma cuando corresponde");

        Anotacion anotacionesDiego = new Anotacion();

        //Instancia de obj Alumnos 1, 2 y 3
       // Alumno alumno1 = new Alumno("Diego Ignacio", "Aedo", 24, LocalDate.of(1998,Month.AUGUST, 11), 1, curso1, )

        //Impresiones por pantalla
        System.out.println("*******************Persona*******************");
        System.out.println(pers1);
        System.out.println(pers1.getNombre());

        System.out.println(pers1.presentacion());
        System.out.println("");
        System.out.println("*******************Profesor*******************");
        System.out.println(prof1);
        System.out.println("El profesor "+prof1.getNombre()+" hace clases en los cursos "+ prof1.getListaCursos());
        System.out.println("");
        System.out.println("********************Metodo presentacion******************");
        System.out.println(prof1.presentacion());
        System.out.println(prof2.presentacion());

        System.out.println(prof1.inspectoria());
        System.out.println(prof2.inspectoria());
        System.out.println("");
        System.out.println("**************************************");
        System.out.println("LocalDate = " + LocalDate.now());
        System.out.println("LocalDateTime = " + LocalDateTime.now());
        System.out.println("LocalTime = " + LocalTime.now());
        System.out.println("El Cumpleaños de Andrés es = " + LocalDate.of(1995, Month.MARCH, 4));

    Persona persona12 = new Persona("Nelson", "Carvajal", 15, LocalDate.of(2010, Month.OCTOBER,12));
    }

}

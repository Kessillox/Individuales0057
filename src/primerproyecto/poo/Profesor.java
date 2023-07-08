package primerproyecto.poo;

import java.time.LocalDate;
import java.util.List;

public class Profesor extends Persona{
    private String asignatura;
    private List<Curso> listaCursos;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, int edad, LocalDate fechaNac, String asignatura, List<Curso> listaCursos) {
        super(nombre, apellido, edad, fechaNac);
        this.asignatura = asignatura;
        this.listaCursos = listaCursos;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    @Override
    public String toString() {
        return  super.toString()+ "Profesor{" +
                "asignatura='" + asignatura + '\'' +
                ", listaCursos=" + listaCursos +
                "} ";
    }

<<<<<<< HEAD

=======
>>>>>>> 03f24c580d5bb5f7f194341fdb4688f0cede44a3
    public String presentacion(){
      String saludo = "Hola! soy el profesor "+this.getNombre()+" y hago clases de "+this.asignatura +" en los cursos "+ this.getListaCursos();
    return saludo;
    }
<<<<<<< HEAD


    public String inspectoria(){
        String orden = "a Inspectoría!!!! Yaaaaa!!";
        return  orden;
    }

=======
>>>>>>> 03f24c580d5bb5f7f194341fdb4688f0cede44a3
}

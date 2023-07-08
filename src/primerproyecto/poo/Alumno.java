package primerproyecto.poo;

<<<<<<< HEAD
<<<<<<< HEAD
import java.time.LocalDate;
import java.util.List;

public class Alumno extends Persona {

    private int nLista;
    private Curso curso;

    private List<Anotacion> listaAnotaciones;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad, LocalDate fechaNac, int nLista, Curso curso, List<Anotacion> listaAnotaciones) {
        super(nombre, apellido, edad, fechaNac);
        this.nLista = nLista;
        this.curso = curso;
        this.listaAnotaciones = listaAnotaciones;
    }

    public int getnLista() {
        return nLista;
    }

    public void setnLista(int nLista) {
        this.nLista = nLista;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Anotacion> getListaAnotaciones() {
        return listaAnotaciones;
    }

    public void setListaAnotaciones(List<Anotacion> listaAnotaciones) {
        this.listaAnotaciones = listaAnotaciones;
    }

    @Override
    public String toString() {
        return super.toString()+ " Alumno{" +
                "nLista=" + nLista +
                ", curso=" + curso +
                ", listaAnotaciones=" + listaAnotaciones +
                "} ";
    }
=======
public class Alumno {
>>>>>>> 03f24c580d5bb5f7f194341fdb4688f0cede44a3
=======
public class Alumno {
>>>>>>> 03f24c580d5bb5f7f194341fdb4688f0cede44a3
}

package codingclub.andrealopez.java.ind31;

public class Honorario extends Trabajador{

    private String giro;
    private int annioInicioActividades;

    public Honorario(String nombre, String apellido1, String apellido2, String run, int telefono, int edad, String giro, int annioInicioActividades) {
        super(nombre, apellido1, apellido2, run, telefono, edad);
        this.giro = giro;
        this.annioInicioActividades = annioInicioActividades;
    }

    public Honorario() {
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getAnnioInicioActividades() {
        return annioInicioActividades;
    }

    public void setAnnioInicioActividades(int annioInicioActividades) {
        this.annioInicioActividades = annioInicioActividades;
    }

    @Override
    public String toString() {
        return "Honorario{" +
                "giro='" + giro + '\'' +
                ", annioInicioActividades=" + annioInicioActividades +
                '}';
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El Trabajador es de tipo Honorario, siendo su giro " + giro + " y su año de inicio de actividades " + annioInicioActividades);
    }
}

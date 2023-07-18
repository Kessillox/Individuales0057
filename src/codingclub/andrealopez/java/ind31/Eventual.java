package codingclub.andrealopez.java.ind31;

public class Eventual extends Trabajador{
    private String disponibilidad, correo;

    public Eventual(String nombre, String apellido1, String apellido2, String run, int telefono, int edad, String disponibilidad, String correo) {
        super(nombre, apellido1, apellido2, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.correo = correo;
    }

    public Eventual() {
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Eventual{" +
                "disponibilidad='" + disponibilidad + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El Trabajador es de tipo Eventual, siendo su disponibilidad " + disponibilidad + " y su correo " +  correo
        );
    }
}

package bytemaster.individuales.individual31;

public class Eventual extends Trabajador {
private String disponibilidad;
private String correo;

    public Eventual() {
    }

    public Eventual(String nombre, String apellido, String run, int telefono, int edad, String disponibilidad, String correo) {
        super(nombre, apellido, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.correo = correo;
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
                "} " + super.toString();
    }

    @Override
    public void mostrarDatos() {
        System.out.println("soy un trabajador Eventual");
        super.mostrarDatos();
    }
}

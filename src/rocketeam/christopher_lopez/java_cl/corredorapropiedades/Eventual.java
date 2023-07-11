package rocketeam.christopher_lopez.java_cl.corredorapropiedades;

public class Eventual extends Trabajador{

    private String disponibilidad;
    private String email;

    public Eventual() {
    }

    public Eventual(String nombres, String apellidos, String run, int telefono, int edad, String disponibilidad, String email) {
        super(nombres, apellidos, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.email = email;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "eventual{" +
                "disponibilidad='" + disponibilidad + '\'' +
                ", email='" + email + '\'' +
                "} " + super.toString();
    }

    @Override
    public String mostrarDatos() {
        return "Disponibilidad: "+this.getDisponibilidad()+", correo electrónico: "+ this.getEmail();
    }
}

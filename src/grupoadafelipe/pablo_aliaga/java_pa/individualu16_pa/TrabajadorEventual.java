package grupoadafelipe.pablo_aliaga.java_pa.individualu16_pa;
//ESTE TRABAJO INCLUYE EL INDIVIDUAL31
public class TrabajadorEventual extends Trabajador {
    private String disponibilidad;
    private String correo;

    public TrabajadorEventual() {
    }

    public TrabajadorEventual(String nombre, String apellido1, String apellido2, String rut, int edad, int fechaNac, int telefono, String disponibilidad, String correo) {
        super(nombre, apellido1, apellido2, rut, edad, fechaNac, telefono);
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
        return "TrabajadorEventual{" +
                "disponibilidad='" + disponibilidad + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    public TrabajadorEventual(String nombre, String apellido1, String apellido2, String rut, int edad, int fechaNac, int telefono) {
        super(nombre, apellido1, apellido2, rut, edad, fechaNac, telefono);
    }
    public String mostrarDatos (){return getNombre()+" " + getApellido1()+" "+ getApellido2()+" "+"Estoy disponible los dias :"+ disponibilidad+" " + "Mi correo es: "+correo;}
}

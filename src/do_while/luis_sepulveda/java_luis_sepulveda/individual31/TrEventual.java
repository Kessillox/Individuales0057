package do_while.luis_sepulveda.java_luis_sepulveda.individual31;

public class TrEventual extends Trabajador{

    private String Disponibilidad;
    private String CorreoElectronico;

    public TrEventual() {
    }

    public TrEventual(String nombres, String apellidos, String run, String telefono, int edad, String disponibilidad, String correoElectronico) {
        super(nombres, apellidos, run, telefono, edad);
        Disponibilidad = disponibilidad;
        CorreoElectronico = correoElectronico;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        Disponibilidad = disponibilidad;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "TrEventual{" +
                "Disponibilidad='" + Disponibilidad + '\'' +
                ", CorreoElectronico='" + CorreoElectronico + '\'' +
                "} " + super.toString();
    }

    @Override
    public void mostrarDatos() {

        System.out.println("Disponibilidad: "+ this.getDisponibilidad());
        System.out.println("Correo Electronico: " + this.getCorreoElectronico());
    }
}

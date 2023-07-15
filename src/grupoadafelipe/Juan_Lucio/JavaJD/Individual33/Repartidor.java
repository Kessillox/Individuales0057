package grupoadafelipe.Juan_Lucio.JavaJD.Individual33;

import java.time.LocalDate;

public class Repartidor extends Empleado{
    public String horario;

    public Repartidor() {
    }

    public Repartidor(String horario) {
        this.horario = horario;
    }

    public Repartidor(String nombre, String apellido, LocalDate fechaNacimiento, int salario, String horario) {
        super(nombre, apellido, fechaNacimiento, salario);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "horario='" + horario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", salario=" + salario +
                "} " + super.toString();
    }
}

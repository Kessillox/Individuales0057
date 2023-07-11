package rocketeam.christopher_lopez.java_cl.corredorapropiedades;

import java.time.LocalDate;

public class Contratado extends Trabajador{

    private LocalDate fechaIngreso;
    private int salario;

    public Contratado() {
    }

    public Contratado(String nombres, String apellidos, String run, int telefono, int edad, LocalDate fechaIngreso, int salario) {
        super(nombres, apellidos, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Contratado{" +
                "fechaIngreso=" + fechaIngreso +
                ", salario=" + salario +
                "} " + super.toString();
    }

    @Override
    public String mostrarDatos() {
        return "Fecha de ingreso: "+ this.getFechaIngreso()+", salario mensual: "+ this.getSalario();
    }
}

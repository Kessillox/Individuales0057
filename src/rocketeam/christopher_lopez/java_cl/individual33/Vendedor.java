package rocketeam.christopher_lopez.java_cl.individual33;

import java.time.LocalDate;

public class Vendedor extends Empleado{
    private LocalDate fechaIngreso;

    public Vendedor() {
    }

    public Vendedor(String nombre, String apellido, int edad, int salario, LocalDate fechaIngreso) {
        super(nombre, apellido, edad, salario+50000);
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public void setSalario(int salario) {
        super.setSalario(salario+50000);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "fechaIngreso=" + fechaIngreso +
                "} " + super.toString();
    }


}

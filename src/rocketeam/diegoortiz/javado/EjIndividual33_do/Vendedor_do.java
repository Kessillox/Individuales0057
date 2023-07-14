package rocketeam.diegoortiz.javado.EjIndividual33_do;

import java.time.LocalDate;

public class Vendedor_do extends Empleado_do{

    private LocalDate fechaIngreso;

    public Vendedor_do() {
    }

    public Vendedor_do(String nombre, String apellido, int edad, int salario, LocalDate fechaIngreso) {
        super(nombre, apellido, edad, salario + 50000);
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Vendedor_do{" +
                "fechaIngreso=" + fechaIngreso +
                "} " + super.toString();
    }
}

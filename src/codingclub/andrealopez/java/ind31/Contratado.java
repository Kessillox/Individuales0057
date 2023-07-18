package codingclub.andrealopez.java.ind31;

import java.time.LocalDate;

public class Contratado extends Trabajador{

    private LocalDate fechaIngreso;
    private int salarioMensual;

    public Contratado(String nombre, String apellido1, String apellido2, String run, int telefono, int edad, LocalDate fechaIngreso, int salarioMensual) {
        super(nombre, apellido1, apellido2, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }

    public Contratado() {
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "Contratado{" +
                "fechaIngreso=" + fechaIngreso +
                ", salarioMensual=" + salarioMensual +
                '}';
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El trabajador es de tipo Contratado, siendo su fecha de ingreso " + fechaIngreso + " y su salario mensual " + salarioMensual);
    }
}

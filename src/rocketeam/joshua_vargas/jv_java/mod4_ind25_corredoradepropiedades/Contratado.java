package rocketeam.joshua_vargas.jv_java.mod4_ind25_corredoradepropiedades;

import java.time.LocalDate;

public class Contratado extends Trabajador{
    private LocalDate fechaIngreso;
    private int salarioMensual;

    public Contratado() {
    }

    public Contratado(String nombres, String apellidos, String run, int telefono, int edad, LocalDate fechaIngreso, int salarioMensual) {
        super(nombres, apellidos, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
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
    public String mostrarDatos() {
        return "Su fecha de ingreso es: "+ getFechaIngreso()+ ", y su salario es: "+ getSalarioMensual();
    }
}

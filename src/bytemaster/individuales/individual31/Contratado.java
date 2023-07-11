package bytemaster.individuales.individual31;


import java.time.LocalDate;

public class Contratado extends Trabajador {
private LocalDate fechaIngreso;
private Double salarioMensual;

    public Contratado() {
    }

    public Contratado(String nombre, String apellido, String run, int telefono, int edad, LocalDate fechaIngreso, Double salarioMensual) {
        super(nombre, apellido, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(Double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "Contratado{" +
                "fechaIngreso=" + fechaIngreso +
                ", salarioMensual=" + salarioMensual +
                "} " + super.toString();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}

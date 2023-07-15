package grupoadafelipe.Juan_Lucio.JavaJD.Individual33;

import java.time.LocalDate;

public class Vendedor extends Empleado {

    public LocalDate fechaInicio;
    public int bonoVendedor = 50000;

    public Vendedor() {
    }

    public Vendedor(LocalDate fechaInicio, int bonoVendedor) {
        this.fechaInicio = fechaInicio;
        this.bonoVendedor = bonoVendedor;
    }

    public Vendedor(String nombre, String apellido, LocalDate fechaNacimiento, int salario, LocalDate fechaInicio, int bonoVendedor) {
        super(nombre, apellido, fechaNacimiento, salario);
        this.fechaInicio = fechaInicio;
        this.bonoVendedor = bonoVendedor;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getBonoVendedor() {
        return bonoVendedor;
    }

    public void setBonoVendedor(int bonoVendedor) {
        this.bonoVendedor = bonoVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "fechaInicio=" + fechaInicio +
                ", bonoVendedor=" + bonoVendedor +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", salario=" + salario +
                "} " + super.toString();
    }
}
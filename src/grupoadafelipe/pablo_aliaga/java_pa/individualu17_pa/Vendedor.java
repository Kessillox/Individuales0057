package grupoadafelipe.pablo_aliaga.java_pa.individualu17_pa;

import java.time.LocalDate;

public class Vendedor extends Empleado{

    private localDate fechaInicio;
    private int bonoVendedor = 50000;

    public Vendedor() {
    }

    public Vendedor(localDate fechaInicio, int bonoVendedor) {
        this.fechaInicio = fechaInicio;
        this.bonoVendedor = bonoVendedor;
    }

    public Vendedor(String nombre, String apellido, LocalDate fechaNacimiento, int salario, localDate fechaInicio, int bonoVendedor) {
        super(nombre, apellido, fechaNacimiento, salario);
        this.fechaInicio = fechaInicio;
        this.bonoVendedor = bonoVendedor;
    }

    public localDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(localDate fechaInicio) {
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

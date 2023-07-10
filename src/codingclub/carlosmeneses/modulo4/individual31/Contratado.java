package codingclub.carlosmeneses.modulo4.individual31;

public class Contratado extends Trabajador {
    private int fechaIngreso;
    private int salarioMensual;

    @Override
    public String toString() {
        return "Contratado{" +
                "fechaIngreso=" + fechaIngreso +
                ", salarioMensual=" + salarioMensual +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public String mostrarDatos() {
        return "Fecha de ingreso: " + fechaIngreso + ", salario mensual: " + salarioMensual;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public int getSalarioMensual() {
        return salarioMensual;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
}

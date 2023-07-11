package codingclub.carlosmeneses.modulo4.individual33;

public class Vendedor extends Empleado {
    private int fechaInicio;

    public Vendedor(String nombre, String apellido, int edad, int salario, int fechaInicio) {
        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;

        this.salario += 50000;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "fechaInicio=" + fechaInicio +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}

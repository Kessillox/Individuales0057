package grupoadafelipe.Juan_Lucio.JavaJD.Individual33;

import java.time.LocalDate;

public class Empleado {
    //atributos
    public String nombre;
    public String apellido;
    public LocalDate fechaNacimiento;
    public int salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, LocalDate fechaNacimiento, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void bonificacion(){
        int edad = calcularEdad();

        if (edad > 40) {
            salario += 100000; // Agregar bono
        }
    }
    private int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getYear() - fechaNacimiento.getYear();
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", salario=" + salario +
                '}';
    }
}

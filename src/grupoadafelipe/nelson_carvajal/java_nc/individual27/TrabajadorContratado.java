package grupoadafelipe.nelson_carvajal.java_nc.individual27;

import java.time.LocalDate;

//ESTE TRABAJO INCLUYE EL INDIVIDUAL31
public class TrabajadorContratado extends Trabajador{
    private LocalDate fechaIngre;
    private int salario;

    public TrabajadorContratado() {
    }

    public TrabajadorContratado(String nombre, String apellido1, String apellido2, String rut, int edad, LocalDate fechaNac, int telefono, LocalDate fechaIngre, int salario) {
        super(nombre, apellido1, apellido2, rut, edad, fechaNac, telefono);
        this.fechaIngre = fechaIngre;
        this.salario = salario;
    }

    public LocalDate getFechaIngre() {
        return fechaIngre;
    }

    public void setFechaIngre(LocalDate fechaIngre) {
        this.fechaIngre = fechaIngre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "TrabajadorContratado{" +
                "fechaIngre=" + fechaIngre +
                ", salario=" + salario +
                '}';
    }
    public String mostrarDatos (){return fechaIngre+" "+salario;}
}

package bytemaster.individuales.Individual33;

import java.time.LocalDate;

public class Vendedor extends Empleado {
    private LocalDate fechaInicio;


    public Vendedor(String nombre, String apellido, int edad, double salario, String disponibilidad) {
        super(nombre, apellido, edad, salario);
        this.disponibilidad = disponibilidad;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de inicio en la empresa: " + fechaInicio);
    }

    public double calcularSalarioTotal() {
        double salarioTotal = super.calcularSalarioTotal();
        salarioTotal += 50000;
        return salarioTotal;
    }
}

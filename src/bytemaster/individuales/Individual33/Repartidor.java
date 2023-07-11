package bytemaster.individuales.Individual33;

import java.time.LocalDate;

public class Repartidor extends Empleado {
    private LocalDate fechaInicio;

    public Repartidor(String nombre, String apellido, int edad, double salario, LocalDate fechaInicio) {
        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;
    }

    public double calcularSalarioTotal() {
        double salarioTotal = super.calcularSalarioTotal();
        if (edad < 30) {
            salarioTotal += 15000;
        }
        return salarioTotal;
    }
}

package bytemaster.individuales.Individual33;

public class Vendedor extends Empleado {
    private String disponibilidad;


    public Vendedor(String nombre, String apellido, int edad, double salario, String disponibilidad) {
        super(nombre, apellido, edad, salario);
        this.disponibilidad = disponibilidad;
    }

    public double calcularSalarioTotal() {
        double salarioTotal = super.calcularSalarioTotal();
        salarioTotal += 50000;
        return salarioTotal;
    }
}

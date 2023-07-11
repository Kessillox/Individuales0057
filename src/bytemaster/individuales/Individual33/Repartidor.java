package bytemaster.individuales.Individual33;



public class Repartidor extends Empleado {
    private String disponibilidadHoraria;

    public Repartidor(String nombre, String apellido, int edad, double salario, String disponibilidadHoraria) {
        super(nombre, apellido, edad, salario);
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Disponibilidad horaria: " + disponibilidadHoraria);
    }

    public double calcularSalarioTotal() {
        double salarioTotal = super.calcularSalarioTotal();
        if (edad < 30) {
            salarioTotal += 15000;
        }
        return salarioTotal;
    }
}

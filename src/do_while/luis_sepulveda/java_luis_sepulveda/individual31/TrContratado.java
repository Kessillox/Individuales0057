package do_while.luis_sepulveda.java_luis_sepulveda.individual31;

public class TrContratado extends Trabajador{
    private String FechaIngreso;
    private String SalarioMensual;

    public TrContratado() {
    }

    public TrContratado(String nombres, String apellidos, String run, String telefono, int edad, String fechaIngreso, String salarioMensual) {
        super(nombres, apellidos, run, telefono, edad);
        FechaIngreso = fechaIngreso;
        SalarioMensual = salarioMensual;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public String getSalarioMensual() {
        return SalarioMensual;
    }

    public void setSalarioMensual(String salarioMensual) {
        SalarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "TrContratado{" +
                "FechaIngreso='" + FechaIngreso + '\'' +
                ", SalarioMensual='" + SalarioMensual + '\'' +
                "} " + super.toString();
    }

    @Override
    public void mostrarDatos() {

        System.out.println("Fecha de Ingreso: " + this.getFechaIngreso());
        System.out.println("Salario Mensual: " + this.getSalarioMensual());

    }
}

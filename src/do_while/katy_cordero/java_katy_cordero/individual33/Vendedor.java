package do_while.katy_cordero.java_katy_cordero.individual33;

public class Vendedor extends Empleado {
    private String fechaInicio;

    public Vendedor() {
    }

    public Vendedor(String nombre, String apellido, int edad, int salario, String fechaInicio) {
        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "fechaInicio='" + fechaInicio + '\'' +
                '}';

    }

    @Override
    public void calcularSueldo() {
        super.calcularSueldo();
        this.setSalario(getSalario() + 50000);
    }

    /*
    public void calcularSueldo (){
       super.calcularSueldo();
        this.setSalario(getSalario() + 50000);
        }
*/

}

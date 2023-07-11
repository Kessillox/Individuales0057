package do_while.katy_cordero.java_katy_cordero.individual33;

public class Repartidor extends Empleado {
    private String disponibilidad;

    public Repartidor() {
    }

    public Repartidor(String nombre, String apellido, int edad, int salario, String disponibilidad) {
        super(nombre, apellido, edad, salario);
        this.disponibilidad = disponibilidad;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "disponibilidad='" + disponibilidad + '\'' +
                '}';
    }

    @Override
    public void calcularSueldo() {
        super.calcularSueldo();
        if (getEdad() < 30) {
            int salarioActual = getSalario();
            int nuevoSalario = salarioActual + 15000;
            setSalario(nuevoSalario);
        }
    }
}



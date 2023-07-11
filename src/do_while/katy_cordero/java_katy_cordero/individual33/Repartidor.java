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
                ", salario=" + salario +
                "} " + super.toString();
    }

    @Override
    public void calcularSueldo() {
        super.calcularSueldo();
        if (getEdad() < 30) {
           this.setSalario(getSalario() + 15000);
            }
        System.out.println("Salario total (con bono de repartidor: "+ salario);
    }
}



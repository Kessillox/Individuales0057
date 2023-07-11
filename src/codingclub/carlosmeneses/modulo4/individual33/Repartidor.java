package codingclub.carlosmeneses.modulo4.individual33;

public class Repartidor extends Empleado {
    private String disponibilidadHoraria;

    public Repartidor(String nombre, String apellido, int edad, int salario, String disponibilidadHoraria) {
        super(nombre, apellido, edad, salario);
        this.disponibilidadHoraria = disponibilidadHoraria;

        if (this.edad < 30) {
            this.salario += 15000;
        }
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "disponibilidadHoraria='" + disponibilidadHoraria + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }

    public void setDisponibilidadHoraria(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }
}

package rocketeam.christopher_lopez.java_cl.individual33;

public class Repartidor extends Empleado{

    private String disponibilidad;

    public Repartidor() {
    }

    public Repartidor(String nombre, String apellido, int edad, int salario, String disponibilidad) {
        super(nombre, apellido, edad, salario);
        this.disponibilidad = disponibilidad;

        if (edad<30)
            super.setSalario(salario+15000);

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
                "} " + super.toString();
    }


}

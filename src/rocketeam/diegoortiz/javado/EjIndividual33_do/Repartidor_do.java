package rocketeam.diegoortiz.javado.EjIndividual33_do;

public class Repartidor_do extends Empleado_do{
    private String disponibilidadHoraria;

    public Repartidor_do() {
    }

    public Repartidor_do(String nombre, String apellido, int edad, int salario, String disponibilidadHoraria) {
        super(nombre, apellido, edad, salario);
        if (edad < 30) super.setSalario(salario+30000);
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }

    public void setDisponibilidadHoraria(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    @Override
    public String toString() {
        return "Repartidor_do{" +
                "disponibilidadHoraria='" + disponibilidadHoraria + '\'' +
                "} " + super.toString();
    }
}

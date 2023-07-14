package rocketeam.joshua_vargas.jv_java.mod4_ind33;

public class Repartidor_JV extends Empleado_JV {
    private String disponibilidadHoraria;

    public Repartidor_JV() {
    }

    public Repartidor_JV(String nombre, String apellido, int edad, int salario, String disponibilidadHoraria) {
        super(nombre, apellido, edad, salario);
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }

    public void setDisponibilidadHoraria(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }
    public void bonoAdicional(){

    }

    @Override
    public String toString() {
        return "Repartidor_JV{" +
                "disponibilidadHoraria='" + disponibilidadHoraria + '\'' +
                '}';
    }
}

package rocketeam.joshua_vargas.jv_java.mod4_ind33;

import java.time.LocalDate;

public class Vendedor_JV extends Empleado_JV {
    private LocalDate fechaInicio;

    public Vendedor_JV() {
    }


    public Vendedor_JV(String nombre, String apellido, int edad, int salario, LocalDate fechaInicio) {
        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /*public void bonoAdicional(){
        int bono = 50000;
            int salarioTotal =
    }*/

    @Override
    public String toString() {
        return "Vendedor_JV{" +
                "fechaInicio=" + fechaInicio +
                '}';
    }
}

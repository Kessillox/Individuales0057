package grupoadafelipe.Juan_Lucio.JavaJD.individual31;
//ESTE TRABAJO INCLUYE EL INDIVIDUAL31
public class TrabajadorContratado extends Trabajador{
    private int fechaIngre;
    private int salario;

    public TrabajadorContratado() {
    }

    public TrabajadorContratado(String nombre, String apellido1, String apellido2, String rut, int edad, int fechaNac, int telefono, int fechaIngre, int salario) {
        super(nombre, apellido1, apellido2, rut, edad, fechaNac, telefono);
        this.fechaIngre = fechaIngre;
        this.salario = salario;
    }

    public int getFechaIngre() {
        return fechaIngre;
    }

    public void setFechaIngre(int fechaIngre) {
        this.fechaIngre = fechaIngre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "TrabajadorContratado{" +
                "fechaIngre=" + fechaIngre +
                ", salario=" + salario +
                '}';
    }
    public String mostrarDatos (){return fechaIngre+" "+salario;}
}

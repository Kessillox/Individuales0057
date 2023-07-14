package rocketeam.joshua_vargas.jv_java.mod4_ind33;

public class Empleado_JV {
    private String nombre;
    private String apellido;
    private int edad;
    private int salario;

    public Empleado_JV() {
    }


    public Empleado_JV(String nombre, String apellido, int edad, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;

    }
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}

    public int getSalario() {return salario;}

    public void setSalario(int salario) {this.salario = salario;}


   public void bonoAdicional(){
     int bono = 0;
     int nuevoSalario = 0;
        if(this.getEdad() >40){
            bono = 100000;
            // bono+this.salario;
        }
   }

    @Override
    public String toString() {
        return "Empleado_JV{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}

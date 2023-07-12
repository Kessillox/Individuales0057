package rocketeam.christopher_lopez.java_cl.individual33;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private int salario;

    private boolean bono100 = false;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int edad, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
        if (edad>40)
            this.salario = salario+100000;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        if (this.getEdad()>40)
            this.salario = salario+100000;
        else
            this.salario = salario;


    }



    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }


}

package primerproyecto.poo;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNac;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNac = fechaNac;
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

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", fechaNac=" + fechaNac +
                '}';
    }

    public String presentacion(){
        String saludo = "Hola! soy el Lolito "+this.getNombre()+" y hago anexos";
        return saludo;
    }
}

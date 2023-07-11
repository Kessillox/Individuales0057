package losprofes.polimorfismo;

public class Gato extends Animal{

    private String nombre;
    private int edad;
    private String raza;

    public Gato() {
    }

    public Gato(String especie, String nombre, int edad, String raza) {
        super(especie);
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                "} " + super.toString();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("soy un gato de nombre "+this.getNombre()+", tengo "+this.getEdad()+" soy de raza "+this.getRaza() );
    }
}

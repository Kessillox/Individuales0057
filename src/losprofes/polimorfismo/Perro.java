package losprofes.polimorfismo;

public class Perro extends Animal{
    private String nombre;
    private int edad;
    private String raza;

    public Perro() {
    }

    public Perro(String especie, String nombre, int edad, String raza) {
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
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                "} " + super.toString();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Soy un perro de raza "+this.getRaza()+", me llamo "+this.getNombre()+" y tengo "+this.getEdad()+" años");
    }
}

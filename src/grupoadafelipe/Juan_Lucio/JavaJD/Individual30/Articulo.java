package grupoadafelipe.Juan_Lucio.JavaJD.Individual30;

public class Articulo {
    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y setters

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
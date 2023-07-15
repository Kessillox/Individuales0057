public class Vendedor {
    private String nombre;
    private String direccion;
    private String telefono;

    public Vendedor(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

// Getters y setters

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
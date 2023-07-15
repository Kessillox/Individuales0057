public class Comprador {
    private String nombre;
    private String direccion;
    private String telefono;

    public Comprador(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y setters

    @Override
    public String toString() {
        return "Comprador{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
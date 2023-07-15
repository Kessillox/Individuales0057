public class Envio {
    private String metodo;
    private double costo;

    public Envio(String metodo, double costo) {
        this.metodo = metodo;
        this.costo = costo;
    }

    // Getters y setters

    @Override
    public String toString() {
        return "Envio{" +
                "metodo='" + metodo + '\'' +
                ", costo=" + costo +
                '}';
    }
}
package grupoadafelipe.Juan_Lucio.JavaJD.Individual30;

public class Pago {
    private String tipo;
    private double monto;

    public Pago(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
    }

    // Getters y setters

    @Override
    public String toString() {
        return "Pago{" +
                "tipo='" + tipo + '\'' +
                ", monto=" + monto +
                '}';
    }
}
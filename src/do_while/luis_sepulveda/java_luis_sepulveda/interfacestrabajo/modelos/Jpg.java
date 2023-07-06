package do_while.luis_sepulveda.java_luis_sepulveda.interfacestrabajo.modelos;

public class Jpg extends Imagen {
    private String tipo;

    public Jpg() {
    }

    public Jpg(String nombreImagen, String tipo) {
        super(nombreImagen);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void validar() {
        super.validar();
        System.out.println("Soy una imagen de tipo "+ getTipo());
    }
}

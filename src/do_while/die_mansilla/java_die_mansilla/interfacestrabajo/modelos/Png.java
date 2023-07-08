package do_while.die_mansilla.java_die_mansilla.interfacestrabajo.modelos;

public class Png extends Imagen {
    private String tipo;

    public Png() {
    }

    public Png(String nombreImagen, String tipo) {
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
        System.out.println("soy una imagen de tipo "+getTipo());
    }
}

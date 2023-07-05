package do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.modelos;

public  class Documento {
    private String titulo;

    public Documento() {
    }

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                '}';
    }

    public void validar(){

    }
}

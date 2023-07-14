package do_while.luis_sepulveda.java_luis_sepulveda.interfacestrabajo.modelos;

import do_while.luis_sepulveda.java_luis_sepulveda.interfacestrabajo.interfaces.IValidacion;

public class Documento implements IValidacion {
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

    @Override
    public void validar() {
    }

}

package losprofes.interfacestrabajo.modelos;

import losprofes.interfacestrabajo.interfaces.IValidacion;

public class Documento implements IValidacion {
    private String nombreDocumento;

    public Documento() {
    }

    public Documento(String titulo) {
        this.nombreDocumento = titulo;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + nombreDocumento + '\'' +
                '}';
    }

    @Override
    public void validar() {
    }

}

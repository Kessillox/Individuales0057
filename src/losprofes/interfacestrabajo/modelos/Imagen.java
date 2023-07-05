package losprofes.interfacestrabajo.modelos;

import losprofes.interfacestrabajo.interfaces.IValidacion;

public class Imagen implements IValidacion {
    private String nombreImagen;

    public Imagen() {
    }

    public Imagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    @Override
    public String toString() {
        return "Imagenes{" +
                "nombreImagen='" + nombreImagen + '\'' +
                '}';
    }


    @Override
    public void validar() {
        System.out.println("La imagen de nombre " + getNombreImagen() + " ha sido validada");
    }
}

package do_while.luis_sepulveda.java_luis_sepulveda.interfacestrabajo;

import do_while.luis_sepulveda.java_luis_sepulveda.interfacestrabajo.modelos.*;
import do_while.luis_sepulveda.java_luis_sepulveda.interfacestrabajo.servicios.ServicioValidacion;

public class Main {
    public static void main(String[] args) {
        ServicioValidacion servicioValidacion = new ServicioValidacion();
        Word doc1 = new Word("SuperDocumento", 1997);
        Video video1=new Video("El mundo de Java de Pablito");
        Pdf doc3 = new Pdf("Aprende Java", true);
        Imagen img1 = new Imagen("Foto Bonita de Volcan");
        Png img2 = new Png("Foto Linda sin fondo", "PNG");
        Jpg img3 = new Jpg("Imagen con Fondo", "JPG");

        servicioValidacion.agregarArchivo(doc1);
        servicioValidacion.agregarArchivo(doc3);
        servicioValidacion.agregarArchivo(video1);
        servicioValidacion.agregarArchivo(img1);
        servicioValidacion.agregarArchivo(img2);
        servicioValidacion.agregarArchivo(img3);


        servicioValidacion.validarArchivo();

    }
}

package do_while.luis_sepulveda.java_luis_sepulveda.interfacestrabajo.modelos;

import do_while.luis_sepulveda.java_luis_sepulveda.interfacestrabajo.interfaces.IValidacion;

public class Video implements IValidacion {
    private String nombreVideo;


    public Video() {
    }

    public Video(String nombreVideo) {
        this.nombreVideo = nombreVideo;
    }

    public String getNombreVideo() {
        return nombreVideo;
    }

    public void setNombreVideo(String nombreVideo) {
        this.nombreVideo = nombreVideo;
    }

    @Override
    public String toString() {
        return "Video{" +
                "nombreVideo='" + nombreVideo + '\'' +
                '}';
    }

    @Override
    public void validar(){
        System.out.println("El video de nombre " + this.nombreVideo + " ha sido validado");
    }
}

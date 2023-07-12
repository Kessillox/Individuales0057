package losprofes.interfacestrabajo.servicios;

import losprofes.interfacestrabajo.interfaces.IValidacion;
import losprofes.interfacestrabajo.modelos.Documento;


import java.util.ArrayList;
import java.util.List;

public class ServicioValidacion {
    private List<IValidacion> listaArchivos = new ArrayList<IValidacion>();

    public ServicioValidacion() {
    }

    public void agregarArchivo(IValidacion archivoRecibido){
        listaArchivos.add(archivoRecibido);
    }

    public void eliminarArchivo(IValidacion archivoRecibido){
        listaArchivos.remove(archivoRecibido);
    }

    public void listarArchivos(){
        System.out.println(listaArchivos);
    }
    public void validarArchivo(){
        for (IValidacion archivoRecorridoDeListaArchivos:listaArchivos
             ) {
            archivoRecorridoDeListaArchivos.validar();
        }
    }

}

package do_while.luis_sepulveda.java_luis_sepulveda.interfacestrabajo.servicios;

import do_while.luis_sepulveda.java_luis_sepulveda.interfacestrabajo.interfaces.IValidacion;

import java.util.ArrayList;
import java.util.List;

public class ServicioValidacion {
    private List<IValidacion> listaArchivos = new ArrayList<IValidacion>();

    public ServicioValidacion() {
    }

    public void agregarArchivo(IValidacion archivoRecibido){
        listaArchivos.add(archivoRecibido);
    }

    public void validarArchivo(){
        for (IValidacion archivoRecorridoDeListaArchivos:listaArchivos
             ) {
            archivoRecorridoDeListaArchivos.validar();
        }
    }

}

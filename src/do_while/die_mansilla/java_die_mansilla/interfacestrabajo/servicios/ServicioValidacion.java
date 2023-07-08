package do_while.die_mansilla.java_die_mansilla.interfacestrabajo.servicios;

import do_while.die_mansilla.java_die_mansilla.interfacestrabajo.interfaces.IValidacion;

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

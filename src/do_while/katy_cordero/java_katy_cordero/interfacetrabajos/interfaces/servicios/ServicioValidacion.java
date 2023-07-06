package do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.servicios;

import do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.interfaces.IValidacion;

import java.util.ArrayList;
import java.util.List;

    public class ServicioValidacion {
    private final List<IValidacion> listaArchivos = new ArrayList<IValidacion>();

    public ServicioValidacion() {
    }

    public void agregarDocumento(IValidacion archivoRecibido) {listaArchivos.add(archivoRecibido);
    }

    public void validarArchivo() {
        for (IValidacion archivoRecorridoDeListaArchivos : listaArchivos
        ) {
            archivoRecorridoDeListaArchivos.validar();
        }
    }
}


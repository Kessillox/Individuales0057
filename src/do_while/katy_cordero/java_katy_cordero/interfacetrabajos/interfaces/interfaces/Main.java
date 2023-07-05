package do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.interfaces;

import do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.modelos.Pdf;
import do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.modelos.Word;
import do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.servicios.ServicioValidacion;

public class Main {
    public static void main(String[] args){
        ServicioValidacion servicioValidacion = new ServicioValidacion();
        Word doc1 = new Word("SuperDocumento", 1997);

        Pdf doc3 = new Pdf("Aprende Java", true);

        servicioValidacion.agregarDocumento(doc1);
        servicioValidacion.agregarDocumento(doc3);

        servicioValidacion.validarDocumentos();
    }
}

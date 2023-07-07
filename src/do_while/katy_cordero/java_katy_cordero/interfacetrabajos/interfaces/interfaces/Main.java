package do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.interfaces;

import do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.modelos.Pdf;
import do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.modelos.Word;
import do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.servicios.ServicioValidacion;

public class Main {
    public static void main(String[] args){
        ServicioValidacion ServicioValidacion = new ServicioValidacion();
        Word doc1 = new Word("SuperDocumento", 1997);

        Pdf doc3 = new Pdf("Aprende Java", true);

        ServicioValidacion.agregarDocumento(doc1);
        ServicioValidacion.agregarDocumento(doc3);

        ServicioValidacion.validarArchivo();
    }
}

package do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.modelos;

import do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.interfaces.IValidacion;

public class Pdf extends Documento implements IValidacion {
    private boolean protegido;

    public Pdf() {
    }

    public Pdf(String titulo, boolean protegido) {
        super(titulo);
        this.protegido = protegido;
    }

    public boolean isProtegido() {
        return protegido;
    }

    public void setProtegido(boolean protegido) {
        this.protegido = protegido;
    }

    @Override
    public String toString() {
        return "Pdf{" +
                "protegido=" + protegido +
                '}';
    }

    @Override
    public void validar() {
    }

}

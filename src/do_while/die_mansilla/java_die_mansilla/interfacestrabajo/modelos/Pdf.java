package do_while.die_mansilla.java_die_mansilla.interfacestrabajo.modelos;

public class Pdf extends Documento {
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
                "} " + super.toString();
    }

    @Override
    public void validar() {
        System.out.println("El documento PDF de título "+getTitulo()+" ha sido validado");
    }

}

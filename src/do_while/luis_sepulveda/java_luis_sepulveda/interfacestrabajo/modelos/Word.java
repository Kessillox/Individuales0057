package do_while.luis_sepulveda.java_luis_sepulveda.interfacestrabajo.modelos;

public class Word extends Documento {
    private int version;

    public Word() {
    }

    public Word(String titulo, int version) {
        super(titulo);
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Word{" +
                "version=" + version +
                "} " + super.toString();
    }

    @Override
    public void validar() {
        System.out.println("El documento Word, versión "+this.version+" y título "+ getTitulo()+ " ha sido validado");
    }
}

package do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.modelos;


import do_while.katy_cordero.java_katy_cordero.interfacetrabajos.interfaces.interfaces.IValidacion;

public class Word extends Documento implements IValidacion {
    private int version;

    public Word() {
    }

    public Word(String titulo, int version) {
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
                "version=" + version + '\''+
                '}' ;
    }

    public void validar(){
        System.out.println("El documento word, version"+this.version+" y titulo "+ getTitulo()+ "ha sido validado");
    }


}


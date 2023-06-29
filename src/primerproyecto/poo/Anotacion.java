package primerproyecto.poo;

import java.util.List;

public class Anotacion {
    private List<AnotacionPositiva> anotacionesPositivas;
    private List<AnotacionNegativa> anotacionesNegativas;

    public Anotacion() {
    }

    public Anotacion(List<AnotacionPositiva> anotacionesPositivas, List<AnotacionNegativa> anotacionesNegativas) {
        this.anotacionesPositivas = anotacionesPositivas;
        this.anotacionesNegativas = anotacionesNegativas;
    }

    public List<AnotacionPositiva> getAnotacionesPositivas() {
        return anotacionesPositivas;
    }

    public void setAnotacionesPositivas(List<AnotacionPositiva> anotacionesPositivas) {
        this.anotacionesPositivas = anotacionesPositivas;
    }

    public List<AnotacionNegativa> getAnotacionesNegativas() {
        return anotacionesNegativas;
    }

    public void setAnotacionesNegativas(List<AnotacionNegativa> anotacionesNegativas) {
        this.anotacionesNegativas = anotacionesNegativas;
    }
}

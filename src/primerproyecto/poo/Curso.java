package primerproyecto.poo;

public class Curso {
    int numAlumnos;
    String letra;

    public Curso() {
    }

    public Curso(int numAlumnos, String letra) {
        this.numAlumnos = numAlumnos;
        this.letra = letra;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public String getLetra() {
        return letra;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "numAlumnos=" + numAlumnos +
                ", letra='" + letra + '\'' +
                '}';
    }
}

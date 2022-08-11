package guia.pkg6.java.poo.aprendizaje.entidades;

import java.lang.reflect.Array;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Ahoracado {

    private char vector[];
    private int letrasEncontradas;
    private int jugadasMaximas;
    private String palabraOculta;

    public Ahoracado() {
    }

    public Ahoracado(char[] vector, int letrasEncontradas, int jugadasMaximas, String palabraOculta) {
        this.vector = vector;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.palabraOculta = palabraOculta;
    }

    public char[] getVector() {
        return vector;
    }

    public void setVector(char letra,int x) {
        this.vector[x] = letra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public String getPalabraOculta() {
        return palabraOculta;
    }

    public void setPalabraOculta(String palabraOculta) {
        this.palabraOculta = palabraOculta;
    }

    @Override
    public String toString() {
        return "Ahoracado{" + "vector=" + vector + ", letrasEncontradas=" + letrasEncontradas + ", jugadasMaximas=" + jugadasMaximas + ", palabraOculta=" + palabraOculta + '}';
    }

}

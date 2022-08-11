package guia.pkg6.java.poo.aprendizaje.entidades;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class MyArray {

    private String vector[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = vector[ThreadLocalRandom.current().nextInt(0, 11)];

    public MyArray() {
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "MyArray{" + "vector=" + vector + ", mesSecreto=" + mesSecreto + '}';
    }
}

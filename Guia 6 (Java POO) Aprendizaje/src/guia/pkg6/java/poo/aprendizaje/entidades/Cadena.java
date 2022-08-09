package guia.pkg6.java.poo.aprendizaje.entidades;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Cadena {

    String frase;
    int largoFrase;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.largoFrase = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {        
        this.frase = frase;
        largoFrase=frase.length();
    }

    public int getLargoFrase() {
        return largoFrase;
    }

    public void setLargoFrase(int largoFrase) {
        this.largoFrase = largoFrase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", largoFrase=" + largoFrase + '}';
    }

}

package guia.pkg6.java.poo.aprendizaje.entidades;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class SopaDeLetras {

    char matriz[][] = new char[10][10];
    String palabra;
    String[] vector = {"perro", "reloj", "carta", "banco", "gamer", "coche", "yerba", "rueda", "lente", "horno"};

    public SopaDeLetras() {
    }

    public SopaDeLetras(String palabra) {
        this.palabra = palabra;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    @Override
    public String toString() {
        return "SopaDeLetras{" + "matriz=" + matriz + ", palabra=" + palabra + ", vector=" + vector + '}';
    }

}

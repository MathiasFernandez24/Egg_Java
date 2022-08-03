package guia.pkg6.java.poo.aprendizaje.entidades;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Circunferencia {

    private float radio;
    private float perimetro;
    private float area;

    public Circunferencia() {
    }

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", perimetro=" + perimetro + ", area=" + area + '}';
    }







}

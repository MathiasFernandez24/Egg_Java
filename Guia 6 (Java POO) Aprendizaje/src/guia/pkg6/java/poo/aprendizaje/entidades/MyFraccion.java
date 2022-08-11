package guia.pkg6.java.poo.aprendizaje.entidades;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class MyFraccion {

    private int denominador;
    private int numerador;

    public MyFraccion() {
        this.numerador=0;
        this.denominador=1;
    }

    public MyFraccion(int numerador) {
        this.numerador = numerador;
        this.denominador=1;
    }

       
    public MyFraccion(int denominador, int numerador) {
        this.numerador = numerador;
        if(denominador==0){
            this.denominador=1;
        }
        this.denominador = denominador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    @Override
    public String toString() {
        return "{"+numerador+"/"+denominador+"}";
    }

}

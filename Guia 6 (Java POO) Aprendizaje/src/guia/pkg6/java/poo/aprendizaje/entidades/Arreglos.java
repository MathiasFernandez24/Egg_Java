package guia.pkg6.java.poo.aprendizaje.entidades;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Arreglos {
    private double[] arrayA;
    private double[] arrayB;
    
    public Arreglos() {
    }
    
    public Arreglos(int dimA, int dimB){
        this.arrayA = new double[dimA];
        this.arrayB = new double[dimB];
    }
    
    

    public double[] getArrayA() {
        return arrayA;
    }

    public void setArrayA(double[] arrayA) {
        this.arrayA = arrayA;
    }

    public double[] getArrayB() {
        return arrayB;
    }

    public void setArrayB(double[] arrayB) {
        this.arrayB = arrayB;
    }

    
}

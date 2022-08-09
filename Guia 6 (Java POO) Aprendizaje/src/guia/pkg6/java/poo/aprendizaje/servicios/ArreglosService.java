package guia.pkg6.java.poo.aprendizaje.servicios;


import guia.pkg6.java.poo.aprendizaje.entidades.Arreglos;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class ArreglosService {

    Scanner leer = new Scanner(System.in);

    public Arreglos crearArreglos() {
        
        
        System.out.println("Ingrese dimension del arreglo A: ");
        int dA = leer.nextInt();

        System.out.println("Ingrese dimension del arreglo B: ");
        int dB = leer.nextInt();
        
        return  new Arreglos(dA, dB);
    }

    public void rellenarArreglo(double[] arrayA) {
 
       for (int i = 0; i < arrayA.length; i++) {
          arrayA[i] = Math.random() * 10;
       }
        System.out.println("ARREGLO A DESORDENADO");
        System.out.println(Arrays.toString(arrayA));
    }

    public void ordenarArreglo(double[] arrayA) {
        Arrays.sort(arrayA);
        System.out.println("ARREGLO A ORDENADO");
        System.out.println(Arrays.toString(arrayA));
    }

    public void rellenarArregloB(double[] arrayA, double[] arrayB, int dimB) {
        arrayB = Arrays.copyOf(arrayA, dimB);
        Arrays.fill(arrayB, dimB-10, dimB , 0.5);
        System.out.println("ARREGLO B");
        System.out.println(Arrays.toString(arrayB));

    }

}


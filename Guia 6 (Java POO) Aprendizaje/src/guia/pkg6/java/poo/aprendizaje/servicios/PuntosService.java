package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class PuntosService {
    public Puntos crearPuntos(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Puntos rtrn = new Puntos();
        System.out.print("Punto 1, eje X: ");
        rtrn.setX1(leer.nextInt());
        System.out.print("Punto 1, eje Y: ");
        rtrn.setY1(leer.nextInt());
        System.out.print("Punto 2, eje X: ");
        rtrn.setX2(leer.nextInt());
        System.out.print("Punto 2, eje Y: ");
        rtrn.setY2(leer.nextInt());
      
        return rtrn;
    }
    
    public float calcularDistancias(Puntos p){
        float rtrn=0;
        //Teorema de Pitagoras
        int x = (int) Math.pow((p.getX2()-p.getX1()),2);
        int y = (int) Math.pow((p.getY2()-p.getY1()), 2);
        rtrn=(float) Math.sqrt(x+y);
        return rtrn;
    }
}

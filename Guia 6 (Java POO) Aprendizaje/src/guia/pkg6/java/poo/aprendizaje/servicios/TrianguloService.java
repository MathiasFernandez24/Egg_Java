package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Triangulo;
import java.util.Scanner;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class TrianguloService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Triangulo crearTriagnulo() {
        Triangulo t = new Triangulo();
        System.out.print("Base: ");
        t.setBase(sc.nextInt());
        System.out.print("Altura: ");
        t.setAltura(sc.nextInt());
        t.setArea((t.getBase() * t.getAltura()) / 2);
        
        float hipotenusa = (float) Math.sqrt((Math.pow(t.getBase()/2, 2))+(Math.pow(t.getAltura(), 2)));
        t.setPerimetro(hipotenusa*2+t.getBase());
        return t;
    }
    
    public void mayorSuperficie(Triangulo v[]){
        float mayorArea=0, mayorPerimetro=0;
        for (Triangulo t : v) {
            mayorArea =t.getArea()>mayorArea?t.getArea():mayorArea;
            mayorPerimetro= t.getPerimetro()>mayorPerimetro?t.getPerimetro():mayorPerimetro;
        }
        
        System.out.println("\nMayor Area de los triangulos: " + mayorArea);
        System.out.println("Mayor Perimetro de los triangulos: " + mayorPerimetro);
    }
}

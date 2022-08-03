package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class RectanguloService {

    Scanner leer = new Scanner(System.in);
    //Crea un rectangulo
    public Rectangulo crearRectangulo() {

        Rectangulo rectangulito = new Rectangulo();
        System.out.println("    ----Creando un rectangulo----");
        System.out.print("Ingrese la base: ");
        rectangulito.setBase(leer.nextInt());
        System.out.print("Ingrese la altura: ");
        rectangulito.setAltura(leer.nextInt());
        return rectangulito;
    }
    public void superficie(Rectangulo objeto){
        System.out.println("La superfcie es :"+objeto.getBase()*objeto.getAltura());
    }
    
    public void perimetro(Rectangulo objeto){
        System.out.println("El perimetro es: "+(objeto.getAltura()+objeto.getBase())*2);
    }
    
}

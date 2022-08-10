package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class CancionService {
    public Cancion crearCancion(){
        Cancion rtrn = new Cancion();
        return rtrn;
    }
    
    public Cancion crearCancionCompleta(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese titulo del la cancion: ");
        String titulo = leer.next();
        System.out.print("Ingrese autor del la cancion: ");
        String autor = leer.next();
        
        Cancion rtrn= new Cancion(titulo, autor);
        return rtrn;
    }
}

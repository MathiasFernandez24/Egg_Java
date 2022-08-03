
package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Mascota;
import java.util.Scanner;

/**
 * 
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class ServicioMascota {
    public Mascota crearMascota(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese Nombre: ");
        String nombre = leer.next();
                System.out.print("Ingrese Apodo: ");
        String apodo = leer.next();
                System.out.print("Ingrese Tipo: ");
        String tipo = leer.next();
        
        return new Mascota(nombre, apodo, tipo);
        
    }

}

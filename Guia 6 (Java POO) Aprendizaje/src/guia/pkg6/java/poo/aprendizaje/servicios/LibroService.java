package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class LibroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        Libro librito = new Libro();
        System.out.print("ISBN del Libro: ");
        librito.setIsbn(leer.nextInt());
        System.out.print("Titulo del Libro: ");
        librito.setTitulo(leer.next());
        System.out.print("Autor del Libro: ");
        librito.setAutor(leer.next());
        System.out.print("Paginas del Libro: ");
        librito.setPaginas(leer.nextInt());
        return librito;
            
    }
}

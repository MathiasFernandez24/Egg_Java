package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class CircunferenciaService {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        Circunferencia circunferencia = new Circunferencia();
        System.out.print("Defina el radio de la circunferencia: ");
        circunferencia.setRadio(leer.nextInt());
        return circunferencia;
    }

    public void area(Circunferencia objeto) {
        objeto.setArea((float) (3.14 * objeto.getRadio() * objeto.getRadio()));
        System.out.println("El Area es " + objeto.getArea());
    }

    public void perimetro(Circunferencia objeto) {
        objeto.setPerimetro((float) (objeto.getRadio() * 2*3.14));
        System.out.println("El perimetro es " + objeto.getPerimetro());
    }

}

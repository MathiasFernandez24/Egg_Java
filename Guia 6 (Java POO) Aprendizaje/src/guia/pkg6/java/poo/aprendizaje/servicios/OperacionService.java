package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class OperacionService {

    Scanner leer = new Scanner(System.in);
    Operacion operacionSv = new Operacion();

    public Operacion crearOperacion() {
        Operacion objeto = new Operacion();
        System.out.print("Ingrese primer numero: ");
        objeto.setNumero1(leer.nextInt());
        System.out.print("Ingrese segundo numero: ");
        objeto.setNumero2(leer.nextInt());

        return objeto;
    }

    public void cambiarNumeros(Operacion objeto) {
        System.out.print("Reescribir primer numero: ");
        objeto.setNumero1(leer.nextInt());
        System.out.print("Reescribir segundo numero: ");
        objeto.setNumero2(leer.nextInt());
    }

    public int sumar(Operacion objeto) {
        return objeto.getNumero1() + objeto.getNumero2();
    }

    public int restar(Operacion objeto) {
        return objeto.getNumero1() - objeto.getNumero2();
    }

    public int multiplicar(Operacion objeto) {
        if (objeto.getNumero1() == 0 || objeto.getNumero2() == 0) {
            System.out.println("Error, uno de los numeros es cero");
            return 0;
        } else {
            return objeto.getNumero1() * objeto.getNumero2();
        }
    }

    public int dividir(Operacion objeto) {
        if (objeto.getNumero1() == 0 || objeto.getNumero2() == 0) {
            System.out.println("Error, uno de los numeros es cero");
            return 0;
        } else {
            return objeto.getNumero1() / objeto.getNumero2();
        }
    }

}

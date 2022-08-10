package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class RaicesService {

    public Raices crearRaices() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese variable A: ");
        float a = leer.nextFloat();
        System.out.print("Ingrese variable B: ");
        float b = leer.nextFloat();
        System.out.print("Ingrese variable C: ");
        float c = leer.nextFloat();

        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices r) {
        return Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC());
    }

    public boolean tieneRaices(Raices r) {
        return getDiscriminante(r) >= 0;
    }

    public boolean tieneRaiz(Raices r) {
        return getDiscriminante(r) == 0;
    }

    public void obtenerRaices(Raices r) {
        if (tieneRaices(r)) {
            System.out.println("Solucion 1: " + (-r.getB() + getDiscriminante(r)) / (2 * r.getA()));
            System.out.println("Solucion 2: " + (-r.getB() - getDiscriminante(r)) / (2 * r.getA()));
        } else {
            System.out.println("No hay 2 soluciones");
        }
    }

    public void obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            System.out.println("Solucion: " + (-r.getB() + getDiscriminante(r)) / (2 * r.getA()));
        } else {
            System.out.println("No 1 hay solucion");
        }
    }
    
    public void calcular(Raices r){
        obtenerRaices(r);
        obtenerRaiz(r);
    }

}

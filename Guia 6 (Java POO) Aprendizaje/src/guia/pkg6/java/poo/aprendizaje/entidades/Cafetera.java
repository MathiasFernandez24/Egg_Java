package guia.pkg6.java.poo.aprendizaje.entidades;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Cafetera {

    int capacidadMaxima;
    int cantidadActual;
    String nombre;

    public void agregarCafe(int cafeAAgregar) {

        if (cafeAAgregar + cantidadActual > capacidadMaxima) {
            System.out.println("se rebalsó :_( ");
            cantidadActual = capacidadMaxima;
        } else {
            cantidadActual += cafeAAgregar;
            System.out.println("Se agregó cafe, actualmente tienes: " + cantidadActual);
        }
    }

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + ", nombre=" + nombre + '}';
    }



}

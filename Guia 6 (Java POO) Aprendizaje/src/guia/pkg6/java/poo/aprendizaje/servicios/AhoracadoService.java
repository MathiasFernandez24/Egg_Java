package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Ahoracado;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class AhoracadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahoracado crearJuego() {

        System.out.print("Ingrese palabra oculta: ");
        String palabra = leer.next();
        System.out.print("Ingrese cantidad de vidas: ");
        int vidas = leer.nextInt();

        char vector[] = new char[palabra.length()];
        Arrays.fill(vector, '_');
        return new Ahoracado(vector, 0, vidas, palabra);
    }

    public void longitud(Ahoracado juego) {
        System.out.println(juego.getVector().length);
    }

    public void buscar(Ahoracado juego) {

        char letra;
        boolean bandera = false;
        boolean ban2 = false;
        do {
            System.out.print("Letra a buscar: ");
            letra = leer.next().charAt(0);
            for (int i = 0; i < juego.getPalabraOculta().length(); i++) {
                if (juego.getPalabraOculta().charAt(i) == letra) {
                    juego.setVector(letra, i);
                    bandera = true;
                }

            }
            if (bandera == false) {
                juego.setJugadasMaximas(juego.getJugadasMaximas() - 1);
                System.out.println("Te quedan " + juego.getJugadasMaximas() + "vidas");
            }
            bandera = false;
            ban2= false;
            System.out.println(juego.getVector());
            System.out.println(juego.getJugadasMaximas());

            for (int i = 0; i < juego.getPalabraOculta().length(); i++) {
                if (juego.getVector()[i] == '_') {
                    ban2 = true;
                }

            }
            
        } while (juego.getJugadasMaximas() > 0 && ban2==true);

        if (ban2) {
            System.out.println("--Perdiste--");
        } else {
            System.out.println("--Gansgter--");
        }

    }

}

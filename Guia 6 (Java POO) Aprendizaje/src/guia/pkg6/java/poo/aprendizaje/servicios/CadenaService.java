package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class CadenaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearFrase() {
        Cadena frase = new Cadena();
        System.out.println("Ingrese una frase");
        frase.setFrase(leer.next());
        return frase;
    }

    public void mostrarVocales(Cadena frase) {
        int contador = 0;

        for (int i = 0; i < frase.getLargoFrase(); i++) {
            switch (frase.getFrase().substring(i, i + 1).toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    contador++;
                    break;
            }
        }
        System.out.println("La cantidad de vocales es: " + contador);
    }

    public void invertirFrase(Cadena frase) {
        StringBuilder palabra = new StringBuilder(frase.getFrase());
        System.out.println("Palabra invertida: " + palabra.reverse());
        frase.setFrase(palabra.toString());
    }

    public void vecesRepetido(Cadena frase) {
        int contador = 0;
        System.out.print("Ingrese letra a buscar: ");
        String letra = leer.next();

        for (int i = 0; i < frase.getLargoFrase(); i++) {
            if (frase.getFrase().substring(i, i + 1).toLowerCase().equals(letra.toLowerCase())) {
                contador++;
            }
        }
        System.out.println("Se encontro: " + contador + " veces");
    }

    public void compararLongitud(Cadena frase) {
        System.out.print("Ingrese frase a comparar: ");
        String fraseNueva = leer.next();
        int largoFraseNueva = fraseNueva.length();

        if (largoFraseNueva == frase.getLargoFrase()) {
            System.out.println("El largo es identico");
        } else if (largoFraseNueva > frase.getLargoFrase()) {
            System.out.println("La frase nueva es mas larga");
        } else {
            System.out.println("La frase nueva es mas corta");

        }
    }

    public void unirFrases(Cadena frase) {
        System.out.print("Ingrese frase para agregar: ");
        String fraseNueva = leer.next();
        System.out.println(frase.getFrase() + " " + fraseNueva);
        frase.setFrase(frase.getFrase() + " " + fraseNueva);
    }

    public void reemplazar(Cadena frase) {
        System.out.print("Letra 'A' será reemplazada por: ");
        String letra = leer.next();
        System.out.println("la nueva frase es: " + frase.getFrase().toLowerCase().replace("a", letra));
    }

    public boolean contiene(Cadena frase) {
        System.out.println("Ingrese letra a validar si existe en la frase: ");
        String letra = leer.next();
        return frase.getFrase().toLowerCase().contains(letra.toLowerCase());
    }

}

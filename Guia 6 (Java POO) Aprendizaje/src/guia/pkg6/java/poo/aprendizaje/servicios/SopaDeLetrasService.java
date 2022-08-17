package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.SopaDeLetras;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class SopaDeLetrasService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public SopaDeLetras crearSopa() {
        SopaDeLetras rtrn = new SopaDeLetras();
        char[][] matriz = new char[10][10];
        
        for (char[] row : matriz) {
            Arrays.fill(row, '_');
        }
        rtrn.setMatriz(matriz);
        return rtrn;
    }
    
    public void mostrar(SopaDeLetras sopa) {
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopa.getMatriz()[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void mostrarInvertido(SopaDeLetras sopa) {
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopa.getMatriz()[j][i] + " ");
            }
            System.out.println("");
        }
    }
    
    public void llenar(SopaDeLetras sopa) {
        int random;
        char matriz[][] = sopa.getMatriz();
        for (int i = 0; i < 10; i++) {
            random = ThreadLocalRandom.current().nextInt(0, 6);
            for (int j = random; j < random + 5; j++) {
                matriz[i][j] = sopa.getVector()[i].charAt(j - random);
            }
        }
    }
    
    public void buscar(SopaDeLetras sopa) {
        System.out.print("\n\nIngrese palabra a buscar: \n");
        String palabra = sc.next();
        char matriz[][] = sopa.getMatriz();
        if (palabra.length() == 5) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 6; j++) {
                    
                    if (matriz[i][j] == palabra.charAt(0)
                            && matriz[i][j + 1] == palabra.charAt(1)
                            && matriz[i][j + 2] == palabra.charAt(2)
                            && matriz[i][j + 3] == palabra.charAt(3)
                            && matriz[i][j + 4] == palabra.charAt(4)) {
                        System.out.println("Esa palabra inicia en las coordenadas: " + (i + 1) + " . " + (j + 1));
                    }
                }
            }
        } else {
            System.out.println("La palabra debe ser de 5 caracteres");
        }
    }
    
    public void reemplazar(SopaDeLetras sopa) {
        System.out.print("\n\nIngrese palabra a reemplazar: \n");
        String palabra = sc.next();
        char matriz[][] = sopa.getMatriz();
        if (palabra.length() == 5) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 6; j++) {
                    
                    if (matriz[i][j] == palabra.charAt(0)
                            && matriz[i][j + 1] == palabra.charAt(1)
                            && matriz[i][j + 2] == palabra.charAt(2)
                            && matriz[i][j + 3] == palabra.charAt(3)
                            && matriz[i][j + 4] == palabra.charAt(4)) {
                        System.out.print("Será reemplazada por: ");
                        String nuevaPalabra = sc.next();
                        for (int k = 0; k < 5; k++) {
                            matriz[i][j+k]=nuevaPalabra.charAt(k);
                        }
                    }
                }
            }
        } else {
            System.out.println("La palabra debe ser de 5 caracteres");
        }
    }
}

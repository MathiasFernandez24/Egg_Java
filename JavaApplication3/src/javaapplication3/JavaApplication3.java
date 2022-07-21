package javaapplication3;

import static java.lang.Math.abs;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        //auxiliar();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();

    }

    public static void auxiliar() {
        

    }

    public static void ejercicio11() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String palabra, fraseCodificada = "";
        
        char c = frase.charAt(frase.length() - 1);
      
        if (frase.endsWith(".")) {
            for (int i = 0; i < frase.length(); i++) {

                palabra = frase.substring(i, i + 1);
                //System.out.println(palabra);

                switch (palabra.toLowerCase()) {
                    case "a":
                        palabra = "@";
                        break;
                    case "e":
                        palabra = "#";
                        break;
                    case "i":
                        palabra = "$";
                        break;
                    case "o":
                        palabra = "%";
                        break;
                    case "u":
                        palabra = "*";
                        break;
                }
                fraseCodificada += palabra;
            }
        } else {
            System.out.println("Debe terminar la frase en Punto (.)");
        }
        System.out.println(fraseCodificada);
    }

    public static void ejercicio12() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese numero 2");
        int numero2 = leer.nextInt();
        esMultiplo(numero1, numero2);
    }

    public static void esMultiplo(int a, int b) {
        if (a % b == 0) {
            System.out.println(a + " es multiplo de " + b);
        } else {
            System.out.println("No son multiplos");
        }
    }

    public static void ejercicio13() {
        Scanner leer = new Scanner(System.in);
        String[] nombres = new String[9];

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = leer.nextLine();
        }

        for (String i : nombres) {
            System.out.println(i);
        }
    }
}

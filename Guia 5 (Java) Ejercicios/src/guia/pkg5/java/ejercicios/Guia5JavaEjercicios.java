package guia.pkg5.java.ejercicios;

import java.util.Scanner;

/**
 * @author Mathias Fernandez (mathias_fernandez_24@hotmail.com)
 */
public class Guia5JavaEjercicios {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();
    }

    public static void ejercicio1() {
        /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        dos.El programa deberá después mostrar el resultado de la suma*/
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un numero");
        int num2 = leer.nextInt();
        int total = num1 + num2;
        System.out.println("El total es: " + total);
    }

    public static void ejercicio2() {
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
        pantalla.*/
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
    public static void ejercicio3() {
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa una frase");
        String frase = leer.nextLine();
        System.out.println("\nTu frase en minuscula es :\n" + frase.toLowerCase() + "\n");
        System.out.println("Tu frase en Mayuscula es :\n" + frase.toUpperCase());
    }
        public static void ejercicio4() {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        
        Scanner leer = new Scanner(System.in);

            System.out.println("Ingrese temperatura en grados centígrados para \nver su equivalente en grados Fahrenheit:");
        int c = leer.nextInt();
        int f = 32+(9*c/5);
                
        System.out.println(c +"° Celcius equivale a "+f+"° Fahrenheit");
    }
}

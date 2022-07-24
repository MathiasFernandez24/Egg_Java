package guia.pkg5.java.ejercicios.extra;

import java.util.Scanner;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Guia5JavaEjerciciosExtra {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        ejercicio8();
    }

    public static void ejercicio1() {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una cantidad de minutos: ");
        int minutos = leer.nextInt(), horas = 0, dias = 0;
        if (minutos > 60) {
            horas = minutos / 60;
            minutos = minutos % 60;
            if (horas > 24) {
                dias = horas / 24;
                horas = horas % 24;
            }
        }
        System.out.println("Tu tiempo es :\n" + dias + " dias\n" + horas + " horas\n" + minutos + " minutos");
    }

    public static void ejercicio2() {
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
        una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
        tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
        iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/

        int a = 1, b = 2, c = 3, d = 4, aux = 0;
        System.out.println("a -> " + a + "\nb -> " + b + "\nc -> " + c + "\nd -> " + d);

        aux = c;
        c = a;
        a = d;
        d = b;
        b = aux;
        System.out.println("\n\na -> " + a + "\nb -> " + b + "\nc -> " + c + "\nd -> " + d);
    }

    public static void ejercicio3() {
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        String letra = leer.nextLine();
        if (letra.toLowerCase().equals("a")
                || letra.toLowerCase().equals("e")
                || letra.toLowerCase().equals("i")
                || letra.toLowerCase().equals("o")
                || letra.toLowerCase().equals("u")) {
            System.out.println("Es una letra VOCAL");
        } else {
            System.out.println("ERROR, no es una letra vocal");
        }
    }

    public static void ejercicio4() {
        /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
        equivalente en romano.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        int num = leer.nextInt();

        if (num > 0 && num <= 10) {
            System.out.print("\nSu numero en romano es: ");
        }
        switch (num) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("ERROR, numero fuera de rango");
        }

    }

    public static void ejercicio5() {
        /*Una obra social tiene tres clases de socios:
        - Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
        todos los tipos de tratamientos.
        - Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
        los mismos tratamientos que los socios del tipo A.
        - Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
        tratamientos.
        - Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
        real que represente el costo del tratamiento (previo al descuento) y determine el
        importe en efectivo a pagar por dicho socio.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese categoria (A,B o C) :");
        String categoria = leer.nextLine();
        if ("a".equals(categoria.toLowerCase()) || "b".equals(categoria.toLowerCase()) || "c".equals(categoria.toLowerCase())) {
            System.out.print("Ingrese costo del tratamiento :");
            double tratamiento = leer.nextInt();
            System.out.println("El costo del tratamiento sin descuento es : $" + tratamiento);
            switch (categoria.toLowerCase()) {
                case "a":
                    tratamiento = (tratamiento * 0.5);
                    break;
                case "b":
                    tratamiento = (tratamiento * 0.65);
                    break;
            }
            System.out.println("El costo del tratamiento con su obra social es : $" + tratamiento);
        } else {
            System.out.println("\nError, categoria no existente");
        }
    }

    public static void ejercicio6() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Personas a evaluar: ");
        int cantPersonas = leer.nextInt(), cantPersBajas = 0, cantPersGeneral = 0;
        double estatura, promEstaturaGeneral = 0, promEstaturaBajas = 0;
        for (int i = 1; i <= cantPersonas; i++) {
            System.out.print("Estatura persona " + i + " :");
            estatura = leer.nextDouble();

            if (estatura < 1.60) {
                promEstaturaBajas += estatura;
                cantPersBajas++;
            } else {
                promEstaturaGeneral += estatura;
                cantPersGeneral++;
            }
        }
        System.out.println("Promedio de estaturas menores a 1.60 :" + (promEstaturaBajas / cantPersBajas));
        System.out.println("Promedio de estaturas general :" + (promEstaturaGeneral / cantPersGeneral));
    }

    public static void ejercicio7() {
        /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
        de n números (n>0). El valor de n se solicitará al principio del programa y los números
        serán introducidos por el usuario. Realice dos versiones del programa, una usando el
        bucle “while” y otra con el bucle “do - while”.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad de datos a ingresar :");
        int cantDatos = leer.nextInt(), i = 0, valMin = (int) Math.pow(99, 99), valMax = 0, val;
        double prom = 0;
        if (cantDatos > 0) {
            //Con While
            /*while (i < cantDatos) {
                System.out.print("Ingrese un valor: ");
                val = leer.nextInt();
                prom += val;
                if (val > valMax) {
                    valMax = val;
                }
                if (val < valMin) {
                    valMin = val;
                }
                i++;
            }*/
            
            // Con Do While
             do {
                System.out.print("Ingrese un valor: ");
                val = leer.nextInt();
                prom += val;
                if (val > valMax) {
                    valMax = val;
                }
                if (val < valMin) {
                    valMin = val;
                }
                i++;
            }while(i < cantDatos);
            
            System.out.println("Minimo " + valMin);
            System.out.println("Maximo " + valMax);
            System.out.println("Promedio " + (prom / cantDatos));
        } else {
            System.out.println("\nIngrese numeros mayores a cero");
        }
    }
    public static void ejercicio8(){
        /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
        detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
        la cantidad de números impares. Al igual que en el ejercicio anterior los números
        negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
        
    }
    
}

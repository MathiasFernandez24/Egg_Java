package guia.pkg5.java.ejercicios;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom; //para obtener numeros aleatorios

/**
 * @author Mathias Fernandez (mathias_fernandez_24@hotmail.com)
 */
public class Guia5JavaEjercicios {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
        //ejercicio14();
        //ejercicio15();
        //ejercicio16();
        //ejercicio17();
        //ejercicio18();
        //ejercicio19();
        //ejercicio20();
        //ejercicio21();

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
        int f = 32 + (9 * c / 5);

        System.out.println(c + "° Celcius equivale a " + f + "° Fahrenheit");
    }

    public static void ejercicio5() {
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();

        System.out.println("\nEl doble es: " + num * 2);
        System.out.println("El triple es: " + num * 3);
        System.out.println("La raiz cuadrada es: " + Math.sqrt(num));
    }

    public static void ejercicio6() {
        /*Crear un programa que dado un numero determine si es par o impar.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero es Par");
        } else {
            System.out.println("El numero es impar");
        }
    }

    public static void ejercicio7() {
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
        pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
        la función equals() en Java.*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = leer.nextLine();

        if (palabra.equals("eureka")) {
            System.out.println("La palabra ingresadaes EUREKA!");
        } else {
            System.out.println("Vuelve a intentar");
        }
    }

    public static void ejercicio8() {
        /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
        usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
        pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
        Nota: investigar la función Lenght() en Java.*/

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = leer.nextLine();

        if (palabra.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

    public static void ejercicio9() {
        /*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
        es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
        diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
        la función Substring y equals() de Java.*/

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase; ");
        String palabra = leer.nextLine();

        //OPCION 1, con substring localizo la primer letra y la comparo con "a"
        if (palabra.toLowerCase().substring(0, 1).equals("a")) {
            System.out.println("1--CORRECTO");
        } else {
            System.out.println("1--INCORRECTO");
        }

        //OPCION 2, con la funcion startsWith() comparo si la primer letra es igual a "a"
        if (palabra.toLowerCase().startsWith("a")) {
            System.out.println("2--CORRECTO");
        } else {
            System.out.println("2--INCORRECTO");
        }
    }

    public static void ejercicio10() {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numMax = leer.nextInt(), num = 0;

        while (num < numMax) {
            System.out.println("Ingrese un numero para sumar,\nhasta que el total sea mayor a " + numMax);
            num += leer.nextInt();
            System.out.println("Su total sumado es: " + num);
            System.out.println("");
        }
    }

    public static void ejercicio11() {
        /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
        pantalla el siguiente menú:

        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:

        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
        y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
        Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
        directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
        desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
        programa, caso contrario se vuelve a mostrar el menú.*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros :");
        double num1 = leer.nextInt(), num2 = leer.nextInt();
        boolean bandera = false;

        do {
            System.out.println("\n        MENU\n"
                    + "        1. Sumar\n"
                    + "        2. Restar\n"
                    + "        3. Multiplicar\n"
                    + "        4. Dividir\n"
                    + "        5. Salir\n");
            System.out.print("Seleccione una opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " X " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    char respuesta = leer.next().charAt(0);
                    if (respuesta == 's' || respuesta == 'S') {
                        bandera = true;
                    } else {
                        System.out.println("Volveremos al MENU principal");
                    }
            }
        } while (bandera == false);
        System.out.println("          ----FIN PROGRAMA----");
    }

    public static void ejercicio12() {
        /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
        dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
        fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
        X y el último tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
        especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
        de FDE, que no respete el formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
        incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
        siguientes funciones de Java Substring(), Length(), equals().*/

        Scanner leer = new Scanner(System.in);
        String codigo;
        int correcto = 0, incorrecto = 0;

        do {
            System.out.print("Ingrese un codigo de 5 caracteres :");
            codigo = leer.nextLine();
            if (codigo.length() == 5) {
                if (codigo.toLowerCase().startsWith("x") && codigo.toLowerCase().endsWith("o")) {
                    correcto++;
                } else {
                    incorrecto++;
                }
            } else {
                System.out.println("    debe ser de 5 caracteres (este intento no se tendrá en cuenta)\n");
            }

        } while (!codigo.equals("&&&&&"));
        System.out.println("\n\n     INFORME\n" + correcto + " Lecturas correctas recibidas\n" + incorrecto
                + " lecturas incorrectas recibidas");
    }

    public static void ejercicio13() {
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el largo de cada lado del cuedrado a dibujar: ");
        int lados = leer.nextInt();

        for (int i = 0; i < lados; i++) {
            if (i == 0 || i == lados - 1) {
                for (int j = 0; j < lados; j++) {
                    System.out.print("* ");
                }
                System.out.println("");

            } else {
                System.out.print("* ");
                for (int j = 0; j < lados - 2; j++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            }
        }
    }

    public static void ejercicio14() {
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €*/

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Euros que posee :");
        int euros = leer.nextInt();
        System.out.println("\nIngrese alguna de las siguientes palabras"
                + "\npara realizar el cambio de sus Euros:\n-libras\n-dolares\n-yenes\n"
        );
        String moneda = leer.next();
        conversion(euros, moneda);
    }

    public static void conversion(double cantidadEuros, String nombreMoneda) {
        switch (nombreMoneda) {
            case "libras":
                System.out.println("Tus " + cantidadEuros + " EUROS equivalen a: " + (cantidadEuros * 0.86) + " LIBRAS");
                break;
            case "dolares":
                System.out.println("Tus " + cantidadEuros + " EUROS equivalen a: " + (cantidadEuros * 1.28611) + " DOLARES");
                break;
            case "yenes":
                System.out.println("Tus " + cantidadEuros + " EUROS equivalen a: " + (cantidadEuros * 129.852) + " YENES");
                break;
            default:
                System.out.println("No ingreso una moneda dentro de las opcions");
        }
    }

    public static void ejercicio15() {
        /*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
        muestre por pantalla en orden descendente.*/

        int vector[] = new int[100];
        //Este 'for' almacena los valores en cada posicion del array y los va mostrando
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
            System.out.println(vector[i]);
        }

        System.out.println("");
        //este 'for' los muestra desde la posicion 99 hasta la posicion 0 
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }

    }

    public static void ejercicio16() {
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
        usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        numero y si se encuentra repetido*/

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el largo del VECTOR a completar \ncon numeros aleatorios entre 0 y 99: ");
        int largoVector = leer.nextInt();
        int vector[];
        vector = new int[largoVector];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = ThreadLocalRandom.current().nextInt(1, 100);;
            System.out.println("posicion " + i + " -> " + vector[i]);
        }
        System.out.print("Ingrese numero a buscar: ");
        int num = leer.nextInt(), vecesNumEncontrado = 0;
        System.out.println("");

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                System.out.println("Numero encontrado en la posicion " + i);
                vecesNumEncontrado++;
            }
        }
        System.out.println("    En total se encontró " + vecesNumEncontrado + " veces");
    }

    public static void ejercicio17() {
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        de 2 dígitos, etcétera (hasta 5 dígitos).*/

        int vector[];
        vector = new int[200];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = ThreadLocalRandom.current().nextInt(1, 99999);;
            System.out.println("posicion " + i + " -> " + vector[i]);
        }
        int var, largo1 = 0, largo2 = 0, largo3 = 0, largo4 = 0, largo5 = 0;
        for (int i : vector) {
            System.out.println(i);
            var = Integer.toString(i).length();

            System.out.println("largo -> " + var);
            switch (var) {
                case 1:
                    largo1++;
                    break;
                case 2:
                    largo2++;
                    break;
                case 3:
                    largo3++;
                    break;
                case 4:
                    largo4++;
                    break;
                case 5:
                    largo5++;
                    break;
            }
        }
        System.out.println("");
        System.out.println(largo1 + " Numeros de 1 digito");
        System.out.println(largo2 + " Numeros de 2 digitos");
        System.out.println(largo3 + " Numeros de 3 digitos");
        System.out.println(largo4 + " Numeros de 4 digitos");
        System.out.println(largo5 + " Numeros de 5 digitos");
    }

    public static void ejercicio18() {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
        traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
        cambiando sus filas por columnas (o viceversa).*/

        int matriz[][] = new int[4][4];
        System.out.println("Matriz Original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //el +10 que ingreso es para obtener numeros a partir del 10 y que no queden de 1 digito
                matriz[i][j] = (4 * i) + j + 10;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\nMatriz traspuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //cambie de lugar la "j" y la "i" para hacerla traspuesta
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
    }

    public static void ejercicio19() {
        /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
        matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
        signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
        Scanner leer = new Scanner(System.in);

        //asignar valores a la matriz
        int matriz[][] = new int[3][3];
        System.out.println("Ingrese 9 numeros");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        //imprimir la matriz original
        System.out.println("Matriz Original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        //imprimir la matriz traspuesta
        System.out.println("\nMatriz transpuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }

        //utilizo una variable "bandera" para corroborar si la condicion se cumple
        boolean bandera = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    bandera = false;
                }
            }
        }
        //este "if" solo imprime un mensaje final dependiendo si "bandera cambió a false o se quedó en true
        if (bandera) {
            System.out.println("\nLa matriz es antisimetrica");
        } else {
            System.out.println("\nLa matriz NO es antisimetrica");
        }
    }

    private static void ejercicio20() {
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.*/

        Scanner leer = new Scanner(System.in);

        //asignar valores a la matriz
        int matriz[][] = new int[3][3];
        System.out.println("Ingrese 9 numeros entre el 1 y el 9:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }

        //imprimir la matriz original
        System.out.println("Matriz Original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        //creo una variable "bandera" en true y corroboro la logica con "for", si es distinto a 15 cambio a false
        int var1, var2, var3 = 0, var4 = 0, varX = matriz.length - 1;
        boolean bandera = true;
        for (int i = 0; i < matriz.length; i++) {
            //var1 y var 2 las reinicio en 0 en cada vuelta
            var1 = 0;
            var2 = 0;
            //este "for" sirve para sumar en var1 cada fila
            for (int j = 0; j < matriz.length; j++) {
                var1 += matriz[i][j];
            }
            System.out.println("fila " + i + " = " + var1);
            //En este punto en var1 están sumadas cada fila en cada vuelta, descomentar la linea anterior para corroborar
            if (var1 != 15) {
                bandera = false;
            }

            for (int j = 0; j < matriz.length; j++) {
                var2 += matriz[j][i];
            }
            System.out.println("columna " + i + " = " + var2);
            //En este punto en var1 están sumadas cada columna en cada vuelta, descomentar la linea anterior para corroborar
            if (var2 != 15) {
                bandera = false;
            }
            //En var3 almaceno la diagonal de izquierda a derecha
            var3 += matriz[i][i];
            //System.out.println("diagonal principal :" + var3);

            //En var4 almaceno la diagonal de izquierda a derecha, varX se usa como contador
            var4 += matriz[varX][i];
            varX--;

        }
        System.out.println("Diagonal 1 : " + var3 + "\nDiagonal 2 : " + var4 + "\n");
        if (var3 != 15 || var4 != 15) {
            bandera = false;
        }
        if (bandera) {
            System.out.println("Es un cuadro magico");
        } else {
            System.out.println("ERROR, No es un cuadro magico");
        }
    }

    public static void ejercicio21() {
        /*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
        3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
        dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
        se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
        que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
        la matriz M en la cual empieza el primer elemento de la submatriz P.
        Ejemplo:

        Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
        4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.*/

        Scanner leer = new Scanner(System.in);

        int matrizM[][] = new int[10][10];
        int matrizP[][] = new int[3][3];

        // Este For rellena la matrizM con numero aleatorios entre 10 y 99
        System.out.println("MUESTRA MATRIZ MAYOR: \n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = ThreadLocalRandom.current().nextInt(10, 100);
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println("");
        }
        //Este For rellena manualmente la matrizP con 9 numeros
        System.out.println("\nIngrese 9 numeros\nde Matriz Menor :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j] = leer.nextInt();
            }
        }
        //muestra MatrizP
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizP[i][j] + " ");
            }
            System.out.println("");
        }
        //creamos un marcador "bandera" para que cambie en caso que no coincidan todos los elementos
        boolean bandera = true, bandera2 = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //el condicional if es el primer filtro, en caso que concida toda la primerfila,c ontinua a validar los demas datos
                if (matrizM[i][j] == matrizP[0][0] && matrizM[i][j + 1] == matrizP[0][1] && matrizM[i][j + 2] == matrizP[0][2]) {
                    bandera2 = true;
                    System.out.println("\nPrimera fila encontrada en coordenada: " + i + " - " + j);
                    //estos "for" anidados, validan las proximas 6 posiciones 
                    //(filas 1 y 2 completas), la fila 1 ya fue validada en el if anterior
                    for (int k = 1; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matrizM[i + k][j + l] == matrizP[k][l]) {
                                System.out.println("Coincide posicion :" + k + " - " + l);
                            } else {
                                bandera = false;
                            }
                        }
                    }
                }
            }
        }
        //mensaje final, muestra se encontró o no la matrizP dentro de matrizM
        if (bandera && bandera2) {
            System.out.println("\nSE HA ENCONTRADO LA MATRIZ!!!!");
        } else {
            System.out.println("\nERROR, la matriz no fué encontrada");
        }
    }
}

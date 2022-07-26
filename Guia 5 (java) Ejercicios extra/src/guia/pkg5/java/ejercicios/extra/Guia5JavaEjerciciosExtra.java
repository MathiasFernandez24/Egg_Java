package guia.pkg5.java.ejercicios.extra;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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
        //ejercicio22();
        //ejercicio23();
        //ejercicio24();

        //aux();
    }

    public static void aux() {
        Scanner leer = new Scanner(System.in);
        int num1 = 2;
        int num2 = 2;

        do {
            System.out.println("Ingrese un numero: ");
            num2 = leer.nextInt();
        } while (num1 != num2);

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
            } while (i < cantDatos);

            System.out.println("Minimo " + valMin);
            System.out.println("Maximo " + valMax);
            System.out.println("Promedio " + (prom / cantDatos));
        } else {
            System.out.println("\nIngrese numeros mayores a cero");
        }
    }

    public static void ejercicio8() {
        /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
        detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
        la cantidad de números impares. Al igual que en el ejercicio anterior los números
        negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/

        Scanner leer = new Scanner(System.in);
        int num, par = 0, impar = 0, leidos = 0;
        do {
            System.out.print("Ingrese un numero: ");
            num = leer.nextInt();
            if (num >= 0) {
                leidos++;
                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        } while (num % 5 != 0 || num == 0);

        System.out.println("\nNumero leidos :" + leidos);
        System.out.println("Numeros Pares :" + par);
        System.out.println("Numeros Pares :" + impar);
    }

    public static void ejercicio9() {
        /*Simular la división usando solamente restas. Dados dos números enteros mayores que
        uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
        Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
        resultado es el residuo, y el número de restas realizadas es el cociente.
        Por ejemplo: 50 / 13:
        50 – 13 = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas
        24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Numero a dividir: ");
        int num1 = leer.nextInt();
        System.out.print("entre: ");
        int num2 = leer.nextInt();
        int cociente = 0, residuo = 0;
        while (num1 >= num2) {
            num1 -= num2;
            cociente++;
        }
        residuo = num1;
        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);
    }

    public static void ejercicio10() {
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
        dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
        si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
        al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java.*/
        Scanner leer = new Scanner(System.in);
        int num1 = ThreadLocalRandom.current().nextInt(1, 11);
        int num2 = ThreadLocalRandom.current().nextInt(1, 11);
        int numOculto = num1 * num2;
        int numUsuario;
        System.out.println("ingrese numeros (1 al 100) hasta adivinar el correcto");
        //descomentar la siguiente linea para ver el numero Oculto
        //System.out.println("Numero Oculto: " + numOculto);
        do {
            System.out.print("Ingrese numero: ");
            numUsuario = leer.nextInt();
        } while (numUsuario != numOculto);
        System.out.println("ADIVINASTE!! el numero oculto es " + numOculto);
    }

    public static void ejercicio11() {
        /*Escribir un programa que lea un número entero y devuelva el número de dígitos que
        componen ese número. Por ejemplo, si introducimos el número 12345, el programa
        deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
        de división. Nota: recordar que las variables de tipo entero truncan los números o
        resultados.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero de varias cifras: ");
        int num = leer.nextInt();
        int contador = 1;
        while (num > 9) {
            num = num / 10;
            contador++;
        }
        System.out.println("\nSu numero tiene " + contador + " cifras");
    }

    public static void ejercicio12() {
        /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
        0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
        Ejemplo:
        0-0-0
        0-0-1
        0-0-2
        0-0-E
        0-0-4
        0-1-2
        0-1-E
        Nota: investigar función equals() y como convertir números a String.*/

        int num1 = 0, num2 = 0, num3 = 0;
        String var1 = "", var2 = "", var3 = "";

        do {
            num3++;
            if (num3 == 10) {
                num2++;
                num3 = 0;
                if (num2 == 10) {
                    num1++;
                    num2 = 0;
                }
            }
            if (num1 == 3 || num2 == 3 || num3 == 3) {
                if (num1 == 3) {
                    var1 = "E";
                } else {
                    var1 = String.valueOf(num1);
                }
                if (num2 == 3) {
                    var2 = "E";
                } else {
                    var2 = String.valueOf(num2);
                }
                if (num3 == 3) {
                    var3 = "E";
                } else {
                    var3 = String.valueOf(num3);
                }

                System.out.println(var1 + "-" + var2 + "-" + var3);
            } else {
                System.out.println(num1 + "-" + num2 + "-" + num3);
            }

        } while (num1 != 9 || num2 != 9 || num3 != 9);
    }

    public static void ejercicio13() {
        /*Crear un programa que dibuje una escalera de números, donde cada línea de números
        comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
        usuario al comenzar. Ejemplo: si se ingresa el número 3:
        1
        12
        123*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero (largo escalera): ");
        int largo = leer.nextInt();
        String escalera = "";
        for (int i = 1; i <= largo; i++) {
            escalera = escalera + String.valueOf(i);
            System.out.println(escalera);
        }
    }

    public static void ejercicio14() {
        /*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
        hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
        de hijos para averiguar la media de edad de los hijos de todas las familias.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Numero de familias: ");
        int numFamilias = leer.nextInt(), aux, aux2;
        double hijosTotal = 0, edadHijosTotal = 0;

        for (int i = 1; i <= numFamilias; i++) {
            System.out.print("Numero de hijos de familia " + i + " :");
            aux2 = leer.nextInt();
            for (int j = 1; j <= aux2; j++) {
                System.out.print("Edad de hijo " + j + " de familia " + i + " : ");
                aux = leer.nextInt();
                hijosTotal++;
                edadHijosTotal += aux;
            }

        }
        System.out.println("el promedio de edad de los hijos de las familia es: " + edadHijosTotal / hijosTotal);
    }

    public static void ejercicio15() {
        /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
        restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
        matemática y deben devolver sus resultados para imprimirlos en el main.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros: ");
        int num1 = leer.nextInt(), num2 = leer.nextInt();

        System.out.println("    MENU"
                + "\n1- sumar"
                + "\n2- restar"
                + "\n3- multiplicar"
                + "\n4- dividir\n");
        System.out.print("elige opcion :");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + suma(num1, num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + resta(num1, num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es: " + multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println("El resultado de la division es: " + division(num1, num2));
                break;
            default:
                System.out.println("ERROR, Opcion no valida");
        }
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static void ejercicio16() {
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
        las personas ingresadas por teclado e indique si son mayores o menores de edad.
        Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
        mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/

        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad de personas a ingresar: ");
        int cantpersonas = leer.nextInt();
        String vectorNombres[] = new String[cantpersonas], mayor18Años, pregunta;
        int vectorEdad[] = new int[cantpersonas];
        int contador = 0;

        for (int i = 0; i < cantpersonas; i++) {
            System.out.println("Nombre persona " + (i + 1));
            vectorNombres[i] = leer.next();
            System.out.println("Edad persona " + (i + 1));
            vectorEdad[i] = leer.nextInt();
        }

        while (contador != cantpersonas) {
            if (contador != 0) {
                System.out.print("Quiere ver mas? (S/N): ");
                pregunta = leer.next();
                if ("n".equals(pregunta.toLowerCase())) {
                    break;
                }
            }

            if (vectorEdad[contador] >= 18) {
                mayor18Años = " Mayor de edad";
            } else {
                mayor18Años = " Menor de edad";
            }

            System.out.println("\nNombre: " + vectorNombres[contador] + ", Edad: " + vectorEdad[contador] + " (es " + mayor18Años + ")");

            contador++;
        }
        System.out.println("\n---Fin Programa---");
    }

    public static void ejercicio17() {
        /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
        por parámetro para que nos indique si es o no un número primo, debe devolver true si es
        primo, sino false.
        Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
        primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
        ¿Qué son los números primos?
        Básicamente, un número primo es un número natural que tiene solo dos divisores o
        factores: 1 y el mismo número. Es decir, es primo aquel número que se puede dividir por
        uno y por el mismo número.
        El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son: 2, 3, 5, 7, 11,
        13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es primo: ");
        int num = leer.nextInt();
        System.out.println(esPrimo(num));
    }

    public static boolean esPrimo(int a) {
        int contador = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                contador++;
            }
        }
        return contador == 2;
    }

    public static void ejercicio18() {
        /*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
        N, con los valores ingresados por el usuario.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Largo vector: ");
        int largoVector = leer.nextInt();
        int vector[] = new int[largoVector], sumaTotal = 0;
        for (int i = 0; i < largoVector; i++) {
            System.out.print("Ingrese un numero: ");
            vector[i] = leer.nextInt();
            sumaTotal += vector[i];
        }
        System.out.println("\nLa suma de todos los elementos del\nVector es: " + sumaTotal);
    }

    public static void ejercicio19() {
        /*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
        comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
        elementos).*/

        Scanner leer = new Scanner(System.in);

        int vector1[] = new int[5];
        int vector2[] = new int[5];

        System.out.println("Ingrese 5 numeros de Vector1: ");
        for (int i = 0; i < 5; i++) {
            vector1[i] = leer.nextInt();
        }
        System.out.println("Ingrese 5 numeros de Vector2: ");
        for (int i = 0; i < 5; i++) {
            vector2[i] = leer.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (vector1[i] == vector2[i]) {
                System.out.println("Posicion " + i + " coincide");
            } else {
                System.out.println("Error, posicion " + i + " diferente");
                break;
            }
        }
    }

    public static void ejercicio20() {
        /*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
        parámetro. Después haremos otra función o procedimiento que imprima el vector.*/

        int vector[] = new int[10];
        completarArrayConAleatorios(vector);
        mostrarArray(vector);

    }

    public static void completarArrayConAleatorios(int[] a) {
        for (int i = 0; i < 10; i++) {
            a[i] = ThreadLocalRandom.current().nextInt(1, 11);
        }
    }

    public static void mostrarArray(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void ejercicio21() {
        /*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
        adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
        desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
        prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
        programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
        desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
        igual al 7 de sus notas del curso.*/

        double alumnos[] = new double[10];
        int parcial1, parcial2, integrador1, integrador2;
        for (int i = 0; i < 10; i++) {
            parcial1 = ThreadLocalRandom.current().nextInt(1, 11);
            parcial2 = ThreadLocalRandom.current().nextInt(1, 11);
            integrador1 = ThreadLocalRandom.current().nextInt(1, 11);
            integrador2 = ThreadLocalRandom.current().nextInt(1, 11);
            System.out.println("\nAlumno " + (i + 1) + " :"
                    + "\n   Parcial 1: " + parcial1
                    + "\n   Parcial 2: " + parcial2
                    + "\nIntegrador 1: " + integrador1
                    + "\nIntegrador 2: " + integrador2);

            alumnos[i] = parcial1 * 0.1 + parcial2 * 0.15 + integrador1 * 0.25 + integrador2 * 0.5;
            System.out.println("PROMEDIO FINAL: " + alumnos[i]);
            if (alumnos[i] >= 7) {
                System.out.println("    --APROBADO--");
            } else {
                System.out.println("    --REPROBADO--");
            }
        }
    }

    public static void ejercicio22() {
        /*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
        muestre la suma de sus elementos.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Cant Filas: ");
        int fila = leer.nextInt();
        System.out.print("Cant Columnas: ");
        int columna = leer.nextInt();
        int matriz[][] = new int[fila][columna];

        System.out.println("    MATRIZ");
        int sumaTotal = 0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j] = ThreadLocalRandom.current().nextInt(10, 99);
                sumaTotal += matriz[i][j];
            }
        }

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\nSuma total: " + sumaTotal);
    }

    public static void ejercicio23() {
        /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
        que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
        20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
        será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
        rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
        por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
        de Java substring(), Length() y Math.random().*/

        Scanner leer = new Scanner(System.in);
        String palabras[] = new String[5];
        String sopa[][] = new String[20][20];
        int vectorRandom[] = new int[5];
        boolean aux = false;

        //le asigno un valor diferente a 0, a todo vectorRandom, en este caso 99, pero no significa nada
        for (int i = 0; i < 5; i++) {
            vectorRandom[i] = 99;
        }
        //almaceno las 5 palabras ingresadas, validando que tengan entre 3 y 5 caracteres, las almaceno en un vector
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Ingrese palabra " + (i + 1) + ": ");
                palabras[i] = leer.next();
                if (palabras[i].length() >= 3 && palabras[i].length() <= 5) {
                    aux = false;
                } else {
                    aux = true;
                    System.out.println("ERROR, debe tener entre 3 y 5 letras");
                }
            } while (aux);
        }
        //asigna valor standar a toda la sopa "-"
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = "-";
            }
        }
        //imprime la sopa
        System.out.println("\n    SOPA VACIA\n");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
        }

        int aux2 = 0, randomFila, randomColumna;
        boolean existeRandom;
        for (int i = 0; i < 5; i++) {
            switch (palabras[i].length()) {
                case 3:
                    aux2 = 3;
                    break;
                case 4:
                    aux2 = 4;
                    break;
                case 5:
                    aux2 = 5;

            }
            //genera una posicion entre 0 y 20, pero le resto el largo de la palabra, porque si tocase 20, podria no caber en la sopa
            randomColumna = ThreadLocalRandom.current().nextInt(0, 21 - aux2);
            //en este do, se verifica que no toquen 2 veces la misma fila para las palabras, si la fila se
            //repite por casualidad, no la almacena y vuelve a generar otro numero random
            do {
                existeRandom = false;
                randomFila = ThreadLocalRandom.current().nextInt(0, (20));
                //System.out.println(randomFila);
                for (int j = 0; j < 5; j++) {

                    if (vectorRandom[j] == randomFila) {
                        existeRandom = true;
                    }
                }
            } while (existeRandom);
            vectorRandom[i] = randomFila;

            for (int j = 0; j < palabras[i].length(); j++) {
                sopa[randomFila][randomColumna + j] = palabras[i].substring(j, j + 1);
            }

        }
        //imprime la sopa
        System.out.println("\n\n  Sopa (resultados)\n");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
        }
        //imprime la sopa
        System.out.println("\n\n    Sopa Final\n");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == "-") {
                    sopa[i][j] = String.valueOf(ThreadLocalRandom.current().nextInt(1, 10));
                }
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void ejercicio24() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int cantNum = leer.nextInt();
        //uso long, porque a partir de la posicion 47 del array "num" los numeros son demasiado largos para ser "int" y genera numeros negativos
        long num[] = new long[cantNum];
        
        //para la posicion 0 y 1 del vector "num" el valor es 1, para las demas posiciones se suma la posicion anterior y la ante-anterior
        for (int i = 0; i < cantNum; i++) {
            if (i > 1) {
                num[i] = num[i - 1] + num[i - 2];
            } else {
                num[i] = 1;
            }
        }
        //imprimer el resultado del vector "num
        System.out.println("\nPrimeros " + cantNum + " numeros de\nSecuencia de Fibonaccin: ");
        for (int i = 0; i < cantNum; i++) {
            System.out.println(num[i] + ", ");
        }
    }
}

package guia.pkg6.java.poo.aprendizaje;

import guia.pkg6.java.poo.aprendizaje.entidades.Arreglos;
import guia.pkg6.java.poo.aprendizaje.entidades.Cadena;
import guia.pkg6.java.poo.aprendizaje.entidades.Cafetera;
import guia.pkg6.java.poo.aprendizaje.entidades.Cancion;
import guia.pkg6.java.poo.aprendizaje.entidades.Circunferencia;
import guia.pkg6.java.poo.aprendizaje.entidades.CuentaBancaria;
import guia.pkg6.java.poo.aprendizaje.entidades.Libro;
import guia.pkg6.java.poo.aprendizaje.entidades.Mascota;
import guia.pkg6.java.poo.aprendizaje.entidades.Matematica;
import guia.pkg6.java.poo.aprendizaje.entidades.NIF;
import guia.pkg6.java.poo.aprendizaje.entidades.Operacion;
import guia.pkg6.java.poo.aprendizaje.entidades.Persona;
import guia.pkg6.java.poo.aprendizaje.entidades.PersonaEj12;
import guia.pkg6.java.poo.aprendizaje.entidades.PersonaEj7;
import guia.pkg6.java.poo.aprendizaje.entidades.Puntos;
import guia.pkg6.java.poo.aprendizaje.entidades.Raices;
import guia.pkg6.java.poo.aprendizaje.entidades.Rectangulo;
import guia.pkg6.java.poo.aprendizaje.servicios.ArreglosService;
import guia.pkg6.java.poo.aprendizaje.servicios.CadenaService;
import guia.pkg6.java.poo.aprendizaje.servicios.CafeteraService;
import guia.pkg6.java.poo.aprendizaje.servicios.CancionService;
import guia.pkg6.java.poo.aprendizaje.servicios.CircunferenciaService;
import guia.pkg6.java.poo.aprendizaje.servicios.CuentaBancariaService;
import guia.pkg6.java.poo.aprendizaje.servicios.LibroService;
import guia.pkg6.java.poo.aprendizaje.servicios.MatematicaService;
import guia.pkg6.java.poo.aprendizaje.servicios.NIFService;
import guia.pkg6.java.poo.aprendizaje.servicios.OperacionService;
import guia.pkg6.java.poo.aprendizaje.servicios.PersonaEj12Service;
import guia.pkg6.java.poo.aprendizaje.servicios.PersonaEj7Service;
import guia.pkg6.java.poo.aprendizaje.servicios.PersonaService;
import guia.pkg6.java.poo.aprendizaje.servicios.PuntosService;
import guia.pkg6.java.poo.aprendizaje.servicios.RaicesService;
import guia.pkg6.java.poo.aprendizaje.servicios.RectanguloService;
import guia.pkg6.java.poo.aprendizaje.servicios.ServicioMascota;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Guia6JavaPOOAprendizaje {

    public static void main(String[] args) {

        //ejemploVideo();
        //ejercicioPersona();
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
        //EJERCICIOS EXTRA
        //ejercicioExtra1();
        //ejercicioExtra2();
        //ejercicioExtra3();
        ejercicioExtra4();
    }

    public static void ejemploVideo() {
        ServicioMascota sm = new ServicioMascota();
        Mascota m1 = sm.crearMascota();

        System.out.println(m1);
        m1 = null;
        System.out.println(m1);
    }

    public static void ejercicioPersona() {
        PersonaService personaSv = new PersonaService();
        Scanner leer = new Scanner(System.in);

        System.out.println("    Crear objeto 'Persona':");
        System.out.println("Ingrese Nombre, edad y DNI separados\npor 'barra espaciadora'");
        String nombreAsignado = leer.next();
        int edadAsignada = leer.nextInt();
        int dniAsignado = leer.nextInt();

        Persona p1 = new Persona(nombreAsignado, edadAsignada, dniAsignado);
        System.out.println(p1);
        personaSv.mostrarNombre(p1);

    }

    public static void ejercicio1() {
        LibroService libroSv = new LibroService();
        Libro primerLibro = libroSv.crearLibro();
        System.out.println(primerLibro);
    }

    public static void ejercicio2() {
        CircunferenciaService circunferenciaSv = new CircunferenciaService();
        Circunferencia circulo = circunferenciaSv.crearCircunferencia();

        //System.out.println(circulo);
        circunferenciaSv.area(circulo);
        //System.out.println(circulo);

        circunferenciaSv.perimetro(circulo);
        //System.out.println(circulo);
    }

    public static void ejercicio3() {

        //crea el servicio como "operacionSV"
        OperacionService operacionSV = new OperacionService();

        //utilizo el metodo crearOperacion() del servicio creado anteriormente como "operacionSV"
        Operacion primeraOperacion = operacionSV.crearOperacion();
        System.out.println(primeraOperacion);

        //almaceno en resultadoSuma lo que retorna el metodo (o funcion) de suma(), le debo pasar el "objeto" creado
        int resultadoSuma = operacionSV.sumar(primeraOperacion);
        System.out.println("suma " + resultadoSuma);

        //reescribo los numeros y los imprimo sumando
        operacionSV.cambiarNumeros(primeraOperacion);
        System.out.println("suma " + operacionSV.sumar(primeraOperacion));

        //muestro por pantalla el retorno del metodo/funcion "resta" de "operacionSV"
        System.out.println("resta " + operacionSV.restar(primeraOperacion));

        //muestro por pantalla el retorno del metodo "multiplicar" de "operacionSV"
        System.out.println("multiplicacion " + operacionSV.multiplicar(primeraOperacion));

        //muestro por pantalla el retorno del metodo "dividir" de "operacionSV"
        System.out.println("dividir " + operacionSV.dividir(primeraOperacion));

    }

    public static void ejercicio4() {
        RectanguloService rectanguloSV = new RectanguloService();
        Rectangulo primerRectangulo = rectanguloSV.crearRectangulo();
        rectanguloSV.superficie(primerRectangulo);
        rectanguloSV.perimetro(primerRectangulo);
    }

    public static void ejercicio5() {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaService cuentaBancariaSV = new CuentaBancariaService();

        CuentaBancaria miCuenta = cuentaBancariaSV.crearCuentaNueva();
        boolean continuarEnMenu = true;
        int opcion;
        do {
            System.out.println(" *****MENU*****\n1-Ingresar Dinero\n2-Retirar Dinero\n3-Extraccion Rapida\n4-Consultar Saldo\n5-Consultar Datos\n6-Salir\n\nSeleccione opcion: ");
            opcion = leer.nextInt();
            System.out.println("--------------------------------------");
            switch (opcion) {
                case 1:
                    cuentaBancariaSV.ingresarDinero(miCuenta);
                    break;
                case 2:
                    cuentaBancariaSV.retirarDinero(miCuenta);
                    break;
                case 3:
                    cuentaBancariaSV.extraccionRapida(miCuenta);
                    break;
                case 4:
                    cuentaBancariaSV.consultarSaldo(miCuenta);
                    break;
                case 5:
                    cuentaBancariaSV.consultarDatos(miCuenta);
                    break;
                case 6:
                    continuarEnMenu = false;
                    break;
            }
        } while (continuarEnMenu);

    }

    public static void ejercicio6() {
        CafeteraService cf = new CafeteraService();
        Cafetera c1 = cf.crearCafetera();
        Cafetera c2 = cf.crearCafetera();

        cf.llenarCafetera(c1);
        System.out.println(c1);
    }

    public static void ejercicio7() {

        PersonaEj7Service sv = new PersonaEj7Service();
        PersonaEj7 mica = sv.crearPersona();
        PersonaEj7 luis = sv.crearPersona();
        PersonaEj7 maira = sv.crearPersona();
        PersonaEj7 maxi = sv.crearPersona();
        PersonaEj7 martin = sv.crearPersona();
        PersonaEj7 mathi = sv.crearPersona();
        PersonaEj7 luciano = sv.crearPersona();

        PersonaEj7 vector[] = new PersonaEj7[7];

        vector[0] = mica;
        vector[1] = luis;
        vector[2] = maira;
        vector[3] = maxi;
        vector[4] = martin;
        vector[5] = mathi;
        vector[6] = luciano;

        int varHambre = 0;
        int varSobrepeso = 0;
        int varOptimo = 0;
        int mayores = 0;
        int menores = 0;
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2]);
        for (int i = 0; i < 3; i++) {

            System.out.println("-------" + vector[i].getNombre() + "-------");
            switch (sv.calcularIMC(vector[i])) {

                case 1:
                    System.out.println("Peso: Tiene Sobrepeso");
                    varSobrepeso++;
                    break;
                case -1:
                    System.out.println("Peso: tiene hambre");
                    varHambre++;
                    break;
                case 0:
                    System.out.println("Peso: Optimo");
                    varOptimo++;
            }
            if (sv.esMayorDeEdad(vector[i])) {
                System.out.println("Es Mayor de edad");
                mayores++;
            } else {
                System.out.println("Es Menor de edad");
                menores++;
            }

            System.out.println("-----------------------------");
        }

        System.out.println("Peso ideal " + varOptimo);
        System.out.println("Sobrepeso: " + varSobrepeso);
        System.out.println("con hambruna: " + varHambre);
        System.out.println("Mayores de edad: " + (mayores * 100 / 7) + "%");
        System.out.println("Menores de edad: " + (menores * 100 / 7) + "%");
    }

    public static void ejercicio8() {
        CadenaService sv = new CadenaService();
        Cadena frase1 = sv.crearFrase();

        System.out.println(frase1);

        sv.mostrarVocales(frase1);
        sv.invertirFrase(frase1);
        sv.vecesRepetido(frase1);
        sv.compararLongitud(frase1);
        sv.unirFrases(frase1);
        sv.reemplazar(frase1);

        System.out.println(sv.contiene(frase1));

        System.out.println("-----" + frase1);

    }

    public static void ejercicio9() {

        MatematicaService sv = new MatematicaService();
        Matematica variable = sv.crearMatematica();

        System.out.println(variable);
        System.out.println(sv.devolverMayor(variable));
        System.out.println(sv.calcularPotencia(variable));
        System.out.println(sv.calculaRaiz(variable));
    }

    public static void ejercicio10() {
        ArreglosService as = new ArreglosService();
        Arreglos a = as.crearArreglos();

        as.rellenarArreglo(a.getArrayA());
        as.ordenarArreglo(a.getArrayA());
        as.rellenarArregloB(a.getArrayA(), a.getArrayB(), a.getArrayB().length);
    }

    public static void ejercicio11() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("año: ");
        int anio = leer.nextInt() - 1900;
        System.out.print("mes: ");
        int mes = leer.nextInt();
        System.out.print("dia: ");
        int dia = leer.nextInt();

        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();
        System.out.println(fechaActual);

        System.out.println("Diferencia, años: " + (fechaActual.getYear() - fecha.getYear()));
        System.out.println("Diferencia, dias: " + (fechaActual.getDay() - fecha.getDay()));
        System.out.println("Diferencia, meses: " + (fechaActual.getMonth() - fecha.getMonth()));
        System.out.println(fechaActual.getDay());
        System.out.println(fecha.getDay());
    }

    public static void ejercicio12() {
        PersonaEj12Service sv = new PersonaEj12Service();
        PersonaEj12 maira = sv.crearPersona();
        System.out.println(maira);
        sv.mostrarEdad(maira);
    }

    public static void ejercicioExtra1() {
        CancionService sv = new CancionService();
        Cancion c1 = sv.crearCancion();
        Cancion c2 = sv.crearCancionCompleta();

        System.out.println(c1);
        System.out.println(c2);
    }

    public static void ejercicioExtra2() {
        PuntosService sv = new PuntosService();
        Puntos puntito = sv.crearPuntos();

        System.out.println(puntito);
        System.out.println(sv.calcularDistancias(puntito));
        System.out.println(Math.sqrt(37));
    }

    public static void ejercicioExtra3() {
        RaicesService sv = new RaicesService();
        Raices raiz1 = sv.crearRaices();

        System.out.println(raiz1);
        System.out.println(sv.getDiscriminante(raiz1));
        System.out.println(sv.tieneRaices(raiz1));
        sv.obtenerRaices(raiz1);
        sv.obtenerRaiz(raiz1);
        sv.calcular(raiz1);
    }

    public static void ejercicioExtra4() {
        NIFService sv = new NIFService();
        NIF dni = sv.crearNif();
        System.out.println(dni);
        sv.mostrar(dni);
    }

}

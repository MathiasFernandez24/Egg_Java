package guia.pkg6.java.poo.aprendizaje;

import guia.pkg6.java.poo.aprendizaje.entidades.Cafetera;
import guia.pkg6.java.poo.aprendizaje.entidades.Circunferencia;
import guia.pkg6.java.poo.aprendizaje.entidades.CuentaBancaria;
import guia.pkg6.java.poo.aprendizaje.entidades.Libro;
import guia.pkg6.java.poo.aprendizaje.entidades.Mascota;
import guia.pkg6.java.poo.aprendizaje.entidades.Operacion;
import guia.pkg6.java.poo.aprendizaje.entidades.Persona;
import guia.pkg6.java.poo.aprendizaje.entidades.PersonaEj7;
import guia.pkg6.java.poo.aprendizaje.entidades.Rectangulo;
import guia.pkg6.java.poo.aprendizaje.servicios.CafeteraService;
import guia.pkg6.java.poo.aprendizaje.servicios.CircunferenciaService;
import guia.pkg6.java.poo.aprendizaje.servicios.CuentaBancariaService;
import guia.pkg6.java.poo.aprendizaje.servicios.LibroService;
import guia.pkg6.java.poo.aprendizaje.servicios.OperacionService;
import guia.pkg6.java.poo.aprendizaje.servicios.PersonaEj7Service;
import guia.pkg6.java.poo.aprendizaje.servicios.PersonaService;
import guia.pkg6.java.poo.aprendizaje.servicios.RectanguloService;
import guia.pkg6.java.poo.aprendizaje.servicios.ServicioMascota;
import java.util.Scanner;

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
        ejercicio7();

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
}

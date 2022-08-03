package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.CuentaBancaria;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class CuentaBancariaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuentaNueva() {
        System.out.println("    ----Creando cuenta nueva----");
        CuentaBancaria cuentaNueva = new CuentaBancaria();

        System.out.print("*Nombre titular :");
        cuentaNueva.setNombre(leer.next());

        System.out.print("*DNI del titular: ");
        cuentaNueva.setDni(leer.nextInt());

        cuentaNueva.setNumeroCuenta(ThreadLocalRandom.current().nextInt(10000, 99999));
        System.out.println("\n*Su numero de cuenta asignado es: " + cuentaNueva.getNumeroCuenta());

        cuentaNueva.setSaldoActual(1000);
        System.out.println("\n*Como regalo de bienvenida, le otorgamos un\nSaldo inicial de $" + cuentaNueva.getSaldoActual());

        cuentaNueva.setInteres(0.15);
        System.out.println("\n*El interes aplicado a su cuenta es del " + cuentaNueva.getInteres() + "%\n");
        System.out.println("--------------------------------------");
        return cuentaNueva;
    }

    public void ingresarDinero(CuentaBancaria objeto) {
        System.out.print("Cantidad a ingresar: ");
        objeto.setSaldoActual(objeto.getSaldoActual() + leer.nextInt());
        System.out.println("----Su nuevo saldo es: $" + objeto.getSaldoActual());
        System.out.println("--------------------------------------");
    }

    public void retirarDinero(CuentaBancaria objeto) {
        boolean reintentar;
        String respuesta;
        int montoARetirar;
        do {
            System.out.println("Cantidad a retirar: ");
            montoARetirar = leer.nextInt();
            if (montoARetirar <= objeto.getSaldoActual()) {
                System.out.println("Saldo anterior:   $" + objeto.getSaldoActual());
                objeto.setSaldoActual(objeto.getSaldoActual() - montoARetirar);
                System.out.println("Monto retirado:   $" + montoARetirar);
                System.out.println("Saldo disponible: $" + objeto.getSaldoActual());
                reintentar = false;
            } else {
                System.out.println("ERROR, Fondos insuficientes");
                System.out.println("desea reintentar con otro importe? (S/N)");
                respuesta = leer.next();
                if ("s".equals(respuesta.toLowerCase())) {
                    reintentar = true;
                } else {
                    reintentar = false;
                }
            }
        } while (reintentar);
        System.out.println("--------------------------------------");
    }

    public void extraccionRapida(CuentaBancaria objeto) {
        double montoARetirarDisponible = objeto.getSaldoActual() * 0.2;
        System.out.println("Solo puede retirar hasta: $" + montoARetirarDisponible);
        System.out.print("Monto a retirar: ");
        int montoARetirar = leer.nextInt();
        if (montoARetirar > montoARetirarDisponible) {
            System.out.println("*Esta opcion no permite retirar ese monto");
        } else {
            System.out.println("Saldo anterior: $" + objeto.getSaldoActual());
            objeto.setSaldoActual(objeto.getSaldoActual() - montoARetirar);
            System.out.println("Monto retirado: $" + montoARetirar);
            System.out.println("Saldo disponible: $" + objeto.getSaldoActual());
        }
        System.out.println("--------------------------------------");
    }

    public void consultarSaldo(CuentaBancaria objeto) {
        System.out.println("*Saldo de cuenta N°" + objeto.getNumeroCuenta() + " $" + objeto.getSaldoActual());
        System.out.println("--------------------------------------");
    }

    public void consultarDatos(CuentaBancaria objeto) {
        System.out.println("       --RESUMEN--");
        System.out.println("    Usuario: " + objeto.getNombre());
        System.out.println("    DNI    : " + objeto.getDni());
        System.out.println("    Cta    : " + objeto.getNumeroCuenta());
        System.out.println("    Saldo  : $" + objeto.getSaldoActual());
        System.out.println("    Interes: " + objeto.getInteres() + "%");
        System.out.println("--------------------------------------");
    }
}

package guia.pkg6.java.poo.aprendizaje.entidades;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class CuentaBancaria {
    String nombre;
    long dni;
    int numeroCuenta;
    int saldoActual;
    double interes;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String nombre, long dni, int numeroCuenta, int saldoActual, double interes) {
        this.nombre = nombre;
        this.dni = dni;
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "nombre=" + nombre + ", dni=" + dni + ", numeroCuenta=" + numeroCuenta + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }

   
    
}

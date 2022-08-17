package guia.pkg6.java.poo.aprendizaje.entidades;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
import java.util.Date;

public class Auto {

    /*Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color
del vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km), 
Crear métodos que permitan:
• Que un usuario cargue su ficha del auto.
• Que el usuario, modifique la titularidad del vehículo.
• Indicar un trayecto recorrido, modificando de este modo los KM del motor
• Crear un método que indique si es necesario realizar Service al vehículo, considerando que 
al llegar a los 10.000km corresponde realizarlo*/
    String nombreDueño, color;
    int modelo, kmMotor = 7500;
    Date fechaVencimientoCarnet = new Date();

    public Auto() {
    }

    public Auto(String nombreDueño, String color, int modelo, int kmMotor, Date fechaVencimientoCarnet) {
        this.nombreDueño = nombreDueño;
        this.color = color;
        this.modelo = modelo;
        this.kmMotor = kmMotor;
        this.fechaVencimientoCarnet = fechaVencimientoCarnet;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKmMotor() {
        return kmMotor;
    }

    public void setKmMotor(int kmMotor) {
        this.kmMotor = kmMotor;
    }

    public Date getFechaVencimientoCarnet() {
        return fechaVencimientoCarnet;
    }

    public void setFechaVencimientoCarnet(Date fechaVencimientoCarnet) {
        this.fechaVencimientoCarnet = fechaVencimientoCarnet;
    }

    @Override
    public String toString() {
        return "Auto{ nombreDue\u00f1o=" + nombreDueño + ", color=" + color + ", modelo=" + modelo + ", kmMotor=" + kmMotor + ", fechaVencimientoCarnet=" + fechaVencimientoCarnet + '}';
    }
}

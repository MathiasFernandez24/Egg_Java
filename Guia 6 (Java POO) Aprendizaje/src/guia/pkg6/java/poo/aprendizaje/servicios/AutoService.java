package guia.pkg6.java.poo.aprendizaje.servicios;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
import guia.pkg6.java.poo.aprendizaje.entidades.Auto;
import java.util.Date;
import java.util.Scanner;

public class AutoService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Auto crearAuto() {
        Auto auto = new Auto();
        System.out.print("Nombre dueño del vehiculo: ");
        auto.setNombreDueño(sc.next());
        System.out.print("Color del vehiculo: ");
        auto.setColor(sc.next());
        System.out.print("Modelo del vehiculo: ");
        auto.setModelo(sc.nextInt());
        System.out.println("Fecha vencimiento carnet (en numeros)");
        System.out.print("Año: ");
        int anio = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Dia: ");
        int dia = sc.nextInt();
        Date vencimiento = new Date(anio - 1900, mes - 1, dia);

        auto.setFechaVencimientoCarnet(vencimiento);

        return auto;
    }
    
    public void cambioTitularidad(Auto a){
        System.out.print("Nombre nuevo titular: ");
        a.setNombreDueño(sc.next());
        System.out.println("Fecha vencimiento carnet (en numeros)");
        System.out.print("Año: ");
        int anio = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Dia: ");
        int dia = sc.nextInt();
        Date vencimiento = new Date(anio - 1900, mes - 1, dia);

        a.setFechaVencimientoCarnet(vencimiento);
    }
    
    public void recorrerDistancia(Auto a){
        System.out.print("Distancia recorrida: ");
        a.setKmMotor(a.getKmMotor()+sc.nextInt());
    }
    public void service(Auto a){
        int serv = a.getKmMotor()/10000;
        System.out.println("El vehiculo deberia tener "+serv+" Service realizados");
        System.out.println("El proximo service es en "+(((serv+1)*10000)-a.getKmMotor())+"Km");
    }
}



package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Tiempo;
import java.util.Scanner;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class TiempoService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Tiempo crearTiempo() {

        System.out.print("Hora: ");
        int hora = sc.nextInt();
        System.out.print("Minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Segundos: ");
        int segundos = sc.nextInt();

        Tiempo t = new Tiempo(hora, minutos, segundos);
        ajustarHora(t);
        return t;
    }

    
    public void ajustarHora(Tiempo t) {
        //si ingresa 60 seg o mas, cada 60 segundos agrega 1 minuto, y resta 60 a segundos
        if (t.getSegundos() > 59) {
            t.setMinutos(t.getMinutos() + t.getSegundos() / 60);
            t.setSegundos(t.getSegundos() - (t.getSegundos() / 60) * 60);
        }
        //si hay 60 min o mas, cada 60 minutos agrega 1 hora, y resta 60 a minutos
        if (t.getMinutos() > 59) {
            t.setHora(t.getHora() + t.getMinutos() / 60);
            t.setMinutos(t.getMinutos() - (t.getMinutos() / 60 * 60));
        }
    }

    public void mostrarHora(Tiempo t) throws InterruptedException {
        while (true) {
            System.out.printf("%02d:%02d:%02d%n", t.getHora(), t.getMinutos(), t.getSegundos());
            Thread.sleep(1000); //funcion para hacer una pausa en milisegundos 1000 = 1 segundo
            t.setSegundos(t.getSegundos()+1);
            ajustarHora(t);
        }
    }
}

package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CafeteraService {

    Cafetera a = new Cafetera();

    public void llenarCafetera(Cafetera cafetera) {
       cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Se ha llenado la cafetera");
    }
    
    public void servirTaza(int medidaTaza, Cafetera cafetera){
        if(medidaTaza<=cafetera.getCantidadActual()){
            System.out.println("alcanza el cafe que ha solicitado :D \n La taza si se llenó");
            cafetera.setCantidadActual(cafetera.getCantidadActual()-medidaTaza);
        }else{
            System.out.println("Hay menos cafe, no alcanzó, peeroo....\nun poquito alcanza, te puedo servir " + cafetera.getCantidadActual());
            cafetera.setCantidadActual(0);
            System.out.println("lataza no se llenó");
            
            
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
        System.out.println("la cafetera se vació");
    }
    
    public Cafetera crearCafetera(){
        Scanner leer = new Scanner(System.in);
        Cafetera cafeteraNueva = new Cafetera();
        
        System.out.print("ingrese cantidad maxima: ");
        cafeteraNueva.setCapacidadMaxima(leer.nextInt());
        
        System.out.print("ingrese cantidad actual de la cafetera: ");
        cafeteraNueva.setCantidadActual(leer.nextInt());
                
        return cafeteraNueva;
    }
}

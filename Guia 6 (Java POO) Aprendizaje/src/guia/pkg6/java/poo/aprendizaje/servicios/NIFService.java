package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.NIF;
import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class NIFService {
    public NIF crearNif(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        NIF rtrn = new NIF();
        System.out.print("Ingrese DNI: ");
        rtrn.setDni(leer.nextLong());
        
        char vector[] = {'t','r','w','a','g','m','y','f','p','d','x','b','n','j','z','s','q','v','h','l','c','k','e'};
        rtrn.setLetra(vector[Math.toIntExact(rtrn.getDni()%22)]);
        
        return rtrn;
    }
    
    public void mostrar(NIF dni){
        System.out.print(dni.getDni()+"-"+dni.getLetra());
    }
}

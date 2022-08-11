package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.MyArray;
import java.util.Scanner;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class MyArrayService {
    public MyArray crearMes(){
        MyArray mes = new MyArray();
        return mes;
    }
    
    public void adivinarMes(MyArray mes){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String respuesta;
        do{
            System.out.print("Adivina el mes secreto: ");    
            respuesta = leer.next().toLowerCase();
        }while(!mes.getMesSecreto().equals(respuesta));
        
        System.out.println("Adivinaste!!");
    }
}

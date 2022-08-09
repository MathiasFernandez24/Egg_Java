package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Matematica;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class MatematicaService {

    public Matematica crearMatematica() {
        Matematica rtrn = new Matematica();
        rtrn.setNum1((float) (Math.random() * 10));
        rtrn.setNum2((float) (Math.random() * 10));
        

        return rtrn;
    }

    public float devolverMayor(Matematica valores) {
        return Math.max(valores.getNum1(), valores.getNum2());
    }
    
    public float calcularPotencia(Matematica valores){
        //suerte con la lectura
        return(float) Math.pow(Math.round(Math.max(valores.getNum1(), valores.getNum2())), Math.round(Math.min(valores.getNum1(), valores.getNum2())));
    }
    public float calculaRaiz(Matematica valores){
        return (float) Math.sqrt(Math.abs(Math.min(valores.getNum1(), valores.getNum2())));
    }

}

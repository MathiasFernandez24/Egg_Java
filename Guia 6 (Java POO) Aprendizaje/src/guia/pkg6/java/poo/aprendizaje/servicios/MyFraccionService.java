package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.MyFraccion;
import java.util.Scanner;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class MyFraccionService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public MyFraccion crearFraccion() {
        MyFraccion f = new MyFraccion();

        System.out.print("Numerador: ");
        f.setNumerador(leer.nextInt());
        System.out.print("Denominador: ");
        f.setDenominador(leer.nextInt());

        return f;
    }

    public String mostrar(MyFraccion f) {
        return f.getNumerador() + "/" + f.getDenominador();

    }

    public MyFraccion simplificar(MyFraccion f) {
        int u = Math.abs(f.getNumerador());
        int v = Math.abs(f.getDenominador());
        if (v == 0) {
        } else {
            int r;
            while (v != 0) {
                r = u % v;
                u = v;
                v = r;
            }
        }
        f.setDenominador(f.getDenominador() / u);
        f.setNumerador(f.getNumerador() / u);

        return f;
    }

    public MyFraccion sumarFracciones(MyFraccion f1, MyFraccion f2) {
        MyFraccion rtrn = new MyFraccion();
        rtrn.setNumerador(f1.getNumerador() * f2.getDenominador() + f1.getDenominador() * f2.getNumerador());
        rtrn.setDenominador(f1.getDenominador() * f2.getDenominador());
        simplificar(rtrn);
        return rtrn;
    }

    public MyFraccion restarFracciones(MyFraccion f1, MyFraccion f2) {
        MyFraccion rtrn = new MyFraccion();
        rtrn.setNumerador(f1.getNumerador() * f2.getDenominador() - f1.getDenominador() * f2.getNumerador());
        rtrn.setDenominador(f1.getDenominador() * f2.getDenominador());
        simplificar(rtrn);
        return rtrn;
    }

    public MyFraccion multiplicarFracciones(MyFraccion f1, MyFraccion f2) {
        MyFraccion rtrn = new MyFraccion();
        rtrn.setNumerador(f1.getNumerador() * f2.getNumerador());
        rtrn.setDenominador(f1.getDenominador() * f2.getDenominador());
        simplificar(rtrn);
        return rtrn;
    }

    public MyFraccion dividirFracciones(MyFraccion f1, MyFraccion f2) {
        MyFraccion rtrn = new MyFraccion();
        rtrn.setNumerador(f1.getNumerador() * f2.getDenominador());
        rtrn.setDenominador(f1.getDenominador() * f2.getNumerador());
        simplificar(rtrn);
        return rtrn;
    }
    
    public void sumaRestaMultiplicaciónDivision(MyFraccion f1, MyFraccion f2){
        System.out.println("sus fracciones son: " + f1 + " y " + f2);
        System.out.println(f1+"+"+f2+"="+ sumarFracciones(f1, f2));
        System.out.println(f1+"-"+f2+"="+restarFracciones(f1, f2));
        System.out.println(f1+"X"+f2+"="+multiplicarFracciones(f1, f2));
        System.out.println(f1+"/"+f2+"="+dividirFracciones(f1, f2));
    }
}

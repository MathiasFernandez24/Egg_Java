package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Fecha;
import java.util.Scanner;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class FechaService {

    Scanner sc = new Scanner(System.in);
    int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int[] mesesB = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String month[] = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

    public Fecha crearFecha() {
        Fecha f1 = new Fecha();
        System.out.println("Ingrese el año");
        f1.setAnio(sc.nextInt());
        if (f1.getAnio() < 1900 || f1.getAnio() > 2021) {
            f1.setAnio(1900);
        }

        System.out.println("Ingrese el mes");
        f1.setMes(sc.nextInt());
        if (f1.getMes() < 1 || f1.getMes() > 12) {
            f1.setMes(01);
        }

        System.out.println("Ingrese el dia");
        f1.setDia(sc.nextInt());
        if (bisiesto(f1)) {
            if (f1.getDia() < 1 || f1.getDia() > (mesesB[f1.getMes() - 1])) {
                f1.setDia(01);
            }
        } else {
            if (f1.getDia() < 1 || f1.getDia() > (meses[f1.getMes() - 1])) {
                f1.setDia(01);
            }
        }
        return f1;
    }

    public boolean bisiesto(Fecha f) {
        if ((f.getAnio() % 4 == 0) && ((f.getAnio() % 100 != 0) || (f.getAnio() % 400 == 0))) {
            //System.out.println("El año es bisiesto");
            return true;

        } else {
            //System.out.println("El año no es bisiesto");
            return false;
        }

    }

    public void mesElegido(Fecha f) {
        if (bisiesto(f)) {
            System.out.println("El mes elegido es " + month[f.getMes() - 1] + " tiene " + mesesB[f.getMes() - 1]);
        } else {
            System.out.println("El mes elegido es " + month[f.getMes() - 1] + " tiene " + meses[f.getMes() - 1]);
        }
    }

    public void diaAntPos(Fecha f) {
        if (!bisiesto(f)) {
            if (f.getDia() == 01 && f.getMes() != 01) {
                System.out.println("El dia anterior es: " + meses[f.getMes() - 2] + "/" + (f.getMes() - 1) + "/" + f.getAnio());
            } else if (f.getMes() == 01 && f.getDia() == 01) {
                System.out.println("El dia anterior es: " + 31 + "/" + 12 + "/" + (f.getAnio() - 1));
            } else {
                System.out.println("El dia anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
            }
        } else {
            if (f.getDia() == 01 && f.getMes() != 01) {
                System.out.println("El dia anterior es: " + mesesB[f.getMes() - 2] + "/" + (f.getMes() - 1) + "/" + f.getAnio());
            } else if (f.getMes() == 01 && f.getDia() == 01) {
                System.out.println("El dia anterior es: " + mesesB[11] + "/" + 12 + "/" + (f.getAnio() - 1));
            } else {
                System.out.println("El dia anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
            }
        }
        if (!bisiesto(f)) {
            if (f.getDia() == meses[f.getMes() - 1] && f.getMes() != 12) {
                System.out.println("El dia posterior es: " + 01 + "/" + (f.getMes() + 1) + "/" + f.getAnio());
            } else if (f.getDia() == meses[f.getMes() - 1] && f.getMes() == 12) {
                System.out.println("El dia posterior es: " + 01 + "/" + 01 + "/" + (f.getAnio() + 1));
            } else {
                System.out.println("El dia posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
            }
        } else {
            if (f.getDia() == mesesB[f.getMes() - 1] && f.getMes() != 12) {
                System.out.println("El dia posterior es: " + 01 + "/" + (f.getMes() + 1) + "/" + f.getAnio());
            } else if (f.getDia() == mesesB[f.getMes() - 1] && f.getMes() == 12) {
                System.out.println("El dia posterior es: " + 01 + "/" + 01 + "/" + (f.getAnio() + 1));
            } else {
                System.out.println("El dia posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
            }
        }

    }

    public void test(Fecha f) {
        System.out.println(f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
    }
}

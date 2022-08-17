package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.Pass;
import java.util.Scanner;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class PassService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearPass(Pass p) {
        String pass;
        do {
            System.out.print("Ingrese password de 10 caracteres: ");
            pass = sc.next();
        } while (pass.length() != 10);
        p.setPass(pass);
    }

    public void analizarPass(Pass p) {
        int x = 0;

        for (int i = 0; i < 10; i++) {
            if (p.getPass().substring(i, i + 1).equals("a")) {
                x++;
            }
        }
        if (x > 1 && p.getPass().contains("z")) {
            System.out.println("Seguridad ALTA");
        } else if (p.getPass().contains("z")) {
            System.out.println("Seguridad MEDIA");
        } else {
            System.out.println("Seguridad BAJA");
        }

    }

    public void modificarPass(Pass p) {
        System.out.print("Ingrese su contraseña actual: ");
        String pass = sc.next();
        if (p.getPass().equals(pass)) {
            System.out.println("Clave correcta! , puede modificar su password");
            crearPass(p);
            System.out.println("Clave cambiada satisfactoriamente");
        } else {
            System.out.println("Lo siento, clave Incorrecta");
        }
    }

    public void modificarNombre(Pass p) {
        System.out.print("Ingrese su contraseña actual: ");
        String pass = sc.next();
        if (p.getPass().equals(pass)) {
            System.out.println("Clave correcta! , puede modificar su nombre");
            p.setNombre(sc.next());
            System.out.println("Nombre cambiado a " + p.getNombre());
        } else {
            System.out.println("Lo siento, clave Incorrecta");
        }
    }

    public void modificarDni(Pass p) {
        System.out.print("Ingrese su contraseña actual: ");
        String pass = sc.next();
        if (p.getPass().equals(pass)) {
            System.out.println("Clave correcta! , puede modificar su DNI");
            p.setNombre(sc.next());
            System.out.println("DNI cambiado a " + p.getNombre());
        } else {
            System.out.println("Lo siento, clave Incorrecta");
        }
    }

    public void menu(Pass p) {
        System.out.println("--Primer ingreso, cree su nueva Password--");
        crearPass(p);
        int seleccion;

        do {
            System.out.println("\n\n--------MENU--------"
                    + "\n 1-Ver Nivel de password"
                    + "\n 2-Modificar password"
                    + "\n 3-Modificar Nombre"
                    + "\n 4-Modificar DNI"
                    + "\n 5-Ver datos"
                    + "\n 6-Salir");
            seleccion = sc.nextInt();

            switch (seleccion) {
                case 1:
                    analizarPass(p);
                    break;
                case 2:
                    modificarPass(p);
                    break;
                case 3:
                    modificarNombre(p);
                    break;
                case 4:
                    modificarDni(p);
                    break;
                case 5:
                    System.out.println("Nombre: " + p.getNombre());
                    System.out.println("DNI: " + p.getDni());
                    System.out.println("Pass: " + p.getPass());
                    break;
                case 6:
                    System.out.println("¡¡ Gracias por usar nuestro servicios !!");
                    break;
                default:
                    System.out.println("Opcion no valida\n");
            }
        } while (seleccion != 6);

    }
}

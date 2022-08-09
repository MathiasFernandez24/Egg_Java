package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.PersonaEj12;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class PersonaEj12Service {

    public PersonaEj12 crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaEj12 personita = new PersonaEj12();
        System.out.print("Nombre: ");
        personita.setNombre(leer.next());

        System.out.print("año de nacimiento: ");
        int anio = leer.nextInt() - 1900;
        System.out.print("mes de nacimiento: ");
        int mes = leer.nextInt() - 1;
        System.out.print("dia de nacimiento: ");
        int dia = leer.nextInt();

        Date fecha = new Date(anio, mes, dia);
        personita.setFechaNacimiento(fecha);

        return personita;
    }

    public void mostrarEdad(PersonaEj12 pers) {
        Date fechaActual = new Date();
        int aux = fechaActual.getYear() - pers.getFechaNacimiento().getYear();

        if (fechaActual.getMonth() <= pers.getFechaNacimiento().getMonth() && fechaActual.getDate() < pers.getFechaNacimiento().getDate()) {
            aux--;
        }

        System.out.println("Edad de " + pers.getNombre() + " :" + aux);

    }

}

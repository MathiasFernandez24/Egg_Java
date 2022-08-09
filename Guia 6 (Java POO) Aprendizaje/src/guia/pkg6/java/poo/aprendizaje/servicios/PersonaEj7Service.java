package guia.pkg6.java.poo.aprendizaje.servicios;

import guia.pkg6.java.poo.aprendizaje.entidades.PersonaEj7;

import java.util.Scanner;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class PersonaEj7Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    public PersonaEj7 crearPersona() {
        PersonaEj7 persona = new PersonaEj7();
        boolean validador = true;

        System.out.print("Nombre: ");
        persona.setNombre(leer.next());
        System.out.print("Edad: ");
        persona.setEdad(leer.nextInt());
        String sexo;

        do {
            System.out.println("Sexo (M/H/O): ");
            sexo = leer.next();
            sexo = sexo.toLowerCase();
            if (sexo.equals("m") || sexo.equals("h") || sexo.equals("o")) {
                validador = false;
            } else {
                System.out.println("--Ingrese un valor correcto");
            }

//            switch (sexo) {
//                case "m":
//                    validador = false;
//                    break;
//                case "h":
//                    validador = false;
//                    break;
//                case "o":
//                    validador = false;
//                    break;
//                default:
//                    System.out.println("no seas pelotudo ponelo bien");
//                    break;
//            }
        } while (validador);
        persona.setSexo(sexo);
        System.out.print("Altura: ");
        persona.setAltura(leer.nextFloat());
        System.out.print("Peso: ");
        persona.setPeso(leer.nextFloat());

        return persona;
    }

    public int calcularIMC(PersonaEj7 personita) {
        int noRtr = -1;
        float iMC = personita.getPeso() / (personita.getAltura() * personita.getAltura());
        System.out.println("---"+iMC);
        if (iMC >= 20 && iMC <= 25) {
            noRtr = 0;
        } else if (iMC > 25) {
            noRtr = 1;
        }

        return noRtr;
    }

    public boolean esMayorDeEdad(PersonaEj7 personita) {
        return personita.getEdad() >= 18;
    }

}
//  private String nombre;
//    private int edad;
//    private String sexo;
//    private double altura;
//    private double peso;

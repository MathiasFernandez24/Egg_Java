package guia.pkg6.java.poo.aprendizaje.entidades;

import java.util.Date;

/**
 * 
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Usuario {

    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String pais;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }

}

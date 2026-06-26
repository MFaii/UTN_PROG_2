/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializableapp;

import java.io.Serializable;

/**
 *
 * @author Maxi
 */
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nombre;
    private int edad;
    private transient String password;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

}

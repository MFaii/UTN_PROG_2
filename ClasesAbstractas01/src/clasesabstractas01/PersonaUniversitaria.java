/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas01;

/**
 *
 * @author Maxi
 */
public abstract class PersonaUniversitaria {

    protected String nombre;
    protected String dni;
    protected String email;

    public PersonaUniversitaria(String nombre, String dni, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "PersonaUniversitaria{" + "nombre=" + nombre + ", dni=" + dni + ", email=" + email + '}';
    }

    public abstract void realizarActividadPrincipal(); // Contrato, todas mis clases hijas van a tener este metodo implementado. Obligatoriamente
}

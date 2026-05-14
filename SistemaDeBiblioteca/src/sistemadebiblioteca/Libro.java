/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebiblioteca;

/**
 *
 * @author Maxi
 */
public class Libro {

    // Atributos
    String titulo;
    Autor autor;
    String fecha;
    String editorial;
    boolean estaDisponible;
    String material;
    String genero;

    public Libro(String titulo, boolean estaDisponible) {
        this.titulo = titulo;
        this.estaDisponible = estaDisponible;
    }

    // Metodos
    public void leer() {
    }

    public void prestar() {
    }

    public void devolver() {
    }

    public String toString() {
        return "Titulo: " + titulo
                + " Autor: " + autor.nombre
                + " Fecha: " + fecha
                + " Editorial: " + editorial
                + " Esta disponible: " + estaDisponible
                + " Material: " + material
                + " Genero: " + genero;
    }
}

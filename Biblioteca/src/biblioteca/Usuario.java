/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Maxi
 */
public class Usuario {

    private String nombre;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void tomarLibro(Libro libro) {
        if (libro.estaDisponible()) {
            libro.prestar();
            librosPrestados.add(libro);
            System.out.println(nombre + " tomo el libro: " + libro.getTitulo());
        } else {
            System.out.println("El libro no esta disponible.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.devolver();
            librosPrestados.remove(libro);
            System.out.println(nombre + " devolvio el libro: " + libro.getTitulo());
        } else {
            System.out.println("No tiene el libro.");
        }
    }

    public void mostrarLibros() {
        System.out.println("Libros de " + nombre + ": ");
        for (Libro l : librosPrestados) { //forEach java
            System.out.println(" - " + l.getTitulo());
        }
    }
}

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
public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca");
        for (Libro l : libros) {
            System.out.println(l); //l.toString();
        }
    }

    public Libro buscarLibro(String titulo) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {//Compara strings ignore case
                return l;
            }
        }
        return null;
    }
}

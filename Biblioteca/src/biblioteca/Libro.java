/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Maxi
 */
public class Libro {

    private String titulo;
    private boolean disponible;
    private Autor autor;

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
        }
    }

    public void devolver() {
        disponible = true;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", disponible=" + disponible + ", autor=" + autor + '}';
    }

}

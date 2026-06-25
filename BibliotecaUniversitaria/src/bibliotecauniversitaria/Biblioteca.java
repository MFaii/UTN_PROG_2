/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecauniversitaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Maxi
 */
public class Biblioteca {

    private List<Libro> catalogo;

    private LinkedList<Prestamo> prestamos;

    private HashSet<Usuario> usuarios;

    private HashMap<String, Libro> librosPorISBN;

    public Biblioteca() {
        catalogo = new ArrayList<>();

        prestamos = new LinkedList<>();

        usuarios = new HashSet<>();

        librosPorISBN = new HashMap<>();
    }

    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
        librosPorISBN.put(libro.getIsbn(), libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Libro buscarLibroPorISBN(String isbn) {
        return librosPorISBN.get(isbn);
    }

    public Prestamo prestarLibro(String isbn, Usuario usuario) {
        Libro libro = librosPorISBN.get(isbn);

        if (libro == null) {
            throw new RuntimeException("Libro no encontrado");
        }

        if (libro.isPrestado()) {
            throw new RuntimeException("El libro ya esta prestado");
        }

        if (!usuarios.contains(usuario)) {
            throw new RuntimeException("Usuario no registrado");
        }

        libro.setPrestado(true);

        Prestamo prestamo = new Prestamo(libro, usuario);

        prestamos.add(prestamo);

        return prestamo;
    }

    public void devolverLibro(String isbn) {

        Libro libro = librosPorISBN.get(isbn);

        if (libro == null) {
            throw new RuntimeException("Libro no encontrado");
        }
        if (!libro.isPrestado()) {
            throw new RuntimeException("Libro no esta prestado");
        }

        libro.setPrestado(false);
    }

    public List<Libro> obtenerCatalogoOrdenado() {
        List<Libro> ordenado = new ArrayList<>(catalogo);

        ordenado.sort((l1, l2) -> l1.getTitulo().compareTo(l2.getTitulo()));

        return ordenado;
    }

    public List<Libro> librosPrestados() {
        List<Libro> resultado = new ArrayList<>();

        for (Libro l : catalogo) {
            if (l.isPrestado()) {
                resultado.add(l);
            }
        }
        return resultado;
    }

    public List<Usuario> obtenerUsuarios() {
        return new ArrayList<>(usuarios);
    }

    public int totalPrestamos() {
        return prestamos.size();
    }

    public int prestamosPorUsuarios(Usuario usuario) {
        int count = 0;

        for (Prestamo p : prestamos) {
            if (p.getUsuario().equals(usuario)) {
                count++;
            }
        }
        return count;
    }
}

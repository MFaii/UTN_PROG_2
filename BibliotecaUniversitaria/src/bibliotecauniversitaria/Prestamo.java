/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecauniversitaria;

/**
 *
 * @author Maxi
 */
public class Prestamo {

    private Libro libro;
    private Usuario usuario;
    private boolean activo;

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.activo = true;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void cerrar() {
        this.activo = false;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Prestamo{"
                + "libro=" + libro.getTitulo()
                + ", usuario=" + usuario.getNombre()
                + '}';
    }

}

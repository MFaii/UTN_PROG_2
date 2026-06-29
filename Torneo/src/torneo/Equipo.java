/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneo;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author Maxi
 */
public abstract class Equipo {

    private String nombre;
    private LocalDateTime fechaCreacion;

    public Equipo(String nombre, LocalDateTime fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public String getFicha() {
        return nombre + " fundado el " + fechaCreacion;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Equipo otro = (Equipo) obj;

        return nombre.equals(otro.nombre)
                && fechaCreacion.equals(otro.fechaCreacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fechaCreacion);
    }

    @Override
    public String toString() {
        return getFicha();
    }

}

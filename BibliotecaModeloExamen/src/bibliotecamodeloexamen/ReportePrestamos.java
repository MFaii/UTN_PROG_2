/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecamodeloexamen;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Maxi
 */
public class ReportePrestamos implements Exportable {

    private Biblioteca biblioteca;

    public ReportePrestamos(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void exportar(String rutaArchivo) {

        try {
            PrintWriter writer = new PrintWriter(rutaArchivo);

            writer.println("=== REPORTE DE PRESTAMOS ACTIVOS ===");
            writer.println();

            for (Prestamo prestamo : biblioteca.listarPrestamosActivos()) {

                writer.println("ID: " + prestamo.getIdPrestamo());

                writer.println("Socio: " + prestamo.getSocio().getNombre()
                        + " " + prestamo.getSocio().getApellido()
                        + " " + prestamo.getSocio().getDni());

                writer.println("Libro: " + prestamo.getLibro().getTitulo());

                writer.println("Fecha prestamo: " + prestamo.getFechaPrestamo());

                writer.println("Estado: Activo");

                writer.println("---------------------------------------------");

            }

            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error al generar el reporte.");
        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecturaarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Maxi
 */
public class LecturaArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            File propiedadesArchivo = new File("datos.txt");
            System.out.println(propiedadesArchivo.exists());
            System.out.println(propiedadesArchivo.getName());
            System.out.println(propiedadesArchivo.getAbsolutePath());

            FileReader archivo = new FileReader("datos.txt");
            BufferedReader lector = new BufferedReader(archivo);

            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            lector.close();
            archivo.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}

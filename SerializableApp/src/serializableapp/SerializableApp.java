/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serializableapp;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Maxi
 */
public class SerializableApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Serializar
        Persona persona = new Persona("Juan", 25);

        try {
            FileOutputStream archivo = new FileOutputStream("persona.dat");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);

            salida.writeObject(persona);

            salida.close();
            archivo.close();

            System.out.println("Objecto guardado correctamente");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Deserializar
        
        System.out.println("---Deserializando---");
        try {
            FileInputStream archivoEntrada = new FileInputStream("persona.dat");
            ObjectInputStream entrada = new ObjectInputStream(archivoEntrada);

            Persona persona2 = (Persona) entrada.readObject();

            entrada.close();
            archivoEntrada.close();

            System.out.println("Objeto leido:");
            System.out.println(persona2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}

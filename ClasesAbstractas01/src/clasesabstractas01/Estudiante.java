/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas01;

/**
 *
 * @author Maxi
 */
public class Estudiante extends PersonaUniversitaria implements AccesoCampusVirtual {

    private String carrera;

    public Estudiante(String nombre, String dni, String email, String carrera) {
        super(nombre, dni, email);
        this.carrera = carrera;
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println(nombre + " esta cursando la carrera de " + carrera);
    }

    public void inscribirseMateria(String materia) {
        System.out.println(nombre + " se inscribio a: " + materia);
    }

    @Override
    public void ingresarCampus() {
        System.out.println("Ingreso al campus.");
    }
}

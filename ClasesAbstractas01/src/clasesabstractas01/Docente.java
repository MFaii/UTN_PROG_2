/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas01;

/**
 *
 * @author Maxi
 */
public class Docente extends PersonaUniversitaria implements AccesoCampusVirtual, FirmaDigital {

    private String departamento;

    public Docente(String nombre, String dni, String email, String departamento) {
        super(nombre, dni, email);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println(nombre + " pertenece al departamento: " + departamento);
    }

}

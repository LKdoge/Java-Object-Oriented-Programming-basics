/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author Acer
 */
public class Persona {
    private int Cedula; 
    private String Nombre;

    public Persona(int Cedula, String Nombre) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }
    
    
}

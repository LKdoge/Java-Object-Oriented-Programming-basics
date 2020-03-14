/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//putoel que lolea 
package taller2;

/**
 *
 * @author Acer
 */
public class Estudiante extends persona {
    private float Promedio;
    private int Semestre;

    public Estudiante(float Promedio, int Semestre, int Cedula, String Nombre) {
        super(Cedula, Nombre);
        this.Promedio = Promedio;
        this.Semestre = Semestre;
    }

    public float getPromedio() {
        return Promedio;
    }

    public int getSemestre() {
        return Semestre;
    }
    public Estudiante (){
    
    }
}

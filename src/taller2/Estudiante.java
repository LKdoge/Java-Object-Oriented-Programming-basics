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
    private String profesor;
    public Estudiante(float Promedio, int Semestre, int Cedula, String Nombre, 
            String profesor) {
        super(Cedula, Nombre);
        this.Promedio = Promedio;
        this.Semestre = Semestre;
        this.profesor = profesor;
    }

    public float getPromedio() {
        return Promedio;
    }
    public void setPromedio(float promedio){
        this.Promedio = promedio;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getSemestre() {
        return Semestre;
    }
    public String getprofesor(){
        return profesor;
    }
    public Estudiante (){
    
    }
}

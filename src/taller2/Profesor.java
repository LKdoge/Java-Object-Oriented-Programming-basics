/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Profesor extends Persona {

    private ArrayList<Estudiante> ListaEstudiantes = new ArrayList<Estudiante>();
    private ArrayList<Materias> ListaMaterias = new ArrayList<Materias>();

    public Profesor(int Cedula, String Nombre) {
        super(Cedula, Nombre);
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return ListaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> ListaEstudiantes) {
        this.ListaEstudiantes = ListaEstudiantes;
    }

    public Estudiante ObtenerEstudianteMejorPromedio() {

        return 0;
    }

    public Profesor ObtenerProfesorMasMaterias(ArrayList<Profesor> Materias) {

        return 0;
    }
}

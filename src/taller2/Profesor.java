
package taller2;

import java.util.ArrayList;

/**
 *
 * @author we are gods like this
 */
public class Profesor extends persona {
    private int numeromaterias;
    private ArrayList<Estudiante> ListaEstudiantes = new ArrayList<Estudiante>();
    private ArrayList<Materias> ListaMaterias = new ArrayList<Materias>();
     Estudiante pos = new Estudiante();
    public Profesor(int numeromaterias,int Cedula, String Nombre) {
        super(Cedula, Nombre);
        this.numeromaterias = numeromaterias;
    }

    public int getnumeromaterias() {
        return numeromaterias;
    }

    public void setnumeromaterias(int numeromaterias) {
        this.numeromaterias = numeromaterias;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return ListaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> ListaEstudiantes) {
        this.ListaEstudiantes = ListaEstudiantes;
    }

    public Estudiante ObtenerEstudianteMejorPromedio() {
    float comp = 0;
        for (int x = 0; x < ListaEstudiantes.size(); x++) {
            if (ListaEstudiantes.get(x).getPromedio() > comp) {
                comp = ListaEstudiantes.get(x).getPromedio();
                pos = ListaEstudiantes.get(x);
            }
        }
        return pos;
    }

    public Profesor ObtenerProfesorMasMaterias(ArrayList<Profesor> Materias) {
    Profesor jo = new Profesor(0,1001226090,"luis");
        int mat = 0;
        for(int x = 0 ; x < Materias.size(); x++){
            if(Materias.get(x).getnumeromaterias() > mat){
                mat = Materias.get(x).getnumeromaterias();
                jo = Materias.get(x);
            }
        }
        return jo;
    }
}

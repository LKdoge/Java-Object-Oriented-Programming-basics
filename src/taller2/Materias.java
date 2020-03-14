package taller2;

public class Materias {

    private String NombreMateria;
    private Profesor profe;

    public Materias(String NombreMateria, Profesor profe) {
        this.NombreMateria = NombreMateria;
        this.profe = profe;
    }

    public String getNombreMateria() {
        return NombreMateria;
    }
}

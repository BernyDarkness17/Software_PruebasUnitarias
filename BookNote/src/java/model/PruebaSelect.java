package model;

/**
 *
 * @author Edunaldo
 */
public class PruebaSelect {
    
    private int id;
    private String nombre;
    private float nota;
    private float porcentaje;
    private String id_asignatura;
    private int id_alumno;

    public PruebaSelect() {
    }

    public PruebaSelect(int id, String nombre, float nota, float porcentaje, String id_asignatura, int id_alumno) {
        this.id = id;
        this.nombre = nombre;
        this.nota = nota;
        this.porcentaje = porcentaje;
        this.id_asignatura = id_asignatura;
        this.id_alumno = id_alumno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(String id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }
    
    
}

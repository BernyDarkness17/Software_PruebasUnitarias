package model;


public class Asignatura {
    
    private int id;
    private String nombre;
    private int id_docente;
    private int asistencia;

    public Asignatura() {
    }

    public Asignatura(int id, String nombre, int id_docente, int asistencia) {
        this.id = id;
        this.nombre = nombre;
        this.id_docente = id_docente;
        this.asistencia = asistencia;
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

    public int getId_docente() {
        return id_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "id=" + id + ", nombre=" + nombre + ", id_docente=" + id_docente + ", asistencia=" + asistencia + '}';
    }
    
}

package model;

public class Mensaje {
    
    private int id;
    private String texto;
    private String fecha;
    private int id_asignatura;

    public Mensaje() {
    }

    public Mensaje(int id, String texto, String fecha, int id_asignatura) {
        this.id = id;
        this.texto = texto;
        this.fecha = fecha;
        this.id_asignatura = id_asignatura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(int id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "id=" + id + ", texto=" + texto + ", fecha=" + fecha + ", id_asignatura=" + id_asignatura + '}';
    }
    
}

package model;

public class Asistencia {
    
    private int id;
    private String fecha; 
    private boolean asistio;

    public Asistencia() {
    }

    public Asistencia(int id, String fecha, boolean asistio) {
        this.id = id;
        this.fecha = fecha;
        this.asistio = asistio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isAsistio() {
        return asistio;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "id=" + id + ", fecha=" + fecha + ", asistio=" + asistio + '}';
    }
    
}

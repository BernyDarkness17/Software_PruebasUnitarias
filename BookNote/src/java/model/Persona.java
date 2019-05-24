package model;


public class Persona {
    
    private int id;
    private String nombre;
    private String apellido;
    private int id_usuario;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, int id_usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_usuario = id_usuario;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", id_usuario=" + id_usuario + '}';
    }

    
    
}

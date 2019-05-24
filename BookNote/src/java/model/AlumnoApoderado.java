package model;

/**
 *
 * @author csandoval
 */
public class AlumnoApoderado {
    int id;
    int idAlumno;
    int idApoderado;

    public AlumnoApoderado(int id, int idAlumno, int idApoderado) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.idApoderado = idApoderado;
    }

    public AlumnoApoderado() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdApoderado() {
        return idApoderado;
    }

    public void setIdApoderado(int idApoderado) {
        this.idApoderado = idApoderado;
    }
    
}

package dao;

import java.sql.SQLException;
import java.util.List;
import model.Asignatura;

public interface AsignaturaDAO {
    void create (Asignatura as)throws SQLException;
    List<Asignatura> read()throws SQLException;        
    void update (Asignatura as)throws SQLException;
    void delete (String id)throws SQLException;
    
    //otros
    List<Asignatura> asignaturaDocente(int id) throws SQLException;
    List<Asignatura> asignaturaAlumno(int id) throws SQLException;
    List<Asignatura> getAsignaturaProfesor(int idDocente)throws SQLException;
    
}

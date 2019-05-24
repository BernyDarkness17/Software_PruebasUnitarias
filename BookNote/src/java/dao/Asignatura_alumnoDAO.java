package dao;

import java.sql.SQLException;
import java.util.List;
import model.AsignaturaAlumno;

public interface Asignatura_alumnoDAO {
    
    void create (AsignaturaAlumno asa)throws SQLException;
    List<AsignaturaAlumno> read()throws SQLException;        
    void update (AsignaturaAlumno asa)throws SQLException;
    void delete (String id)throws SQLException;
}

package dao;

import java.sql.SQLException;
import java.util.List;
import model.AlumnoApoderado;

/**
 *
 * @author csandoval
 */
public interface AlumnoApoderadoDAO {
     void create (AlumnoApoderado aa)throws SQLException;
    List<AlumnoApoderado> read()throws SQLException;        
    void update (AlumnoApoderado aa)throws SQLException;
    void delete (String id)throws SQLException;
}

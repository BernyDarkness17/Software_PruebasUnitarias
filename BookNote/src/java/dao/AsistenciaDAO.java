package dao;

import java.sql.SQLException;
import java.util.List;
import model.Asistencia;

public interface AsistenciaDAO {
    
    void create (Asistencia asi)throws SQLException;
    List<Asistencia> read()throws SQLException;        
    void update (Asistencia asi)throws SQLException;
    void delete (String id)throws SQLException;
}

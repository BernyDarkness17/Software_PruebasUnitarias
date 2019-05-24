package dao;

import java.sql.SQLException;
import java.util.List;
import model.Prueba;

public interface PruebaDAO {
    
    void create (Prueba p)throws SQLException;
    List<Prueba> read()throws SQLException;        
    void update (Prueba p)throws SQLException;
    void delete (String id)throws SQLException;
    List<Prueba> getPorcByNombre(String nombre)throws SQLException;
}

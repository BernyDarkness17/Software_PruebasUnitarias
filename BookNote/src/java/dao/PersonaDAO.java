package dao;

import java.sql.SQLException;
import java.util.List;
import model.Persona;

public interface PersonaDAO {
    void create (Persona p)throws SQLException;
    List<Persona> read()throws SQLException;        
    void update (Persona p)throws SQLException;
    void delete (String id)throws SQLException;
    Persona searchNameByUser(int idUser)throws SQLException;
    List<Persona> getNameByAsignatura(String asignatura)throws SQLException;        
    List<Persona> getNameDocente()throws SQLException;
    int getIdAlumno(int id_usu)throws SQLException;
}

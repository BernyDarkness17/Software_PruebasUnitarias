package dao;

import java.sql.SQLException;
import java.util.List;
import model.PruebaSelect;

public interface PruebaSelectDAO {

    public List<PruebaSelect> getNotasAlumno(int id_alumno)throws SQLException;
}

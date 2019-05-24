package dao;

import java.sql.SQLException;
import java.util.List;
import model.Mensaje;

public interface MensajeDAO {

    void create(Mensaje m) throws SQLException;

    List<Mensaje> read() throws SQLException;

    void update(Mensaje m) throws SQLException;

    void delete(String id) throws SQLException;

    //otros
    List<Mensaje> buscar(int exp) throws SQLException;

}

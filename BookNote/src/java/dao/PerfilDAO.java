package dao;

import java.sql.SQLException;

/**
 *
 * @author Ratita
 */
public interface PerfilDAO {
    public int searchPerfilByName(String name)throws SQLException;
}

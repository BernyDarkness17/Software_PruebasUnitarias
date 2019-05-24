package factories;

import dao.PerfilDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Perfil;

/**
 *
 * @author Ratita
 */
public class MySQL_PerfilDAO implements PerfilDAO {

    private ResultSet rs;
    private String sql;

    MySQL_ConexionDAO c;

    public MySQL_PerfilDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public int searchPerfilByName(String name) throws SQLException {
        sql = "select id from perfil where perfil.perfil like '%" + name + "%'";
        System.out.println(sql);
        Perfil p = new Perfil();

        rs = c.ejecutarSelec(sql);

        if (rs.next()) {
            p.setId(rs.getInt(1));

        }

        int id = p.getId();
        c.close();
        System.out.println(id);
        return id;
    }

}

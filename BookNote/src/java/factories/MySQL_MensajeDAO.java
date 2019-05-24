package factories;

import dao.MensajeDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Mensaje;

public class MySQL_MensajeDAO implements MensajeDAO {

    private ResultSet rs;
    private String sql;
    private List<Mensaje> mensaje;

    MySQL_ConexionDAO c;

    public MySQL_MensajeDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public void create(Mensaje m) throws SQLException {
        sql = "insert into mensaje value(null,'" + m.getTexto() + "','" + m.getFecha() + "'," + m.getId_asignatura() + ")";
        c.ejecutar(sql);
    }

    @Override
    public List<Mensaje> read() throws SQLException {
        sql = "select * from mensaje";

        mensaje = new ArrayList<>();

        Mensaje m;

        rs = c.ejecutarSelec(sql);

        while (rs.next()) {
            m = new Mensaje();

            m.setId(rs.getInt(1));
            m.setTexto(rs.getString(2));
            m.setFecha(rs.getString(3));
            m.setId_asignatura(rs.getInt(4));

            mensaje.add(m);
        }

        c.close();

        return mensaje;
    }

    @Override
    public void update(Mensaje m) throws SQLException {
        sql = "update mensaje set texto = '" + m.getTexto() + "', fecha = " + m.getFecha() + ", id_asignatura = " + m.getId_asignatura() + " where id = " + m.getId() + "";
        c.ejecutar(sql);
    }

    @Override
    public void delete(String id) throws SQLException {
        sql = "delete from mensaje where id=" + id;
        c.ejecutar(sql);
    }

    @Override
    public List<Mensaje> buscar(int exp) throws SQLException {
        sql = "select mensaje.texto, mensaje.fecha from mensaje where mensaje.id_asignatura = " + exp;

        mensaje = new ArrayList<>();
        Mensaje m;
        rs = c.ejecutarSelec(sql);

        while (rs.next()) {
            m = new Mensaje();
            m.setTexto(rs.getString(1));
            m.setFecha(rs.getString(2));

            mensaje.add(m);
        }

        c.close();
        return mensaje;
    }

}

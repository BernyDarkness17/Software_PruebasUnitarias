package factories;

import dao.PruebaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Prueba;

public class MySQL_PruebaDAO implements PruebaDAO {

    private ResultSet rs;
    private String sql;
    private List<Prueba> prueba;

    MySQL_ConexionDAO c;

    public MySQL_PruebaDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public void create(Prueba p) throws SQLException {
        sql = "insert into prueba value(null,'" + p.getNombre() + "'," + p.getNota() + "," + p.getPorcentaje() + "," + p.getId_asignatura() + "," + p.getId_alumno() + ")";
        c.ejecutar(sql);
    }

    @Override
    public List<Prueba> read() throws SQLException {
        sql = "select * from prueba";

        prueba = new ArrayList<>();

        Prueba p;

        rs = c.ejecutarSelec(sql);

        while (rs.next()) {
            p = new Prueba();

            p.setId(rs.getInt(1));
            p.setNombre(rs.getString(2));
            p.setNota(rs.getFloat(3));
            p.setPorcentaje(rs.getFloat(4));
            p.setId_asignatura(rs.getInt(5));
            p.setId_alumno(rs.getInt(6));

            prueba.add(p);
        }

        c.close();

        return prueba;
    }

    @Override
    public void update(Prueba p) throws SQLException {
        sql = "update asignatura_alumno set nombre = '" + p.getNombre() + "', nota = " + p.getNota() + ", porcentaje = " + p.getPorcentaje() + ", id_asignatura = " + p.getId_asignatura() + ", id_alumno = " + p.getId_alumno() + " where id = " + p.getId() + "";
        c.ejecutar(sql);
    }

    @Override
    public void delete(String id) throws SQLException {
        sql = "delete from prueba where id=" + id;
        c.ejecutar(sql);
    }

    @Override
    public List<Prueba> getPorcByNombre(String nombre) throws SQLException {
        sql = "select prueba.porcentaje from prueba where prueba.nombre LIKE '%" + nombre + "%'";

        prueba = new ArrayList<>();

        Prueba p;

        rs = c.ejecutarSelec(sql);

        while (rs.next()) {
            p = new Prueba();

            p.setPorcentaje(rs.getFloat(1));

            prueba.add(p);
        }

        c.close();

        return prueba;
    }

}

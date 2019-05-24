/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import dao.AlumnoApoderadoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.AlumnoApoderado;

/**
 *
 * @author csandoval
 */
public class MYSQL_AlumnoApoderadoDAO implements AlumnoApoderadoDAO {

    private ResultSet rs;
    private String sql;

    MySQL_ConexionDAO c;

    public MYSQL_AlumnoApoderadoDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public void create(AlumnoApoderado aa) throws SQLException {
        sql = "insert into alumnoApoderado value(null,'" + aa.getIdAlumno() + "','" + aa.getIdApoderado() + "')";
        c.ejecutar(sql);
    }

    @Override
    public List<AlumnoApoderado> read() throws SQLException {
        sql = "select * from asistencia";

        List<AlumnoApoderado> alumnoApoderados = new ArrayList<>();

       AlumnoApoderado aa;

        rs = c.ejecutarSelec(sql);

       
            while (rs.next()) {
                aa = new AlumnoApoderado();
                
                aa.setId(rs.getInt(1));
                aa.setIdAlumno(rs.getInt(2));
                aa.setIdApoderado(rs.getInt(3));
                
                alumnoApoderados.add(aa);
            }
        

        c.close();

        return alumnoApoderados;
    }

    @Override
    public void update(AlumnoApoderado aa) throws SQLException {
        sql = "update alumnoApoderado set id_alumno = '" + aa.getIdAlumno() + "', id_apoderado = " + aa.getIdApoderado() + " where id = " + aa.getId() + "";
        c.ejecutar(sql);
    }

    @Override
    public void delete(String id) throws SQLException {
        sql = "delete * from alumnoApoderado where id="+id;
        c.ejecutar(sql);
    }

}

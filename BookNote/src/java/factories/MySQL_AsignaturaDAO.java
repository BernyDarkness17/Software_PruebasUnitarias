package factories;

import dao.AsignaturaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Asignatura;

public class MySQL_AsignaturaDAO implements AsignaturaDAO {

    private ResultSet rs;
    private String sql;
    private List<Asignatura> asignatura;

    MySQL_ConexionDAO c;

    public MySQL_AsignaturaDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public void create(Asignatura as) throws SQLException {
        sql = "insert into asignatura value(null,'" + as.getNombre() + "'," + as.getId_docente() + "," + as.getAsistencia() + ")";
        c.ejecutar(sql);
    }

    @Override
    public List<Asignatura> read() throws SQLException {
        sql = "select * from asignatura";

        asignatura = new ArrayList<>();

        Asignatura as;

        rs = c.ejecutarSelec(sql);

        while (rs.next()) {
            as = new Asignatura();

            as.setId(rs.getInt(1));
            as.setNombre(rs.getString(2));
            as.setId_docente(rs.getInt(3));
            as.setAsistencia(rs.getInt(4));

            asignatura.add(as);
        }

        c.close();

        return asignatura;
    }

    @Override
    public void update(Asignatura as) throws SQLException {
        sql = "update asignatura set nombre = '" + as.getNombre() + "', id_docente = " + as.getId_docente() + ", asistencia = " + as.getAsistencia() + " where id = " + as.getId() + "";
        c.ejecutar(sql);
    }

    @Override
    public void delete(String id) throws SQLException {
        sql = "delete from asignatura where id=" + id;
        c.ejecutar(sql);
    }

    @Override
    public List<Asignatura> asignaturaDocente(int id) throws SQLException {
        sql = "select asignatura.id, asignatura.nombre "
                + "from asignatura "
                + "where id_docente =" + id;

        asignatura = new ArrayList<>();
        Asignatura as;

        rs = c.ejecutarSelec(sql);
        while (rs.next()) {
            as = new Asignatura();

            as.setId(rs.getInt(1));
            as.setNombre(rs.getString(2));
            asignatura.add(as);
        }

        c.close();
        return asignatura;

    }

    @Override
    public List<Asignatura> asignaturaAlumno(int id) throws SQLException {
       sql = "select asignatura.id, asignatura.nombre "
                + "from asignatura, asignatura_alumno, persona "
                + "where asignatura.id = id_asignatura and persona.id = id_alumno "
                + "and id_alumno = " + id;

        asignatura = new ArrayList<>();
        Asignatura asa;

        rs = c.ejecutarSelec(sql);

        while (rs.next()) {
            asa = new Asignatura();

            asa.setId(rs.getInt(1));
            asa.setNombre(rs.getString(2));
            asignatura.add(asa);
        }

        c.close();
        return asignatura;    
    }
    
    @Override
    public List<Asignatura> getAsignaturaProfesor(int idDocente)throws SQLException {
        sql = "select * from asignatura where id_docente = "+idDocente;

        asignatura = new ArrayList<>();

        Asignatura as;

        rs = c.ejecutarSelec(sql);

       
            while (rs.next()) {
                as = new Asignatura();
                
                as.setId(rs.getInt(1));
                as.setNombre(rs.getString(2));
                as.setId_docente(rs.getInt(3));
                as.setAsistencia(rs.getInt(4));
                
                asignatura.add(as);
            }
        

        c.close();


        return asignatura;
    }

}

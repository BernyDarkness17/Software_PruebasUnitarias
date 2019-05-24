package factories;

import dao.Asignatura_alumnoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.AsignaturaAlumno;

public class MySQL_Asignatura_alumnoDAO implements Asignatura_alumnoDAO {

    private ResultSet rs;
    private String sql;
    private List<AsignaturaAlumno> asignatura_alumno;

    MySQL_ConexionDAO c;

    public MySQL_Asignatura_alumnoDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public void create(AsignaturaAlumno asa) throws SQLException {
        sql = "insert into asignatura_alumno value(null," + asa.getId_asignatura() + "," + asa.getId_alumno() + ")";
        c.ejecutar(sql);
    }

    @Override
    public List<AsignaturaAlumno> read() throws SQLException{
        sql = "select * from asignatura_alumno";

        asignatura_alumno = new ArrayList<>();

        AsignaturaAlumno asa;

        rs = c.ejecutarSelec(sql);

       
            while (rs.next()) {
                asa = new AsignaturaAlumno();
                
                asa.setId(rs.getInt(1));
                asa.setId_asignatura(rs.getInt(2));
                asa.setId_alumno(rs.getInt(3));
                
                asignatura_alumno.add(asa);
            }
        

        c.close();

        return asignatura_alumno;
    }

    @Override
    public void update(AsignaturaAlumno asa) throws SQLException {
        sql = "update asignatura_alumno set id_asignatura = '" + asa.getId_asignatura() + "', id_alumno = " + asa.getId_alumno() + " where id = " + asa.getId() + "";
        c.ejecutar(sql);
    }

    @Override
    public void delete(String id) throws SQLException {
        sql = "delete from asignatura_alumno where id=" + id;
        c.ejecutar(sql);
    }

    
    
}

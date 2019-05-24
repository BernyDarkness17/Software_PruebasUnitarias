package factories;

import dao.PruebaSelectDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.PruebaSelect;

public class MySQL_PruebaSelectDAO implements PruebaSelectDAO{

    private ResultSet rs;
    private String sql;
    private List<PruebaSelect> pruebaSelect;

    MySQL_ConexionDAO c;

    public MySQL_PruebaSelectDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }
    
    @Override
    public List<PruebaSelect> getNotasAlumno(int id_alumno) throws SQLException{
        sql = "select asignatura.nombre,prueba.nota from asignatura, prueba where prueba.id_asignatura = asignatura.id and prueba.id_alumno = "+id_alumno;
        
        pruebaSelect = new ArrayList<>();
        
        PruebaSelect ps;
        
        rs = c.ejecutarSelec(sql);
        
        while(rs.next()){
            ps = new PruebaSelect();
            
            ps.setId_asignatura(rs.getString(1));
            ps.setNota(rs.getFloat(2));
            
            pruebaSelect.add(ps);
        }
        c.close();
        
        return pruebaSelect;
    }
}

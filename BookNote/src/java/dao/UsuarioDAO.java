package dao;

import java.sql.SQLException;
import java.util.List;
import model.Usuario;

public interface UsuarioDAO {
    
    void create (Usuario u)throws SQLException;
    List<Usuario> read()throws SQLException;        
    void update (Usuario u)throws SQLException;
    void delete (String id)throws SQLException;
    Usuario logIn(String nick, String pass, int perfil)throws SQLException;
    int getIdLast()throws SQLException;
}

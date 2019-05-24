package factories;

import dao.ConexionDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

public class MySQL_ConexionDAO implements ConexionDAO {
private Connection con; 
    private Statement sen;  
    private ResultSet rs;   

    public MySQL_ConexionDAO(String server, String bd, String user, String pass) throws ClassNotFoundException, SQLException {
       
            String protocolo = "jdbc:mysql://";
            String lineaUser = "user=" + user;
            String lineaPass = "password=" + pass;

            String url = protocolo
                    + server + "/"
                    + bd + "?"
                    + lineaUser + "&"
                    + lineaPass;

            System.out.println(url);

            Class.forName("com.mysql.jdbc.Driver"); 
            con = DriverManager.getConnection(url);
        

    }

    @Override
    public void close() throws SQLException {
       
            sen.close();
        
    }

    @Override
    public void ejecutar(String query) throws SQLException {
       
            sen = con.createStatement();
            sen.executeUpdate(query);
            close();

        

    }

    @Override
    public void conectar() throws SQLException {
        
            sen = con.createStatement();
        
    }

    @Override
    public ResultSet ejecutarSelec(String select) throws SQLException {
        
            System.out.println(select);
            sen = con.createStatement();
            rs = sen.executeQuery(select);
            
        
        return rs;

    }



    
}

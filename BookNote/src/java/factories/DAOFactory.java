package factories;

import dao.AsignaturaDAO;
import dao.Asignatura_alumnoDAO;
import dao.AsistenciaDAO;

import dao.MensajeDAO;
import dao.PerfilDAO;
import dao.PruebaDAO;
import dao.UsuarioDAO;
import exception.MotorNoSoportadoException;
import java.sql.SQLException;
import dao.PersonaDAO;
import dao.PruebaSelectDAO;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }

        return daoFactory;
    }

    public enum Motor {
        MY_SQL,
    }

    public PersonaDAO getPersonaDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_PersonaDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }
    }


    public AsignaturaDAO getAsignaturaDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_AsignaturaDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }
    }

    public Asignatura_alumnoDAO getAsignatura_alumnoDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_Asignatura_alumnoDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }
    }

    public AsistenciaDAO getAsistenciaDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_AsistenciaDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }
    }

 
    public MensajeDAO getMensajeDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_MensajeDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }
    }

    public PruebaDAO getPruebaDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_PruebaDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }
    }
    
    
    public PruebaSelectDAO getPruebaSelectDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_PruebaSelectDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }
    }

    public UsuarioDAO getUsuarioDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_UsuarioDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }
    }
    
    public PerfilDAO getPerfilDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_PerfilDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }
    }

}

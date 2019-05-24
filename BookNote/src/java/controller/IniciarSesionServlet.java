package controller;

import exception.MotorNoSoportadoException;
import factories.DAOFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 *
 * @author pabli
 */
@WebServlet(name = "IniciarSesionServlet", urlPatterns = {"/iniciarSesion.do"})
public class IniciarSesionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String parametro = request.getParameter("parametro");
            if (parametro != null) {
                String user = request.getParameter("txtUsuario");
                String pass = request.getParameter("txtContrasenia");
                String perfilString = request.getParameter("selectperfil");
                int perfil = DAOFactory.getInstance().getPerfilDAO(DAOFactory.Motor.MY_SQL).searchPerfilByName(perfilString);

                Usuario u = DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).logIn(user, pass, perfil);

                if (u != null) {
                    request.getSession().setAttribute("usuario", u);
                    request.getSession().removeAttribute("error");
                    
                    response.sendRedirect("sesion.jsp");

                } else{
                    request.getSession().setAttribute("error", new Error("Datos Incorrectos"));
                    response.sendRedirect("inicio.jsp");
                }
            }

        } catch (MotorNoSoportadoException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(IniciarSesionServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

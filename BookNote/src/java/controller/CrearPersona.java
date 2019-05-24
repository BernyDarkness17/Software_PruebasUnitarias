/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import exception.MotorNoSoportadoException;
import factories.DAOFactory;
import factories.MySQL_PersonaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Persona;
import model.Usuario;

/**
 *
 * @author pabli
 */
@WebServlet(name = "CrearPersona", urlPatterns = {"/crearPersona.do"})
public class CrearPersona extends HttpServlet {

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
            String nombre = request.getParameter("txtNombre");
            String apellido = request.getParameter("txtApellido");
            String perfilString = request.getParameter("selectperfil");

            int perfil = DAOFactory.getInstance().getPerfilDAO(DAOFactory.Motor.MY_SQL).searchPerfilByName(perfilString);

            Usuario u = new Usuario();
            List<Usuario> usuarios = DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).read();

            String nick = nombre.substring(0, 1).toLowerCase().concat(apellido).toLowerCase();
            for (int i = 0; i < usuarios.size(); i++) {

                Usuario us = usuarios.get(i);
                System.out.println(usuarios.get(i).getNickname());
                while (us.getNickname().equalsIgnoreCase(nick)) {
                    int diferenciador = 1; 
                    nick = nick.concat(Integer.toString(diferenciador));
                    diferenciador ++;
                }

            }
            u.setNickname(nick);
            u.setPass("123");
            u.setPerfil(perfil);
            DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).create(u);
            System.out.println(nick);

            Persona p = new Persona();
            p.setNombre(nombre);
            p.setApellido(apellido);
            p.setId_usuario(DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).getIdLast());

            DAOFactory.getInstance().getPersonaDAO(DAOFactory.Motor.MY_SQL).create(p);

            response.sendRedirect("sesion.jsp?userNew="+nick);
        } catch (MotorNoSoportadoException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CrearPersona.class.getName()).log(Level.SEVERE, null, ex);
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

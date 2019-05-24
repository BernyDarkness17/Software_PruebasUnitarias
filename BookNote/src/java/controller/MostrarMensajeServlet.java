/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import exception.MotorNoSoportadoException;
import factories.DAOFactory;
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
import model.Asignatura;
import model.Mensaje;

/**
 *
 * @author Berny
 */
@WebServlet(name = "MostrarMensajeServlet", urlPatterns = {"/mostrarMensaje.do"})
public class MostrarMensajeServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, MotorNoSoportadoException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            int asignatura = Integer.parseInt(request.getParameter("asignatura"));

            List<Mensaje> lista = DAOFactory.getInstance().getMensajeDAO(DAOFactory.Motor.MY_SQL).buscar(asignatura);
            int i = 0;

            out.println("<br><br>");
            out.println("<table>");

            out.println("<tr style='background-color:green'>");
            out.println("<th style= 'color:white'>Num°</th>");
            out.println("<th style= 'color:white'>Mensaje</th>");
            out.println("<th style= 'color:white'>Fecha de envío</th>");
            out.println("</tr>");
            for (Mensaje m : lista) {
                i++;

                out.println("<tr>");
                out.println("<td>" + i + "</td>");
                out.println("<td>" + m.getTexto() + "</td>");
                out.println("<td>" + m.getFecha()+ "</td>");
                out.println("</tr>");

//                out.println("<h3>"+m.getTexto()+"</h3>");
//                System.out.println("mensaje: "+m.getTexto());
            }
            out.println("</table>");

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
        try {
            processRequest(request, response);
        } catch (MotorNoSoportadoException ex) {
            Logger.getLogger(MostrarMensajeServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MostrarMensajeServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarMensajeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (MotorNoSoportadoException ex) {
            Logger.getLogger(MostrarMensajeServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MostrarMensajeServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarMensajeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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

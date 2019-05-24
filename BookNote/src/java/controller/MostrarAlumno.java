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
import model.Persona;
import model.Prueba;

/**
 *
 * @author Alex971
 */
@WebServlet(name = "CargarAlumnosServlet", urlPatterns = {"/mostrarAlumno.do"})
public class MostrarAlumno extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, MotorNoSoportadoException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String filtro = request.getParameter("filtro");

            List<Persona> personas = DAOFactory.getInstance().getPersonaDAO(DAOFactory.Motor.MY_SQL).getNameByAsignatura(filtro);
            out.println(" Alumno:"
                    + "<select class=\"form-control\" name=\"selAlumno\" id=\"selectAlumno\">");
            for (Persona p : personas) {

                out.println("<option  value=" + p.getNombre() + " " + p.getApellido() + ">" + p.getNombre() + " " + p.getApellido() + "</option>");

            }
            out.println("</select>\n");
            
            
            //response.sendRedirect("docenteNota.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (MotorNoSoportadoException ex) {
            Logger.getLogger(MostrarAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MostrarAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (MotorNoSoportadoException ex) {
            Logger.getLogger(MostrarAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MostrarAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarAlumno.class.getName()).log(Level.SEVERE, null, ex);
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

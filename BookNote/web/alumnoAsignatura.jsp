<%@page import="model.Persona"%>
<%@page import="model.Asignatura"%>
<%@page import="java.util.List"%>
<%@page import="factories.DAOFactory"%>
<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <title>BookNote</title>
    </head>
    <%
        Usuario u = (Usuario) request.getSession().getAttribute("usuario");

        if (u == null) {
            request.getSession().setAttribute("error", new Error("Debe Ingresar sus Credenciales"));
            request.getRequestDispatcher("inicio.jsp").forward(request, response);
        }


    %>
    <style>
        .navbar-nav.navbar-center {
            position: absolute;
            left: 50%;
            transform: translatex(-50%);
        }

        .navbar-header{
            padding-top: 7px; 
            padding-left: 10px
        }

        .navbar-custome{
            background: #48BD48;
            font-weight: bolder;
            color: white;

        }

    </style>

    <body>


        <nav class="navbar navbar-default navbar-fixed-top navbar-custome" role="navigation">

            <div class="navbar-header">
                <a href="#" class="navbar-left">
                    <!-- <span><img width=80px height=35px src=""></span> LOGO-->
                </a>
            </div>
            <p class="navbar-text pull-left"><a href="sesion.jsp" style="text-decoration:none;color: #465346" > BookNote</a></p>

            <ul class="nav navbar-nav navbar-center">
                <li>
                    <%                        if (u.getPerfil() == 1) {
                    %>

                <li>
                    <a href="crearPersona.jsp">Crear Persona</a>
                </li>

                <li>
                    <a href="crearAsignaturaD.jsp">Añadir Asignatura</a>
                </li>

                <%
                    }
                %></li>

                <li>
                    <%
                        if (u.getPerfil() == 2) {
                    %>
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Notas<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="docenteNota.jsp">Ingresar Nota</a></li>
                        <li><a href="docenteMod.jsp">Modificar Nota</a></li>
                    </ul>
                </li>
                <li>
                    <a href="docenteAsistencia.jsp">Asistencia</a>
                </li>

                <li>
                    <a href="docenteMensaje.jsp">Mensajes</a>
                </li>
                <%
                    }
                %> </li>  

                <%
                    if (u.getPerfil() == 3) {
                %>

                <li>
                    <a href="alumnoNota.jsp">Ver Notas</a>
                </li>

                <li>
                    <a href="alumnoMensaje.jsp">Avisos del Profesor</a>
                </li>

                <li>
                    <a href="alumnoAsignatura.jsp">Registrar Asignatura</a>
                </li>
                
                <li>
                    <a href="alumnoContrasenia.jsp">Cambiar Contraseña</a>
                </li>

                <%
                    }
                %>

                <%
                    if (u.getPerfil() == 4) {
                %>

                <li>
                    <a href="papasAsistencia.jsp">Asistencia</a>
                </li>

                <li>
                    <a href="papasNotas.jsp">Notas</a>
                </li>

                <%
                    }
                %>


            </ul>

            <ul class="nav navbar-nav navbar-right" style="padding-right: 10px">
                <li>
                    <form class="navbar-form pull-right" action="cerrarSesionServlet.do">
                        <button type="submit" class="btn btn-danger">Cerrar sesión</button>
                    </form>
                </li>
            </ul>
        </nav>

        <br><br><br>
        <br><br><br>

        <div class="container">
            <div class="jumbotron" style="border-radius: 10px 10px 10px 10px">
                <div class="row justify-content-xl-center">
                    <div class="col-md-6 col-md-offset-3">
                        <form action="crearAlumnoAsigntura.do" method="post" >

                            <%
                                int id_Alum = DAOFactory.getInstance().getPersonaDAO(DAOFactory.Motor.MY_SQL).getIdAlumno(u.getId());

                                out.println("<input name='id_alum' type='hidden' value='" + id_Alum + "'>");

                                System.out.print(id_Alum);

                            %>


                            <div class="form-group">
                                asignatura:
                                <select class="form-control" name ="selectAsignatura" >
                                    <%                                        
                                        List<Asignatura> asignatura = DAOFactory.getInstance().getAsignaturaDAO(DAOFactory.Motor.MY_SQL).read();
                                        for (Asignatura a : asignatura) {
                                            out.println("<option name='id_asig' value='" + a.getId() + "'>" + a.getNombre() + "</option>");
                                            
                                            System.out.print(a.getId());
                                        }

                                    %>
                                </select>
                            </div>


                            <center>
                                <button  class="btn btn-primary navbar-custome" type="submit" value="Iniciar Sesion" name="iniciarsesion">
                                    Añadir Asignatura
                                </button>
                                <a href="sesion.jsp" class="btn btn-primary navbar-custome" role="button" aria-pressed="false" >Volver</a>
                            </center>

                        </form>
                    </div>
                </div>
            </div>
    </body>
</html>

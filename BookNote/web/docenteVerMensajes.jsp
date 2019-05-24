<%-- 
    Document   : docenteVerMensajes
    Created on : 18/05/2018, 04:13:53 PM
    Author     : Berny
--%>

<%@page import="model.Asignatura"%>
<%@page import="model.Persona"%>
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

        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }



    </style>
    <body>
        <br><br><br>
        <nav class="navbar navbar-default navbar-fixed-top navbar-custome" role="navigation">

            <div class="navbar-header">
                <a href="#" class="navbar-left">
                    <!-- <span><img width=80px height=35px src=""></span> LOGO--> 
                </a>
            </div>
            <p class="navbar-text pull-left"><a href="sesion.jsp" style="text-decoration:none;color: #465346" > BookNote</a></p>

            <ul class="nav navbar-nav navbar-center">
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Notas<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="docenteNota.jsp">Ingresar Nota</a></li>
                        <li><a href="docenteMod.jsp">Modificar Nota</a></li>
                    </ul>

                <li>
                    <a href="docenteAsistencia.jsp">Asistencia</a>
                </li>

                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Mensajes<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="docenteMensaje.jsp">Enviar mensajes</a></li>
                        <li><a href="docenteVerMensajes.jsp">Ver mensajes</a></li>
                    </ul>
                </li>
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
        <div class="container">
            <div class="jumbotron" style="border-radius: 10px 10px 10px 10px">
                <center><h1>Mensajes enviados</h1></center>
                <div class="row justify-content-xl-center">
                    <div class="col-md-6 col-md-offset-3">
                        Asignatura correspondiente:
                        <label for="cboAsignatura"></label><span class="text-danger"></span>
                        <select class="form-control" id="aaa" name="cboAsignatura" onclick="mostrarMensaje()">
                            <%
                                Usuario u = (Usuario) request.getSession().getAttribute("usuario");
                                Persona p = DAOFactory.getInstance().getPersonaDAO(DAOFactory.Motor.MY_SQL).searchNameByUser(u.getId());
                                int id = p.getId();
                                for (Asignatura a : DAOFactory.getInstance().getAsignaturaDAO(DAOFactory.Motor.MY_SQL).asignaturaDocente(id)) {
                                    out.println("<option value='" + a.getId() + "'>" + a.getNombre() + "</option>");
                                }
                            %>
                        </select>  
                        <div class="form-group" id="resultadoo">
                        </div>
                    </div>
                    <a href="sesion.jsp" class="btn btn-primary navbar-custome" role="button" aria-pressed="false" style="margin-top: 18px" >
                        Volver a inicio
                    </a>
                </div>
            </div>
        </div>
        <script src="js/jquery-3.2.1.min.js"></script>
        <script>


                            function mostrarMensaje() {
                                var asign = $("#aaa").val();
                                $.ajax({
                                    url: "mostrarMensaje.do",
                                    data: {
                                        asignatura: asign
                                    },
                                    success: function (resulta) {
                                        $("#resultadoo").html(resulta);
                                    }
                                });
                            }
        </script>
    </body>
</html>

<%@page import="model.Asignatura"%>
<%@page import="java.util.List"%>
<%@page import="model.Persona"%>
<%@page import="model.Usuario"%>
<%@page import="factories.DAOFactory"%>
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
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    %>
    <script>
        $(function () {
            $("#fechaNacimiento").datepicker();
            $("#fechaNacimiento").datepicker({
                dateFormat: "dd-mm-yy"
            });

            // Getter
            var dateFormat = $("#fechaNacimiento").datepicker("option", "dateFormat");

            // Setter
            $("#fechaNacimiento").datepicker("option", "dateFormat", "dd 'de' MM 'de' yy");
        });
    </script>

    <script>
        // español
        $.datepicker.regional['es'] = {
            closeText: 'Cerrar',
            prevText: '<Ant',
            nextText: 'Sig>',
            currentText: 'Hoy',
            monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
            monthNamesShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
            dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
            dayNamesShort: ['Dom', 'Lun', 'Mar', 'Mié', 'Juv', 'Vie', 'Sáb'],
            dayNamesMin: ['Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sá'],
            weekHeader: 'Sm',
            dateFormat: 'dd/mm/yy',
            firstDay: 1,
            isRTL: false,
            showMonthAfterYear: false,
            yearSuffix: '',
            changeMonth: true,
            changeYear: true,
            yearRange: "-100:+0",
            maxDate: "+0m"
        };
        $.datepicker.setDefaults($.datepicker.regional['es']);

    </script>

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
                <center><h1>Asistencia</h1></center>
                <div class="row justify-content-xl-center">
                    <div class="col-md-6 col-md-offset-3">
                        <div>
                            <!--   <input class="form-control" id="fechaNacimiento" name="txtFechaNacimineto" readonly="" required="required">-->
                        </div>
                        <br>
                        Asignatura:
                        <select name="selAsignatura" class="form-control" id="select" onclick="buscar()">
                            <%
                                Persona per = DAOFactory.getInstance().getPersonaDAO(DAOFactory.Motor.MY_SQL).searchNameByUser(u.getId());

                                List<Asignatura> asignaturas = DAOFactory.getInstance().getAsignaturaDAO(DAOFactory.Motor.MY_SQL).getAsignaturaProfesor(per.getId());
                                for (Asignatura a : asignaturas) {
                                    out.println("<option class='form-control' value=" + a.getId() + ">" + a.getNombre() + "</option>");
                                }
                            %>
                        </select>
                        <br>
                        <form action="crearAsistencia.do" method="post">
                            <div class="form-group" id="resultado">

                            </div>

                            <center>
                                <button  class="btn btn-primary navbar-custome" type="submit" value="Registrar Usuario" name="registrar">
                                    Guardar Cambios
                                </button>
                                <a href="sesion.jsp" class="btn btn-primary navbar-custome" role="button" aria-pressed="false" >Volver</a>

                            </center>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
                            function buscar() {
                                //Rescata lo que el usuario escribio
                                var opFiltro = $("#select").val();
                                $.ajax({
                                    url: "mostrarAlumnosAsignatura.do",
                                    data: {
                                        filtro: opFiltro
                                    },
                                    success: function (result) {
                                        $("#resultado").html(result);
                                    }
                                });
                            }



    </script>
    
    
</html>

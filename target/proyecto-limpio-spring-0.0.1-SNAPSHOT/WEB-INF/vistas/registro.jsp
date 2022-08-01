<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--    <meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1">--%>

<%--    <!-- Add icon library -->--%>
<%--    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">--%>
<%--    <style>--%>
<%--        body {font-family: Arial, Helvetica, sans-serif;}--%>
<%--        * {box-sizing: border-box;}--%>

<%--        .input-container {--%>
<%--            display: -ms-flexbox; /* IE10 */--%>
<%--            display: flex;--%>
<%--            width: 100%;--%>
<%--            margin-bottom: 15px;--%>
<%--        }--%>

<%--        .icon {--%>
<%--            padding: 10px;--%>
<%--            background: dodgerblue;--%>
<%--            color: white;--%>
<%--            min-width: 50px;--%>
<%--            text-align: center;--%>
<%--        }--%>

<%--        .input-field {--%>
<%--            width: 100%;--%>
<%--            padding: 10px;--%>
<%--            outline: none;--%>
<%--        }--%>

<%--        .input-field:focus {--%>
<%--            border: 2px solid dodgerblue;--%>
<%--        }--%>

<%--        /* Set a style for the submit button */--%>
<%--        .btn {--%>
<%--            background-color: dodgerblue;--%>
<%--            color: white;--%>
<%--            padding: 15px 20px;--%>
<%--            border: none;--%>
<%--            cursor: pointer;--%>
<%--            width: 100%;--%>
<%--            opacity: 0.9;--%>
<%--        }--%>

<%--        .btn:hover {--%>
<%--            opacity: 1;--%>
<%--        }--%>
<%--    </style>--%>

<%--    <title>Registro</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--<form action="registrarUsuario" method="post" modelAttribute="usuario"  style="max-width:500px;margin:auto">--%>
<%--    <h2>Register Form</h2>--%>


<%--&lt;%&ndash;    <div class="input-container">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <i class="fa fa-user icon"></i>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <input class="input-field" type="text" placeholder="Username" name="username">&ndash;%&gt;--%>
<%--&lt;%&ndash;    </div>&ndash;%&gt;--%>

<%--    <div class="input-container">--%>
<%--        <i class="fa fa-envelope icon"></i>--%>
<%--        <input class="input-field" type="text" placeholder="Email" name="email">--%>
<%--    </div>--%>

<%--    <div class="input-container">--%>
<%--        <i class="fa fa-key icon"></i>--%>
<%--        <input class="input-field" type="password" placeholder="Password" name="password">--%>
<%--    </div>--%>

<%--    <button type="submit" class="btn">Registrar</button>--%>
<%--</form>--%>

<%--</body>--%>
<%--</html>--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <%--	CSS		--%>
        <%--		<link href="<c:url value="/css/index.css" />">--%>
        <%--	Bootstrap	--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <%--	Icono	--%>
        <link rel="icon" type="image/png" href="<c:url value="/images/logo.png"/>">
        <title>Knock Out!</title>
    </head>
    <body>
        <img src="<c:url value="/images/img3.webp" />" style="width: 100%">

        <section class="container-fluid w-100 d-flex justify-content-center align-items-center home" style="margin: -716px 0 310px 0;">
            <div class="d-flex justify-content-center d-flex flex-row mt-4 botones">
                <div class="row justify-content-center align-items-center" style="width: 56%;">
                    <div class="col-auto bg-light p-5 rounded-3 shadow-lg">
                        <div class="d-flex align-items-center">
                            <img src="<c:url value="/images/logo.png" />" style="width: 14%; margin-right: 4%;">
                            <h3 class="form-signin-heading">
                                Registrarme en Knock Out!
                            </h3>
                        </div>
                        <hr class="colorgraph">

                        <form action="registrarUsuario" method="post" modelAttribute="usuario">
                            <div class="input-group p-2 d-flex align-items-center">
                                <input class="form-control" type="text" placeholder="Email" name="email">
                            </div>
                            <div class="input-group p-2 d-flex align-items-center">
                                <input class="form-control" type="password" placeholder="Password" name="password">
                            </div>
                            <br>
                            <button type="submit" class="btn btn-primary w-100">Registrarme</button>
                        </form>
                        <br>

                        <%--Bloque que es visible si el elemento error no esta vacio	--%>
                        <c:if test="${not empty error}">
                            <h4><span>${error}</span></h4>
                            <br>
                        </c:if>
                        ${msg}
                    </div>
                </div>
            </div>
        </section>

        <a href="login" class="btn btn-success position-absolute top-0 end-0" role="button" aria-pressed="true" style="margin: 2% 6% 0 0;">
            Iniciar Sesi&oacute;n
        </a>

        <%@include file="partial/footer.jsp"%>
    </body>
</html>
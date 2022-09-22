<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
    <link href="css/homeDos.css" rel="stylesheet" />
    <script src="https://kit.fontawesome.com/b7aa95e782.js" crossorigin="anonymous"></script>
    <meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8″ />
    <title>Knock Out!</title>
</head>
<body>
<nav class="navbar navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="homeAdmin">
            <img src="<c:url value="/images/logo.png"/>" style="width: 8%; margin-left: 1%;">
            Knock Out!
        </a>
    </div>
</nav>

<div class="container">
    <h2>Control de Usuarios</h2>

    <div class="row">

        <div class="col">
            <table class="table" style="width: 80%">
                <tr>
                    <th scope="col">Email</th>
                    <th scope="col">Activo</th>
                    <th scope="col">Nivel</th>
                    <th scope="col">Editar</th>
                    <th scope="col">Activar/Desactivar</th>
                </tr>

                <c:forEach var="usuario" items="${usuarios}">
                    <tr>
                        <td>${usuario.email}</td>
                        <td>${usuario.activo}</td>
                        <td class="text-center">${usuario.nivel.numero}</td>
                        <td class="text-center"><a><i class="fas fa-pencil-alt"></i></a></td>
                        <td class="text-center">
                            <c:if test="${usuario.activo == false}">
                                <a href="cambio-estado?id=${usuario.id}" class="text-decoration-none">Activar</a>
                            </c:if>
                            <c:if test="${usuario.activo == true}">
                                <a  href="cambio-estado?id=${usuario.id}" class="text-decoration-none">Desactivar</a>
                            </c:if>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <c:if test="${empty usuarios}">
                        <td></td>
                        <td>No existen usuarios</td>
                        <td></td>
                    </c:if>
                </tr>
            </table>
        </div>

        <div class="col">
            <div class="card" style="width: 18rem;">
                <div class="card-header">
                    Ranking <i class="fas fa-medal"></i>
                </div>
                <table class="table"style="margin-bottom:0">
                    <tr>
                        <th scope="col">Jugador</th>
                        <th scope="col">Nivel</th>
                    </tr>

                    <c:forEach var="maximos" items="${max}">
                        <tr>
                            <td>${maximos.email}</td>
                            <td class="text-center">${maximos.nivel.numero}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>

        <div class="col mt-4">
            <div class="card mb-3" style="max-width: 18rem;">
                <div class="card-header">Jugador con maximo nivel <i class="fas fa-crown"></i> </div>
                <div class="card-body">
                    <h5 class="card-text">${maximo.email}</h5>
                    <h5 class="card-text text-center">Nivel: ${maximo.nivel.numero}</h5>
                </div>
            </div>
        </div>
    </div>
</div>




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="js/homeDos.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
</body>
</html>
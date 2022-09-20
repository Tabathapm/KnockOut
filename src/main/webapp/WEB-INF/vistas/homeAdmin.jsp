<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
    <link href="css/homeDos.css" rel="stylesheet" />
    <script src="https://kit.fontawesome.com/b7aa95e782.js" crossorigin="anonymous"></script>
    <link rel="icon" type="image/png" href="<c:url value="/images/logo.png"/>">
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

<h1>Jugador con maximo nivel</h1>
<h3>${maximo.email}</h3>
<h3>${maximo.nivel.numero}</h3>


<div class="container">
    <h2>Control de Usuarios</h2>

    <div class="row">

        <div class="col">
            <table class="table" style="width: 80%">
                <tr>
                    <th scope="col">Email</th>
                    <th scope="col">Activo</th>
                    <th scope="col">Nivel</th>
                </tr>

                <c:forEach var="usuario" items="${usuarios}">
                    <tr>
                        <td>${usuario.email}</td>
                        <td>${usuario.activo}</td>
                        <td>${usuario.nivel.numero}</td>
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
            Ranking <i class="fas fa-crown"></i>
        </div>
       <table class="table">
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
    </div>

</div>




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="js/homeDos.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
</body>
</html>

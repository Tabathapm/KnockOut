<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
    <link href="css/homeDos.css" rel="stylesheet" />
    <%--		<link href="<c:url value="/resources/css/homeDos.css"/>" rel="stylesheet" />--%>
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
    <%--	Icono	--%>
    <link rel="icon" type="image/png" href="<c:url value="/images/logo.png"/>">
    <title>Knock Out!</title>

    <style>
        .bcontent {
            margin-top: 10px;
        }
    </style>
</head>

<body class="sb-nav-fixed">
<%@include file="partial/navBar.jsp"%>
<%-- ------------------------ --%>
<%-- ------------------------ --%>
<div id="layoutSidenav">
    <%@include file="partial/sidebar.jsp"%>

    <div id="layoutSidenav_content">
        <main>
            <div>
                <div class="container position-absolute top-0 start-0" style="margin: 3% 0 0  18%">
                    <%--							<h1 class="mt-4">Bienvenidos a Knock Out!</h1>--%>

                        <div class="container bcontent">
                            <h2>Comprar Monedas</h2>
<%--                            <hr />--%>
                            <div class="card-group">
                                <div class="card">
                                    <img src="images/dollar.png">
                                    <div class="card-body">
                                        <h5 class="card-title">500 Monedas</h5>
                                        <p class="card-text">Comprar 500 monedas a tan solo $.</p>
                                    </div>
                                    <a href="pagoMonedas" class="btn btn-success" role="button" aria-pressed="true">
                                        Comprar 500 monedas
                                    </a>
                                </div>
                                <div class="card">
                                    <img src="images/dollar.png">
                                    <div class="card-body">
                                        <h5 class="card-title">1000 Monedas</h5>
                                        <p class="card-text">Comprar 1000 monedas a tan solo $.</p>
                                    </div>

                                        <button type="button" class="btn btn-primary" href="pagoMonedas" >Comprar 1000 monedas</button>

                                </div>
                                <div class="card">
                                    <img src="images/dollar.png">
                                    <div class="card-body">
                                        <h5 class="card-title">2000 Monedas</h5>
                                        <p class="card-text">Comprar 2000 monedas a tan solo $.</p>
                                    </div>

                                        <button type="button" class="btn btn-primary" href="pagoMonedas" >Comprar 2000 monedas</button>

                                </div>
                            </div>
                        </div>

                </div>



            </div>
        </main>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="js/homeDos.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
</body>
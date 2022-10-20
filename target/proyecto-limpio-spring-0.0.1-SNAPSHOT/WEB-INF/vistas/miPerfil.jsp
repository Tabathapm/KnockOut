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
</head>
<body class="sb-nav-fixed">
<%@include file="partial/navBar.jsp"%>
<%-- ------------------------ --%>
<%-- ------------------------ --%>
<div id="layoutSidenav">
    <%@include file="partial/sidebar.jsp"%>

    <div id="layoutSidenav_content">
        <main>
            <img src="<c:url value="/images/fondoMiPerfil.jpg" />" style="width: 100%" class="opacity-50">

            <div class="container pt-5" style="width: 36%; margin: -606px 0 0 420px;z-index: 100;position: absolute;">
                <div class="card text-center">
                    <div class="card-header">
                        Mi Perfil
                    </div>
                    <div class="card-body">
                        <div class="row g-3 align-items-center" id="formulario" enctype="multipart/form-data">
                            <form action="#" method="post">
                                <div class="col-auto d-flex p-2">
                                    <label for="email" class="col-form-label px-2">Email:</label>
                                    <input type="text" id="email" class="form-control px-2" name="email" placeholder="${usuario.email}" disabled>
                                </div>

                                <div class="col-auto d-flex p-2">
                                    <label for="nivel" class="col-form-label px-2">Nivel N&#176;:</label>
                                    <input type="text" id="nivel" class="form-control px-2" name="nivel" placeholder="${usuario.nivel.numero}" disabled style="width: 83%;">
                                </div>

                            </form>
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
</html>

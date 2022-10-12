<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="es">

<head>
    <meta charset='utf-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <title>Combate</title>

    <link href='https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css' rel='stylesheet'>
    <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css' rel='stylesheet'>
    <style></style>
    <script type='text/javascript' src=''></script>
    <script type='text/javascript' src='https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js'></script>
    <script type='text/javascript' src='https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js'></script>
    <style>

        body {
            background-image:url( "<c:url value="/images/fondo1.png" />");
            background-repeat: no-repeat;
        }

    </style>
    <link rel="stylesheet" href="css/combate.css">
</head>

<body oncontextmenu='return false' class='snippet-body'>
<div class="d-flex " style="margin-left: 10px;">
    <a href="home"><button type="button" class="btn btn-danger mt-3">Salir</button></a>
</div>
<section class="fondo">
    <div class="duelo mt-5 d-flex" style="justify-content: space-around">
        <c:if test="${not empty personajeElegido}">
            <div class="cartaDuelo">
                <div class="borde">

                    <img src="<c:url value="/images/personajes/${personajeElegido.imagen}" />" alt="">


                </div>
                <div class="text-white text-center nombre">
                    <h4>${personaje.nombre}</h4>
                </div>
                <div class="puntaje mt-2">
                    <div class="fondoP d-flex">
                        <img src="images/espadas.png" alt="" style="height: 50px;">
                        <h4>100</h4>
                    </div>
                    <div class="fondoP d-flex">
                        <img src="images/escudo.png" alt="" style="height: 50px;">
                        <h4>500</h4>
                    </div>
                </div>
            </div>
            <div class="d-flex colvs" style="flex-direction: column;justify-content: inherit;">
                <img src="images/imgVs.png" style="height: 100px;transform: scale(1.7);" class="mt-5 vs">
                <button type="button" class="btn btn-danger mb-5">Atacar</button>
            </div>

            <div class="cartaIa">
                <div class="borde">
                    <img src="<c:url value="/images/personajes/batman_.jpg" />" alt="">

                </div>
                <div class="text-white text-center nombre">
                    <h4>Batman</h4>
                </div>
                <div class="puntaje mt-2">
                    <div class="fondoP d-flex">
                        <img src="images/espadas.png" alt="" style="height: 50px;">
                        <h4>100</h4>
                    </div>
                    <div class="fondoP d-flex">
                        <img src="images/escudo.png" alt="" style="height: 50px;">
                        <h4>500</h4>
                    </div>
                </div>
            </div>
        </c:if>
    </div>
</section>
<section class="pt-5 pb-5 fondo1">
    <div class="container misCartas">
        <div class="row pb-5 mb-4">
            <div>
                <h3 class="mb-3 text-white">Mis personajes,selecciona uno</h3>
            </div>
            <%--    SE RECORRE LA LISTA     --%>
            <c:forEach items="${personajes}" var="personaje">

                <%--    POR CADA PERSONAJE SE CREA UNA TARJETA    --%>
                <div class="col-lg-3 col-md-6 mb-4 mb-lg-0 pb-5">
                    <div class="card shadow-sm border-1 shadow-lg rounded">
                        <div class="card-body p-0">
                            <img src="<c:url value="/images/personajes/${personaje.imagen}" />" class="w-100 card-img-top">
                            <div class="p-4">
                                <h5 class="mb-0 text-center">${personaje.nombre}</h5>
                                <br>
                                <div style="display: flex; justify-content: space-evenly;">
                                    <a href="seleccionPersonaje?id=${personaje.id} " class="btn btn-primary" role="button">Seleccionar</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</section>
<script type='text/javascript'></script>
</body>

</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
    <link href="css/homeDos.css" rel="stylesheet" />
    <link href="css/miColeccion.css" rel="stylesheet" />
    <%--		<link href="<c:url value="/resources/css/homeDos.css"/>" rel="stylesheet" />--%>
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
    <%--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">--%>
    <%--    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>--%>
    <%--	Icono	--%>
    <link rel="icon" type="image/png" href="<c:url value="/images/logo.png"/>">
    <title>Knock Out!</title>

    <style>
      .card{
        border-radius: 4px;
        background: #fff;
        box-shadow: 0 6px 10px rgba(0,0,0,.08), 0 0 6px rgba(0,0,0,.05);
        transition: .3s transform cubic-bezier(.155,1.105,.295,1.12),.3s box-shadow,.3s -webkit-transform cubic-bezier(.155,1.105,.295,1.12);
        cursor: pointer;
      }

      .card:hover{
        transform: scale(1.05);
        box-shadow: 0 10px 20px rgba(0,0,0,.12), 0 4px 8px rgba(0,0,0,.06);
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

          <div class="container py-3">
            <!-- -->
            <header class="text-center mb-5">
              <h1 class="display-4 font-weight-bold">Comics</h1>
              <p class="font-italic text-muted mb-0">

              </p>
            </header>

            <div class="row pb-5 mb-4">
              <%--    SE RECORRE LA LISTA     --%>
              <c:forEach items="${comics}" var="comic">

                  <%--    POR CADA PERSONAJE SE CREA UNA TARJETA    --%>
                  <div class="col-lg-3 col-md-6 mb-4 mb-lg-0 pb-5">
                    <div class="card shadow-sm border-1 shadow-lg rounded">
                      <div class="card-body p-0">
                        <img src="<c:url value="/images/portadas/${comic.portada}" />" class="w-100 card-img-top">
                        <div class="p-4">
                          <h5 class="mb-0 text-center">${comic.titulo}</h5>
                          <br>
                          <div style="display: flex; justify-content: space-evenly;">
                            <a href="<c:url value="/comics/${comic.pdf}" />" download="${comic.pdf}" class="btn btn-success" role="button">
                              Descargar
                            </a>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
              </c:forEach>
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

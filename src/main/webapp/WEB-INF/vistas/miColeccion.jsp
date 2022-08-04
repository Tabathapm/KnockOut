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

            <div class="container py-3">
                <!-- For Demo Purpose-->
                <header class="text-center mb-5">
                    <h1 class="display-4 font-weight-bold">Mi Colecci&oacute;n</h1>
                    <p class="font-italic text-muted mb-0">
                        Ac&aacute; vas a poder ver todos los personajes que ten&eacute;s en tu colecci&oacute;n.
                    </p>
                </header>

                <!--  -->
                <div class="row pb-5 mb-4">
                    <div class="col-lg-3 col-md-6 mb-4 mb-lg-0">
                        <!-- Tarjeta -->
                        <div class="card shadow-sm border-0 rounded">
                            <div class="card-body p-0"><img src="https://bootstrapious.com/i/snippets/sn-cards/profile-1_dewapk.jpg" alt="" class="w-100 card-img-top">
                                <div class="p-4">
                                    <h5 class="mb-0">Mark Rockwell</h5>
                                    <p class="small text-muted">CEO - Consultant</p>
                                    <div>
                                        <button type="button" class="btn btn-warning">Ver m&aacute;s</button>
                                        <button type="button" class="btn btn-success">Vender</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-6 mb-4 mb-lg-0">
                        <!-- Card-->
                        <div class="card shadow-sm border-0 rounded">
                            <div class="card-body p-0"><img src="https://bootstrapious.com/i/snippets/sn-cards/profile-3_ybnq8v.jpg" alt="" class="w-100 card-img-top">
                                <div class="p-4">
                                    <h5 class="mb-0">Mark Rockwell</h5>
                                    <p class="small text-muted">CEO - Consultant</p>
                                    <div>
                                        <button type="button" class="btn btn-warning">Ver m&aacute;s</button>
                                        <button type="button" class="btn btn-success">Vender</button>
                                        <button type="button" class="btn btn-danger">Borrar</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-6 mb-4 mb-lg-0">
                        <!-- Card-->
                        <div class="card shadow-sm border-0 rounded">
                            <div class="card-body p-0"><img src="https://bootstrapious.com/i/snippets/sn-cards/profile-2_ujssbj.jpg" alt="" class="w-100 card-img-top">
                                <div class="p-4">
                                    <h5 class="mb-0">Mark Rockwell</h5>
                                    <p class="small text-muted">CEO - Consultant</p>
                                    <div>
                                        <button type="button" class="btn btn-warning">Ver m&aacute;s</button>
                                        <button type="button" class="btn btn-success">Vender</button>
                                        <button type="button" class="btn btn-danger">Borrar</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-6 mb-4 mb-lg-0">
                        <!-- Card-->
                        <div class="card shadow-sm border-0 rounded">
                            <div class="card-body p-0"><img src="https://res.cloudinary.com/mhmd/image/upload/v1570799922/profile-2_ujssbj.jpg" alt="" class="w-100 card-img-top">
                                <div class="p-4">
                                    <h5 class="mb-0">Mark Rockwell</h5>
                                    <p class="small text-muted">CEO - Consultant</p>
                                    <div>
                                        <button type="button" class="btn btn-warning">Ver m&aacute;s</button>
                                        <button type="button" class="btn btn-success">Vender</button>
                                        <button type="button" class="btn btn-danger">Borrar</button>
                                    </div>
                                </div>
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
</html>

<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: warhe
  Date: 25/10/2022
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:if test ="${not empty ganador}">
    <h1> ${ganador} </h1>
</c:if>

<c:if test ="${not empty derrota}">
    <h1> ${derrota} </h1>
</c:if>


${usuario.userName} : ${resultadoUsuario}
<br>
Rival : ${resultadoBoot}

</body>
</html>

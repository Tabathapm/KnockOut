<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <%--	Bootstrap	--%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <%--	Icono	--%>
    <link rel="icon" type="image/png" href="<c:url value="/images/logo.png"/>">
    <title>Knock Out!</title>
    <style>
      input[type=number]::-webkit-inner-spin-button,
      input[type=number]::-webkit-outer-spin-button {
        -webkit-appearance: none;
        margin: 0;
      }

      body{
        background-color: darkslategrey;
      }
    </style>
  </head>
  <body>
    <section class="container-fluid w-100 d-flex justify-content-center align-items-center">
      <div class="d-flex justify-content-center d-flex flex-row mt-4 botones">
        <div class="row justify-content-center align-items-center" style="width: 56%;">
          <div class="col-auto bg-light p-5 rounded-3 shadow-lg">
            <div class="d-flex align-items-center">
              <img src="<c:url value="/images/logo_pago.png" />" style="width: 14%; margin-right: 4%;">
              <h3 class="form-signin-heading" style="margin-left: 32px">
                Medio de pago
              </h3>
            </div>
            <hr class="colorgraph">

            <form action="validar-pago" method="POST" modelAttribute="datosDePago">
                <input type="hidden" name="montoElegido" value="${montoElegido}">
              <br>
              <div class="row">
                <div class="col-12">
                  <label>N&uacute;mero de tarjeta</label>
                  <input id="numTarjeta" type="number" class="form-control" maxlength="16" oninput="if(this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);">
                </div>
              </div>
              <br>
              <div class="row">
                <div class="col-12">
                  <label>Nombre y apellido</label>
                  <input type="text" id="nombreTitular" class="form-control">
                </div>
              </div>
              <br>
              <div class="row">
                <div class="col-sm">
                  <label>Mes</label>
                  <br>
                  <select name="mes" id="mes" class="form-select">
                    <option selected disabled> --- </option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                  </select>
                </div>

                <div class="col-sm">
                  <label>A&ntilde;o</label>
                  <select name="anio" id="anio" class="form-select">
                    <option selected disabled> --- </option>
                    <option value="2024">2024</option>
                    <option value="2025">2025</option>
                    <option value="2026">2026</option>
                    <option value="2027">2027</option>
                    <option value="2028">2028</option>
                    <option value="2029">2029</option>
                    <option value="2030">2030</option>
                  </select>
                </div>
              </div>
              <br>
              <div class="row">
                <div class="col-12">
                  <label>C&oacute;digo de seguridad</label>
                  <input id="cvv" type="number" class="form-control" placeholder="***" maxlength="3" oninput="if(this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);">
                  <img src="<c:url value="/images/cvv.png" />" style="width: 12%; margin: -19% 0 0 85%;">
                </div>
              </div>

              <br>
              <button class="btn btn-primary w-100" Type="Submit"/>Pagar</button>
            </form>

            <br>

            <c:if test="${not empty error}">
              <h4><span>${error}</span></h4>
              <br>
            </c:if>
            ${msg}
          </div>
        </div>
      </div>
    </section>

  </body>
</html>
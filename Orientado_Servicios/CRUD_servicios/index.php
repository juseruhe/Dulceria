<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>PHP PDO Login</title>

  <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Open+Sans:600'>
  <link rel="stylesheet" href="style.css">

</head>
<body>
  <div class="login-wrap">
  <div class="login-html">
    <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Ingresar</label>
    <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Registrarse</label>
    <div class="login-form">
      <form class="sign-in-htm" action="http://localhost/Dulceria/Orientado_Servicios/CRUD_servicios/api.php?apicall=loginusuario" method="POST">
        <div class="group">
          <label for="usua" class="label">Usuario: </label>
          <input id="username" name="usuario" type="text" class="input">
        </div>
        <div class="group">
          <label for="contr" class="label">Contraseña: </label>
          <input id="password" name="clave" type="password" class="input" data-type="password">
        </div>
        <div class="group">
          <input id="check" type="checkbox" class="check" checked>
          <label for="check"><span class="icon"></span> Recordar Contraseña</label>
        </div>
        <div class="group">
          <input type="submit" class="button" value="Ingresar">
        </div>
        <div class="hr"></div>
        <div class="foot-lnk">
          <a href="#forgot">¿Olvidaste Tu Contraseña?</a>
        </div>
      </form>
      <form class="sign-up-htm" action="http://localhost/pdologin03/api.php?apicall=createusuario" method="POST">
        <div class="group">
          <label for="nomcom" class="label">Nombre Completo: </label>
          <input id="fullname" name="fullname" type="text" class="input">
        </div>
        <div class="group">
          <label for="usua" class="label">Usuario: </label>
          <input id="username" name="username" type="text" class="input">
        </div>
        <div class="group">
          <label for="contr" class="label">Contraseña: </label>
          <input id="password" name="password" type="password" class="input" data-type="password">
        </div>
        <div class="group">
          <label for="pin" class="label">Pin Secreto: </label>
          <input id="secretpin" name="secretpin" type="text" class="input" >
        </div>
        <input id="created" type="hidden" name="created"  value="<?php echo date("Y-m-d\TH-i");?>">
        <div class="group">
          <input type="submit" class="button" value="Registrarse">
        </div>
        <div class="hr"></div>
        <div class="foot-lnk">
          <label for="tab-1">Ya estas Registrado?</a>
        </div>
      </form>
    </div>
  </div>
</div>

</body>
</html>
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
    <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Recuperar Contraseña</label>
    <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab"></label>
    <div class="login-form">
      <form class="sign-in-htm" action="http://localhost/Dulceria/Orientado_Servicios/CRUD_servicios/api.php?apicall=mostrarcontrasena" method="POST">
        <div class="group">
          <label for="usua" class="label">Usuario: </label>
          <input id="username" name="usuario" type="text" class="input">
        </div>
        
        <div class="group">
          <input type="submit" class="button" value="Ingresar">
        </div>
      </form>


    
      
     
    </div>
  </div>
</div>

</body>
</html>
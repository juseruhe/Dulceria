<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dulcería</title>
</head>
<body>

<?php

if(isset($_SESSION["validado"]) && $_SESSION["validado"] == 1){

    
if(isset($_SESSION["contador"])){
$_SESSION["contador"]= $_SESSION["contador"]+1;
}
else {
    $_SESSION["contador"] =1;
} }else {

    header("location:sesion2.php");
    die();
}


?>
<p> Zona Privada </p>
<p> Con Sesión <?php $_SESSION["contador"]   ?>  </p>
<a href="cerrar.php">Desconectar</a>
    
</body>
</html>
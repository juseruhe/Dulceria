<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cookies</title>
</head>
<body>

<p> uno.php</p>
<a href="cookie.php">Cookie</a>
<?php

setcookie("Visita_Uno","Hora: ".date("H:i:s"),time()+1500);
foreach($_COOKIE as $clave => $valor){

    echo "Clave= ".$clave." Valor= ".$valor."<br>";
}

?>
</body>
</html>
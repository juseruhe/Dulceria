<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dulcería</title>
</head>
<body>

<form action="sesion2.php" method="post">

Producto :  <input type="text" name="producto" id="">
<input type="submit" value="Enviar">




</form>
    
</body>
<?php
session_start();
if(isset($_POST["producto"])){

if($_POST["producto"]== "dulces"){
   $_SESSION["validado"] = 1;
    header("location:control.php");
    die();
}

}




?>
</html>
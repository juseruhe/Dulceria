<?php

$Host_Base_Datos = "localhost";
$Nombre_Base_Datos = "dulceria";
$Usuario_Base_Datos = "root";
$Contrasena_Base_Datos = "";


try {

    $conexion = new PDO("mysql:host={$Host_Base_Datos}; dbname={$Nombre_Base_Datos}",
    $Usuario_Base_Datos,$Contrasena_Base_Datos);

    $conexion -> setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);

  



} catch(PDOException $e){

echo $e->getMessage();

}
















?>
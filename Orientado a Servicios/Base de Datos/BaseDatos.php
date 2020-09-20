<?php

class BaseDatos{

public function getConectar(){

    $localhost = "localhost";
    $basedatos = "dulceria";
    $usuario= "root";
    $contrasena = "";

    $link = new PDO("mysql:host=$localhost;dbname=$basedatos",$usuario,$contrasena);

return $link;


}



}










?>
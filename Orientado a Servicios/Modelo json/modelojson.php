<?php

require_once "../Base de Datos/BaseDatos.php";

class Datos extends BaseDatos{

public function crearUsuarioModel($DatosModel,$Tabla){

$sentencia = BaseDatos::getConectar()->prepare("INSERT into $Tabla(nombre_completo,nombre_usuario,
contrasena,pin,creado) values (:nombre_completo,:nombre_usuario,:contrasena,:pin,:creado)");

$sentencia->bindParam(":nombre_completo",$DatosModel["nombre_completo"],PDO::PARAM_STR);
$sentencia->bindParam(":nombre_usuario",$DatosModel["nombre_usuario"],PDO::PARAM_STR);
$sentencia->bindParam(":contrasena",$DatosModel["contrasena"],PDO::PARAM_STR);
$sentencia->bindParam(":pin",$DatosModel["pin"],PDO::PARAM_INT);
$sentencia->bindParam(":creado",$DatosModel["creado"],PDO::PARAM_STR);

if($sentencia->execute()){
    return true;
} else {

    return false;
}



}


public function leerUsuarioModel($Tabla){

$sentencia = BaseDatos::getConectar()->prepare("SELECT * from $Tabla ");

}


}










?>
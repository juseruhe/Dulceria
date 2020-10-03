<?php
require_once 'modelojson.php';

class Controllerjson{

    public function createUsuarioController($nombre, $usuario, $clave, $nota, $fecha){
        $datosController = array("nombre"=>$nombre,
        "usuario"=>$usuario,
        "clave"=>$clave,
        "nota"=>$nota,
        "fecha"=>$fecha);

        $respuesta = Datos::createUsuarioModel($datosController,"usuario");
        return $respuesta;
    }

    public function readUsuarioController(){
        $respuesta = Datos::readUsuarioModel("usuario");
        return $respuesta;
    }

    public function updateUsuariosController($id, $clave){
        $datosController = array("id"=>$id, "clave"=>$clave);
        $respuesta = Datos::updateUsuarioModel($datosController, "usuario");
        return $respuesta;
    }

    public function deleteUsuarioController($id){
      
        $respuesta = Datos::deleteUsuarioModel($id, "usuario");
        return $respuesta;
    }

    public function loginUsuarioController($usuario, $clave){
        $datosController = array("usuario"=>$usuario, "clave"=>$clave);
        $respuesta = Datos::loginUsuarioModel($datosController, "usuario");
        return $respuesta;
    }

    public function mostrarcontrasenaController($usuario){

        //$datosController = array("usuario"=>$usuario);
        $respuesta = Datos::mostrarcontrasenaModel($usuario,"usuario");

        return $respuesta;

    }
}
?>
<?php
require_once 'controllerjson.php';

function ParametrosDisponibles($params){
    $disponible = true;
    $faltantes = "";

    foreach($params as $param){
        if(!isset($_POST[$param]) || strlen($_POST[$param]) <=0){
            $disponible = false;
            $faltantes = $faltantes . ",". $param;
        }
    }

    if(!$disponible){
        $respuesta = array();
        $respuesta['error'] = true;

        $respuesta['mensaje'] = 'Parametro: ' . substr($faltantes, 1, strlen($faltantes)). 'vacio';
        echo json_encode($respuesta);

        //detener la ejecucion
        die();
    }
}
$respuesta = array();

if(isset($_GET['apicall'])){

    switch($_GET['apicall']){
        case 'createusuario':

            ParametrosDisponibles(array('nombre', 'usuario', 'clave', 'nota', 'fecha'));
            



            $db = new Controllerjson();
            $result = $db->createUsuarioController($_POST['nombre'],
            $_POST['usuario'],
            $_POST['clave'],
            $nota,
            $_POST['fecha']);

        if($result){
            $respuesta['error'] = false;
            $respuesta['mensaje'] = 'Usuario agregado correctamente';
            $respuesta['contenido'] = $db->readUsuarioController();
        }else{
            $respuesta['error'] = true;
            $respuesta['mensaje'] = 'Ocurrio un error intenta nuevamente';
        }

        $respuesta= $db->readUsuarioController();
    break;

    case 'readusuarios':
        $db = new Controllerjson();
        $result = $db->readUsuarioController();

        $respuesta['error'] = false;
        $respuesta['mensaje'] = 'Solicitud completada correctamente';
        $respuesta['contenido'] = $db->readUsuarioController();

        

    break;

    case 'loginusuario':
        ParametrosDisponibles(array('usuario', 'clave'));
        $db = new Controllerjson();
        $result = $db->loginUsuarioController($_POST['usuario'], $_POST['clave']);

        if(!$result){
            $respuesta['error'] = true;
            $respuesta['mensaje'] = 'credenciales no validas';
        }else{
            $respuesta['error'] = false;
            $respuesta['mensaje'] = 'Bienvenido';
            $respuesta['contenido'] = $result;
        }
    break;
    case 'deleteusuario':
        ParametrosDisponibles(array('id'));
        $db = new Controllerjson();
        $result = $db->deleteUsuarioController($_POST['id']);
    break;

    case 'mostrarcontrasena':
        ParametrosDisponibles(array('usuario'));
        $db = new Controllerjson();
      $result = $db->mostrarcontrasenaController($_POST['usuario']);
      
      $respuesta = $result;
    break;
    
   



    }

    
}else{
    $respuesta['error'] = true;
    $respuesta['mensaje'] = 'Llamado invalido del API!';
}
echo json_encode($respuesta);
?>
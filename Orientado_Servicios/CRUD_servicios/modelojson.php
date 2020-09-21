<?php
require_once 'database.php';

class Datos extends Database{

    //METODOS
    public function createUsuarioModel($datosModel,$tabla){
        $stmt = Database::getconectar()->prepare("INSERT INTO $tabla(nombre,usuario,clave,nota,fecha) 
        VALUES (:nombre, :usuario, :clave, :nota, :fecha)");

        $stmt->bindParam(":nombre", $datosModel["nombre"],PDO::PARAM_STR);
        $stmt->bindParam(":usuario", $datosModel["usuario"],PDO::PARAM_STR);
        $stmt->bindParam(":clave", $datosModel["clave"],PDO::PARAM_STR);
        $stmt->bindParam(":nota", $datosModel["nota"],PDO::PARAM_INT);
        $stmt->bindParam(":fecha", $datosModel["fecha"],PDO::PARAM_STR);

        if($stmt->execute()){
            return true;
        }else{
            return false;
        }
    }

    public function readUsuarioModel($tabla){
        $stmt = Database::getconectar()->prepare("SELECT * FROM $tabla");
        $stmt->execute();

        $stmt->bindColumn("id",$id);
        $stmt->bindColumn("nombre",$nombre);
        $stmt->bindColumn("usuario",$usuario);
        $stmt->bindColumn("clave",$clave);
        $stmt->bindColumn("nota",$nota);
        $stmt->bindColumn("fecha",$fecha);
        $usuarios = array();

        while($fila = $stmt->fetch(PDO::FETCH_BOUND)){
            $user = array();

            $user["id"] = utf8_encode($id);
            $user["nombre"] = utf8_encode($nombre);
            $user["usuario"] = utf8_encode($usuario);
            $user["clave"] = utf8_encode($clave);
            $user["nota"] = utf8_encode($nota);
            $user["fecha"] = utf8_encode($fecha);

            array_push($usuarios, $user);
        }
        return $usuarios;
    }

    public function updateUsuarioModel($datosModel, $tabla){
        $stmt = Database::getconectar()->prepare("UPDATE $tabla set clave=:clave WHERE id=:id");

        $stmt->bindParam(":clave", $datosModel["clave"], PDO::PARAM_STR);
        $stmt->bindParam(":id", $datosModel["id"], PDO::PARAM_INT);
        
        if($stmt->execute()){
            echo "Actualizacion Exitosa";
        }else{
            echo "No se pudo hacer la Actualizacion";
        }
    }

    public function deleteUsuarioModel($id, $tabla){
        $stmt = Database::getconectar()->prepare("DELETE FROM $tabla WHERE id=:id");

        $stmt->bindParam(":id",$id, PDO::PARAM_INT);
        if($stmt->execute()){
            echo "Usuario eliminado correctamente";
        }else{
            echo "El Usuario no se pudo Eliminar";
        }
    }

    public function loginUsuarioModel($datosModel, $tabla){
        $stmt = Database::getconectar()->prepare("SELECT * FROM $tabla WHERE usuario=:usuario AND clave=:clave");

        $stmt->bindParam(":usuario",$datosModel["usuario"]);
        $stmt->bindParam(":clave",$datosModel["clave"]);

        $stmt->execute();

        $stmt->bindColumn("id",$id);
        $stmt->bindColumn("nombre",$nombre);
        $stmt->bindColumn("usuario",$usuario);
        $stmt->bindColumn("clave",$clave);
        $stmt->bindColumn("nota",$nota);
        $stmt->bindColumn("fecha",$fecha);

        while($fila = $stmt->fetch(PDO::FETCH_BOUND)){
            $user = array();
            $user["id"] = utf8_encode($id);
            $user["nombre"] = utf8_encode($nombre);
            $user["usuario"] = utf8_encode($usuario);
            $user["clave"] = utf8_encode($clave);
            $user["nota"] = utf8_encode($nota);
            $user["fecha"] = utf8_encode($fecha);
        }
        if(!empty($user)){
            return $user;
        }else{
            return false;
        }      
    }

    public function mostrarcontrasenaModel($usuario,$tabla){
     
        $stmt = Database::getconectar()->prepare("SELECT usuario,clave FROM $tabla where usuario=:usuario");
        
       $stmt->bindParam(":usuario",$usuario);
       
        $stmt->execute();

       
        $stmt->bindColumn("usuario",$usuario);
        $stmt->bindColumn("clave",$clave); 
        //$usuarios = array();


        
        while($fila = $stmt->fetch(PDO::FETCH_BOUND)){
            
            
            $user["usuario"] = utf8_encode($usuario);
            $user["clave"] = utf8_encode($clave);
          
          //  array_push($usuarios,$user);
          if($user["usuario"] != null) {
         return "La contrasena del Usuario $user[usuario] es $user[clave]";}
           else {
               return "El usuario no existe";
           }
        }
        
   

    }
}
?>
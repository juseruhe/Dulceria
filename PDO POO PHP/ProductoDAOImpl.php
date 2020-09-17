<?php

require_once("config.php");

class ProductoDAOImpl extends Conexiondb{

private $conexion;

private $id,$codigo_producto,$nombre_producto,$categoria,$venta_dia1,$venta_dia2,$venta_dia3;

public function __construct()
{
    $this->conexion=Conexiondb::conectar();

   

}

public function getListarProducto(){

    $declaracion= $this->conexion->prepare("SELECT * from producto order by id");

    $declaracion->execute();

    $declaracion->bindColumn("codigo_producto",$codigo);
    $declaracion->bindColumn("nombre_producto",$nombre);
    $declaracion->bindColumn("categoria",$categoria);
    $declaracion->bindColumn("venta_dia1",$venta_dia1);
    $declaracion->bindColumn("venta_dia2",$venta_dia2);
    $declaracion->bindColumn("venta_dia3",$venta_dia3);

    return $declaracion->fetchAll();

  

}

public function setInsertarProducto($codigo_producto,$nombre_producto,$categoria,
$venta_dia1,$venta_dia2,$venta_dia3){

    $declaracion = $this->conexion->prepare("INSERT into producto (codigo_producto,nombre_producto,
    categoria,venta_dia1,venta_dia2,venta_dia3) values(:codigo_producto,:nombre_producto,:categoria,
    :venta_dia1,:venta_dia2,:venta_dia3)");

    $declaracion->bindParam(":codigo_producto",$codigo_producto);
    $declaracion->bindParam(":nombre_producto",$nombre_producto);
    $declaracion->bindParam(":categoria",$categoria);
    $declaracion->bindParam(":venta_dia1",$venta_dia1);
    $declaracion->bindParam(":venta_dia2",$venta_dia2);
    $declaracion->bindParam(":venta_dia3",$venta_dia3);

    $declaracion->execute();
}


public function setActualizar($id,$codigo_producto,$nombre_producto,$categoria,
$venta_dia1,$venta_dia2,$venta_dia3){

$declaracion = $this->conexion->prepare("UPDATE producto set codigo_producto=:codigo_producto,
nombre_producto=:nombre_producto,
categoria=:categoria,venta_dia1=:venta_dia1,venta_dia2=:venta_dia2,venta_dia3=:venta_dia3
where id=:id");

$declaracion->bindParam(':id',$id);
$declaracion->bindParam(':codigo_producto',$codigo_producto);
$declaracion->bindParam(':nombre_producto',$nombre_producto);
$declaracion->bindParam(':categoria',$categoria);
$declaracion->bindParam(':venta_dia1',$venta_dia1);
$declaracion->bindParam(':venta_dia2',$venta_dia2);
$declaracion->bindParam(':venta_dia3',$venta_dia3);

$declaracion->execute();

}

public function getMostrarProducto($id){

    $declaracion = $this->conexion->prepare("SELECT * from producto where id='$id'");

$declaracion->execute();

$declaracion->bindColumn("id",$id);
$declaracion->bindColumn("codigo_producto",$codigo);
    $declaracion->bindColumn("nombre_producto",$nombre);
    $declaracion->bindColumn("categoria",$categoria);
    $declaracion->bindColumn("venta_dia1",$venta_dia1);
    $declaracion->bindColumn("venta_dia2",$venta_dia2);
    $declaracion->bindColumn("venta_dia3",$venta_dia3);

   return $declaracion->fetchAll();

}

public function setEliminar($id){

    $declaracion = $this->conexion->prepare("DELETE from producto where id=:id");


$declaracion->execute(array(":id" => $id));
}

}

?>







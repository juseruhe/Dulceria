<?php

require_once("config.php");

class ProductoDAOImpl extends Conexiondb{

private $conexion;

public function __construct()
{
    $this->conexion=Conexiondb::conectar();



}

public function getListarProducto(){

    $declaracion= $this->conexion->prepare("SELECT codigo_producto,nombre_producto,categoria,venta_dia1,
    venta_dia2,venta_dia3 from producto order by id");

    $declaracion->execute();

    $declaracion->bindColumn("codigo_producto",$codigo);
    $declaracion->bindColumn("nombre_producto",$nombre);
    $declaracion->bindColumn("categoria",$categoria);
    $declaracion->bindColumn("venta_dia1",$venta_dia1);
    $declaracion->bindColumn("venta_dia2",$venta_dia2);
    $declaracion->bindColumn("venta_dia3",$venta_dia3);

    return $declaracion->fetchAll();

    $declaracion->close();

}


}












?>
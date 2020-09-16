<?php


include ("ProductoDAOImpl.php");


if(isset($_POST["submit"])) {



$codigo_producto = $_POST["codigo"];
$nombre_producto = $_POST["nombre"];
$categoria = $_POST["categoria"];
$venta_dia1 = $_POST["venta_dia1"];
$venta_dia2 = $_POST["venta_dia2"];
$venta_dia3 = $_POST["venta_dia3"];


if(empty($codigo_producto) || empty($nombre_producto) || empty($categoria) 
|| empty($venta_dia1) || empty($venta_dia2) || empty($venta_dia3)){

    if(empty($codigo_producto)){

     echo "<p style=' color:#63000B; font-family:arial;'>  El Campo de Código del Producto       
     está vacío</p> <br>";

    }

    if(empty($nombre_producto)){

        echo "<p style=' color:#63000B; font-family:arial;'>  El Campo de Nombre del Producto       
        está vacío</p> <br>";

       }

       if(empty($categoria)){

        echo "<p style=' color:#63000B; font-family:arial;'>  El Campo de Categoria del Producto       
        está vacío</p> <br>";

       }

       if(empty($venta_dia1)){

        echo "<p style=' color:#63000B; font-family:arial;'>  El Campo de Venta Día 1 del Producto       
        está vacío</p> <br>";

       }

       
       if(empty($venta_dia2)){

        echo "<p style=' color:#63000B; font-family:arial;'>  El Campo de Venta Día 2      
        está vacío</p> <br>";

       }

       
       if(empty($venta_dia3)){

        echo "<p style=' color:#63000B; font-family:arial;'>  El Campo de Venta Día 3     
        está vacío</p> <br>";

       }

echo"<br> <a href='javascript:self.history.back();'> Volver </a> ";

 

}
else {

    $modelo2 = new ProductoDAOImpl();
   
    $resultado= $modelo2->getInsertarProducto($codigo_producto,$nombre_producto,$categoria,
    $venta_dia1,$venta_dia2,$venta_dia3);
    
  echo "<p> Datos Ingresados Correctamente </p>";
  echo "<a href='listarproductosp1.php'> Volver a la Página Principal </a>";

  

}



}














?>
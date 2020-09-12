<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Total de Ventas </title>
</head>
<body>
    

<form action="totalventas.php" method="post">
<p> Digite el código del Producto: </p>
<input type="text" name="codigo" id="" placeholder="Digite el código del Producto:"> 

<p> Digite el nombre del Producto: </p>
<input type="text" name="nombre" id="" placeholder="Digite el nombre del Producto:"> 

<p> Digite el Precio del Producto:  </p>
<input type="number" name="precio" id="" placeholder="Digite el Precio del Producto: "> 
    

<p> Digite la Cantidad del Producto:  </p>
<input type="number" name="cantidad" id="" placeholder="Digite la Cantidad del Producto:"> 
        
<p> Digite las unidades Vendidas del Producto: </p>
<input type="number" name="unidades" id="" placeholder="Digite las unidades Vendidas del Producto:"> 

<input type="hidden" name="NumeroProductos" value="<?php echo $NumeroProductos?>">
    
<input type="submit" value="Registrar Productos">


</form>
    
    <?php

$TotalProductos = 0;
  

if(isset($_POST["codigo"]) && isset($_POST["nombre"]) && isset($_POST["precio"]) 
&& isset($_POST["cantidad"]) && isset($_POST["unidades"])  ){

    echo "<p> Existe valores de los productos   </p>";


   
   $codigo =  $_POST["codigo"] ;
   $nombre =  $_POST["nombre"] ;
   $precio =  $_POST["precio"] ;
   $cantidad =  $_POST["cantidad"] ;
   $unidades =  $_POST["unidades"] ;

  
    
    $TotalProducto = $precio * $unidades;

    $Diferencia = $TotalProducto - $TotalProducto ;

    $TotalCantidad = $cantidad - $unidades;

echo "El Total del Producto ".$nombre." es: $".$TotalProducto." COP"."<br>".
"El Balance es de: $Diferencia ".", con N° de Productos es de: $TotalCantidad";

$TotalProductos += $TotalProducto;
  

}else {

  echo "<p> No existe valores de los productos   </p>" ; 
}

  

  ?>











</body>
</html>
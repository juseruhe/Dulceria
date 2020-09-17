<?php

require("ProductoDAOImpl.php");

if(isset($_POST["update"])){

    $id = $_POST["id"];
    $codigo_producto = $_POST["codigo_producto"];
    $nombre_producto = $_POST["nombre_producto"];
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

$modelo3 = new ProductoDAOImpl();

$resultado= $modelo3->setActualizar($id,$codigo_producto,$nombre_producto,$categoria,
    $venta_dia1,$venta_dia2,$venta_dia3);
    
  echo "<p> Datos Actualizados Correctamente </p>";
  echo "<a href='listarproductosp1.php'> Volver a la Página Principal </a>";

// header("location:index.php");



    }



}

?>


<?php

$id = $_GET["id"];

$modelo4 = new ProductoDAOImpl();

$resultado2 = $modelo4->getMostrarProducto($id);

if($resultado2){

    foreach($resultado2 as $row => $item){

        ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar Producto</title>
</head>
<body>
    <a href="index.php">Inicio</a>
    <br> <br>
    <form action="editarproducto.php" method="post" name="form1">
  <table border="0">
      <tr>
    <td> Código del Producto: </td>
    <td> <input type="text" name="codigo_producto" value="<?php echo $item["codigo_producto"]  ?>" id=""></td>
</tr>


<tr>
    <td> Nombre del Producto: </td>
    <td> <input type="text" name="nombre_producto" value="<?php echo $item["nombre_producto"]   ?>" id=""></td>
</tr>


<tr>
    <td> Categoria del Producto: </td>
    <td> <input type="text" name="categoria" value="<?php echo $item["categoria"]    ?>" id=""></td>
</tr>

<tr>
    <td> Venta del Día 1: </td>
    <td> <input type="number" name="venta_dia1" value="<?php echo $item["venta_dia1"]    ?>" id=""></td>
</tr>

<tr>
    <td> Venta del Día 2: </td>
    <td> <input type="number" name="venta_dia2" value="<?php echo $item["venta_dia2"]  ?>" id=""></td>
</tr>

<tr>
    <td> Venta del Día 3: </td>
    <td> <input type="number" name="venta_dia3" value="<?php echo $item["venta_dia3"]    ?>" id=""></td>
</tr>

<tr>
    <td>  </td>
    <td> <input type="hidden" name="id" value="<?php echo $_GET["id"];   ?>" id=""></td>
</tr>



<tr>
    <td> </td>
    <td> <input type="submit" name="update" value="Editar Producto" id=""></td>
</tr>



  </table>



    </form>
</body>
</html>

        


<?php
    }
}




?>


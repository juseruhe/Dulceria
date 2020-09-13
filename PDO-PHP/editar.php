<?php

include_once("config.php");

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

$sql = "UPDATE producto set codigo_producto=:codigo_producto,nombre_producto=:nombre_producto,
categoria=:categoria,venta_dia1=:venta_dia1,venta_dia2=:venta_dia2,venta_dia3=:venta_dia3
where id=:id";

$query = $conexion -> prepare($sql);
$query->bindParam(':id',$id);
$query->bindParam(':codigo_producto',$codigo_producto);
$query->bindParam(':nombre_producto',$nombre_producto);
$query->bindParam(':categoria',$categoria);
$query->bindParam(':venta_dia1',$venta_dia1);
$query->bindParam(':venta_dia2',$venta_dia2);
$query->bindParam(':venta_dia3',$venta_dia3);

$query->execute();

header("location:index.php");



    }



}

?>


<?php

$id = $_GET["id"];
$sql = "SELECT * from producto where id=:id";
$query= $conexion->prepare($sql);
$query->execute(array(":id" => $id));

while($row = $query->fetch(PDO::FETCH_ASSOC)){

    $codigo_producto = $row["codigo_producto"];
    $nombre_producto = $row["nombre_producto"];
    $categoria = $row["categoria"];
    $venta_dia1 = $row["venta_dia1"];
    $venta_dia2 = $row["venta_dia2"];
    $venta_dia3 = $row["venta_dia3"];



}



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
    <form action="editar.php" method="post" name="form1">
  <table border="0">
      <tr>
    <td> Código del Producto: </td>
    <td> <input type="text" name="codigo_producto" value="<?php echo $codigo_producto;   ?>" id=""></td>
</tr>


<tr>
    <td> Nombre del Producto: </td>
    <td> <input type="text" name="nombre_producto" value="<?php echo $nombre_producto;   ?>" id=""></td>
</tr>


<tr>
    <td> Categoria del Producto: </td>
    <td> <input type="text" name="categoria" value="<?php echo $categoria;   ?>" id=""></td>
</tr>

<tr>
    <td> Venta del Día 1: </td>
    <td> <input type="number" name="venta_dia1" value="<?php echo $venta_dia1;   ?>" id=""></td>
</tr>

<tr>
    <td> Venta del Día 2: </td>
    <td> <input type="number" name="venta_dia2" value="<?php echo $venta_dia2;   ?>" id=""></td>
</tr>

<tr>
    <td> Venta del Día 3: </td>
    <td> <input type="number" name="venta_dia3" value="<?php echo $venta_dia3;   ?>" id=""></td>
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
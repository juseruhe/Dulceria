<?php

require_once("config.php");

$result = $conexion->query("SELECT * from producto order by id asc");

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Productos</title>
</head>
<body style="background:#40CD0B; color:#ffffff; font-family:lucida calligraphy; font-size:20px;">
    
<a href="agregar.html" style="color: #F32050;">Adicionar Producto</a> <br> <br>
<table width=80% border=3>
<tr style=" background:#0B20CD; text-align:center; " >
<td>Código del Producto</td>
<td>Nombre del Producto</td>
<td>Categoría</td>
<td>Ventas del Día 1</td>
<td>Ventas del Día 2</td>
<td>Ventas del Día 3</td>
<td>Editar</td>
<td>Eliminar</td>
</tr>

<?php

while($row=$result->fetch(PDO::FETCH_ASSOC)){

    echo "<tr>";
    echo "<td>".$row['codigo_producto']."</td>";
    echo "<td>".$row['nombre_producto']. "</td>";
    echo "<td>".$row['categoria']. "</td>";
    echo "<td>".$row['venta_dia1']."</td>";
    echo "<td>".$row['venta_dia2']. "</td>";
    echo "<td>".$row['venta_dia3']. "</td>";
    echo "<td> <a href=\"editar.php?id=$row[id]\"> Editar Producto</a> </td>";
    echo "<td> <a href=\"eliminar.php?id=$row[id]\" onclick=\"return 
    confirm('¿Esta Seguro de Eliminar este Producto?')\"> Eliminar Producto</a> </td>";

}


?>


</table>
</body>
</html>
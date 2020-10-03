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
    <link rel="stylesheet" href="styles.css"/>
</head>
<body>
    
<a href="agregar.html" >Adicionar Producto</a> <br> <br>
<table class="index">
<tr class="titulo" >
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
    echo "<td> <a href=\"eliminar.php?id=$row[id]\" onclick=\"
    confirm('¿Esta Seguro de Eliminar este Producto?');\"> Eliminar Producto</a> </td>";
    echo "</tr>";

}


?>

</table>
</body>
</html>
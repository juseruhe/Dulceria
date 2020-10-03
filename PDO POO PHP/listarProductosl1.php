<?php

include ("ProductoDAOImpl.php");

$modelo = new ProductoDAOImpl();

$resultado = $modelo->getListarProducto();
echo"<table border='1' width='40%'>";
echo"<tr>";
echo"<th> Código del Producto </th>";
echo"<th> Nombre del Producto </th>";
echo"<th> Categoria </th>";
echo"<th> Venta del Día 1 </th>";
echo"<th> Venta del Día 2 </th>";
echo"<th> Venta del Día 3 </th>";
echo"<th>Acción</th>";
echo "</tr>";

if($resultado){

foreach($resultado as $row => $item){

    echo"
    <tr>
    <td>".utf8_encode($item['codigo_producto'])."</td>
    <td>".utf8_encode($item['nombre_producto'])."</td>
    <td>".utf8_encode($item['categoria'])."</td>
    <td>".utf8_encode($item['venta_dia1'])."</td>
    <td>".utf8_encode($item['venta_dia2'])."</td>
    <td>".utf8_encode($item['venta_dia3'])."</td>
    <td><a href=\"editarproducto.php?id=$item[id]\"> Actualizar</a> <a href=\"eliminarproducto.php?id=$item[id]\" onclick=\"return confirm('¿Estas Seguro de Eliminar?');\">Eliminar</a></td>
    </tr>";

}

echo "</table>";

}










?>
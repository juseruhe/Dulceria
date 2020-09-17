<?php

require("ProductoDAOImpl.php");


$id = $_GET["id"];

$modelo5 = new ProductoDAOImpl();

$resultado = $modelo5->setEliminar($id);

header("location:listarproductosp1.php");









?>
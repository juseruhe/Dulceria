<?php

include("config.php");

$id = $_GET["id"];

$sql = "DELETE from producto where id=:id";

$query = $conexion->prepare($sql);

$query->execute(array(":id" => $id));

header("location:index.php");






?>
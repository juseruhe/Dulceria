<?php
class Database{
    public function getconectar(){
    $localhost = "localhost";
    $database = "taller";
    $user = "root"; 
    $password = "";
    $link = new PDO("mysql:host=$localhost; dbname=$database", $user, $password);
    return $link;
    }
}
?>
<?php

class Conexiondb{


    public function conectar(){
      $localhost = "localhost";
      $database = "dulceria";
      $user = "root";
      $password= "";

      $link= new PDO("mysql:host=$localhost;dbname=$database",$user,$password);

      return $link;

    }

}













?>
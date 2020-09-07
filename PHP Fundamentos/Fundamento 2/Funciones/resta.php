<?php


function Restar($a,$b){

$resta = $a -  $b;

return $resta;

throw new Exception("Restar");


}

try{

echo "Excepciones";
}

catch(Exception $e){

echo "Excepción Capturada", $e->getMessage()."<br>";
}

echo Restar(5,9);

?>
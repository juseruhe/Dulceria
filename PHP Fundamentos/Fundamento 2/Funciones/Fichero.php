<?php

$fichero = fopen("dulceria.txt","a+");

if($fichero == false){

    echo "Error <br>";
}

else {

    fwrite($fichero,"Lectura de Dulcería a las:".date("H:i:s")."\n");
    fclose($fichero);
echo "Lectura Finalizada";
}


?>
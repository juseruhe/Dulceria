<?php

$aleatorio = rand(0,500);

if ($aleatorio>249 && $aleatorio<299){
    echo $aleatorio;
    echo "Puntaje Normal";
}

elseif ($aleatorio>0 && $aleatorio<250){
    echo $aleatorio;
    echo "Puntaje Bajo";
}

elseif ($aleatorio>300){
   
    echo $aleatorio;
    echo "Puntaje Alto";
}

else {
    echo $aleatorio;
    echo "Numero Equivocado";
}



?>
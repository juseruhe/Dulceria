<?php

$dulces= array(40,25,87);

$cantidad = count($dulces);


for($i=0;$i<$cantidad;$i++){

echo $i .":". $dulces[$i]."<br>";

}

foreach($dulces as $dulce){

    echo "<<< ".$dulce." <br>";
}






?>
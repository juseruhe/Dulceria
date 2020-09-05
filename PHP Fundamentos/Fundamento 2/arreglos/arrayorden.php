<?php

$dulces = array("a"=> "chocolates","b" => "caramelo", "c" => "gaseosa");

ksort($dulces);


foreach($dulces as $nomenclatura => $nombres) {

    echo "$nomenclatura = $nombres "."<br>";
}

asort($dulces);
foreach($dulces as $nomenclatura => $nombres) {

    echo "$nomenclatura = $nombres "."<br>";
}










?>
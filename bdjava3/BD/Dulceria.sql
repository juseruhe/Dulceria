create database dulceria;
use dulceria;

create table producto(
    id int(15) not null AUTO_INCREMENT,
    codigo_producto varchar(15) not null,
    nombre_producto varchar(55) not null,
    categoria varchar(55) not null,
    venta_dia1 int(30) not null,
    venta_dia2 int(30) not null,
    venta_dia3 int(30) not null,
    primary key(id)
    );

use dulceria;

create table usuario(
id int(10) not null auto_increment,
nombre_completo varchar(20) character set utf8 COLLATE utf-8_unicode_ci not null,
nombre_usuario varchar(20) not null,
contrasena varchar(20) not null,
pin int(10) not null,
creado datetime not null,
primary key(id)
);
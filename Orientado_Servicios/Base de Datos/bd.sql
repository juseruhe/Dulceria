use dulceria;

create table usuario(
id int(10) not null auto_increment,
nombre varchar(20) character set utf8 COLLATE utf8_unicode_ci not null,
usuario varchar(20) not null,
clave varchar(20) not null,
nota int(10) not null,
fecha datetime not null,
primary key(id)
);
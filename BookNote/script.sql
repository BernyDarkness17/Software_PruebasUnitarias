create database pruebaDos;
use pruebaDos; -- drop database pruebaDos;

create table opcionUno(
    id int auto_increment primary key,
    contenido varchar (200)
); -- select * from opcionUno;

create table opcionDos(
    id int auto_increment primary key,
    contenido varchar (200)
); -- select * from opcionDos;

create table pregunta(
    id int auto_increment primary key,
    opcionUno int,
    opcionDos int,
    foreign key (opcionUno) references opcionUno (id),
    foreign key (opcionDos) references opcionDos (id)
); -- select * from pregunta;



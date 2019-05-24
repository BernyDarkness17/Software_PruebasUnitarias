create database bd_book_note;
use bd_book_note;
-- drop database bd_book_note;

create table perfil(
    id int auto_increment,
    perfil varchar(50),
    primary key(id)
);

insert into perfil values(null,"administrador");
insert into perfil values(null,"docente");
insert into perfil values(null,"alumno");
insert into perfil values(null,"apoderado");
-- select * from perfil
-- select id from perfil where perfil.perfil like '%docente%'

create table usuario(
    id int auto_increment,
    nickname varchar(50),
    pass varchar(50),
    perfil int,
    primary key(id),
    foreign key(perfil) references perfil(id)
); -- select * from usuario;


insert into usuario value(null,"admin", AES_ENCRYPT ("admin", "llave"), 1);
insert into usuario value(null,"jperez", AES_ENCRYPT ("jperez123", "llave"), 2);
insert into usuario value(null,"chernandez", AES_ENCRYPT ("12cherna", "llave"), 3);
insert into usuario value(null,"fbarrera", AES_ENCRYPT ("12fbarrera", "llave"), 4);
insert into usuario value(null,"azuniga", AES_ENCRYPT ("123", "llave"), 3);
insert into usuario value(null,"Berny", AES_ENCRYPT ("berny", "llave"), 2);

create table persona (
    id int auto_increment,
    nombre varchar (50),
    apellido varchar (50),
    id_usuario INT,
    primary key (id),
    foreign key(id_usuario) references usuario(id)    
); -- select * from persona;

select id from persona where id_usuario = 3;


insert into persona values(null, "Administrador", "Administrador", 1);
insert into persona values(null, "Juan", "Perez", 2);
insert into persona values(null, "Carlos", "Hernandez", 3);
insert into persona values(null, "Franco", "Barrera", 4);
insert into persona values(null, "Alexis", "Zuniga", 5);
insert into persona values(null, "Berny", "Ant", 6);


create table alumnoApoderado (
    id int auto_increment,
    fk_alumno int,
    fk_apoderado int,
    primary key (id),
    foreign key(fk_alumno) references persona(id),
    foreign key(fk_apoderado) references persona(id)
);

Insert into alumnoApoderado values(null, 3, 1);

create table asignatura (
    id int auto_increment,
    nombre varchar (100),
    id_docente INT,
    asistencia INT,
    primary key (id),
    foreign key(id_docente) references persona(id)  
); -- select * from asignatura;

insert into asignatura values(null, "calculo", 2, 90);
insert into asignatura values(null, "Base de datos", 2, 90);
insert into asignatura values(null, "Arquitectura de software", 6, 90);
-- select * from persona where id_usuario = 1

create table asistencia (
    id int auto_increment,
    id_alumno int,
    id_asignatura int,
    fecha datetime,
    asistio boolean,
    primary key (id),
    foreign key(id_alumno) references persona(id),
    foreign key(id_asignatura) references asignatura(id)
);
-- select * from asistencia;

insert into asistencia value(null,1,1,now(),true);
insert into asistencia value(null,2,1,now(),false);
insert into asistencia value(null,2,2,now(),false);
insert into asistencia value(null,5,1,now(),false);

create table asignatura_alumno (
    id int auto_increment,
    id_asignatura int,
    id_alumno int,
    primary key (id),
    foreign key(id_asignatura) references asignatura(id),
    foreign key(id_alumno) references persona(id)     
); -- select * from asignatura_alumno;

INSERT INTO asignatura_alumno VALUES (null,1,3);
INSERT INTO asignatura_alumno VALUES (null,1,5);
INSERT INTO asignatura_alumno VALUES (null,3,3);
INSERT INTO asignatura_alumno VALUES (null,3,5);
-- select * from usuario where usuario.pass = AES_ENCRYPT ('admin', 'llave') and nickname = 'admin' and perfil = 1

create table prueba(
    id int auto_increment,
    nombre varchar(50),
    nota float,
    porcentaje float,
    id_asignatura int,
    id_alumno int,
    primary key(id),
    foreign key(id_asignatura) references asignatura(id),
    foreign key(id_alumno) references persona(id)
);

insert into prueba value(null,"prueba 1",5.5,0.25,1,3);
insert into prueba value(null,"prueba 2",6.1,0.25,1,3);
insert into prueba value(null,"prueba 3",3.5,0.25,1,3);
insert into prueba value(null,"prueba 2",6.5,0.30,1,3);

select * from prueba where nombre = 'prueba 1';

select prueba.porcentaje from prueba where prueba.nombre = 'prueba 2';

select prueba.nombre from prueba;

create table mensaje (
    id int auto_increment,
    texto varchar(500),
    fecha date,
    id_asignatura int,
    primary key (id),
    foreign key(id_asignatura) references asignatura(id)    
); -- select * from mensaje;
-- drop table mensaje
INSERT INTO mensaje VALUES (null,'me da un completo',NOW(),1);
INSERT INTO mensaje VALUES (null,'Tensidad...',NOW(),2);

select mensaje.texto 
from mensaje 
where mensaje.id_asignatura = 1;

select asignatura.id, asignatura.nombre 
from asignatura
where id_docente = 6

------------------------------------------------
select asignatura.id, asignatura.nombre
from asignatura, asignatura_alumno, persona
where asignatura.id = id_asignatura and persona.id = id_alumno
and id_alumno = 3
-----------------------------------------------
select prueba.porcentaje from prueba where prueba.nombre LIKE '%prueba 1%'

-- select persona.id, persona.nombre, persona.apellido 
-- from asignatura_alumno, persona, asignatura where asignatura.nombre like'%calculo%' and asignatura_alumno.id_alumno = persona.id
/*DELIMITER $$
CREATE FUNCTION crear_usuario (nickn VARCHAR(50),passw VARCHAR(50)) RETURNS BOOLEAN -- DROP FUNCTION crear_usuario
BEGIN
	DECLARE llave VARCHAR(10);
        DECLARE existe_usuario boolean;
        SET llave = 'llave';
        SET existe_usuario = (SELECT COUNT(*) FROM usuario where nickname = nickn);
         IF existe_usuario THEN -- si el usuario existe
            RETURN FALSE;
        ELSE
            insert into usuario value(null,nickn, AES_ENCRYPT (passw, llave));
            RETURN TRUE;
        END IF;
END $$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE obtener_usuario (nickn VARCHAR(50),passw VARCHAR(50))
BEGIN
        DECLARE llave VARCHAR(10);
        SET llave = 'llave';
	SELECT * FROM usuario where nickname = nickn AND password = AES_ENCRYPT(passw,llave);
END $$
DELIMITER ;


 Como hacer el procedimiento en MYSQL:
DELIMITER $$
CREATE PROCEDURE procedimiento (variable TIPO, variable2 TIPO)
BEGIN
	
END $$
DELIMITER ;
*/


--       ----------------------------------------------------------------------------------------------------------------
--       ---------------------------------------LEER COMENTARIOS PORFAAA!!!----------------------------------------------
--       ----------------------------------------------------------------------------------------------------------------

-- INSERTA NOTA pidiendo los ID del alumno, asignatura, la nota y su ponderacion, asumiendo que estamos en el USUARIO de un DOCENTE
/*DELIMITER $$
CREATE PROCEDURE insertar_nota(alumno_fk INT, asignatura_fk INT, nota_nueva FLOAT, ponderacion FLOAT)-- DROP PROCEDURE insertar_nota
BEGIN
	DECLARE destinatario INT;
    SET destinatario = (SELECT id FROM asignatura_alumno WHERE id_alumno = alumno_fk AND id_asignatura = asignatura_fk);
	INSERT INTO nota VALUES (NULL,nota_nueva,ponderacion,destinatario);
END $$
DELIMITER ;

CALL insertar_nota('1','2','5','0');


-- MODIFICA NOTA pudiendo cambiar el VALOR y su PORCENTAJE, pidiendo los ID del alumno, asignatura, la nota y su ponderacion, asumiendo que estamos en el USUARIO de un DOCENTE
DELIMITER $$
CREATE PROCEDURE modificar_nota(alumno_fk INT, asignatura_fk INT, nota_nueva FLOAT, ponderacion FLOAT)-- DROP PROCEDURE modificar_nota
BEGIN
	DECLARE destinatario INT;
    SET destinatario = (SELECT id FROM asignatura_alumno WHERE id_alumno = alumno_fk AND id_asignatura = asignatura_fk);
	UPDATE nota SET valor = nota_nueva, porcentaje = ponderacion where id = destinatario;
END $$
DELIMITER ;

CALL modificar_nota('1','2','7','0.5');


-- INSERTA ASISTENCIA pidiendo los ID del ALUMNO, ASIGNATURA y si llegó ALUMNO asumiendo que estamos en el USUARIO de un DOCENTE y que se queiere registrar la FECHA ACTUAL
DELIMITER $$
CREATE PROCEDURE registrar_asistencia(alumno_fk INT, asignatura_fk INT, atraso BOOLEAN)-- DROP PROCEDURE modificar_nota
BEGIN
	DECLARE destinatario INT;
    SET destinatario = (SELECT id FROM asignatura_alumno WHERE id_alumno = alumno_fk AND id_asignatura = asignatura_fk);
	INSERT INTO asistencia VALUES (null,CURDATE(),atraso,destinatario);
END $$
DELIMITER ;

CALL registrar_asistencia('1','1','0');


-- SELECT DE ASISTENCIA para los APODERADOS solicitando la ID del ALUMNO y ASIGNATURA asumiendo que estamos en el USUARIO de un APODERADO
DELIMITER $$
CREATE PROCEDURE ver_asistencia(alumno_actual INT, asignatura_actual INT)-- DROP PROCEDURE ver_asistencia
BEGIN
	SELECT 
		asist.fecha,
        asist.atrasado,
        al.nombre,
        al.apellido,
        asig.nombre
	
    FROM
		asistencia asist
        
	INNER JOIN asignatura_alumno asig_al ON asig_al.id = asist.id_asignatura_alumno
    INNER JOIN alumno al ON al.id = asig_al.id_alumno
    INNER JOIN asignatura asig ON asig_al.id_asignatura = asig.id
    
    WHERE 
		 al.id = alumno_actual AND
         asig.id = asignatura_actual;
END $$
DELIMITER ;

CALL ver_asistencia('1','1');


-- SELECT DE NOTAS para los APODERADOS solicitando la ID del ALUMNO y ASIGNATURA asumiendo que estamos en el USUARIO de un APODERADO
DELIMITER $$
CREATE PROCEDURE ver_notas(alumno_actual INT, asignatura_actual INT)-- DROP PROCEDURE ver_notas
BEGIN
	SELECT 
		n.valor,
        n.porcentaje,
        al.nombre,
        al.apellido,
        asig.nombre
	
    FROM
		nota n
        
	INNER JOIN asignatura_alumno asig_al ON asig_al.id = n.id_asignatura_alumno
    INNER JOIN alumno al ON al.id = asig_al.id_alumno
    INNER JOIN asignatura asig ON asig_al.id_asignatura = asig.id
    
    WHERE 
		al.id = alumno_actual AND
		asig.id = asignatura_actual;
END $$
DELIMITER ;

CALL ver_notas('1','1');


-- SELECT DE NOTAS para los ALUMNOS solicitando la ID del ALUMNO y ASIGNATURA asumiendo que estamos en el USUARIO de un ALUMNO
-- es igual que el de apoderados, pero con menos datos
DELIMITER $$
CREATE PROCEDURE revizar_notas(alumno_actual INT, asignatura_actual INT)-- DROP PROCEDURE revizar_notas
BEGIN
	SELECT 
		n.valor,
        n.porcentaje,
        asig.nombre
	
    FROM
		nota n
        
	INNER JOIN asignatura_alumno asig_al ON asig_al.id = n.id_asignatura_alumno
    INNER JOIN alumno al ON al.id = asig_al.id_alumno
    INNER JOIN asignatura asig ON asig_al.id_asignatura = asig.id
    
    WHERE 
		al.id = alumno_actual AND
		asig.id = asignatura_actual;
END $$
DELIMITER ;

CALL revizar_notas('4','2');


-- MUESTRA LOS MENSAJES por ASIGNATURA para los ALUMNOS asumiendo que estamos en el USUARIO de un ALUMNO
DELIMITER $$
CREATE PROCEDURE revizar_mensajes(asignatura_actual INT)-- DROP PROCEDURE revizar_notas
BEGIN
	SELECT 
		m.id,
        m.fecha,
        m.texto
	
    FROM
		mensaje m
        
    INNER JOIN asignatura asig ON m.id_asignatura = asig.id
    
    WHERE 
		asig.id = asignatura_actual;
END $$
DELIMITER ;

CALL revizar_mensajes ('2');
			
			*/



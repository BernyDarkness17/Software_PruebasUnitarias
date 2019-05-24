create database bd_book_note;
use bd_book_note;
-- drop database bd_book_note;


create table usuario(
    id int auto_increment,
    nickname varchar(50),
    pass varchar(50),
    primary key(id)
); -- select * from usuario;

insert into usuario value(null,"admin", AES_ENCRYPT ("admin", "llave"));
insert into usuario value(null,"jperez", AES_ENCRYPT ("12perez", "llave"));
insert into usuario value(null,"cherna", AES_ENCRYPT ("12cherna", "llave"));
insert into usuario value(null,"fbarrera", AES_ENCRYPT ("12fbarrera", "llave"));


create table apoderado (
    id int auto_increment,
    nombre varchar (50),
    apellido varchar (50),
    id_usuario INT,
    primary key (id),
    foreign key(id_usuario) references usuario(id)    
); -- select * from apoderado;

insert into apoderado value(null,"Juan","Perez",2);

create table docente (
    id int auto_increment,
    nombre varchar (50),
    apellido varchar (50),
    id_usuario INT,
    primary key (id),
    foreign key(id_usuario) references usuario(id)  
); -- select * from docente;

INSERT INTO docente VALUES (null,"Carlos","Hernandez",3);

create table asistencia (
    id int auto_increment,
    fecha datetime,
    asistio boolean,
    primary key (id)
);

insert into asistencia value(null,now(),true);
insert into asistencia value(null,now(),false);

create table alumno (
    id int auto_increment,
    nombre varchar (50),
    apellido varchar (50),
    id_apoderado int,
    id_usuario INT,
    primary key (id),
    foreign key(id_apoderado) references apoderado(id), 
    foreign key(id_usuario) references usuario(id)  
); -- select * from alumno;

INSERT INTO alumno VALUES (null,'franco','Barrera',1,4);
-- INSERT INTO nota VALUES ();

create table asignatura (
    id int auto_increment,
    nombre varchar (100),
    id_docente INT,
    asistencia INT,
    primary key (id),
    foreign key(id_docente) references docente(id)  
); -- select * from asignatura;

insert into asignatura value(null,"calculo",1,90);


create table asignatura_alumno (
    id int auto_increment,
    id_asignatura int,
    id_alumno int,
    id_asistencia INT,
    primary key (id),
    foreign key(id_asignatura) references asignatura(id),
    foreign key(id_asistencia) references asistencia(id),
    foreign key(id_alumno) references alumno(id)     
);

INSERT INTO asignatura_alumno VALUES (null,1,1,1);
INSERT INTO asignatura_alumno VALUES (null,1,1,2);

create table prueba(
    id int auto_increment,
    nombre varchar(50),
    nota float,
    porcentaje float,
    id_asignatura int,
    id_alumno int,
    primary key(id),
    foreign key(id_asignatura) references asignatura(id),
    foreign key(id_alumno) references alumno(id)
);

insert into prueba value(null,"prueba 1",5.5,0.25,1,1);


create table mensaje (
    id int auto_increment,
    texto varchar (500),
    fecha datetime,
    id_asignatura int,
    primary key (id),
    foreign key(id_asignatura) references asignatura(id)    
); -- select * from mensaje;

INSERT INTO mensaje VALUES (null,'me da un completo',NOW(),1);

DELIMITER $$
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




/* Como hacer el procedimiento en MYSQL:
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


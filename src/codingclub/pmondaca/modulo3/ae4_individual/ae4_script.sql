CREATE SCHEMA `ae4_modulo3` ;
use ae4_modulo3;

SET AUTOCOMMIT=0; 

CREATE TABLE usuarios_si (
id int NOT NULL,
nombre varchar (45) NOT NULL,
apellido varchar (45) NOT NULL,
correo varchar (45) NOT NULL,
genero varchar (45) NOT NULL,
CONSTRAINT PRIMARY KEY(id)
);

CREATE TABLE usuarios_no (
id int NOT NULL,
nombre varchar (45) NOT NULL,
apellido varchar (45) NOT NULL,
correo varchar (45) NOT NULL,
genero varchar (45) NOT NULL,
CONSTRAINT PRIMARY KEY(id)
);

INSERT INTO usuarios_si VALUES
(1, 'user1', 'lastname', 'user1@mail.com', 'Femenino'),
(2, 'user2', 'lastname', 'user2@mail.com', 'Masculino'),
(3, 'user3', 'lastname', 'user3@mail.com', 'Femenino'),
(4, 'user4', 'lastname', 'user4@mail.com', 'Masculino'),
(5, 'user5', 'lastname', 'user5@mail.com', 'Femenino');

INSERT INTO usuarios_no VALUES
(1, 'user1', 'lastname', 'user1@mail.com', 'Femenino'),
(2, 'user2', 'lastname', 'user2@mail.com', 'Masculino');

COMMIT;

Select * from usuarios_no;

DELETE FROM usuarios_si
where id in (1,2);

Select * from usuarios_SI;

COMMIT;

INSERT INTO usuarios_no VALUES
(3, 'user3', 'lastname', 'user3@mail.com', 'Femenino');

Select * from usuarios_no;

DELETE FROM usuarios_si
where id = 3;

Select * from usuarios_SI;

ROLLBACK;
Select * from usuarios_no;

Select * from usuarios_SI;

SET AUTOCOMMIT=1; 


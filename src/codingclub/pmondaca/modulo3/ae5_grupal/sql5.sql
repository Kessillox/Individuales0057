#create database sql5;
#use sql5;
CREATE TABLE usuarios (
id_usuario INT AUTO_INCREMENT NOT NULL,
nombre VARCHAR(45) NOT NULL,
apellido VARCHAR(45) NOT NULL,
contrasena VARCHAR(20) NOT NULL,
zona_horaria VARCHAR(20) NOT NULL DEFAULT 'UTC-3',
genero VARCHAR(20) NOT NULL,
telefono INT NOT NULL,
CONSTRAINT PRIMARY KEY (id_usuario)
);
CREATE TABLE detalle_ingresos (
id_ingreso INT AUTO_INCREMENT NOT NULL,
id_usuario INT NOT NULL,
fecha_hora TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP(),
CONSTRAINT PRIMARY KEY (id_Ingreso),
CONSTRAINT foreign key(id_usuario)
REFERENCES usuarios(id_usuario)
);

#Modifique el UTC por defecto.Desde UTC-3 a UTC-2.
alter table usuarios
 alter zona_horaria set default 'UTC-2';
 
 #Parte 4: Creación de registros.
#- Para cada tabla crea 8 registros.
INSERT INTO usuarios VALUES
(1, 'usuario1', 'apellido1', 'pass123', 'UTC-3','femenino', 2123456),
(2, 'usuario2', 'apellido2', 'pass123', 'UTC-3','femenino', 2123456),
(3, 'usuario3', 'apellido3', 'pass123', 'UTC-3','femenino', 2123456),
(4, 'usuario4', 'apellido4', 'pass123', 'UTC-3','femenino', 2123456),
(5, 'usuario5', 'apellido5', 'pass123', 'UTC-3','masculino', 2123456),
(6, 'usuario6', 'apellido6', 'pass123', 'UTC-3','masculino', 2123456),
(7, 'usuario7', 'apellido7', 'pass123', 'UTC-3','masculino', 2123456),
(8, 'usuario8', 'apellido8', 'pass123', 'UTC-3','masculino', 2123456);
INSERT INTO detalle_ingresos VALUES
(1, 1, current_timestamp()),
(2, 1, current_timestamp()),
(3, 1, current_timestamp()),
(4, 1, current_timestamp()),
(5, 2, current_timestamp()),
(6, 2, current_timestamp()),
(7, 3, current_timestamp()),
(8, 4, current_timestamp());

# Justifique cada tipo de dato utilizado. ¿Es el óptimo en cada caso?

# Son los tipos de datos optimos para almacenar los valores de las columnas definidas 

CREATE TABLE contactos (
id_contacto INT AUTO_INCREMENT NOT NULL,
id_usuario INT NOT NULL,
telefono INT NOT NULL,
correo VARCHAR(45) NOT NULL,
CONSTRAINT PRIMARY KEY(id_contacto),
CONSTRAINT FOREIGN KEY (id_usuario)
REFERENCES usuarios(id_usuario)
);
ALTER TABLE contactos
ADD FOREIGN KEY (telefono) REFERENCES usuarios(telefono);

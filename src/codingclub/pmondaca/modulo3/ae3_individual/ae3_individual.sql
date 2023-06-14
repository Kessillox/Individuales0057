ALTER TABLE operadores
add salario int NOT NULL;

UPDATE operadores
SET salario = 1000
where salario = 0;

INSERT INTO capacitacion VALUES
(11, 'curso11', '11:30 a 12:50', 290, '2023-04-30'),
(12, 'curso12', '14:00 a 15:20', 190, '2023-03-31'),
(13, 'curso13', '15:30 a 16:50', 250, '2023-04-30');

INSERT INTO operadores VALUES
('98765431', 'nombre11', 'apellido11', 'direccion11', 'mail11@gmail.com', '2023-01-01', 1500),
('98765432', 'nombre12', 'apellido12', 'direccion12', 'mail12@gmail.com', '2023-01-19', 1500 ),
('98765433', 'nombre13', 'apellido13', 'direccion13', 'mail13@gmail.com', '2023-03-06', 1500 );


Select * from capacitacion 
where costo = (SELECT max(costo) FROM capacitacion);
/*El curso más caro es el curso7 con un valor de 320*/

Select * from operadores 
where salario = (SELECT min(salario) FROM operadores);
/*El operador con menos salario es el operador nombre10 con un salario de 900*/

Select * from capacitacion 
where costo > (SELECT avg(costo) FROM capacitacion);
/* curso 3, 6, 7, 10, 11, 12 y 13
/*El curso más caro es el curso7 con un valor de 320*/

CREATE TABLE capacitaciones_economicas as
Select * from capacitacion 
where costo < (SELECT avg(costo) FROM capacitacion);

ALTER TABLE capacitaciones_economicas
add cant_min_estudiantes int NOT NULL DEFAULT 5,
add aportes_publicos int NOT NULL DEFAULT 15;

ALTER TABLE capacitaciones_economicas
RENAME COLUMN costo TO costo_efectivo;

UPDATE capacitaciones_economicas
SET costo_efectivo = costo_efectivo - aportes_publicos;

UPDATE capacitacion
SET fecha_realizacion = '2023-04-24'
WHERE codigo_curso = 7;

UPDATE capacitacion
SET fecha_realizacion = '2023-03-21'
WHERE codigo_curso = 8;

UPDATE capacitacion
SET fecha_realizacion = '2023-04-17'
WHERE codigo_curso = 9;

UPDATE capacitacion
SET fecha_realizacion = '2023-04-15'
WHERE codigo_curso = 10;

UPDATE capacitacion
SET costo = 210
WHERE codigo_curso = 1;

UPDATE operadores
SET salario = 1150
WHERE run = '33123449';

UPDATE operadores
SET salario = 950
WHERE run = '33123450';

UPDATE operadores
SET salario = 890
WHERE run = '33123451';






ALTER TABLE producto
add precio int NOT NULL DEFAULT 500;

ALTER TABLE vendedor
add salario int NOT NULL DEFAULT 15000;

ALTER TABLE cliente
add total_pagado int NOT NULL DEFAULT 2000;

INSERT INTO vendedor VALUES
('9876543-0', 'vendedor1', 'apellido1', '1990-01-01', '1', 1000),
('9876543-1', 'vendedor2', 'apellido2', '2000-11-01', '1', 1000),
('9876543-2', 'vendedor3', 'apellido3', '2001-12-01', '1', 1000),
('9876543-3', 'vendedor4', 'apellido4', '2002-02-01', '1', 1000),
('9876543-4', 'vendedor5', 'apellido5', '1997-05-01', '1', 1000);

INSERT INTO cliente VALUES
('1', 'nombre1', 'apellido1', '22345678', 'direccion1', 'comuna1', 'mail1@correo.com', '2023-04-01', 300),
('2', 'nombre2', 'apellido2', '22345677', 'direccion2', 'comuna1', 'mail2@correo.com', '2023-05-25', 90),
('3', 'nombre3', 'apellido3', '22345676', 'direccion3', 'comuna2', 'mail3@correo.com', '2023-03-07', 240),
('4', 'nombre4', 'apellido4', '22345675', 'direccion4', 'comuna2', 'mail4@correo.com', '2023-02-09', 310),
('5', 'nombre5', 'apellido5', '22345674', 'direccion5', 'comuna1', 'mail5@correo.com', '2023-04-15', 30);

INSERT INTO producto VALUES
('1', 'producto1', 'categoria1', 'productor1', '100', 15),
('2', 'producto2', 'categoria2', 'productor2', '110', 39),
('3', 'producto3', 'categoria3', 'productor3', '20', 100),
('4', 'producto4', 'categoria4', 'productor4', '50', 5),
('5', 'producto5', 'categoria5', 'productor5', '101', 23);

SELECT min(salario), max(salario) from vendedor;

UPDATE vendedor
SET salario = salario + 900;
 

SELECT * from producto
where precio = (SELECT max(precio) from producto);

DELETE FROM producto
where producto.sku = 3;

CREATE TABLE clientes_mas_pago AS 
SELECT * FROM cliente
where total_pagado > (SELECT AVG(total_pagado) FROM cliente);

# I.Actualice los datos de tres productos.

UPDATE producto
SET stock = 99
where sku = 1;

UPDATE producto
SET stock = 50
where sku = 2;

UPDATE producto
SET stock = 85
where sku = 4;

#J.Actualice los datos de tres vendedores.

UPDATE vendedor
SET nombre ='Casimiro'
where nombre = 'vendedor1';

UPDATE vendedor
SET nombre ='Florentino'
where nombre = 'vendedor2';

UPDATE vendedor
SET nombre ='Nicanor'
where nombre = 'vendedor3';

# K.Actualice los datos de 1 cliente.

UPDATE cliente
SET direccion ='calle santa maría 765'
where id = 1;

UPDATE cliente
SET direccion = 'alameda 123'
where id = 2;

UPDATE cliente
SET direccion = 'calle cañaveral 100'
where id = 3;

#L.Seleccione el nombre y el apellido de los vendedores que tienen un salario superior al promedio.

Select nombre, apellidos from vendedor
where salario > (Select avg(salario) from vendedor);

#M.Indique cuál es el cliente con mayor gasto

Select * from cliente
where total_pagado = (Select max(total_pagado) from cliente);



# Información adicional: 
# Debe crear una base de datos que contenga tres tablas: (1)
#
# Tabla cuentas: Tiene dos columnas, -> puede tener mas
# la primera ‘Cuenta’ contiene la cuenta del usuario -> cuenta del usuario = llave primaria; excepto si es mas de una columna
# y la segunda columna ‘Saldo’ indica el saldo de cada usuario. -> int
# Cree cuatro usuarios registrados en esta tabla. (2)
#
# Si algún usuario no tiene la cantidad suficiente de TLV Coins,
# la transacción debe deshacerse.

# Algunos aspectos a considerar:
# Los Usuario no pueden tener un saldo negativo.
# Cada usuario puede traspasar TLV Coins a otros usuarios.
#
# (?) Necesitamos transferir 200 TLV Coins desde un usuario A a un usuario B.
# Para esto realice las siguientes transacciones.
#
# Transfiera 200 TLV Coins desde un usuario A un usuario B. (3)
# Transfiera 150 TLV Coins desde un usuario B un usuario C.
# Transfiera 500 TLV Coins desde un usuario C un usuario D.
# Transfiera 200 TLV Coins desde un usuario D un usuario A.
#
# En cada transacción, manualmente debe verificar que la cuenta tenga saldo suficiente.
# Verificar que la cuenta de destino exista.
#
# Actualizar la cuenta de origen.
# Actualizar la cuenta de destino.
# Verificar que se haya actualizado la cuenta de origen.
# Verificar que se haya modificado la cuenta de destino.
#
# Deshaga la transacción que realiza el usuario A al usuario usuario B. (4)
# Deshaga la transacción que realiza el usuario B al usuario usuario C.
# Realice un commit de la transacción que realiza el usuario C al usuario usuario D.
# Realice un commit de la transacción que realiza el usuario D al usuario usuario A.
#
# Todo se tiene que ejecutar de forma transaccional.

# 0. DROP TABLES
DROP TABLE IF EXISTS cuentas;
DROP TABLE IF EXISTS cuentas_repositorio;
DROP TABLE IF EXISTS transacciones;

DROP PROCEDURE IF EXISTS transferencia_y_commit;
DROP PROCEDURE IF EXISTS transferencia_y_rollback;


# 1. Debe crear una base de datos que contenga tres tablas:
# 1.1. Tabla cuentas: (Cuenta (cuenta del usuario), Saldo (saldo de cada usuario))
CREATE TABLE cuentas (
	id varchar(60),
    cuenta varchar(60),
    saldo int
);

# 1.2. Tabla cuentas para verificar cambios. Se queda un poco atrás.
CREATE TABLE cuentas_repositorio (
	id varchar(60),
    cuenta varchar(60),
    saldo int
);

# 1.3. Transacciones: (Origen (tabla cuentas), Destino (tabla cuentas), Monto (int))
CREATE TABLE transacciones (
	origen varchar(60),
    destino varchar(60),
    monto int
);

# 2. Cree cuatro usuarios registrados en esta tabla.
# Traen valor de respaldo (repositorio) para validar que las transacciones se hayan ejecutado correctamente
INSERT INTO cuentas (id, cuenta, saldo)
VALUES ("1", "A", 1000);
INSERT INTO cuentas_repositorio (id, cuenta, saldo)
VALUES ("1", "A", 1000);

INSERT INTO cuentas (id, cuenta, saldo)
VALUES ("2", "B", 1000);
INSERT INTO cuentas_repositorio (id, cuenta, saldo)
VALUES ("2", "B", 1000);

INSERT INTO cuentas (id, cuenta, saldo)
VALUES ("3", "C", 1000);
INSERT INTO cuentas_repositorio (id, cuenta, saldo)
VALUES ("3", "C", 1000);

INSERT INTO cuentas (id, cuenta, saldo)
VALUES ("4", "D", 1000);
INSERT INTO cuentas_repositorio (id, cuenta, saldo)
VALUES ("4", "D", 1000);

# 3. Necesitamos transferir 200 TLV Coins desde un usuario A a un usuario B.
# Para esto realice las siguientes transacciones.

DELIMITER //
CREATE PROCEDURE transferencia_y_commit(
	IN argOrigen VARCHAR(60),
    IN argDestino VARCHAR(60),
    IN deposito int
)
proc_label:BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION ROLLBACK;
	START TRANSACTION;
	
    # En cada transacción, manualmente debe verificar que la cuenta tenga saldo suficiente.
	IF ((SELECT saldo FROM cuentas WHERE cuenta = argOrigen) < deposito) THEN
		LEAVE proc_label;
	# Verificar que la cuenta de destino exista.
	ELSEIF ((SELECT COUNT(*) FROM cuentas WHERE cuenta = argDestino) > 0) THEN
		# Actualizar la cuenta de origen.
		UPDATE cuentas SET saldo = saldo - deposito WHERE cuenta = argOrigen;
        # Actualizar la cuenta de destino.
        UPDATE cuentas SET saldo = saldo + deposito WHERE cuenta = argDestino;
        # Usar la tabla Transacciones para algo
        INSERT INTO transacciones (origen, destino, monto)
        VALUES (argOrigen, argDestino, deposito);
        # Verificar que se haya actualizado la cuenta de origen.
        IF (
				(SELECT saldo FROM cuentas WHERE cuenta = argOrigen) =
                (SELECT saldo FROM cuentas_repositorio WHERE cuenta = argOrigen) - deposito
		) THEN
			UPDATE cuentas_repositorio
            SET saldo = (SELECT saldo FROM cuentas WHERE cuenta = argOrigen)
            WHERE cuenta = argOrigen;
		ELSE
			ROLLBACK;
            LEAVE proc_label;
		END IF;
        # Verificar que se haya modificado la cuenta de destino.
        IF (
				(SELECT saldo FROM cuentas WHERE cuenta = argDestino) =
                (SELECT saldo FROM cuentas_repositorio WHERE cuenta = argDestino) + deposito
		) THEN
			UPDATE cuentas_repositorio
            SET saldo = (SELECT saldo FROM cuentas WHERE cuenta = argDestino)
            WHERE cuenta = argDestino;
		ELSE
			ROLLBACK;
            LEAVE proc_label;
		END IF;
        
        COMMIT;
	ELSE
		ROLLBACK;
	END IF;
END//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE transferencia_y_rollback(
	IN argOrigen VARCHAR(60),
    IN argDestino VARCHAR(60),
    IN deposito int
)
proc_label:BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION ROLLBACK;
	START TRANSACTION;
	
    # En cada transacción, manualmente debe verificar que la cuenta tenga saldo suficiente.
	IF ((SELECT saldo FROM cuentas WHERE cuenta = argOrigen) < deposito) THEN
		LEAVE proc_label;
	# Verificar que la cuenta de destino exista.
	ELSEIF ((SELECT COUNT(*) FROM cuentas WHERE cuenta = argDestino) > 0) THEN
		# Actualizar la cuenta de origen.
		UPDATE cuentas SET saldo = saldo - deposito WHERE cuenta = argOrigen;
        # Actualizar la cuenta de destino.
        UPDATE cuentas SET saldo = saldo + deposito WHERE cuenta = argDestino;
        # Usar la tabla Transacciones para algo
        INSERT INTO transacciones (origen, destino, monto)
        VALUES (argOrigen, argDestino, deposito);
        # Verificar que se haya actualizado la cuenta de origen.
        IF (
				(SELECT saldo FROM cuentas WHERE cuenta = argOrigen) =
                (SELECT saldo FROM cuentas_repositorio WHERE cuenta = argOrigen) - deposito
		) THEN
			UPDATE cuentas_repositorio
            SET saldo = (SELECT saldo FROM cuentas WHERE cuenta = argOrigen)
            WHERE cuenta = argOrigen;
		ELSE
			ROLLBACK;
            LEAVE proc_label;
		END IF;
        # Verificar que se haya modificado la cuenta de destino.
        IF (
				(SELECT saldo FROM cuentas WHERE cuenta = argDestino) =
                (SELECT saldo FROM cuentas_repositorio WHERE cuenta = argDestino) + deposito
		) THEN
			UPDATE cuentas_repositorio
            SET saldo = (SELECT saldo FROM cuentas WHERE cuenta = argDestino)
            WHERE cuenta = argDestino;
		ELSE
			ROLLBACK;
            LEAVE proc_label;
		END IF;
        
        ROLLBACK;
	ELSE
		ROLLBACK;
	END IF;
END//
DELIMITER ;

# 3.1. Transfiera 200 TLV Coins desde un usuario A un usuario B.
# 4.1 Deshaga la transacción que realiza el usuario A al usuario usuario B.
CALL transferencia_y_rollback('A', 'B', 200);

# 3.2. Transfiera 150 TLV Coins desde un usuario B un usuario C.
# 4.2 Deshaga la transacción que realiza el usuario B al usuario usuario C.
CALL transferencia_y_rollback('B', 'C', 150);

# 3.3. Transfiera 500 TLV Coins desde un usuario C un usuario D.
# 4.3 Realice un commit de la transacción que realiza el usuario C al usuario usuario D.
CALL transferencia_y_commit('C', 'D', 500);

# 3.4. Transfiera 200 TLV Coins desde un usuario D un usuario A.
# 4.4 Realice un commit de la transacción que realiza el usuario D al usuario usuario A.
CALL transferencia_y_commit('D', 'A', 200);
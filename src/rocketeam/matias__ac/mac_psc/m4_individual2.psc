Algoritmo login
	Definir usuario, clave Como Cadena;

	Escribir ("ingrese su nombre de usuario");
	leer usuario;
	escribir ("ingrese su Contraseña");
	leer clave;
	si usuario = "admin" y clave = "12345";
		escribir ("¡bienvenido!");
		sino si Usuario <> "admin" Entonces;
			Escribir ("El nombre de usuario no existe verifique nuevamente");
		sino si  Usuario = "admin" y clave <> "12345" Entonces;
			Escribir ("contraseña incorrecta verifique nuevamente");
			FinSi;
		FinSi;
	FinSi;


FinAlgoritmo
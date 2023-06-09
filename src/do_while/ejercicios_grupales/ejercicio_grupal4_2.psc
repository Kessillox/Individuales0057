Proceso ejercicio_grupal4_2
	definir nombre, apellido, telefono, afp, salud, direccion, comuna como cadena;
	definir rut, edad Como Entero;
	
	escribir "ingrese su rut: ";
	leer rut;
	Mientras rut > 400000000 o rut < 1 Hacer
		escribir "ingrese un rut valido.";
		leer rut;
	Fin Mientras
	
	escribir "ingrese su nombre: ";
	leer nombre;
	mientras nombre = "" Hacer
		escribir "ingrese un nombre permitido.";
		leer nombre;
	FinMientras
	
	escribir "ingrese su apellido: ";
	leer apellido;
	mientras apellido = "" Hacer
		escribir "ingrese un apellido permitido.";
		leer apellido;
	FinMientras
	
	escribir "Telefono del Cliente: ";
	leer telefono;
	mientras telefono = "" o Longitud(telefono)>15  Hacer
		escribir "ingrese un telefono permitido.";
		leer telefono;
	FinMientras
	
	escribir "afp a la que pertenece el usuario: ";
	leer afp;
	mientras afp = "" Hacer
		escribir "ingrese una afp permitido.";
		leer afp;
	FinMientras
	
	escribir "ingrese sistema de salud (fonasa o isapre) a la que pertenece el usuario: ";
	leer salud;
	mientras salud = "" o (salud <> "fonasa" y salud <> "isapre") Hacer
		escribir "ingrese fonasa o isapre en minuscula.";
		leer salud;
	FinMientras
	
	escribir "ingrese direccion del usuario: ";
	leer direccion;
	mientras direccion = "" Hacer
		escribir "ingrese una direccion valida.";
		leer direccion;
	FinMientras
	
	escribir "comuna a la que pertenece el usuario: ";
	leer comuna;
	mientras comuna = "" Hacer
		escribir "ingrese una comuna.";
		leer comuna;
	FinMientras
	
	escribir "ingrese edad del usuario: ";
	leer edad;
	mientras edad < 1 o edad > 120 Hacer
		escribir "ingrese una edad valida.";
		leer edad;
	FinMientras
	
	escribir "Los datos ingresados fueron los siguientes: ";
	escribir "RUT: " rut; 
	escribir "Nombre: " nombre ;
	escribir "Apellido: " apellido;
	escribir "Telefono: " telefono;
	escribir "AFP: " afp;
	escribir "Sistema de Salud: " salud;
	escribir "Su direccion" direccion;
	escribir "Comuna: " comuna;
	escribir "Su Edad " edad;
	
	
	
FinProceso

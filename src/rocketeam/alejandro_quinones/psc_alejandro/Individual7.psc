Proceso individual7
	Definir hora Como Entero;
	hora = 0;
	Escribir "Ingresa el valor hora de trabajo para los empleados de AwakeLab";
	Leer hora;

	Definir nombre Como Caracter;
	Escribir "Ingresa el nombre del primer trabajador...";
	leer nombre;

	Definir edad Como Entero;
	Escribir "Ingresa la edad del primer trabajador...";
	leer edad;

	Definir lunes Como Entero;
	Escribir "Ingresa la cantidad de horas que trabajó el día lunes..."
	leer lunes;

	Definir martes Como Entero;
	Escribir "Ingresa la cantidad de horas que trabajó el día martes...";
	leer martes;

	Definir miercoles Como Entero;
	Escribir "Ingresa la cantidad de horas que trabajó el día miercoles...";
	leer miercoles;

	Definir  jueves Como Entero;
	Escribir "Ingresa la cantidad de horas que trabajó el día jueves.."
	leer jueves;

	Definir viernes Como Entero;
	Escribir "Ingresa la cantidad de horas que trabajó el día viernes...";
	leer viernes;

	Definir total Como Entero;
	total = hora * (lunes + martes + miercoles + jueves + viernes);

	Escribir "El sueldo del trabajador, ", nombre, " es de: ", total;



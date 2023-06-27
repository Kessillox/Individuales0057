Algoritmo Mod4_Ind7

	Definir cant_trabajadores Como Entero;
	Definir pago_por_hora Como Entero;

	Escribir "Ingrese la cantidad de trabajadores:";
	Leer cant_trabajadores;
	Escribir "Ingrese el pago por hora trabajada:";
	Leer pago_por_hora;

	Definir nombre como Cadena;
	Definir edad Como Entero;
	Definir horas_trabajadas Como Entero;
	Definir sueldo Como Entero;

	Dimension trabajadores[cant_trabajadores,4];

	Para trabajador = 1 Hasta cant_trabajadores Hacer


		Escribir "Ingrese nombre";
		Leer nombre;
		Escribir "Ingrese edad ";
		Leer edad;
		Escribir "Ingrese horas trabajadas";
		Leer horas_trabajadas;
		sueldo = pago_por_hora * horas_trabajadas;

		trabajadores[trabajador,1] = nombre;
		trabajadores[trabajador,2] = ConvertirATexto(edad);
		trabajadores[trabajador,3] = ConvertirATexto(horas_trabajadas);
		trabajadores[trabajador,4] = ConvertirATexto(sueldo);

	FinPara

	Para fila=1 Hasta cant_trabajadores Hacer
		Para col=1 Hasta 4 Hacer
			Escribir trabajadores[fila,col];
		FinPara
		Escribir "------------------------------------------------------------";
	FinPara



FinAlgoritmo
Proceso individual3
	Definir costoPlato Como Entero;
	costoPlato = 4500;
	Definir personas Como Entero;
	personas = 0;
	Escribir "Ingresa la cantidad de personas...";
	leer personas;

	SI (personas > 200 y personas <= 300)
		Entonces costoPlato = 4200;
	FinSi

	SI (personas > 300)
		Entonces costoPlato = 4000;
	FinSi
	Definir  total Como Entero;
	total = personas * costoPlato;
	Escribir  "El presupuesto para: ", personas, " personas, es de : ", total ;

FinProceso
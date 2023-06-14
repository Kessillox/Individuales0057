Proceso individual9_m4
	Definir num, divisor, contador Como Entero;
	Escribir 'Ingrese un número entero:';
	Leer num;
	Escribir 'Los divisores del número'," ", num, " ", 'son:';
	divisor = 1;
	Mientras divisor<=num Hacer
		Si num MOD divisor=0 Entonces
			Escribir divisor;
		FinSi
		divisor = divisor+1;
	FinMientras
FinProceso
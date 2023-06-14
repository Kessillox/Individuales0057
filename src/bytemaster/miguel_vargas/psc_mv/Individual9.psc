Algoritmo DivisoresEntero
	Definir numero, divisor como Entero

	Escribir "Ingrese un número entero:"
	Leer numero

	Escribir "Divisores de", numero, ":"

	Para divisor <- 1 Hasta numero Con Paso 1 Hacer
		Si numero % divisor = 0 Entonces
			Escribir divisor
		Fin Si
	Fin Para

FinAlgoritmo
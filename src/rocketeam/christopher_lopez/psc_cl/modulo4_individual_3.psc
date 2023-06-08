Algoritmo modulo4_individual3

	definir precio,personas como entero;

	Escribir "Ingrese número de personas";
	Leer personas;

	Si personas>200 Y personas <=300 Entonces
		precio = 4200;

	SiNo
		Si personas>300 Entonces
			precio = 4000;

		SiNo
			precio = 4500;
		FinSi
	FinSi


	Escribir Concatenar("El precio de cada plato es: ",ConvertirATexto(precio));

FinAlgoritmo

Algoritmo do_while
	definir contador Como Entero;
	contador = 0;
	
	repetir
		escribir"el contador es: ",contador;
		esperar 600 Milisegundos;
		contador = contador + 1;
		borrar pantalla;
	mientras que contador <= 9;
	escribir "el contador es: ",contador;
	escribir "Has salido de DO-While";
	
FinAlgoritmo

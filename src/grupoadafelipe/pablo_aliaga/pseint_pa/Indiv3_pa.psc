//Individual 3
//Pablo Aliaga

//el costo de un plato por persona es de $4500. Si el número de personas es mayor a 200 pero menor o igual a 300, 
//el costo será de $4200 por persona.
//Para más de 300 personas el costo será de $4000.

Algoritmo lapulga
	DEFINIR invitados COMO ENTERO;
	DEFINIR total COMO ENTERO;
	ESCRIBIR "INGRESAR EL NUMERO DE INVITADOS";
	LEER invitados;
	
	Si invitados > 300 Entonces
		total = (invitados * 4000);
	SiNo 
		Si invitados <= 200 Entonces
			total = (invitados * 4500);
		SiNo
			total = (invitados * 4200);
		Fin Si
	Fin Si
	
	ESCRIBIR "El total del presupuesto del evento es: " total;
FinAlgoritmo

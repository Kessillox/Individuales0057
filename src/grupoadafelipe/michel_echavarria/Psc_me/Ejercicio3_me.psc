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
Proceso individual4_3
	definir costo_persona Como Entero;
	costo_persona = 4500;
	definir num_personas Como Entero;
	definir costo_total como entero;
	
	escribir "ingrese el numero de personas que participaran en el evento: ";
	leer num_personas;
	Si num_personas > 200 y num_personas <= 300 Entonces
		costo_total = num_personas*4200;
		costo_persona = 4200;
	SiNo
		si num_personas > 300 Entonces
			costo_total = num_personas*4000;
			costo_persona = 4000;
		SiNo
			costo_total = num_personas * costo_persona;
						
		FinSi
		
	Fin Si
	imprimir "El total del evento para " num_personas " personas, es de $" costo_total " costando cada plato $" costo_persona " pesos";
FinProceso

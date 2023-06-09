Algoritmo EjIndividual1
	Definir cantidad_personas Como Entero;
	Definir costo_plato Como Entero;
	Definir costo_total Como Entero;
	
	cantidad_personas = 0;
	
	Escribir "Ingrese cantidad de personas";
	Leer cantidad_personas;
	
	Si cantidad_personas <= 200 Entonces
		costo_plato = 4500;
	SiNo
		Si cantidad_personas > 300 Entonces
			costo_plato = 4000;
		SiNo
			costo_plato = 4200;
		FinSi
	FinSi
	
	costo_total = costo_plato * cantidad_personas;
	
	
	Escribir "El costo total para " + ConvertirATexto(cantidad_personas) + " personas será de $" + ConvertirATexto(costo_total);
	
FinAlgoritmo

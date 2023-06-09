Algoritmo banquetera
    Definir personas, costo, presupuesto Como Entero;
	Definir plato1, plato2, plato3 Como Entero;
	plato1=4500;
	plato2=4200;
	plato3=4000;

    Escribir("Ingrese la cantidad de personas para el evento:");
    Leer personas;

    Si personas > 300 Entonces
        costo = plato1;
        presupuesto = personas * costo;
        Escribir "El presupuesto total para", personas, "personas es de $", presupuesto;
	sino si personas <= 300 Entonces
			costo = plato2;
			presupuesto = personas * costo;
			Escribir "El presupuesto total para", canti_Per, "personas es de $", presupuesto;
		SiNo si personas > 200 y personas <300 entonces;
			FinSi
			costo = plato3;
			presupuesto = personas * costo;
			Escribir "el presupuesto total para", personas, "personas es de $" presupuesto;
		FinSi


    Fin Si

FinAlgoritmo
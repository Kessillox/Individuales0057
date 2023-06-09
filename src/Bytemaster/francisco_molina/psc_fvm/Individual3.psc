Proceso TrabajoInd3

	Definir Personas, costoPorPersona, costoTotal como entero;


	Escribir "Sistema De Cotizacion De Eventos";

	Escribir "";

	Escribir "Favor ingrese cuantas personas asisitiran al evento (valor numerico, sin puntos ni signos): ";
	Leer Personas;

	Si Personas > 300 Entonces
		costoPorPersona <- 4000;

	Sino Si Personas > 200 Entonces;
			costoPorPersona <- 4200;
		Sino
			costoPorPersona <- 4500;
		Fin Si
	Fin si

	costoTotal = Personas * costoPorPersona;

	Escribir "El valor total del banquete es de: $ ", costoTotal , " pesos";
	Escribir "para " , Personas , " personas";

FinProceso
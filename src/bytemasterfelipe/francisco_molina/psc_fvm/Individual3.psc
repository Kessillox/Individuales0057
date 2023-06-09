Proceso PrecioPlato
		// Paso 1: Leer el número de personas
		Escribir "Ingrese el número de personas:"
		Leer personas

		// Paso 2: Calcular el costo por persona según las tarifas
		Si personas > 300 entonces
			costoPorPersona = 4000
		Sino
			Si personas > 200 entonces
				costoPorPersona = 4200
			Sino
				costoPorPersona = 4500
			Fin Si
		Fin Si

		// Paso 3: Calcular el costo total del banquete
		costoTotal = personas * costoPorPersona

		// Paso 4: Mostrar el resultado
		Escribir "El costo por persona es:", costoPorPersona
		Escribir "El costo total del banquete es:", costoTotal

	Fin proceso
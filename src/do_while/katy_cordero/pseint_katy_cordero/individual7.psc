Algoritmo CalcularSueldoSemanal
	
	// Solicitar valor de pago por hora
	Escribir "Ingrese el valor a pagar por hora de trabajo: "
	Leer valorPagoHora
	
	// Solicitar cantidad de trabajadores
	Escribir "Ingrese la cantidad de trabajadores: "
	Leer cantidadTrabajadores
	
	Para i desde 1 hasta cantidadTrabajadores hacer
		Escribir "Ingrese los datos del trabajador ", i
		
		// Solicitar nombre y edad del trabajador
		Escribir "Nombre: "
		Leer nombre
		Escribir "Edad: "
		Leer edad
		
		// Solicitar horas trabajadas en cada día de la semana
		totalHorasSemana := 0
		Para dia desde 1 hasta 5 hacer
			Escribir "Horas trabajadas en el día ", dia, ": "
			Leer horasTrabajadas
			totalHorasSemana := totalHorasSemana + horasTrabajadas
		Fin Para
		
		// Calcular sueldo semanal
		sueldoSemanal := totalHorasSemana * valorPagoHora
		
		// Mostrar los datos del trabajador y su sueldo semanal
		Escribir "Datos del trabajador:"
		Escribir "Nombre: ", nombre
		Escribir "Edad: ", edad
		Escribir "Horas trabajadas en la semana: ", totalHorasSemana
		Escribir "Sueldo semanal: ", sueldoSemanal
		
		Escribir "  " // Línea en blanco para separar los resultados
		
	Fin Para
	
Fin Algoritmo

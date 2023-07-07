Algoritmo Ejercicio7_me
    Definir valorHoraTrabajo, sueldoSemanal como Entero
    Definir cantidadTrabajadores, i, edad, horasLunes, horasMartes, horasMiercoles, horasJueves, horasViernes como Entero
    Definir nombre como Caracter
	
    Escribir "Ingrese el valor de la hora de trabajo:"
    Leer valorHoraTrabajo
	
    Escribir "Ingrese la cantidad de trabajadores:"
    Leer cantidadTrabajadores
	
    Para i = 1 Hasta cantidadTrabajadores Con Paso 1 Hacer
        Escribir "Trabajador ", i, ":"
		
        Escribir "Ingrese el nombre:"
        Leer nombre
		
        Escribir "Ingrese la edad:"
        Leer edad
		
        Escribir "Ingrese las horas trabajadas del lunes:"
        Leer horasLunes
		
        Escribir "Ingrese las horas trabajadas del martes:"
        Leer horasMartes
		
        Escribir "Ingrese las horas trabajadas del miércoles:"
        Leer horasMiercoles
		
        Escribir "Ingrese las horas trabajadas del jueves:"
        Leer horasJueves
		
        Escribir "Ingrese las horas trabajadas del viernes:"
        Leer horasViernes
		
        Definir totalHorasTrabajadas como Entero
        totalHorasTrabajadas = horasLunes + horasMartes + horasMiercoles + horasJueves + horasViernes
		
        sueldoSemanal = totalHorasTrabajadas * valorHoraTrabajo
		
        Escribir "Nombre: ", nombre
        Escribir "Edad: ", edad
        Escribir "Total horas trabajadas: ", totalHorasTrabajadas
        Escribir "Sueldo semanal: ", sueldoSemanal
		
    FinPara
FinAlgoritmo

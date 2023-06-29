//individual Pablo Aliaga
Algoritmo Arreglo
	
	Definir n Como Entero
	Definir i, j Como Entero
	Definir datos Como Real
	Definir nombres Como Cadena
	
	Escribir "Ingresar la cantidad de trabajadores que desea ingresar"
	Leer n
	
	Dimension datos[n, 4]
	Dimension nombres[n]
	
	Para i <- 1 Hasta n Con Paso 1 Hacer
		Escribir "Ingrese el nombre de la persona"
		Leer nombres[i]
		Para j <- 1 Hasta 4 Con Paso 1 Hacer
			Escribir "Ingrese la edad, horas trabajadas a la semana y valor hora"
			Leer datos[i, j];
		Fin Para
	Fin Para
	
	Escribir "Datos:"
	Para i <- 1 Hasta n Hacer
		Escribir "Nombre: ", nombres[i]
		Para j <- 1 Hasta 4 Hacer
			Escribir "Dato ", j, ": ", datos[i, j]
		Fin Para
		
		remuneracion <- datos[i, 3] * datos[i, 4]
		Escribir "Remuneración por semana: ", remuneracion
		Escribir ""
		
	Fin Para
	
Fin Algoritmo

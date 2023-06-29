Algoritmo Tarea4
	
	definir nombre Como Caracter
	definir fecha_nacimiento Como Caracter
	definir rut Como Caracter
	definir perfil Como Caracter	
	Definir cant,contador  Como Entero
	contador<-1
	
	Escribir "cantidad Usuarios a ingresar"
	Leer  cant
	Mientras contador <=cant Hacer
		Escribir "Nombre"
		Leer nombre
		Escribir "Fecha de Nacimiento"
		Leer fecha_nacimiento
		
		Escribir "Rut"
		Leer rut
		Escribir "Perfil"
		Leer perfil
		
		
		si perfil=="cliente" Entonces
			Escribir "Ingrese direccion"
			Leer direccion
			Escribir "Ingrese telefono"
			leer fono
			Escribir "Ingrese Cantidad de empleados"
			leer cant_empleados
			
			Escribir  nombre,"  ",fecha_nacimiento," ",rut ," ",direccion," ",fono," ",cant_empleados
		FinSi
		
		
		si perfil=="administrativo" Entonces
			Escribir "Ingrese funcion"
			Leer fun
			Escribir "Ingrese Nombre Superior"
			leer sup
			Escribir  nombre,"  ",fecha_nacimiento," ",rut ," ",fun," ",sup
		FinSi
		
		
		si perfil=="profesional" Entonces
			Escribir "Ingrese años de experiancia"
			Leer expe
			Escribir "Ingrese departamento"
			leer depa
			Escribir  nombre,"  ",fecha_nacimiento," ",rut ," ",expe," ",depa
		FinSi
		contador<-contador+1
		
	Fin Mientras
	
FinAlgoritmo

Algoritmo individual3
		Definir numPersonas, costoPorPersona, costoTotal Como Entero
		Definir sc Como Entero
		
		Escribir "Ingrese el número de personas: "
		Leer numPersonas
		
		Si (numPersonas > 200 Y numPersonas <= 300) Entonces
			costoPorPersona <- 4200
		FinSi
		
			
		 Si (numPersonas > 300) Entonces
			 costoPorPersona <- 4000
		 FinSi
		 
				
		 Si (numPersonas > 1 Y numPersonas <= 200) Entonces
			 costoPorPersona <- 4500
		 FinSi
		 
				
				costoTotal <- costoPorPersona * numPersonas
				
				
				Escribir "El costo total del evento para ", numPersonas, " personas será de $", costoTotal
				
FinAlgoritmo

	


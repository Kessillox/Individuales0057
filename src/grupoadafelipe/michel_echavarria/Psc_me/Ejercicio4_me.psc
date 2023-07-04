Algoritmo CalcularGananciaLana
	
    Definir precio_inicial_A_tam1, precio_inicial_A_tam2, precio_inicial_B_tam1, precio_inicial_B_tam2 como Entero
    Definir cantidad_A_tam2, cantidad_B_tam1 como Entero
    Definir ganancia_A_tam2, ganancia_B_tam1, ganancia_total como Entero
	
    Escribir "Ingrese el precio inicial por kilo de lana tipo A y tamaño 1:"
    Leer precio_inicial_A_tam1
	
    Escribir "Ingrese el precio inicial por kilo de lana tipo A y tamaño 2:"
    Leer precio_inicial_A_tam2
	
    Escribir "Ingrese el precio inicial por kilo de lana tipo B y tamaño 1:"
    Leer precio_inicial_B_tam1
	
    Escribir "Ingrese el precio inicial por kilo de lana tipo B y tamaño 2:"
    Leer precio_inicial_B_tam2
	
    Escribir "Ingrese la cantidad de lana tipo A y tamaño 2 entregada:"
    Leer cantidad_A_tam2
	
    Escribir "Ingrese la cantidad de lana tipo B y tamaño 1 entregada:"
    Leer cantidad_B_tam1
	
    ganancia_A_tam2 = (precio_inicial_A_tam2 + 300) * cantidad_A_tam2
    ganancia_B_tam1 = (precio_inicial_B_tam1 - 50) * cantidad_B_tam1
	
    ganancia_total = ganancia_A_tam2 + ganancia_B_tam1
	
    Escribir "La ganancia obtenida por la entrega de lana es:", ganancia_total
	
FinAlgoritmo



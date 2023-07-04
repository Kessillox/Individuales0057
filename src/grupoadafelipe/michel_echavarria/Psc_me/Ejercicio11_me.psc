Algoritmo SumaDiagonales
	Definir matriz Como Entero;
    Dimension matriz[4,4];
    Definir sumaDiagonalPrincipal, sumaDiagonalSuperior, sumaDiagonalInferior como Entero
	
    sumaDiagonalPrincipal = 0
    sumaDiagonalSuperior = 0
    sumaDiagonalInferior = 0
	
	Para i=0 Hasta 3 Con Paso paso Hacer
		Para j=0 Hasta 3 Con Paso paso Hacer
			Si i = j Entonces
				sumaDiagonalPrincipal = sumaDiagonalPrincipal + matriz[i,j]
			SiNo
				Si i < j Entonces
					sumaDiagonalSuperior = sumaDiagonalSuperior + matriz[i,j]
				SiNo
					sumaDiagonalInferior <- sumaDiagonalInferior + matriz[i,j]
				Fin Si
			Fin Si
		Fin Para
	Fin Para
	
	Si sumaDiagonalSuperior + sumaDiagonalInferior < sumaDiagonalPrincipal Entonces
		Escribir "La suma de la diagonal superior y la diagonal inferior es menor que la diagonal principal."
	Sino
		Escribir "La suma de la diagonal superior y la diagonal inferior es igual o mayor que la diagonal principal."
	Fin Si
FinAlgoritmo

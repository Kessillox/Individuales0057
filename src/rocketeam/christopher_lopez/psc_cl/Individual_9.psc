Proceso Individual_9
	definir n,m,j,i,divisores como entero;
	j=1;
	
	
	escribir "Ingrese un número entero";
	leer n;
	
	dimension divisores(n);
	
	escribir "Divisores: ";
	Para i<-1 Hasta n Con Paso 1 Hacer
		Si n mod i == 0 Entonces
			divisores(j) = i;
			escribir divisores(j);
			j=j+1;
			
		
			
		FinSi
	FinPara


FinProceso

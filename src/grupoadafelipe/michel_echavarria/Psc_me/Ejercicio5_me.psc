Algoritmo pcr
	DEFINIR salida COMO ENTERO;
	DEFINIR contagio COMO ENTERO;
	DEFINIR pecerre COMO ENTERO;
	DEFINIR resultado COMO ENTERO;
	
	ESCRIBIR "¿Ha salido del pais? 1 para si, 2 para no";
	LEER salida;
	ESCRIBIR "¿Ha presentado contagios cercanos? 1 para si, 2 para no";
	LEER contagio;
	ESCRIBIR "¿Se ha hecho un PCR? 1 para si, 2 para no";
	LEER pecerre;
	ESCRIBIR "Si se efectuo un PCR, ¿Como fue el resultado? 1 para negativo, 2 para positivo";
	LEER resultado;
	
	Si salida=1 Entonces
		Si pecerre=1 Entonces
			Si resultado=2 Entonces
				ESCRIBIR "Debe hacer cuarentera por 14 dias";
			SiNo
				ESCRIBIR "No debe hacer cuarentena";
			Fin Si
		SiNo
			ESCRIBIR "Debe hacer cuarentera por 14 dias";
		Finsi	
	SiNo
		Si contagio=1 Entonces
			ESCRIBIR "Debe hacer cuarentera por 14 dias";
		SiNo
			ESCRIBIR "No debe hacer cuarentera";
		Fin Si
	Fin Si
FinAlgoritmo

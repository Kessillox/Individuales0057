Algoritmo modulo4_individual7

	definir valorHora,n,edad,horasTrabajadas, sueldoSemanal como entero;
	definir nombre como cadena;

	escribir "Ingrese valor de hora trabajada";
	Leer valorHora;

	escribir "Ingrese cantidad de trabajadores";
	Leer n;
	dimension trabajadores[n,3];
	dimension campos[3];

	campos[0]="Nombre: ";
	campos[1]="Edad: ";
	campos[2]="Horas diarias trabajadas: ";

	Para i<-0 Hasta n-1 Con Paso  1 Hacer

		escribir "Ingrese nombre de trabajador ", ConvertirATexto(i+1);
		leer nombre;
		trabajadores[i,0] = nombre;

		escribir "Ingrese edad de trabajador ", ConvertirATexto(i+1);
		leer edad;
		trabajadores[i,1] = ConvertirATexto(edad);

		escribir "Ingrese horas trabajadas diarias de trabajador ", ConvertirATexto(i+1);
		leer horasTrabajadas;
		trabajadores[i,2] = ConvertirATexto(horasTrabajadas);


		Fin Para

		Escribir "";
		Escribir "Informe";
		Escribir "";

		Para j<-0 Hasta n-1 Con Paso 1 Hacer
			escribir "Trabajador ",ConvertirATexto(j+1);
			Para k<-0 Hasta 2 Con Paso 1 Hacer

				escribir campos[k], trabajadores[j,k];


			Fin Para
			horasTrabajadas = ConvertirANumero(trabajadores[j,2])*5;
			sueldoSemanal = horasTrabajadas*valorHora;
			escribir "Sueldo semanal: ",sueldoSemanal;
			escribir "";
		Fin Para




FinAlgoritmo
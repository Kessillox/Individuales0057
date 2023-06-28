Algoritmo Individual_5

	//Una persona debe permanecer 14 días en observación únicamente si ha salido del país.
	//La persona
	//se hará el PCR si quiere volver a la normalidad.
	//Dado que ni la persona ha salido del país ni presenta
	//contagios cercanos, no tendrá que hacer cuarentena ni se le hará el PCR.

	definir P, Q, R Como Logico;

	escribir "¿La persona ha salido del país?";
	leer P;

	escribir "¿La persona ha presenta contagios cercanos?";
	leer Q;

	Escribir "¿Debe permanecer 14 días en observación y se debe hacer el PCR para volver a la normalidad?"
	Si Q <> Verdadero Y P <> Verdadero Entonces
		R = Verdadero;
		escribir "No tendrá que hacer cuarentena ni se le hará el PCR.";
	SiNo
		R = Falso;
		escribir "Tendrá que hacer cuarentena y se le hará el PCR.";
	Fin Si

FinAlgoritmo
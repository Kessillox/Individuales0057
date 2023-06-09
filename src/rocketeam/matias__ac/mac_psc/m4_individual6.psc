Algoritmo EvaluarExpresiones
    Definir V1, V2, V3 Como logico;

    V1 = (('A' > 'B') O (Longitud('Hola mundo') = 10));

    V2 = No((5 + 2) < 7) Y No((7 > 9) O (3 < 5) Y (4 = 3));

    V3 = ((2 * 3 + 5 - 7) > (2 * (2 + 5))) O ((10 - 5) < 20);

    Escribir "El valor de verdad de V1 es ", V1;
	//En V1 la condición 'A' > 'B' es verdadera (lo cual es falso, ya que 'A' tiene un valor ASCII menor que 'B')
	//y si el largo de la cadena "Hola mundo" es igual a 10 (lo cual es verdadero). Por lo tanto, V1 es erdadero.
    Escribir "El valor de verdad de V2 es ", V2;
	//En V2 La primera expresión ((5 + 2) < 7), que es falsa ya que 7 es igual a 7
	//y en la segunda expresión ((7 > 9) O (3 < 5) Y (4 = 3)), que también es falsa.
	// ya que Ambas expresiones negadas darán como resultado verdadero. Por lo tanto, V2 será verdadero.

	Escribir "El valor de verdad de V3 es ", V3;
	//En V3 La primera expresión ((2 * 3 + 5 - 7) > (2 * (2 + 5))) es falsa
	//y la segunda expresión ((10 - 5) < 20) es verdadera siendo una de las expreciones verdadera
	//V3 será verdadero.

FinAlgoritmo
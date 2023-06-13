Algoritmo Mod4_Ind3
    // Declaración de variables
    Definir numeroPersonas Como Entero;
    Definir costoPorPersona Como Entero;
    Definir presupuesto Como Entero;

    // Solicitar número de personas
    Escribir "Ingrese el número de personas:";
    Leer numeroPersonas;

    // Calcular costo por persona según el número de personas
    Si numeroPersonas > 300 Entonces
        costoPorPersona = 4000
        Escribir "El número de personas es mayor a 300, el costo por persona es 4000"
    Sino
		Si numeroPersonas >= 200 Y numeroPersonas <= 300 Entonces
			costoPorPersona = 4200
			Escribir "El número de personas es entre 200 y 300, el costo por persona es 4200"
		Sino
			costoPorPersona = 4500
			Escribir "El número de personas es menor a 300, el costo por persona es 4500"
		Fin Si
	Fin Si



		// Calcular presupuesto total
		presupuesto = numeroPersonas * costoPorPersona

		// Mostrar presupuesto total
		Escribir "El presupuesto para " + ConvertirATexto(numeroPersonas) + " personas es de: $" + ConvertirATexto(presupuesto)
	Fin Algoritmo
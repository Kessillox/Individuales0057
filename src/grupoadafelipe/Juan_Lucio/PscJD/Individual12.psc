
Proceso MatrizTraspuesta
    Dimension matrizOriginal[5][3]
    Dimension matrizTraspuesta[3][5]
    Definir fila, columna como Entero
    
    Para fila = 1 Hasta 5
        Para columna = 1 Hasta 3
            matrizOriginal[fila][columna] = Aleatorio(1, 100)
        FinPara
    FinPara
    
    Para fila = 1 Hasta 5
        Para columna = 1 Hasta 3
            matrizTraspuesta[columna][fila] = matrizOriginal[fila][columna]
        FinPara
    FinPara
    
    Escribir "Matriz Original:"
    Para fila = 1 Hasta 5
        Para columna = 1 Hasta 3
            Escribir matrizOriginal[fila][columna]
        FinPara
    FinPara
    
    Escribir "Matriz Traspuesta:"
    Para fila = 1 Hasta 3
        Para columna = 1 Hasta 5
            Escribir matrizTraspuesta[fila][columna]
        FinPara
    FinPara
    
FinProceso


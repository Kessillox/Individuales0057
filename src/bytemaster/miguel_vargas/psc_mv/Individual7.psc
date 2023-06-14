    Algoritmo CalcularSueldoTrabajadores

        // Paso 1: Leer el valor a pagar por hora de trabajo
        Escribir "Ingrese el valor a pagar por hora de trabajo:"
        Leer valorHora

        // Paso 2: Leer la cantidad de trabajadores
        Escribir "Ingrese la cantidad de trabajadores:"
        Leer cantidadTrabajadores

        // Paso 3: Repetir por cada trabajador
        Para i = 1 hasta cantidadTrabajadores hacer
            // Paso 4: Leer los datos del trabajador
            Escribir "Ingrese el nombre del trabajador ", i, ":"
            Leer nombre

            Escribir "Ingrese la edad del trabajador ", i, ":"
            Leer edad

            // Paso 5: Leer las horas trabajadas en cada día de la semana
            horasTotales = 0
            Para dia = 1 hasta 5 hacer
                Escribir "Ingrese las horas trabajadas por ", nombre, " el día ", dia, ":"
                Leer horasDia
                horasTotales = horasTotales + horasDia
            Fin Para

            // Paso 6: Calcular el sueldo semanal
            sueldoSemanal = horasTotales * valorHora

            // Paso 7: Mostrar los datos del trabajador y su sueldo semanal
            Escribir "Nombre: ", nombre
            Escribir "Edad: ", edad
            Escribir "Horas trabajadas totales: ", horasTotales
            Escribir "Sueldo semanal: ", sueldoSemanal

        Fin Para
    Fin Algoritmo
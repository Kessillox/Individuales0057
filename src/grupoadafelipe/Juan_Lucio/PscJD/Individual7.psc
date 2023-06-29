Una empresa tiene el registro de las horas que trabaja diariamente un profesional durante la semana (cinco días) y requiere determinar el total de éstas, así como el sueldo que recibirá cadahora trabajada.
Se pide realizar un algoritmo en pseudocódigo que reciba una cantidad de trabajadores, y que por cada uno se pida:

- Nombre
- Edad
- Horas trabajadas en cada día de la semana

Por cada trabajador ingresado se deben desplegar los datos agregados, junto con el cálculo de su sueldo semanal. 
Recuerde que, a fin de hacer este último cálculo, debe conocer el valor a pagar por hora de trabajo; dado que es igual para todos los trabajadores, se debe solicitar una sola vez al principio del algoritmo.

--

InicioProceso "Total horas + sueldo por trabajador"

  // Solicitud del valor de la hora de trabajo
  Leer valorHoraTrabajo

  // Solicitud de la cantidad de trabajadores
  Leer cantidadTrabajadores

    InicioCiclo
    Repetir para cada trabajador desde 1

      // Solicitud de los datos del trabajador
      Leer nombre
      Leer edad

      // Solicitud de las horas trabajadas por día
      Leer horasLunes
      Leer horasMartes
      Leer horasMiercoles
      Leer horasJueves
      Leer horasViernes

      // Cálculo del total de horas trabajadas y del sueldo semanal
      totalHorasTrabajadas = horasLunes + horasMartes + horasMiercoles + horasJueves + horasViernes
      sueldoSemanal = totalHorasTrabajadas * valorHoraTrabajo

      // Mostrar los datos del trabajador y su sueldo semanal
      Mostrar "Nombre: " + nombre
      Mostrar "Edad: " + edad
      Mostrar "Total horas trabajadas: " + totalHorasTrabajadas
      Mostrar "Sueldo semanal: " + sueldoSemanal

    Hasta completar cantidadTrabajadores
    FinCiclo

FinProceso

--

Juan Lucio
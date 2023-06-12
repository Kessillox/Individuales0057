Algoritmo ModuloCuatroGrupalDos
	
	enLoop<-Verdadero
	Repetir
		Escribir "Ingrese RUT sin puntos, guion ni número verificador"
		Leer rut
		Si rut >= 100000000 Entonces
			Escribir "RUT muy largo"
		SiNo
			enLoop<-Falso
		Fin Si
	Hasta Que enLoop = Falso
	
	enLoop<-Verdadero
	Repetir
		Escribir "Ingrese nombres (no apellidos)"
		Leer nombres
		Si nombres = "" Entonces
			Escribir "Campo obligatorio"
		SiNo
			enLoop<-Falso
		Fin Si
	Hasta Que enLoop = Falso
	
	enLoop<-Verdadero
	Repetir
		Escribir "Ingrese apellidos"
		Leer apellidos
		Si apellidos = "" Entonces
			Escribir "Campo obligatorio"
		SiNo
			enLoop<-Falso
		Fin Si
	Hasta Que enLoop = Falso
	
	enLoop<-Verdadero
	Repetir
		Escribir "Ingrese telefono"
		Leer telefono
		Si longitud(telefono) > 15 Entonces
			Escribir "Telefono muy largo"
		SiNo
			enLoop<-Falso
		Fin Si
	Hasta Que enLoop = Falso
	
	enLoop<-Verdadero
	Repetir
		Escribir "Ingrese AFP"
		Leer afp
		Si afp = "" Entonces
			Escribir "Campo obligatorio"
		SiNo
			enLoop<-Falso
		Fin Si
	Hasta Que enLoop = Falso
	
	enLoop<-Verdadero
	Repetir
		Escribir "Ingrese sistema de salud, 1 para Fonasa, 2 para Isapre"
		Leer sist_salud_num
		valido<-((sist_salud_num = 1) o (sist_salud_num = 2))
		Si no valido Entonces
			Escribir "Valores validos son 1 o 2"
		SiNo
			Si sist_salud_num = 1 Entonces
				sist_salud<-"Fonasa"
			SiNo
				sist_salud<-"Isapre"
			Fin Si
			enLoop<-Falso
		Fin Si
	Hasta Que enLoop = Falso
	
	enLoop<-Verdadero
	Repetir
		Escribir "Ingrese dirección"
		Leer direccion
		Si longitud(direccion) > 50 Entonces
			Escribir "Dirección muy larga"
		SiNo
			enLoop<-Falso
		Fin Si
	Hasta Que enLoop = Falso
	
	enLoop<-Verdadero
	Repetir
		Escribir "Ingrese comuna"
		Leer comuna
		Si comuna = "" Entonces
			Escribir "Campo obligatorio"
		SiNo
			enLoop<-Falso
		Fin Si
	Hasta Que enLoop = Falso
	
	enLoop<-Verdadero
	Repetir
		Escribir "Ingrese edad"
		Leer edad
		Si edad >= 120 Entonces
			Escribir "Edad muy grande"
		SiNo
			enLoop<-Falso
		Fin Si
	Hasta Que enLoop = Falso
	
	Escribir "Sus datos son:"
	Escribir "RUT: " + cadena rut
	Escribir "Nombres: " + nombres
	Escribir "Apellidos: " + apellidos
	Escribir "Teléfono: " + telefono
	Escribir "AFP: " + afp
	Escribir "Sistema de salud: " + sist_salud
	Escribir "Dirección: " + direccion
	Escribir "Comuna: " + comuna
	Escribir "Edad: " + cadena edad
FinAlgoritmo
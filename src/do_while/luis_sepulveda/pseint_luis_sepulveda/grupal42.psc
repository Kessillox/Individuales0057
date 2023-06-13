Proceso grupal42
	definir R,P Como Logico;
	definir S,Q, respuesta como cadena;
	R=Verdadero;
	P=Verdadero;
	
	Q="Ocurre accidente";
	S="El trabajador ha sufrido incidentes";
	//"P: trabajador cuida los procedimientos de seguridad"
	//"Q: Ocurre accidente"
	//"R: Trabajador lee el manual de seguridad interno"
	//"S: El trabajador ha sufrido incidentes"
	escribir "El trabajador sigue los procedimientos de seguridad? si o no";
	leer respuesta;
	si respuesta = "no" Entonces
		p=falso;
	sino si respuesta="si" Entonces
			p=verdadero;
		fin si
		
	FinSi
		escribir "trabajador lee el manual de seguridad interno? si o no";
		leer respuesta;
		si respuesta = "no" Entonces
			R=falso;
		sino si respuesta="si" entonces
				R=verdadero;
			FinSi
			
		FinSi
	
	si P = falso o R = falso entonces
		escribir Q;
		escribir S;
	FinSi
	
	si P = Verdadero y R = Verdadero entonces
		escribir "no se ha sufrido accidente o incidente";
	FinSi
	
	
	
FinProceso

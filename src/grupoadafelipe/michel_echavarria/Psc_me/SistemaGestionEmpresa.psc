Algoritmo SistemaGestionEmpresa
	Definir matriz Como Caracter
	Dimension matriz[100, 10];
	Definir cont, OP como Entero
	
	cont = 1;
	
	repetir
		Escribir "----- MENÚ PRINCIPAL -----"
		Escribir "1. Registrar usuario"
		Escribir "2. Mostrar usuarios"
		Escribir "3. Contar usuarios por categoría"
		Escribir "4. Modificar usuario"
		Escribir "5. Eliminar usuario"
		Escribir "6. Salir"
		Escribir "7. Mostrar contador"
		Escribir "Ingrese el número de la opción:"
		Leer OP;
		
		Segun OP hacer
			1:
				RegistrarUsuario(matriz, cont)
				cont = cont + 1;
			2:
				MostrarUsuarios(matriz, cont)
			3:
				ContarUsuariosCategoria(matriz, cont)
			4:
				ModificarUsuario(matriz, cont)
			5:
				EliminarUsuario(matriz, cont)
			6:
				Escribir "Saliendo del programa..."
			7:  
				Escribir "El contador va en:",cont;	
			De Otro Modo:
				Escribir "Opción inválida. Ingrese nuevamente."
		Fin Segun
	hasta que opcion = 6
	
FinAlgoritmo

Funcion RegistrarUsuario(matriz, cont)
	Definir nombre, fechaNacimiento, run, direccion, telefono, empleados, experiencia, departamento, funcionadm, nombreSuperior como Caracter
	
	Escribir "----- REGISTRO DE USUARIO -----"
	Escribir "Ingrese el nombre:"
	Leer nombre
	matriz[cont, 1] = nombre
	Escribir "Ingrese la fecha de nacimiento:"
	Leer fechaNacimiento
	matriz[cont, 2] = fechaNacimiento	
	Escribir "Ingrese el RUN:"
	Leer run
	matriz[cont, 3] = run
	
	Escribir "Ingrese el número del perfil (1:cliente, 2:profesional, 3:administrativo)"
	Leer perfil
	
	Segun perfil Hacer	
		1:
			matriz[cont, 4] = "cliente";			
			Escribir "Ingrese la dirección del cliente:";
			Leer direccion;
			matriz[cont, 5] = direccion;	
			Escribir "Ingrese el teléfono del cliente:";
			Leer telefono;
			matriz[cont, 6] = telefono;				
			Escribir "Ingrese la cantidad de empleados de la empresa:";
			Leer empleados;
			matriz[cont, 7] = empleados;			
		2:
			matriz[cont, 4] = "profesional";			
			Escribir "Ingrese los años de experiencia del profesional:"
			Leer experiencia
			matriz[cont, 5] = experiencia;		
			Escribir "Ingrese el departamento del profesional:"
			Leer departamento
			matriz[cont, 6] = departamento;			
		3:
			matriz[cont, 4] = "administrativo";		
			Escribir "Ingrese la función del administrativo:";
			Leer funcionadm;
			matriz[cont, 5] = funcionadm;			
			Escribir "Ingrese el nombre de su superior:";
			Leer nombreSuperior;
			matriz[cont, 6] = nombreSuperior;
		De Otro Modo:
			Escribir "Debe ingresaro solo las opciones 1,2 o 3";
	Fin Segun
	Escribir "Usuario registrado exitosamente.";
FinFuncion

Funcion MostrarUsuarios(matriz, cont)
	Definir  i Como Entero
	Escribir "----- LISTADO DE USUARIOS -----"
	Para i = 1 hasta cont hacer
		Si matriz[i, 1] <> "" entonces
			Escribir "----- USUARIO ", i, " -----"
			Escribir "Nombre: ", matriz[i, 1]
			Escribir "Fecha de nacimiento: ", matriz[i, 2]
			Escribir "RUN: ", matriz[i, 3]
			Escribir "Perfil: ", matriz[i, 4]
			Segun matriz[i, 4] Hacer
				"cliente":
					Escribir "Dirección: ", matriz[i, 5]
					Escribir "Teléfono: ", matriz[i, 6]
					Escribir "Cantidad de empleados: ", matriz[i, 7]
				"profesional":
					Escribir "Años de experiencia: ", matriz[i, 5]
					Escribir "Departamento: ", matriz[i, 6]
				"administrativo":
					Escribir "Función: ", matriz[i, 5]
					Escribir "Nombre del superior: ", matriz[i, 6]
			Fin Segun
		Fin Si
	Fin Para
FinFuncion
			
Funcion ContarUsuariosCategoria(matriz, cont)
	Definir cantClientes, cantProfesionales, cantAdm como Entero
	cantClientes = 0;
	cantProfesionales = 0;
	cantAdm = 0;
			
		Para i = 1 hasta cont hacer
			Si matriz[i, 1] <> "" entonces
				Segun matriz[i, 4] Hacer
					"cliente":
						cantClientes = cantClientes + 1
					"profesional":
						cantProfesionales = cantProfesionales + 1
					"administrativo":
						cantAdm = cantAdm + 1
				Fin Segun				
			FinSi
		Fin Para
			
	Escribir "----- USUARIOS POR CATEGORÍA -----"
	Escribir "Clientes: ", cantClientes;
	Escribir "Profesionales: ", cantProfesionales;
	Escribir "Administrativos: ", cantAdm;
FinFuncion

Funcion ModificarUsuario(matriz, cont)
	Definir runModificar, nombre, fechaNacimiento, direccion, telefono, empleados, experiencia, departamento, funcionadm, nombreSuperior como Caracter;
	Definir id_usuario, i Como Entero;
	
	Escribir "----- MODIFICAR USUARIO -----"
	Escribir "Ingrese el RUN del usuario a modificar:"
	Leer runModificar
	Para i = 1 hasta cont hacer
		Si matriz[i, 3] = runModificar entonces
			id_usuario = i;
			Escribir "Usuario ",matriz[id_usuario, 1]," será modificado, por favor ingrese los nuevos datos:";
			
			Escribir "Ingrese el nombre:";
			Leer nombre;
			matriz[id_usuario, 1] = nombre;
			Escribir "Ingrese la fecha de nacimiento:";
			Leer fechaNacimiento;
			matriz[id_usuario, 2] = fechaNacimiento;	
			Escribir "Ingrese el RUN:";
			Leer run;
			matriz[id_usuario, 3] = run;
			
			Escribir "Ingrese el número del perfil (1:cliente, 2:profesional, 3:administrativo)";
			Leer perfil;
			
			Segun perfil Hacer	
				1:
					matriz[id_usuario, 4] = "cliente";
					Escribir "Ingrese la dirección del cliente:";
					Leer direccion;
					matriz[id_usuario, 5] = direccion;
					Escribir "Ingrese el teléfono del cliente:";
					Leer telefono;
					matriz[id_usuario, 6] = telefono;		
					Escribir "Ingrese la cantidad de empleados de la empresa:";
					Leer empleados;
					matriz[id_usuario, 7] = empleados;
				2:
					matriz[id_usuario, 4] = "profesional";
					Escribir "Ingrese los años de experiencia del profesional:"
					Leer experiencia
					matriz[id_usuario, 5] = experiencia;
					Escribir "Ingrese el departamento del profesional:"
					Leer departamento
					matriz[id_usuario, 6] = departamento;
				3:
					matriz[id_usuario, 4] = "administrativo";
					Escribir "Ingrese la función del administrativo:";
					Leer funcionadm;
					matriz[id_usuario, 5] = funcionadm;
					Escribir "Ingrese el nombre de su superior:";
					Leer nombreSuperior;
					matriz[id_usuario, 6] = nombreSuperior;
				De Otro Modo:
					Escribir "Debe ingresaro solo las opciones 1,2 o 3";
			Fin Segun
			Escribir "Usuario registrado exitosamente.";
		SiNo
			Escribir "No se encontró ningún usuario con el RUN especificado.";
		FinSi
	FinPara
FinFuncion

Funcion EliminarUsuario(matriz, cont)
	Definir runEliminar, encontreUsuario como Caracter;
	Definir id_usuario Como Entero
	id_usuario = 0;
	Escribir "----- ELIMINAR USUARIO -----"
	Escribir "Ingrese el RUN del usuario a eliminar:"
	Leer runEliminar
	
	Para i = 1 hasta cont hacer
		Si matriz[i, 3] = runEliminar entonces
			id_usuario = i;
			Para j = i hasta cont hacer
				matriz[j, 1] = matriz[j + 1, 1];
				matriz[j, 2] = matriz[j + 1, 2];
				matriz[j, 3] = matriz[j + 1, 3];
				matriz[j, 4] = matriz[j + 1, 4];
				matriz[j, 5] = matriz[j + 1, 5];
				matriz[j, 6] = matriz[j + 1, 6];
				matriz[j, 7] = matriz[j + 1, 7];
			Fin Para
				matriz[cont, 1] = "";
				matriz[cont, 2] = "";
				matriz[cont, 3] = "";
				matriz[cont, 4] = "";
				matriz[cont, 5] = "";
				matriz[cont, 6] = "";
				matriz[cont, 7] = "";
				cont = cont - 1;
				Escribir "Usuario eliminado exitosamente.";		
	    FinSi
		Si i = cont y id_usuario = 0 Entonces
				Escribir "No se encontró ningún usuario con el RUN especificado.";
		FinSi
	Fin Para
FinFuncion


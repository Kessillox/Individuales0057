import java.util.Scanner;

public class SistemaGestionEmpresa {
    public static void main(String[] args) {
        char[][] matriz = new char[100][10];
        int cont = 1;
        
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        do {
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Mostrar usuarios");
            System.out.println("3. Contar usuarios por categoría");
            System.out.println("4. Modificar usuario");
            System.out.println("5. Eliminar usuario");
            System.out.println("6. Salir");
            System.out.println("7. Mostrar contador");
            System.out.print("Ingrese el número de la opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    registrarUsuario(matriz, cont);
                    cont++;
                    break;
                case 2:
                    mostrarUsuarios(matriz, cont);
                    break;
                case 3:
                    contarUsuariosCategoria(matriz, cont);
                    break;
                case 4:
                    modificarUsuario(matriz, cont);
                    break;
                case 5:
                    eliminarUsuario(matriz, cont);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                case 7:
                    System.out.println("El contador va en: " + cont);
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese nuevamente.");
            }
        } while (opcion != 6);
        
        scanner.close();
    }
    
    public static void registrarUsuario(char[][] matriz, int cont) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----- REGISTRO DE USUARIO -----");
        System.out.print("Ingrese el nombre: ");
        matriz[cont][0] = scanner.nextLine().toCharArray();
        System.out.print("Ingrese la fecha de nacimiento: ");
        matriz[cont][1] = scanner.nextLine().toCharArray();
        System.out.print("Ingrese el RUN: ");
        matriz[cont][2] = scanner.nextLine().toCharArray();
        
        System.out.println("Ingrese el número del perfil (1:cliente, 2:profesional, 3:administrativo):");
        int perfil = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        switch (perfil) {
            case 1:
                matriz[cont][3] = "cliente".toCharArray();
                System.out.print("Ingrese la dirección del cliente: ");
                matriz[cont][4] = scanner.nextLine().toCharArray();
                System.out.print("Ingrese el teléfono del cliente: ");
                matriz[cont][5] = scanner.nextLine().toCharArray();
                System.out.print("Ingrese la cantidad de empleados de la empresa: ");
                matriz[cont][6] = scanner.nextLine().toCharArray();
                break;
            case 2:
                matriz[cont][3] = "profesional".toCharArray();
                System.out.print("Ingrese los años de experiencia del profesional: ");
                matriz[cont][4] = scanner.nextLine().toCharArray();
                System.out.print("Ingrese el departamento del profesional: ");
                matriz[cont][5] = scanner.nextLine().toCharArray();
                break;
            case 3:
                matriz[cont][3] = "administrativo".toCharArray();
                System.out.print("Ingrese la función del administrativo: ");
                matriz[cont][4] = scanner.nextLine().toCharArray();
                System.out.print("Ingrese el nombre de su superior: ");
                matriz[cont][5] = scanner.nextLine().toCharArray();
                break;
            default:
                System.out.println("Debe ingresar solo las opciones 1, 2 o 3");
                break;
        }
        
        System.out.println("Usuario registrado exitosamente.");
    }
    
    public static void mostrarUsuarios(char[][] matriz, int cont) {
        System.out.println("----- LISTADO DE USUARIOS -----");
        for (int i = 1; i < cont; i++) {
            if (matriz[i][0] != null) {
                System.out.println("----- USUARIO " + i + " -----");
                System.out.println("Nombre: " + new String(matriz[i][0]));
                System.out.println("Fecha de nacimiento: " + new String(matriz[i][1]));
                System.out.println("RUN: " + new String(matriz[i][2]));
                System.out.println("Perfil: " + new String(matriz[i][3]));
                switch (new String(matriz[i][3])) {
                    case "cliente":
                        System.out.println("Dirección: " + new String(matriz[i][4]));
                        System.out.println("Teléfono: " + new String(matriz[i][5]));
                        System.out.println("Cantidad de empleados: " + new String(matriz[i][6]));
                        break;
                    case "profesional":
                        System.out.println("Años de experiencia: " + new String(matriz[i][4]));
                        System.out.println("Departamento: " + new String(matriz[i][5]));
                        break;
                    case "administrativo":
                        System.out.println("Función: " + new String(matriz[i][4]));
                        System.out.println("Nombre del superior: " + new String(matriz[i][5]));
                        break;
                }
            }
        }
    }
    
    public static void contarUsuariosCategoria(char[][] matriz, int cont) {
        int cantClientes = 0;
        int cantProfesionales = 0;
        int cantAdm = 0;
        
        for (int i = 1; i < cont; i++) {
            if (matriz[i][0] != null) {
                switch (new String(matriz[i][3])) {
                    case "cliente":
                        cantClientes++;
                        break;
                    case "profesional":
                        cantProfesionales++;
                        break;
                    case "administrativo":
                        cantAdm++;
                        break;
                }
            }
        }
        
        System.out.println("----- USUARIOS POR CATEGORÍA -----");
        System.out.println("Clientes: " + cantClientes);
        System.out.println("Profesionales: " + cantProfesionales);
        System.out.println("Administrativos: " + cantAdm);
    }
    
    public static void modificarUsuario(char[][] matriz, int cont) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----- MODIFICAR USUARIO -----");
        System.out.print("Ingrese el RUN del usuario a modificar: ");
        String runModificar = scanner.nextLine();
        
        int idUsuario = 0;
        for (int i = 1; i < cont; i++) {
            if (new String(matriz[i][2]).equals(runModificar)) {
                idUsuario = i;
                System.out.println("Usuario " + new String(matriz[idUsuario][0]) + " será modificado, por favor ingrese los nuevos datos:");
                
                System.out.print("Ingrese el nombre: ");
                matriz[idUsuario][0] = scanner.nextLine().toCharArray();
                System.out.print("Ingrese la fecha de nacimiento: ");
                matriz[idUsuario][1] = scanner.nextLine().toCharArray();
                System.out.print("Ingrese el RUN: ");
                matriz[idUsuario][2] = scanner.nextLine().toCharArray();
                
                System.out.print("Ingrese el número del perfil (1:cliente, 2:profesional, 3:administrativo): ");
                int perfil = Integer.parseInt(scanner.nextLine());
                
                switch (perfil) {
                    case 1:
                        matriz[idUsuario][3] = "cliente".toCharArray();
                        System.out.print("Ingrese la dirección del cliente: ");
                        matriz[idUsuario][4] = scanner.nextLine().toCharArray();
                        System.out.print("Ingrese el teléfono del cliente: ");
                        matriz[idUsuario][5] = scanner.nextLine().toCharArray();
                        System.out.print("Ingrese la cantidad de empleados de la empresa: ");
                        matriz[idUsuario][6] = scanner.nextLine().toCharArray();
                        break;
                    case 2:
                        matriz[idUsuario][3] = "profesional".toCharArray();
                        System.out.print("Ingrese los años de experiencia del profesional: ");
                        matriz[idUsuario][4] = scanner.nextLine().toCharArray();
                        System.out.print("Ingrese el departamento del profesional: ");
                        matriz[idUsuario][5] = scanner.nextLine().toCharArray();
                        break;
                    case 3:
                        matriz[idUsuario][3] = "administrativo".toCharArray();
                        System.out.print("Ingrese la función del administrativo: ");
                        matriz[idUsuario][4] = scanner.nextLine().toCharArray();
                        System.out.print("Ingrese el nombre de su superior: ");
                        matriz[idUsuario][5] = scanner.nextLine().toCharArray();
                        break;
                    default:
                        System.out.println("Debe ingresar solo las opciones 1, 2 o 3");
                        break;
                }
                
                System.out.println("Usuario modificado exitosamente.");
                break;
            }
            
            if (i == cont - 1 && idUsuario == 0) {
                System.out.println("No se encontró ningún usuario con el RUN especificado.");
            }
        }
    }
    
    public static void eliminarUsuario(char[][] matriz, int cont) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----- ELIMINAR USUARIO -----");
        System.out.print("Ingrese el RUN del usuario a eliminar: ");
        String runEliminar = scanner.nextLine();
        
        int idUsuario = 0;
        for (int i = 1; i < cont; i++) {
            if (new String(matriz[i][2]).equals(runEliminar)) {
                idUsuario = i;
                for (int j = i; j < cont; j++) {
                    matriz[j][0] = matriz[j + 1][0];
                    matriz[j][1] = matriz[j + 1][1];
                    matriz[j][2] = matriz[j + 1][2];
                    matriz[j][3] = matriz[j + 1][3];
                    matriz[j][4] = matriz[j + 1][4];
                    matriz[j][5] = matriz[j + 1][5];
                    matriz[j][6] = matriz[j + 1][6];
                }
                matriz[cont][0] = null;
                matriz[cont][1] = null;
                matriz[cont][2] = null;
                matriz[cont][3] = null;
                matriz[cont][4] = null;
                matriz[cont][5] = null;
                matriz[cont][6] = null;
                cont--;
                
                System.out.println("Usuario eliminado exitosamente.");
                break;
            }
            
            if (i == cont - 1 && idUsuario == 0) {
                System.out.println("No se encontró ningún usuario con el RUN especificado.");
            }
        }
    }
}

package main;

import java.util.Scanner;

//MartinDCantero

/* 02-Tipos de datos
a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double, boolean y String. 
	Asigna un valor a cada variable y muestra su contenido en la consola. 

b) Asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String en un double… 
	¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no? Justificar el por qué de cada caso. Debatir con otros compañeros. 
*/

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcion;

		// Declaramos variables con distintos tipos. Asignamos valores por defecto
		int numero = 0;
		double numeroDecimal = 0.0d;
		boolean esValido = false;
		String texto = null;

//		// Declaramos variables con distintos tipos, asignamos valores de tipo erróneo
//		// BORRAR COMENTARIOS PARA PODER LEER LOS ERRORES OCASIONADOS POR TIPOS ERRÓNEOS
//		int numeroError = "Hola";
//		double doubleError = 5; // Podemos asignar un int a un double, se interpreta como double con 0 decimales
//		double doubleError2 = false;
//		boolean esValidoError = "true";
//		String textoError = 4;

		// MENU
		do {
			System.out.println("\nMENU:");
			System.out.println("1. Mostrar valores por defecto");
			System.out.println("2. Escanear int");
			System.out.println("3. Escanear double");
			System.out.println("4. Escanear boolean");
			System.out.println("5. Escanear String");
			System.out.println("6. Salir" + "\n");
			System.out.print("Selecciona una opción " + "\n");

			// Variable para controlar las opciones del menú
			opcion = scanner.nextInt();
			// Scanner para leer el input del usuario
			scanner.nextLine();

			switch (opcion) {
			case 1:
				// VALORES POR DEFECTO VARIABLES DISTINTOS TIPOS
				System.out.println("Valores de las variables con valores por defecto:\n"
						+ "---------------------------------------------------");
				System.out.println("int predeterminado: " + numero);
				System.out.println("double predeterminado: " + numeroDecimal);
				System.out.println("booleano predeterminado: " + esValido);
				System.out.println("String predeterminado: " + texto + "\n");
				break;

			// EN LOS CASE DEL 2 AL 5 PODEMOS ESCANEAR VALORES Y ASIGNARLOS A DISTINTOS TIPOS DE VARIABLES
			// Y VER SI SE PRODUCE ALGÚN ERROR
			case 2:
				// COMPROBAR INT
				try {
					System.out.print("introduce un int: ");
					System.out.println("Correcto: " + Integer.parseInt(scanner.nextLine()) + " es de tipo int\n");
				} catch (NumberFormatException e) {
					System.err.print("Error: No es un int \n");
				}
				break;
			case 3:
				// COMPROBAR DOUBLE
				// Si asignamos un int, no se producirá error
				try {
					System.out.print("introduce un double: ");
					System.out.println("Correcto: " + Double.parseDouble(scanner.nextLine()) + " es de tipo double\n");
					System.out.print(
							"Java realiza una conversión automática del entero al tipo double, y el valor se interpreta como un double con cero decimales.\n");
				} catch (NumberFormatException e) {
					System.err.print("Error: No es un double \n");
				}
				break;
			case 4:
				// COMPROBAR BOOLEAN
				// Si asignamos cualquier cosa que no sea true, se tomará como false
				try {
					System.out.print("Introduce un boolean (true or false): ");
					System.out.println("Boolean introducido: " + Boolean.parseBoolean(scanner.nextLine()) + "\n");
					System.out.print("Si escaneamos cualquier cosa que no sea true,\nretornará siempre false\n");
				} catch (IllegalArgumentException e) {
					System.out.println("Error: No es un boolean");
				}
				break;
			case 5:
				// COMPROBAR STRING
				//Podemos escanear cualquier cosa sin errores, cualquier input será tomado como String
				System.out.print("Introduce un string: ");
				System.out.println("String introducida: " + scanner.nextLine() + "\n");
				System.out.print(
						"Cualquier cosa que escaneemos será correcta\ncuando utilizamos el método nextLine() todo se convierte a String \n");
				break;
			case 6:
				break;
			default:
				System.err.println("No es una opción válida, prueba de nuevo.");
				break;
			}
			// Salimos del bucle do-while al seleccionar como opcion 6
		} while (opcion != 6);

		scanner.close(); // Cerramos el scanner cuando termina el programa
	}

}

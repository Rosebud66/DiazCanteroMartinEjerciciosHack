package main;

import java.util.Scanner;

//MartinDCantero

/* 04-Operaciones de Lectura
a) Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: suma, resta, multiplicación y división. 
	Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.

Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste hasta ahora… ¿De qué manera tratarías de evitar ésta situación?
*/

public class Main {

	// Scanner como atributo de clase
	private Scanner scanner;

	public static void main(String[] args) {

		Main main = new Main();
		main.scanner = new Scanner(System.in); // Asignamos el scanner al atributo de clase
		int opcion;

		// MENU
		do {
			System.out.println("\nMENU:");
			System.out.println("1. Introduce 2 números, realiza operaciones matemáticas");
			System.out.println("2. Suma");
			System.out.println("3. Resta");
			System.out.println("4. Multiplicación");
			System.out.println("5. División");
			System.out.println("6. Salir" + "\n");
			System.out.print("Selecciona una opción: " + "\n");

			// Variable para controlar las opciones del menú
			opcion = main.scanner.nextInt();
			// Scanner para leer el input del usuario
			main.scanner.nextLine();

			switch (opcion) {
			case 1:
				// PIDE AL USUARIO 2 NÚMEROS. LOS SUMA, RESTA, MULTIPLICA Y DIVIDE
				main.calculaTodasOperaciones();
				break;
			case 2:
				// SUMA 2 NÚMEROS PASADOS POR PARÁMETRO
				main.suma(4, 7);
				break;
			case 3:
				// RESTA 2 NÚMEROS PASADOS POR PARÁMETRO
				main.resta(4, 7);
				break;
			case 4:
				// MULTIPLICA 2 NÚMEROS PASADOS POR PARÁMETRO
				main.multiplicacion(4, 7);
				break;
			case 5:
				// DIVIDE 2 NÚMEROS PASADOS POR PARÁMETRO
				main.division(4, 7);
				break;
			case 6:
				break;
			default:
				System.err.println("No es una opción válida, prueba de nuevo.");
				break;
			}
			// Salimos del bucle do-while al seleccionar como opcion 6
		} while (opcion != 6);

		main.scanner.close(); // Cerramos el scanner cuando termina el programa
	}

	// REALIZA LAS OPERACIONES DE SUMA, RESTA, MULTIPLICACIÓN Y DIVISIÓN DE 2 NÚMEROS QUE SE PREGUNTAN AL USUARIO
	public void calculaTodasOperaciones() {
		// Preguntamos al usuario el primer número
		System.out.print("Introduce el primer número");
		int numero1 = 0;

		// Comprobamos que es un número válido
		try {
			numero1 = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error: No es un número válido");
			return; // Salimos del método si no es un número válido
		}

		// Preguntamos al usuario el segundo número
		System.out.print("Introduce el segundo número ");
		int numero2 = 0;

		// Comprobamos que es un número válido
		try {
			numero2 = Integer.parseInt(scanner.nextLine());
			System.out.println();
		} catch (NumberFormatException e) {
			System.out.println("Error: No es un número válido");
			return; // Salimos del método si no es un número válido
		}

		// Comprobamos que el numero 2 no sea 0
		if (numero2 == 0) {
			System.err.println("Error: División entre 0 no está permitida \n");
			return; // Salimos del método para evitar dividir entre 0
		}

		// SUMA
		int suma = numero1 + numero2;
		System.out.println("La suma de " + numero1 + " + " + numero2 + " es igual a = " + suma);

		// RESTA
		int resta = numero1 - numero2;
		System.out.println("La resta de " + numero1 + " - " + numero2 + " es igual a = " + resta);

		// MULTIPLICACIÓN
		int multiplicacion = numero1 * numero2;
		System.out.println("La multiplicación de " + numero1 + " * " + numero2 + " es igual a = " + multiplicacion);

		// DIVISIÓN
		int division = numero1 / numero2;
		System.out.println("La división de " + numero1 + " / " + numero2 + " es igual a = " + division);

		System.out.println();
	}

	// SUMA 2 NÚMEROS RECIBIDOS POR PARÁMETRO
	public void suma(double a, double b) {
		double suma = a + b;
		System.out.println("La suma " + a + " + " + b + " es igual a = " + suma);
	}

	// RESTA 2 NÚMEROS RECIBIDOS POR PARÁMETRO
	public void resta(double a, double b) {
		double resta = a - b;
		System.out.println("La resta " + a + " - " + b + " es igual a = " + resta);
	}

	// MULTIPLICA 2 NÚMEROS RECIBIDOS POR PARÁMETRO
	public void multiplicacion(double a, double b) {
		double multiplicacion = a * b;
		System.out.println("La multiplicación de " + a + " * " + b + " es igual a = " + multiplicacion);
	}

	// DIVIDE 2 NÚMEROS RECIBIDOS POR PARÁMETRO
	public void division(double a, double b) {
		double division = a / b;
		System.out.println("La división de  " + a + " / " + b + " es igual a = " + division);
	}

}

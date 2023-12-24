package main;

import java.util.Scanner;

//MartinDCantero

/* 03-Variables y operadores
a) Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla.. 
	Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).
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
			System.out.println("1. Calcula el área de un triángulo");
			System.out.println("2. Introduce base y altura y calcula el área de un triángulo");
			System.out.println("3. Dibujar triángulo");
			System.out.println("4. Introduce base y altura y dibuja un triángulo");
			System.out.println("5. Salir" + "\n");
			System.out.print("Selecciona una opción: " + "\n");

			// Variable para controlar las opciones del menú
			opcion = main.scanner.nextInt();
			// Scanner para leer el input del usuario
			main.scanner.nextLine();

			switch (opcion) {
			case 1:
				// CALCULAR EL ÁREA DE UN TRIÁNGULO CON BASE Y ALTURA RECIBIDOS PARÁMETRO
				main.calculoAreaTriangulo(3, 5);
				break;
			case 2:
				// CALCULAR ÁREA TRIÁNGULO. PREGUNTAR USUARIO POR BASE Y ALTURA
				main.calculoAreaTrianguloScanner();
				break;
			case 3:
				// DIBUJA UN TRIÁNGULO CON BASE Y ALTURA RECIBIDOS PARÁMETRO
				main.dibujarTriangulo(7, 6);
				break;
			case 4:
				// DIBUJAR UN TRIÁNGULO. PREGUNTAR USUARIO POR BASE Y ALTURA
				main.dibujarTrianguloScanner();
				break;
			case 5:
				break;
			default:
				System.err.println("No es una opción válida, prueba de nuevo.");
				break;
			}
			// Salimos del bucle do-while al seleccionar como opcion 5
		} while (opcion != 5);

		main.scanner.close(); // Cerramos el scanner cuando termina el programa
	}

	// CALCULAR ÁREA DE UN TRIÁNGULO. RECIBE BASE Y ALTURA COMO PARÁMETROS
	public void calculoAreaTriangulo(double base, double altura) {
		// Fórmula área triángulo
		double area = (base * altura) / 2;

		System.out.println("El área de un triángulo con base = " + base + " y altura = " + altura + " es igual a = "
				+ area + "\n");
	}

	// CALCULAR ÁREA DE UN TRIÁNGULO. SE PREGUNTA AL USUARIO POR BASE Y ALTURA
	// USANDO SCANNER
	public void calculoAreaTrianguloScanner() {

		// Preguntamos al usuario por la BASE
		System.out.print("Introduce la base del triángulo: ");
		double base = 0.0;
		
		// Comprobamos que es un número válido
		try {
			base = Double.parseDouble(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.err.println("Error: No es un número válido");
			return; // Salimos del método si la base no es un número válido
		}

		// Preguntamos al usuario por la ALTURA
		System.out.print("Introduce la altura del triángulo: ");
		double altura = 0.0;
		
		// Comprobamos que es un número válido
		try {
			altura = Double.parseDouble(scanner.nextLine());
			System.out.println();
		} catch (NumberFormatException e) {
			System.err.println("Error: No es un número válido");
			return; // Salimos del método si la altura no es un número válido
		}

		// Fórmula para calcular el área de un triángulo
		double area = (base * altura) / 2;

		System.out.println(
				"El área del triángulo con base = " + base + " y altura = " + altura + " es igual a = " + area + "\n");
	}

	// DIBUJA EN LA CONSOLA UN TRIÁNGULO CON LA BASE Y ALTURA RECIBIDAS POR
	// PARÁMETRO
	public void dibujarTriangulo(int base, int altura) {

		// Comprobamos que la base sea mayor o igual que la altura
		if (base >= altura) {
			for (int i = 0; i < altura; i++) {
				for (int j = 0; j < 2 * base - 1; j++) {
					if (j >= base - 1 - i && j <= base - 1 + i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.err.println("La base no puede ser menor que la altura.");
		}
	}

	// DIBUJA EN LA CONSOLA UN TRIÁNGULO. SE PREGUNTA LA BASE Y ALTURA AL USUARIO
	// POR CONSOLA
	public void dibujarTrianguloScanner() {

		// Preguntamos al usuario por la BASE
		System.out.print("Introduce la base del triángulo: ");
		double base = 0.0;
		
		// Comprobamos que es un número válido
		try {
			base = Double.parseDouble(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.err.println("Error: No es un número válido");
			return; // Salimos del método si la base no es un número válido
		}

		// Preguntamos al usuario por la ALTURA
		System.out.print("Introduce la altura del triángulo: ");
		double altura = 0.0;
		
		// Comprobamos que es un número válido
		try {
			altura = Double.parseDouble(scanner.nextLine());
			System.out.println();
		} catch (NumberFormatException e) {
			System.err.println("Error: No es un número válido");
			return; // Salimos del método si la altura no es un número válido
		}

		// Comprobamos que la base sea mayor o igual que la altura
		if (base >= altura) {
			for (int i = 0; i < altura; i++) {
				for (int j = 0; j < 2 * base - 1; j++) {
					if (j >= base - 1 - i && j <= base - 1 + i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.err.println("La base no puede ser menor que la altura.");
		}
	}

}

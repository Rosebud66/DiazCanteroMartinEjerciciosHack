package main;

import java.util.Scanner;

//MartinDCantero

/* 06-Estructuras Repetitivas
a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.
	Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar. 
	Luego, muestra el total de la compra que debe abonar.
*/

public class Main {

	// Scanner como atributo de clase
	private Scanner scanner;

	public static void main(String[] args) {

		Main main = new Main();
		main.scanner = new Scanner(System.in); // Asignamos el scanner al atributo de clase

		int precioTotal = 0;

		while (true) {
			System.out.println("Introduce el precio de un producto: (presiona 0 para finalizar)");

			try {
				// Comprobamos que se introduzca un número por teclado
				if (main.scanner.hasNextInt()) {
					// Asignamos a precioProducto el número introducido por teclado
					int precioProducto = main.scanner.nextInt();

					// Si el número es 0, cerramos la ejecución del programa
					if (precioProducto == 0) {
						break;
					}
					// si es mayor que 0 (precio válido) sumamos el valor a precioTotal
					else if (precioProducto > 0) {
						precioTotal += precioProducto;
					}
					// si no es mayor que 0, informamos que debe ser un número positivo
					else {
						System.err.println("\nDebes introducir un número positivo.\n");
					}
				}
				// Si no se introduce un número, se informa de que debe ser uno válido
				else {
					System.err.println("\nDebes introducir un número válido.\n");
					main.scanner.next(); // Limpiamos el scanner erróneo
				}

			} catch (Exception e) {
				System.err.println("\nDebes introducir un número válido.\n");
				main.scanner.next(); // Limpiamos el scanner erróneo
			}

		}
		// Informamos del precio total, suma de los precios de cada producto
		System.out.println("\nEl precio total = " + precioTotal + "\n");
	}

}

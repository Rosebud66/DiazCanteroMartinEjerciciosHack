package main;

import java.util.Arrays;
import java.util.Scanner;

//MartinDCantero

/* 08-Matrices
a) Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. 
	Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:

	-Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").

	-Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2"). 
		El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.

	-Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.

	-A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.

	-El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.
*/

public class Main {
	private Scanner scanner; // Scanner as class attribute

	public static void main(String[] args) {
		Main main = new Main();
		main.scanner = new Scanner(System.in); // Asignamos el scanner al atributo de clase

		char[][] asientos = new char[5][5]; // Matriz para representar los asientos (5x5)
//											0 0 0 0 0
//											0 0 0 0 0
//											0 0 0 0 0
//											0 0 0 0 0
//											0 0 0 0 0

		// Inicializamos los asientos como libres ('0')
		for (char[] fila : asientos) {
			Arrays.fill(fila, 'O');
		}

		int opcion;
		boolean ejecutandose = true;

		while (ejecutandose == true) {
			// Mapa de asientos
			System.out.println("\nMapa de asientos:");
			for (int i = 0; i < asientos.length; i++) {
				for (int j = 0; j < asientos[i].length; j++) {
					System.out.print(asientos[i][j] + " ");
				}
				System.out.println();
			}

			// MENU
			System.out.println();
			System.out.println("MENU:");
			System.out.println("1. Elije un asiento");
			System.out.println("2. Ver todos los asientos");
			System.out.println("3. Salir" + "\n");
			System.out.print("Selecciona una opción: " + "\n");

			// Variable para controlar las opciones del menú
			opcion = main.scanner.nextInt();
			// Scanner para leer el input del usuario
			main.scanner.nextLine();

			switch (opcion) {
			case 1:
				// ELIJE UN ASIENTO INTRODUCIENDO LA FILA Y NÚMERO DE ASIENTO

				// Pedir número de fila
				System.out.println("Selecciona una fila");
				int fila = main.scanner.nextInt();

				// Pedir número de asiento
				System.out.println("Selecciona un asiento");
				int asiento = main.scanner.nextInt();

				// Comprobamos que ni la fila ni el asiento sean menor que 1 ni mayor que 5
				// (Nuestra Matriz es de 5 x 5)
				if (fila < 1 || fila > 5 || asiento < 1 || asiento > 5) {
					System.err.println("No se ha seleccionado un asiento válido");
					break;
				}

				// Restamos 1 a fila y asiento, de manera que emepzeos a contar desde 1 los
				// asientos, en vez de desde 0 que es como funcionan las listas
				if (asientos[fila - 1][asiento - 1] == 'O') {
					// Si el asiento tiene '0' significa que está libre por lo que lo cambiamos por
					// 'X'
					asientos[fila - 1][asiento - 1] = 'X';
					System.out.println(
							"Reserva realizada exitosamente en la fila " + fila + ", asiento " + asiento + ".\n");
					System.out.println("¿Quieres reservar otro asiento?");
				}
				// Si el asiento de la posición seleccionada tenia 'X', significa que está
				// ocupado, se informa al usuario
				else {
					System.err.println("Lo sentimos, ese asiento ya está ocupado");
					System.out.println();
				}
				break;
			case 2:
				// Mapa de asientos
				System.out.println("Mapa de asientos:");
				for (int i = 0; i < asientos.length; i++) {
					for (int j = 0; j < asientos[i].length; j++) {
						System.out.print(asientos[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 3:
				// Si seleccionamos la opción 3, ejecutandose pasa a false, por lo que se
				// finaliza la ejecución del programa
				ejecutandose = false;
				break;
			default:
				System.err.println("No es una opción válida, prueba de nuevo.");
				System.out.println();
				break;
			}

		}

	}

}

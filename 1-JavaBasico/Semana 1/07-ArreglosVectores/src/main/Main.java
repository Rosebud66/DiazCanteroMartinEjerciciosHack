package main;

import java.util.Scanner;

//MartinDCantero

/* 07-Arreglos Vectores
a) Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.

	Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día. 
	Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.
*/

public class Main {

	// Scanner como atributo de clase
	private Scanner scanner;
	// Vector para almacenar las temperaturas semanales
	int[] temperaturas = new int[7];

	public static void main(String[] args) {
		Main main = new Main();
		main.scanner = new Scanner(System.in); // Asignamos el scanner al atributo de clase
		int opcion;

		// MENU
		do {
			System.out.println("\nMENU:");
			System.out.println("1. Guardar temperaturas semanales");
			System.out.println("2. Calcular temperatura media semanal");
			System.out.println("3. Mostrar temperaturas gráficamente");
			System.out.println("4. Mostrar media gráficamente");
			System.out.println("5. Salir" + "\n");
			System.out.print("Selecciona una opción: " + "\n");

			// Variable para controlar las opciones del menú
			opcion = main.scanner.nextInt();
			// Scanner para leer el input del usuario
			main.scanner.nextLine();

			switch (opcion) {
			case 1:
				// GUARDAR EN UN VECTOR LAS TEMPERATURAS SEMANALES
				main.guardarTemperaturas();
				break;
			case 2:
				// CALCULAR TEMPERATURA MEDIA SEMANAL
				main.calcularTemperaturaMedia();
				break;
			case 3:
				// MOSTRAR TEMPERATURAS GRÁFICAMENTE
				main.mostrarTemperaturasGraficamente();
				break;
			case 4:
				// MOSTRAR TEMPERATURA MEDIA GRÁFICAMENTE
				main.mostrarMediaGraficamente();
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

	// SE PIDEN LAS TEMPERATURAS SEMANALES Y SE GUARDAN EN UN VECTOR
	public void guardarTemperaturas() {
		System.out.println("Escribe las temperaturas de la semana pasada:");
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Temperatura de día " + (i + 1) + ": ");
			temperaturas[i] = scanner.nextInt();
		}
	}

	// SE CALCULA LA TEMPERATURA MEDIA DE LAS TEMPERATURAS DEL VECTOR
	public void calcularTemperaturaMedia() {
		double suma = 0;

		// Recorremos el vector de las temperaturas
		for (int temp : temperaturas) {
			// Sumamos cada temperatura a la variable suma
			suma += temp;
		}

		// Dividimos suma entre el número de registros del vector par obtener la media
		double media = suma / temperaturas.length;

		// Mostrar el resultado
		System.out.println("La temperatura media de la semana pasada: " + media + " grados Celsius.\n");
	}

	// MUESTRA LAS TEMPERATURAS ALMACENADAS EN EL VECTOR DE FORMA GRÁFICA
	public void mostrarTemperaturasGraficamente() {
		System.out.println("\nGráfica temperaturas:");
		for (int temp : temperaturas) {
			System.out.print(temp + "°C | ");
			for (int i = 0; i < temp; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// MUESTRA LA TEMPERATURA MEDIA GRÁFICAMENTE
	public void mostrarMediaGraficamente() {
		double suma = 0;
		
		// Recorremos el vector de las temperaturas
		for (int temp : temperaturas) {
			// Sumamos cada temperatura a la variable suma
			suma += temp;
		}
		
		// Dividimos suma entre el número de registros del vector par obtener la media
		double media = suma / temperaturas.length;

		// Muestra la temperatura media con **
		System.out.println("\nTemperatura media: " + media + "°C | ");
		for (int i = 0; i < media; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}

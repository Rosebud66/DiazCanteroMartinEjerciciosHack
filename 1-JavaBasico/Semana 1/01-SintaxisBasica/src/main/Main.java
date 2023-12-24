package main;

import java.util.Scanner;

// MartinDCantero

/* 01-Sintaxis básica
a) Escribir un programa en Java que muestre por pantalla un mensaje de Bienvenida a un usuario. 
	Por ejemplo: “Hola, bienvenido al sistema”. 

b) Una vez logrado esta primera parte, permitir que se almacene el nombre del usuario en una variable y se muestre el mismo en el mensaje. 
	Por ejemplo: “Hola Eduardo, bienvenida al sistema”.
*/

public class Main {
	
	public static void main(String[] args) {
		
		// Scanner para leer el input del usuario
		Scanner scanner = new Scanner(System.in); 

		// Mostrar mensaje de bienvenida
		System.out.println("Hola, Bienvenid@ al sistema\n");

		// Preguntar nombre al usuario
		System.out.print("Escribe tu nombre: ");

		// Leemos línea de texto
		String nombre = scanner.nextLine();

		// Guardamos el nombre en una variable con la primera letra mayúscula
		String nombreFormateado = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();

		// Saludar al usuario con su nombre
		System.out.println("\nHola " + nombreFormateado + ",  Bienvenid@ al sistema");
		
		scanner.close(); // Cerramos el scanner cuando termina el programa
	}

}
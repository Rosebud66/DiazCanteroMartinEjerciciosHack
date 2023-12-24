package main;

import java.util.Scanner;

//MartinDCantero

/* 05-Estructuras Condicionales
a) Una recital permite únicamente el ingreso de mayores de 18 años. 
	Para ello necesita un programa que, a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento. 
	El programa debe mostrar (según cada caso) un mensaje informando la situación.
*/

public class Main {

	// Scanner como atributo de clase
	private Scanner scanner; 

	public static void main(String[] args) {
		
		Main main = new Main();
		main.scanner = new Scanner(System.in); // Asignamos el scanner al atributo de clase
		int edad = 0;
		
		// Pregunta al usuario por su edad
		System.out.println("\nHola, buenos días. Debido a políticas internas, el evento está reservado a mayores de 18 años.\n");

		// Pregunta la edad al usuario
		System.out.print("¿Cuántos años tienes?: \n");

		try {
			// Escaneamos la edad del usuario por entrada de teclado
			edad = main.scanner.nextInt();
			
			// Comprobamos que la edad sea mayor o igual que 0
			if(edad >= 0) {
				// Si esEdadValida devuelve true, informamos de que puede pasar al evento
				if(main.esEdadValida(edad)) {
					System.out.println("Puedes pasar; Que disfrutes del evento.");
				}
				// Si devuelve false, informamos de que no puede pasar, y de los días que quedan para ser mayor de edad
				else {
					System.err.println("Lo siento, no se te permite la entrada, vuelve en  " + ((18 - edad) * 365) + " días");
				}		
			}
			// Si la edad es menor que 0, informamos que no puede ser una edad negativa
			else {
				System.err.println("No puedes tener una edad negativa");
			}
		} 
		// Si se introduce algo que no es un número, se informa de que la edad debe ser un número válido
		catch (Exception e) {
			System.err.println("Debes introducir una edad válida");
		}
	}

	// COMPRUEBA SI LA EDAD RECIBIDA POR PARÁMETRO ES MAYOR A 18, EN CUYO CASO DEVUELVE TRUE
	public boolean esEdadValida(int edad) {
		
		boolean mayorEdad = false;
		
		// Si la edad es menor de 18, mayorEdad sigue false
		if (edad < 18 && edad >= 0) {
			mayorEdad = false;
		} 
		// Si edad es mayor de 18, mayorEdad pasa a true
		else if (edad >= 18) {
			mayorEdad = true;
		} 
		
		return mayorEdad;
	}

}


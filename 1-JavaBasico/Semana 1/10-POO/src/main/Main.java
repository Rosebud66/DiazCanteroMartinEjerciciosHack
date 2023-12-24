package main;

import models.Persona;

//MartinDCantero

/* 10-POO
a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.

b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.

c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.

d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
*/

public class Main {

	public static void main(String[] args) {
		// Crear un vector de tipo Persona con cinco posiciones
		Persona[] personas = new Persona[5];

		// Crear cinco personas y guardarlas en el vector
		personas[0] = new Persona(1, "Juan", 30, "Calle A", "123456789");
		personas[1] = new Persona(2, "María", 25, "Calle B", "987654321");
		personas[2] = new Persona(3, "Pedro", 40, "Calle C", "456789123");
		personas[3] = new Persona(4, "Ana", 35, "Calle D", "789123456");
		personas[4] = new Persona(5, "Luis", 28, "Calle E", "321654987");

		// MOSTRAR DATOS PERSONAS
		System.out.println("DATOS PERSONAS");
		for (Persona persona : personas) {
			mostrarDatos(persona);
			System.out.println();
		}

		// MOSTRAR LOS DATOS ANTES DEL CAMBIO DE NOMBRE
		System.out.println("DATOS ANTES DEL CAMBIO:");
		mostrarDatos(personas[1]); // Mostrar datos de María
		mostrarDatos(personas[3]); // Mostrar datos de Ana
		System.out.println();

		// CAMBIAR LOS NOMBRES DE 2 PERSONAS
		personas[1].setNombre("Maribel");
		personas[3].setNombre("Andrés");

		// MOSTRAR DATOS DESPUÉS DEL CAMBIO DE NOMBRE
		System.out.println("DATOS DESPUÉS DEL CAMBIO:");
		mostrarDatos(personas[1]); // Mostrar datos de Maribel
		mostrarDatos(personas[3]); // Mostrar datos de Andrés
		System.out.println();
		
		// MOSTRAR DATOS DE PERSONAS MAYORES DE 30 AÑOS
		System.out.println("DATOS DE PERSONAS MAYORES DE 30 AÑOS");
		for (Persona persona : personas) {
			if (persona.getEdad() >= 30) {
				mostrarDatos(persona);
			}
		}
		System.out.println();
	}

	// MÉTODO QUE RECIBE UNA PERSONA POR PARÁMETRO Y MUESTRA SUS DATOS
	public static void mostrarDatos(Persona persona) {
		System.out.println();
		System.out.println("ID: " + persona.getId());
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());
		System.out.println("Dirección: " + persona.getDireccion());
		System.out.println("Número de Teléfono: " + persona.getNumeroTelefono());
	}

}

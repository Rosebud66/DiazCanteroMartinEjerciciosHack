package main;

import models.Electrodomestico;

//MartinDCantero

/* 09-Clases y objetos
a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.

b) Crea 1 objeto de la clase Electrodomestico sin parámetros.

c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.

d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
*/

public class Main {

	public static void main(String[] args) {
		// Creación de 3 objetos de la clase Electrodomestico utilizando parámetros
		Electrodomestico electro1 = new Electrodomestico(1, "Samsung", "Modelo1", 100.5, "Blanco");
		Electrodomestico electro2 = new Electrodomestico(2, "LG", "Modelo2", 120.0, "Negro");
		Electrodomestico electro3 = new Electrodomestico(3, "Sony", "Modelo3", 90.8, "Gris");

		// Creación de 1 objeto de la clase Electrodomestico sin parámetros
		Electrodomestico electro4 = new Electrodomestico();

		// Crear un array de Electrodomestico con capacidad para 4 elementos
		Electrodomestico[] electrodomesticos = new Electrodomestico[3];

		// Asignar los objetos a cada posición del array
		electrodomesticos[0] = electro1;
		electrodomesticos[1] = electro2;
		electrodomesticos[2] = electro3;

		// Mostrar los datos de todos los electrodomésticos utilizando un bucle
		for (Electrodomestico electro : electrodomesticos) {
			mostrarDatos(electro);
		}

		// Obtener y mostrar atributos electrodomestico sin parámetros
		System.out.println("La marca del electrodoméstico sin parámetros: ");
		System.out.println("Código: " + electro4.getCod());
		System.out.println("Marca: " + electro4.getMarca());
		System.out.println("Modelo: " + electro4.getModelo());
		System.out.println("Consumo: " + electro4.getConsumo());
		System.out.println("Color: " + electro4.getColor());
		System.out.println("\n(Cuando usamos el constructor por defecto, muestra los valores por defecto)");
	}

	// Método que recibe un Electrodomestico por parámetro y muestra los datos de sus atributos
	public static void mostrarDatos(Electrodomestico electro) {

		System.out.println("Electrodomestico " + electro.getCod() + " :");

		System.out.println("Código: " + electro.getCod());
		System.out.println("Marca: " + electro.getMarca());
		System.out.println("Modelo: " + electro.getModelo());
		System.out.println("Consumo: " + electro.getConsumo());
		System.out.println("Color: " + electro.getColor());

		System.out.println();
	}

}

package main;

import models.Ave;
import models.Mamifero;
import models.Reptil;
import models.Animal;

//MartinDCantero

/* 01-Herencia, polimorfismo y encapsulamiento
a)Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación (con sus métodos y constructores correspondientes). 
	Agregar también un método llamado saludar que emita un mensaje por pantalla que diga “Hola, soy un animal”.
	
c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.

d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?

E) Cambiar el modificador de acceso de los métodos de "public" a "private". 
	Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?
*/

public class Main {

	public static void main(String[] args) {
		
		// Creacion objetos clases hijas
		Mamifero mamifero = new Mamifero(1, "León", 7, "Pelo", "Carnívoro", 4, "Vivíparo", "Amarillo", "Bosque seco");
		Ave ave = new Ave(4, "Colibrí", 1, "Plumas", "Omnívoro", 0.1, "Vuelo batido", "Azul", "Lezna");
		Reptil reptil = new Reptil(5, "Cocodrilo", 10, "Escamas", "Carnívoro", 4.5, "Escamas rugosas", "No venenoso", "Agua dulce");
		
		// Llamamos al método saludar de cada clase hija
		mamifero.saludar();
		ave.saludar();
		reptil.saludar();
		
		System.out.println("---------------------");
		
		// Asignar Mamifero a objeto clase Animal
		// Al saludar, nos mostrará el mensaje del método saludar de la clase mamifero
		Animal animal = mamifero;
		animal.saludar();
		
		// Si cambiamos la vivibilidad de los métodos a private, NO podremos acceder a ellos desde fuera de la clase donde se definen	
	}

}

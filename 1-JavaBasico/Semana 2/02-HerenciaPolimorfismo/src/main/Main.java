package main;

import models.Camiseta;
import models.Pantalon;
import models.Sombrero;
import models.Vestimenta;
import models.Zapato;

//MartinDCantero

/* 02-Herencia y polimorfismo
a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
	Camiseta: manga, cuello
b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 
	3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).
	
d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
*/

public class Main {

	public static void main(String[] args) {

		// Vector de tipo Vestimenta
		Vestimenta[] vestimentas = new Vestimenta[9];

		// Objetos Zapato
		vestimentas[0] = new Zapato(1, "Nike Air", 89.90, "Nike", 44.5, "Negro", "Algodón sustentable", "Cordones");
		vestimentas[1] = new Zapato(2, "Vans Old School", 65.90, "Vans", 44, "Negro", "Estructura vulcanizada de goma", "Cordones");
		vestimentas[2] = new Zapato(3, "Sketchers Sport Air", 45.00, "Sketchers", 42, "Azul", "Caucho", "Cordones");

		// Objetos Pantalon
		vestimentas[3] = new Pantalon(4, "Pantalón vaquero", 20, "Zara", 30, "Azul", "Skinny", "Poliéster");
		vestimentas[3] = new Pantalon(5, "Pantalón cargo corto", 35.99, "Pull&Bear", 25, "Gris", "Regular fit", "Algodón");
		vestimentas[4] = new Pantalon(6, "Pantalón deportivo", 25.99, "Nike", 32, "Negro", "Ajustado", "Poliamida");

		// Objetos Camiseta
		vestimentas[6] = new Camiseta(7, "Camiseta manga corta", 14.99, "Tommy Hilfiger", 15, "Blanca", "Corta", "Redondo");
		vestimentas[7] = new Camiseta(8, "Camiseta manga larga", 19.99, "Emporio Armani", 20, "Gris", "Larga", "V");

		// Objetos Sombrero
		vestimentas[8] = new Sombrero(9, "Sombrero de paja", 7.99, "Sombreros Mengual", 6, "Amarillo", "Paja", 5);

		// Recorrer el vector y ejecutar el método que corresponde para cada posición
		for (Vestimenta vestimenta : vestimentas) {
			if (vestimenta instanceof Zapato) {
				((Zapato) vestimenta).mostrarMarca();
			} else if (vestimenta instanceof Pantalon) {
				((Pantalon) vestimenta).mostrarEstilo();
			} else if (vestimenta instanceof Camiseta) {
				((Camiseta) vestimenta).mostrarTipoManga();
			} else if (vestimenta instanceof Sombrero) {
				((Sombrero) vestimenta).mostrarTipoSombrero();
			}
		}
	}
	
}

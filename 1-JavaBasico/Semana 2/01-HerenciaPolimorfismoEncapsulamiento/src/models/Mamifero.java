package models;

//MartinDCantero

/* 01-Herencia, polimorfismo y encapsulamiento
a) Crear sus clases hijas que compartan sus atributos y métodos:
	"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.
	
b) Una vez creadas las clases, crear los siguientes métodos:
	"Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".
*/

public class Mamifero extends Animal {

	// Atributos de clase
	private int numeroPatas;
	private String tipoReproduccion;
	private String colorPelaje;
	private String habitat;

	// Constructor con atributos clase Animal y atributos clase Mamifero
	public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int numeroPatas,
			String tipoReproduccion, String colorPelaje, String habitat) {
		super(id, nombre, edad, tipoPiel, tipoAlimentacion);
		this.numeroPatas = numeroPatas;
		this.tipoReproduccion = tipoReproduccion;
		this.colorPelaje = colorPelaje;
		this.habitat = habitat;
	}

	// Sobreescritura método clase padre
	@Override
	public void saludar() {
		System.out.println("Hola, soy un mamífero.");
	}

	// Getters y Setters
	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public String getTipoReproduccion() {
		return tipoReproduccion;
	}

	public void setTipoReproduccion(String tipoReproduccion) {
		this.tipoReproduccion = tipoReproduccion;
	}

	public String getColorPelaje() {
		return colorPelaje;
	}

	public void setColorPelaje(String colorPelaje) {
		this.colorPelaje = colorPelaje;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

}

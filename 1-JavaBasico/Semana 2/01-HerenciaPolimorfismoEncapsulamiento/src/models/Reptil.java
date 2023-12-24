package models;

//MartinDCantero

/* 01-Herencia, polimorfismo y encapsulamiento
a) Crear sus clases hijas que compartan sus atributos y métodos:
	"Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.
	
b) Una vez creadas las clases, crear los siguientes métodos:
	"Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".
*/

public class Reptil extends Animal {

	// Atributos de clase
	private double longitud;
	private String tipoEscamas;
	private String tipoVeneno;
	private String habitat;

	// Constructor con atributos clase Animal y atributos clase Reptil
	public Reptil(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, double longitud,
			String tipoEscamas, String tipoVeneno, String habitat) {
		super(id, nombre, edad, tipoPiel, tipoAlimentacion);
		this.longitud = longitud;
		this.tipoEscamas = tipoEscamas;
		this.tipoVeneno = tipoVeneno;
		this.habitat = habitat;
	}

	// Sobreescritura método clase padre
	@Override
	public void saludar() {
		System.out.println("Hola, soy un reptil.");
	}

	// Getters y Setters
	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getTipoEscamas() {
		return tipoEscamas;
	}

	public void setTipoEscamas(String tipoEscamas) {
		this.tipoEscamas = tipoEscamas;
	}

	public String getTipoVeneno() {
		return tipoVeneno;
	}

	public void setTipoVeneno(String tipoVeneno) {
		this.tipoVeneno = tipoVeneno;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

}

package models;

//MartinDCantero

/* 01-Herencia, polimorfismo y encapsulamiento
a) Crear sus clases hijas que compartan sus atributos y métodos:
	"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
	
b) Una vez creadas las clases, crear los siguientes métodos:
	"Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".
*/

public class Ave extends Animal {

	// Atributos de clase
	private double envergaduraAlas;
	private String tipoVuelo;
	private String colorPlumaje;
	private String tipoPico;

	// Constructor con atributos clase Animal y atributos clase Ave
	public Ave(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, double envergaduraAlas,
			String tipoVuelo, String colorPlumaje, String tipoPico) {
		super(id, nombre, edad, tipoPiel, tipoAlimentacion);
		this.envergaduraAlas = envergaduraAlas;
		this.tipoVuelo = tipoVuelo;
		this.colorPlumaje = colorPlumaje;
		this.tipoPico = tipoPico;
	}

	// Sobreescritura método clase padre
	@Override
	public void saludar() {
		System.out.println("Hola, soy un ave.");
	}

	// Getters y Setters
	public double getEnvergaduraAlas() {
		return envergaduraAlas;
	}

	public void setEnvergaduraAlas(double envergaduraAlas) {
		this.envergaduraAlas = envergaduraAlas;
	}

	public String getTipoVuelo() {
		return tipoVuelo;
	}

	public void setTipoVuelo(String tipoVuelo) {
		this.tipoVuelo = tipoVuelo;
	}

	public String getColorPlumaje() {
		return colorPlumaje;
	}

	public void setColorPlumaje(String colorPlumaje) {
		this.colorPlumaje = colorPlumaje;
	}

	public String getTipoPico() {
		return tipoPico;
	}

	public void setTipoPico(String tipoPico) {
		this.tipoPico = tipoPico;
	}

}

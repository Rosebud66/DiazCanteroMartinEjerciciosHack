package models;

//MartinDCantero

/* 02-Herencia y polimorfismo
a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
	Pantalon: estilo, tipoTejido
	
c) Crear los siguientes métodos (en cada subclase correspondiente):
	Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).
*/

public class Pantalon extends Vestimenta {

	// Atributos de clase
	private String estilo;
	private String tipoTejido;

	// Constructor con atributos clase Vestimenta y atributos clase Pantalon
	public Pantalon(int codigo, String nombre, double precio, String marca, double talla, String color, String estilo,
			String tipoTejido) {
		super(codigo, nombre, precio, marca, talla, color);
		this.estilo = estilo;
		this.tipoTejido = tipoTejido;
	}

	// Método para mostrar el estilo de los pantalones
	public void mostrarEstilo() {
		System.out.println("Estos pantalones son de estilo: " + getEstilo());
	}

	// Getters y Setters
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getTipoTejido() {
		return tipoTejido;
	}

	public void setTipoTejido(String tipoTejido) {
		this.tipoTejido = tipoTejido;
	}

}

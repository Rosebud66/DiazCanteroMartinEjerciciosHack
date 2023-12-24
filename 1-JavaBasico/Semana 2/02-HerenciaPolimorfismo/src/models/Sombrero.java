package models;

//MartinDCantero

/* 02-Herencia y polimorfismo
a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
	Sombrero: tipo, tamaño
	
c) Crear los siguientes métodos (en cada subclase correspondiente):
	Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).
*/

public class Sombrero extends Vestimenta {

	// Atributos de clase
	private String tipo;
	private double tamanyo;

	// Constructor con atributos clase Vestimenta y atributos clase Sombrero
	public Sombrero(int codigo, String nombre, double precio, String marca, double talla, String color, String tipo,
			double tamanyo) {
		super(codigo, nombre, precio, marca, talla, color);
		this.tipo = tipo;
		this.tamanyo = tamanyo;
	}

	// Método para mostrar el tipo de sombrero
	public void mostrarTipoSombrero() {
		System.out.println("Este sombrero es de tipo: " + getTipo());
	}

	// Getters y Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(double tamanyo) {
		this.tamanyo = tamanyo;
	}

}

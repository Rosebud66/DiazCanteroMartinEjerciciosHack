package models;

//MartinDCantero

/* 02-Herencia y polimorfismo
a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
	Camiseta: manga, cuello
	
c) Crear los siguientes métodos (en cada subclase correspondiente):
	Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).
*/

public class Camiseta extends Vestimenta {

	// Atributos de clase
	private String manga;
	private String cuello;

	// Constructor con atributos clase Vestimenta y atributos clase Camiseta
	public Camiseta(int codigo, String nombre, double precio, String marca, double talla, String color, String manga,
			String cuello) {
		super(codigo, nombre, precio, marca, talla, color);
		this.manga = manga;
		this.cuello = cuello;
	}
	
	// Método para mostrar el tipo de manga de la camiseta
    public void mostrarTipoManga() {
        System.out.println("Esta camiseta tiene una manga de tipo: " + getManga());
    }

    // Getters y Setters
	public String getManga() {
		return manga;
	}

	public void setManga(String manga) {
		this.manga = manga;
	}

	public String getCuello() {
		return cuello;
	}

	public void setCuello(String cuello) {
		this.cuello = cuello;
	}
    
    
}

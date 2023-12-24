package models;

//MartinDCantero

/* 02-Herencia y polimorfismo
a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
	Zapato: material, tipoCierre
	
c) Crear los siguientes métodos (en cada subclase correspondiente):
	Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).
*/

public class Zapato extends Vestimenta {

	// Atributos de clase
	private String material;
	private String tipoCierre;

	// Constructor con atributos clase Vestimenta y atributos clase Zapato
	public Zapato(int codigo, String nombre, double precio, String marca, double talla, String color, String material,
			String tipoCierre) {
		super(codigo, nombre, precio, marca, talla, color);
		this.material = material;
		this.tipoCierre = tipoCierre;
	}

	// Método para mostrar la marca de los zapatos
    public void mostrarMarca() {
        System.out.println("Estos zapatos son de la marca: " + getMarca());
    }
	
	// Getters y Setters
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTipoCierre() {
		return tipoCierre;
	}

	public void setTipoCierre(String tipoCierre) {
		this.tipoCierre = tipoCierre;
	}

}

package models;

//MartinDCantero

/* 09-Clases y objetos
a) Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) 
	con los siguientes atributos: cod, marca, modelo, consumo y color.
*/

public class Electrodomestico {
	
	// Atributos de clase
	private int cod;
	private String marca;
	private String modelo;
	private double consumo;
	private String color;

	// Constructor sin parámetros (constructor por defecto)
	public Electrodomestico() {
		// Inicialización de los atributos con valores por defecto
		this.cod = 0;
		this.marca = "";
		this.modelo = "";
		this.consumo = 0.0;
		this.color = "";
	}

	// Constructor con parámetros
	public Electrodomestico(int cod, String marca, String modelo, double consumo, String color) {
		this.cod = cod;
		this.marca = marca;
		this.modelo = modelo;
		this.consumo = consumo;
		this.color = color;
	}

	// Getters y setters
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Electrodomestico [cod=" + cod + ", marca=" + marca + ", modelo=" + modelo + ", consumo=" + consumo
				+ ", color=" + color + "]";
	}
	
	

}

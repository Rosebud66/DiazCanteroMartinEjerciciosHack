package models;

//MartinDCantero

/* 02-Herencia y polimorfismo
a) Crear una clase llamada Vestimenta con los atributos: 
	código, nombre, precio, marca, talla y color (con sus métodos y constructores correspondientes).
*/

public class Vestimenta {

	// Atributos de clase
	private int codigo;
	private String nombre;
	private double precio;
	private String marca;
	private double talla;
	private String color;

	// Constructor con parámetros
	public Vestimenta(int codigo, String nombre, double precio, String marca, double talla, String color) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
		this.talla = talla;
		this.color = color;
	}

	// Getters y Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vestimenta [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", marca=" + marca
				+ ", talla=" + talla + ", color=" + color + "]";
	}
	
}

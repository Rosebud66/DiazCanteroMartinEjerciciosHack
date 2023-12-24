package models;

//MartinDCantero

/* 04-Collections
Un administrador de una tienda de electrónica necesita un programa para gestionar los productos en su inventario. 
	Para ello, necesita la creación de una clase Producto que cuente con los siguientes datos: 
		código, nombre, marca, tipo, precio costo, precio venta, cantidad en stock.
*/

public class Producto {

	// Atributos de clase
	private int id;
	private String nombre;
	private String marca;
	private String tipo;
	private double precioCosto;
	private double precioVenta;
	private int cantidadStock;

	// Constructor
	public Producto(int id, String nombre, String marca, String tipo, double precioCosto, double precioVenta,
			int cantidadStock) {
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.tipo = tipo;
		this.precioCosto = precioCosto;
		this.precioVenta = precioVenta;
		this.cantidadStock = cantidadStock;
	}

	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecioCosto() {
		return precioCosto;
	}

	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

}

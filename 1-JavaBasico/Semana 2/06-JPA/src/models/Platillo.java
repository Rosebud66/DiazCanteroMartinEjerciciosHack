package models;

//MartinDCantero

public class Platillo {

	// Atributos de clase
	private int id;
	private String nombre;
	private String receta;
	private double precio;

	// Constructor vacío
	public Platillo() {

	}

	// Constructor
	public Platillo(int id, String nombre, String receta, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.receta = receta;
		this.precio = precio;
	}

	// Getters y setters
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

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}

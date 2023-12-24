package models;

//MartinDCantero

/* 01-Herencia, polimorfismo y encapsulamiento
a) Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación (con sus métodos y constructores correspondientes). 
	Agregar también un método llamado saludar que emita un mensaje por pantalla que diga “Hola, soy un animal”.
*/

public class Animal {

	// Atributos de clase
	private int id;
	private String nombre;
	private int edad;
	private String tipoPiel;
	private String tipoAlimentacion;

	// Constructor con parámetros
	public Animal(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.tipoPiel = tipoPiel;
		this.tipoAlimentacion = tipoAlimentacion;
	}

	// Método que emite un mensaje por pantalla
	public void saludar() {
		System.out.println("Hola, soy un animal");
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipoPiel() {
		return tipoPiel;
	}

	public void setTipoPiel(String tipoPiel) {
		this.tipoPiel = tipoPiel;
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", tipoPiel=" + tipoPiel
				+ ", tipoAlimentacion=" + tipoAlimentacion + "]";
	}
	
	

}

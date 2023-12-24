package models;

//MartinDCantero

/* 10-POO
a) Crear una clase Persona, que tenga los siguientes atributos: 
	id, nombre, edad, dirección y número de teléfono (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
*/

public class Persona {
	private int id;
	private String nombre;
	private int edad;
	private String direccion;
	private String numeroTelefono;

	// Constructor sin parámetros (constructor por defecto)
	public Persona() {
		this.id = 0;
		this.nombre = "";
		this.edad = 0;
		this.direccion = "";
		this.numeroTelefono = "";
	}

	// Constructor con parámetros
	public Persona(int id, String nombre, int edad, String direccion, String numeroTelefono) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.numeroTelefono = numeroTelefono;
	}

	// Getters y setters para acceder y modificar los atributos
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion
				+ ", numeroTelefono=" + numeroTelefono + "]";
	}
	
}


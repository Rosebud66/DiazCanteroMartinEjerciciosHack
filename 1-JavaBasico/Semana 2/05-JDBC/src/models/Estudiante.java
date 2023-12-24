package models;

//MartinDCantero

/* 05-JDBC
Crear una aplicación para gestionar una lista de estudiantes en una base de datos. Los estudiantes tendrán atributos como id, nombre, edad y calificación.

El sistema debe ser capaz de permitir agregar nuevos estudiantes, recuperar la lista de todos y mostrar su información.

Crear una base de datos mediante MySQL llamada universidad y una tabla llamada estudiantes cuyas columnas coincidan con los atributos de la clase estudiante.

Utilizar JDBC (Java Database Connectivity) para interactuar con la base de datos.
*/

public class Estudiante {

	// Atributos de clase
	private int id;
	private String nombre;
	private int edad;
	private double calificacion;

	// Constructor sin valores
	public Estudiante() {
	}

	// Constructor
	public Estudiante(int id, String nombre, int edad, double calificacion) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.calificacion = calificacion;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

}

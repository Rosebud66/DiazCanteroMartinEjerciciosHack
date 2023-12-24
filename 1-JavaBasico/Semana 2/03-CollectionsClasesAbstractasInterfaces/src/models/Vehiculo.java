package models;

//MartinDCantero

/* 03-Collections, clases abstractas e interfaces
a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos: 
	id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.
*/

public abstract class Vehiculo {

	// Atributos de clase
	protected int id;
    protected String placa;
    private String marca;
    protected String modelo;
    protected int anyo;
    protected double costo;

    // Constructor
    public Vehiculo(int id, String placa, String marca, String modelo, int anyo, double costo) {
		super();
		this.id = id;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anyo = anyo;
		this.costo = costo;
	}
    
    // Método abstracto para calcular la antiguedad del Vehiculo
    public abstract int calcularAntiguedad();

    // Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
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

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
    	
}

package models;

import java.time.LocalDate;
import interfaces.Electrico;

//MartinDCantero

/* 03-Collections, clases abstractas e interfaces
c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. 
	Agrega atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs). 
		Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.
*/

public class Auto extends Vehiculo implements Electrico {

	// Atributos de clase
	private int capacidadBateria;
	private double autonomia;

	// Constructor con atributos clase Vehiculo y atributos clase Auto
	public Auto(int id, String placa, String marca, String modelo, int anyo, double costo, int capacidadBateria,
			double autonomia) {
		super(id, placa, marca, modelo, anyo, costo);
		this.capacidadBateria = capacidadBateria;
		this.autonomia = autonomia;
	}

	// Implementación método de la clase Vehiculo
	@Override
	public int calcularAntiguedad() {
		int anyoActual = LocalDate.now().getYear();
		return anyoActual - anyo;
	}

	// Implementación método de la Interfaz Electrico
	@Override
	public void cargarEnergia() {
		System.out.println("Se está cargando energía eléctrica");
	}

	// Getters y Setters
	public int getCapacidadBateria() {
		return capacidadBateria;
	}

	public void setCapacidadBateria(int capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}

	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

}

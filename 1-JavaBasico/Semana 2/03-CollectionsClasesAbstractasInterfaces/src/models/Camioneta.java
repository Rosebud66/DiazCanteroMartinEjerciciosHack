package models;

import java.time.LocalDate;
import interfaces.Combustion;

//MartinDCantero

/* 03-Collections, clases abstractas e interfaces
d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion. 
	Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible. 
		Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
*/

public class Camioneta extends Vehiculo implements Combustion {

	// Atributos de clase
	private double capacidadTanque;
	private double consumoCombustible;
	
	// Constructor con atributos clase Vehiculo y atributos clase Camioneta
	public Camioneta(int id, String placa, String marca, String modelo, int anyo, double costo, double capacidadTanque, double consumoCombustible) {
		super(id, placa, marca, modelo, anyo, costo);
		this.capacidadTanque = capacidadTanque;
		this.consumoCombustible = consumoCombustible;
	}

	// Implementación método de la clase Vehiculo
	@Override
	public int calcularAntiguedad() {
		int anyoActual = LocalDate.now().getYear();
		return anyoActual - anyo;
	}

	// Implementación método de la Interfaz Combustion
	@Override
	public void recargarCombustible() {
		System.out.println("Se está recargando combustible");
		
	}
	
	// Getters y Setters
	public double getCapacidadTanque() {
		return capacidadTanque;
	}

	public void setCapacidadTanque(double capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	public double getConsumoCombustible() {
		return consumoCombustible;
	}

	public void setConsumoCombustible(double consumoCombustible) {
		this.consumoCombustible = consumoCombustible;
	}
		
}

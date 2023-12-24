package models;

import java.time.LocalDate;
import interfaces.Combustion;

//MartinDCantero

/* 03-Collections, clases abstractas e interfaces
e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion. 
	Agrega atributos específicos para las motos de combustión, como cilindrada y tipoMotor. 
		Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
*/

public class Moto extends Vehiculo implements Combustion {

	// Atributos de clase
	private int cilindrada;
	private String tipoMotor;

	// Constructor con atributos clase Vehiculo y atributos clase Moto
	public Moto(int id, String placa, String marca, String modelo, int anyo, double costo, int cilindrada, String tipoMotor) {
		super(id, placa, marca, modelo, anyo, costo);
		this.cilindrada = cilindrada;
		this.tipoMotor = tipoMotor;
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
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}	

}

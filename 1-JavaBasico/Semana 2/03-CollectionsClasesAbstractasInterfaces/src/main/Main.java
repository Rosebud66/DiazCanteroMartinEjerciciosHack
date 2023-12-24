package main;

import java.util.ArrayList;

import interfaces.Combustion;
import interfaces.Electrico;

import models.Auto;
import models.Camioneta;
import models.Moto;
import models.Vehiculo;

//MartinDCantero

/* 03-Collections, clases abstractas e interfaces
Un sistema de gestión de vehículos necesita ser desarrollado para una futura implementación para una tienda de venta de autos. 
	Se requiere utilizar para su implementación tanto clases abstractas como interfaces para modelar este sistema.
	
f) Main: En el programa principal, crea objetos de diferentes tipos de vehículos 
	(autos eléctricos, camionetas de combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo. 
		Muestra información sobre cada uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía o combustible según corresponda.
*/

public class Main {

	public static void main(String[] args) {

		// Creamos un ArrayList para almacenar distintos tipos de Vehiculos
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();

		// Objeto Auto
		Auto auto = new Auto(1, "2450 GDF", "Tesla", "Tesla Cybertruck", 2019, 49000, 125, 652);

		// Objeto Camioneta
		Camioneta camioneta = new Camioneta(2, "DEF456", "Toyota", "Hilux", 2019, 40000, 60, 10);

		// Objeto Moto
		Moto moto = new Moto(3, "GHI789", "Honda", "CBR600RR", 2017, 12000, 600, "4 tiempos");

		// Añadir vehículos al ArrayList
		vehiculos.add(auto);
		vehiculos.add(camioneta);
		vehiculos.add(moto);

		// Mostrar información de cada Vehiculo del ArrayList
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println("Vehículo nº " + vehiculo.getId());
			System.out.println("Placa: " + vehiculo.getPlaca());
			System.out.println("Marca: " + vehiculo.getMarca());
			System.out.println("Modelo: " + vehiculo.getModelo());
			System.out.println("Año: " + vehiculo.getAnyo());
			System.out.println("Costo: " + vehiculo.getCosto());
			System.out.println("Antigüedad: " + vehiculo.calcularAntiguedad() + " años");

			// Verificamos si es eléctrico o de combustión
			if (vehiculo instanceof Electrico) {
				((Electrico) vehiculo).cargarEnergia();
			} else if (vehiculo instanceof Combustion) {
				((Combustion) vehiculo).recargarCombustible();
			}
			System.out.println();
		}
	}

}

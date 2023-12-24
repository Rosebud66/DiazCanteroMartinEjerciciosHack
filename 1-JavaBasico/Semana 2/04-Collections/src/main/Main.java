package main;

import java.util.ArrayList;

import models.Producto;

//MartinDCantero

/* 04-Collections
a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados (por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).

b) Guardar estos objetos creados en un ArrayList.

c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.

d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.

e) Borrar el producto que se encuentre en la posición 5 del ArrayList.

f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock 
	y actualizar el registro en la lista en base a eso.

g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.
*/

public class Main {

	public static void main(String[] args) {

		// Creamos un ArrayList para almacenar distintos tipos de Vehiculos
		ArrayList<Producto> productos = new ArrayList<>();

		// Crear 10 objetos tipo Producto
		Producto producto1 = new Producto(1, "Laptop", "HP", "Electrónico", 800.0, 1200.0, 50);
		Producto producto2 = new Producto(2, "Smartphone", "Samsung", "Electrónico", 500.0, 750.0, 80);
		Producto producto3 = new Producto(3, "Camisa", "Zara", "Ropa", 25.0, 50.0, 150);
		Producto producto4 = new Producto(4, "Zapatos", "Nike", "Calzado", 80.0, 120.0, 60);
		Producto producto5 = new Producto(5, "Libro", "Penguin", "Librería", 10.0, 20.0, 200);
		Producto producto6 = new Producto(6, "Teclado", "Logitech", "Electrónico", 30.0, 50.0, 40);
		Producto producto7 = new Producto(7, "Cámara", "Canon", "Electrónico", 300.0, 500.0, 30);
		Producto producto8 = new Producto(8, "Silla", "IKEA", "Mueble", 50.0, 80.0, 100);
		Producto producto9 = new Producto(9, "Pantalón", "Levi's", "Ropa", 35.0, 60.0, 90);
		Producto producto10 = new Producto(10, "Botella de Agua", "Dasani", "Bebida", 1.0, 2.0, 500);

		// Añadir productos al ArrayList
		productos.add(producto1);
		productos.add(producto2);
		productos.add(producto3);
		productos.add(producto4);
		productos.add(producto5);
		productos.add(producto6);
		productos.add(producto7);
		productos.add(producto8);
		productos.add(producto9);
		productos.add(producto10);

		// MAYOR PRECIO DE VENTA
		// Variable para almacenar el producto con mayor precio de venta
		Producto masCaro = null;

		// Recorrer el ArrayList en busca del producto con mayor precio de venta
		for (Producto producto : productos) {
			// Verificamos si el producto actual tiene mayor precio de venta que masCaro
			if (masCaro == null || producto.getPrecioVenta() > masCaro.getPrecioVenta()) {
				// Si tiene mayor precio de venta, asignamos el producto actual a masCaro
				masCaro = producto;
			}
		}

		// Imprimimos el producto con mayor precio de venta
		if (masCaro != null) {
			System.out.println("El producto con el mayor precio de venta es: " + masCaro.getNombre()
					+ " con un precio de venta de: " + masCaro.getPrecioVenta());
		} else {
			// Si no tenemos ningún producto en el ArrayList informamos por pantalla
			System.err.println("No se han encontrado productos");
		}

		// MAYOR PRECIO DE COSTO
		// Variable para almacenar el producto con menor precio de costo
		Producto menosCosto = null;

		// Recorrer el ArrayList en busca del producto con menor precio de costo
		for (Producto producto : productos) {
			// Verificamos si el producto actual tiene menor precio de costo que menosCosto
			if (menosCosto == null || producto.getPrecioCosto() < menosCosto.getPrecioCosto()) {
				// Si tiene menor precio de costo, asignamos el producto actual a menosCosto
				menosCosto = producto;
			}
		}

		// Imprimimos el producto con menor precio de costo
		if (menosCosto != null) {
			System.out.println("El producto con el menor precio de costo es: " + menosCosto.getNombre()
					+ " con un precio de costo de: " + menosCosto.getPrecioCosto());
		} else {
			// Si no tenemos ningún producto en el ArrayList informamos por pantalla
			System.err.println("No se han encontrado productos");
		}

		// BORRAR PRODUCTO POSICIÓN 5
		// Verificamos que haya al menos 6 elementos en el ArrayList
		if (productos.size() >= 6) {
			// Eliminar el producto en la posición 5
			productos.remove(5);
			System.out.println("Se ha eliminado el producto de la posición 5.");
		} else {
			System.err.println("No hay ningún producto en la posición 5, el tamaño del ArrayList es inferior");
		}

		// MAYOR CANTIDAD STOCK
		// Variable para almacenar el producto con mayor cantidad de Stock
		Producto masStock = null;

		// Recorrer el ArrayList en busca del producto con mayor cantidad de Stock
		for (Producto producto : productos) {
			if (masStock == null || producto.getCantidadStock() > masStock.getCantidadStock()) {
				masStock = producto;
			}
		}
		
		// Restamos 3 unidades al Stock del producto con mayor Stock
		if (masStock != null) {
			 System.out.println("El producto con el mayor Stock es: " + masStock.getNombre() + " con un Stock de: " + masStock.getCantidadStock());
			// Guardamos en stockActualizado el stock del producto con mayor - 3
		    int stockActualizado = masStock.getCantidadStock() - 3;
		    // Asignamos al Stock del producto el stockActualizado
		    masStock.setCantidadStock(stockActualizado);
		    System.out.println("Se han descontado 3 unidades al Stock del producto: " + masStock.getNombre());
		    System.out.println("El Stock del producto: " + masStock.getNombre() + " es ahora: " + masStock.getCantidadStock());
		} else {
		    System.err.println("No se han encontrado productos");
		}
	}

}

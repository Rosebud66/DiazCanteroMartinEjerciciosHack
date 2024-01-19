package logic;

import exception.DatosProductoInvalidosException;
import java.util.List;
import models.Producto;

public class GestionInventario {

    public static void agregarProductoAlInventario(String nombre, double precio, int cantidadDisponible, List<Producto> inventario)
            throws DatosProductoInvalidosException {
        // Validar la información del producto
        if (nombre == null || nombre.isEmpty()) {
            throw new DatosProductoInvalidosException("El nombre del producto no puede estar vacío.");
        }

        if (precio <= 0) {
            throw new DatosProductoInvalidosException("El precio del producto debe ser mayor que cero.");
        }

        if (cantidadDisponible < 0) {
            throw new DatosProductoInvalidosException("La cantidad disponible no puede ser negativa.");
        }

        // Agregar el producto al inventario
        Producto nuevoProducto = new Producto(nombre, precio, cantidadDisponible);
        inventario.add(nuevoProducto);
        System.out.println("Producto agregado al inventario: " + nuevoProducto.getNombre());
    }

}

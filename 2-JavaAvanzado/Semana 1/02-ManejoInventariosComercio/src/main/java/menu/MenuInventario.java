package menu;

import exception.DatosProductoInvalidosException;
import logic.GestionInventario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Producto;

// Clase que maneja el menú de gestión de inventario
public class MenuInventario {

    private List<Producto> inventario;

    public MenuInventario() {
        this.inventario = new ArrayList<>();
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- Menú de Inventario ----");
            System.out.println("1. Agregar producto al inventario");
            System.out.println("2. Ver inventario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    mostrarInventario();
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private void agregarProducto() {
        Scanner scanner = new Scanner(System.in);

        // Ingresar nombre del producto
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        try {
            validarNombre(nombre);
        } catch (DatosProductoInvalidosException e) {
            System.out.println("Error en el inventario: " + e.getMessage());
            return;
        }

        // Ingresar precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        try {
            validarPrecio(precio);
        } catch (DatosProductoInvalidosException e) {
            System.out.println("Error en el inventario: " + e.getMessage());
            return;
        }

        // Ingresar cantidad disponible del producto
        System.out.print("Ingrese la cantidad disponible del producto: ");
        int cantidadDisponible = scanner.nextInt();

        try {
            validarCantidad(cantidadDisponible);
        } catch (DatosProductoInvalidosException e) {
            System.out.println("Error en el inventario: " + e.getMessage());
            return;
        }

        // Si todas las validaciones son exitosas, agregar el producto al inventario
        try {
            GestionInventario.agregarProductoAlInventario(nombre, precio, cantidadDisponible, inventario);
            System.out.println("Producto agregado al inventario: " + nombre);
        } catch (DatosProductoInvalidosException e) {
            System.out.println("Error en el inventario: " + e.getMessage());
        }
    }

    private void validarNombre(String nombre) throws DatosProductoInvalidosException {
        if (nombre == null || nombre.isEmpty()) {
            throw new DatosProductoInvalidosException("El nombre del producto no puede estar vacío.");
        }
    }

    private void validarPrecio(double precio) throws DatosProductoInvalidosException {
        if (precio <= 0) {
            throw new DatosProductoInvalidosException("El precio del producto debe ser mayor que cero.");
        }
    }

    private void validarCantidad(int cantidad) throws DatosProductoInvalidosException {
        if (cantidad < 0) {
            throw new DatosProductoInvalidosException("La cantidad disponible no puede ser negativa.");
        }
    }

    private void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("\nInventario actual:");
            System.out.printf("%-20s %-10s %-10s\n", "Nombre", "Precio", "Cantidad");
            for (Producto producto : inventario) {
                System.out.printf("%-20s %-10.2f %-10d\n", producto.getNombre(), producto.getPrecio(), producto.getCantidadDisponible());
            }
        }
    }

}

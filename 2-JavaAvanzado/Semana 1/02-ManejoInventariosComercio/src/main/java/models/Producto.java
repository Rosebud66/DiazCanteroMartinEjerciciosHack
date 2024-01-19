package models;

import exception.DatosProductoInvalidosException;

// Clase que representa un producto
public class Producto {

    private String nombre;
    private double precio;
    private int cantidadDisponible;

    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Getters 
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
    
    
    
    
    // Método para actualizar la cantidad disponible
    public void actualizarCantidad(int nuevaCantidad) throws DatosProductoInvalidosException {
        if (nuevaCantidad < 0) {
            throw new DatosProductoInvalidosException("La cantidad no puede ser negativa.");
        }

        this.cantidadDisponible = nuevaCantidad;
    }
}

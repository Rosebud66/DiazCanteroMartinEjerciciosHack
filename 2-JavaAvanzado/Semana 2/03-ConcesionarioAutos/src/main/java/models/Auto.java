package models;


//MartinDCantero

/* 03-Concesionario de Autos*/

 /*Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. 

    Crea una clase Auto con atributos como marca, modelo, año, y precio. 
 */

public class Auto {

    // Atributos
    private String marca;
    private String modelo;
    private int anyo;
    private double precio;

    // Constructor vacío
    public Auto() {
    }

    // Constructor
    public Auto(String marca, String modelo, int anyo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.precio = precio;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // ToString
    @Override
    public String toString() {
        return String.format("| %-12s | %-12s | %-6d | $%-10.2f |", marca, modelo, anyo, precio);
    }

}

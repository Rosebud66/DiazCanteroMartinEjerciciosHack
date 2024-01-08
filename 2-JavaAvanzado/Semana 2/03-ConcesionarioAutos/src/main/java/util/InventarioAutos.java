package util;

import java.util.ArrayList;
import java.util.List;
import models.Auto;

//MartinDCantero

/* 03-Concesionario de Autos*/

 /*Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos.  

    Implementa una clase utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:

    a) Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.

    b) Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.

    c) Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los autos en el inventario. 
 */

public class InventarioAutos<T extends Auto> {

    private List<T> autos;

    public InventarioAutos() {
        this.autos = new ArrayList<>();
    }

    // AGREGAR autos al inventario (autos)
    public void agregarAuto(T auto) {
        autos.add(auto);
    }

    // BUSCAR autos por marca
    public List<T> autosPorMarca(String marca) {
        List<T> autosMarca = new ArrayList<>();
        for (T auto : autos) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                autosMarca.add(auto);
            }
        }
        return autosMarca;
    }

    // BUSCAR autos por año
    public List<T> autosPorAnyo(int anyo) {
        List<T> autosAnyo = new ArrayList<>();
        for (T auto : autos) {
            if (auto.getAnyo() == anyo) {
                autosAnyo.add(auto);
            }
        }
        return autosAnyo;
    }

    // Valor total autos
    public double valorTotalAutos() {
        double valorTotal = 0;
        for (T auto : autos) {
            valorTotal += auto.getPrecio();
        }
        return valorTotal;
    }

    // LISTAR todos los autos
    public List<T> obtenerTodosLosAutos() {
        return new ArrayList<>(autos);
    }

}

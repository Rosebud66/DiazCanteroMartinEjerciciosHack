package models;

import java.time.LocalDate;
import util.Categoria;

//MartinDCantero

/* 02-Gestor de Eventos*/

/*Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. Cada evento tiene un nombre, una fecha y una categoría 
    (por ejemplo, "Reunión", "Conferencia", "Taller"). 
*/

public class Evento {
    
    // Atributos
    private String nombre;
    private LocalDate fecha;
    private Categoria categoria;

    // Constructor vacío
    public Evento() {
    }

    // Constructor
    public Evento(String nombre, LocalDate fecha, Categoria categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // toString
    @Override
    public String toString() {
        return "Evento{" + "nombre=" + nombre + ", fecha=" + fecha + ", categoria=" + categoria + '}';
    }
    
    
    
}

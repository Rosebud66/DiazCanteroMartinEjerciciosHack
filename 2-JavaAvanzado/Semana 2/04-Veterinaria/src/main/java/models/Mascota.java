package models;

import util.Especie;

//MartinDCantero

/* 04-Veterinaria*/

 /*Una clínica veterinaria necesita un sistema para administrar su registro de mascotas, para ello, se solicita la definición de una clase genérica 
Mascota<T> con atributos como nombre, edad, y especie (no olvides el código o id de mascota para identificar a cada una). 
 */

public class Mascota<T> {

    // Atributos
    private T id;
    private String nombre;
    private int edad;
    private Especie especie;

    // Constructor vacío
    public Mascota() {
    }

    // Constructor
    public Mascota(T id, String nombre, int edad, Especie especie) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Especie getEspecie() {
        return especie;
    }

    public T getId() {
        return id;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public void setId(T id) {
        this.id = id;
    }

    // ToString
    @Override
    public String toString() {
        return "Mascota: " + nombre + ", Edad: " + edad + ", Especie: " + especie + ", ID: " + id;
    }

}

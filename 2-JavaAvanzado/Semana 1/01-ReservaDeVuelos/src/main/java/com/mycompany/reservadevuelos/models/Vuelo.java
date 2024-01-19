package com.mycompany.reservadevuelos.models;

import com.mycompany.reservadevuelos.exception.ReservaInvalidaException;


public class Vuelo {
    private int asientosDisponibles;

    public Vuelo(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public void reservarVuelo(String nombre, String destino, String fecha, int numeroAsientos) throws ReservaInvalidaException {
        // Validar la información de reserva
        if (nombre == null || destino == null || fecha == null || numeroAsientos <= 0) {
            throw new ReservaInvalidaException("La información de reserva es incompleta.");
        }

        // Validar disponibilidad de asientos
        if (numeroAsientos > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles.");
        }

        // Actualizar la cantidad de asientos disponibles
        asientosDisponibles -= numeroAsientos;

        System.out.println("Reserva exitosa para " + nombre + " con destino a " + destino + " el " + fecha +
                " para " + numeroAsientos + " asientos.");
    }

    public int obtenerAsientosDisponibles() {
        return asientosDisponibles;
    }
}

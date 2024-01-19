package com.mycompany.reservadevuelos.ui;


import com.mycompany.reservadevuelos.exception.ReservaInvalidaException;
import java.util.Scanner;
import com.mycompany.reservadevuelos.models.Vuelo;

public class Menu {
    private Vuelo vuelo;

    public Menu(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- Menú ----");
            System.out.println("1. Realizar una reserva");
            System.out.println("2. Consultar asientos disponibles");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    realizarReserva();
                    break;
                case 2:
                    consultarAsientosDisponibles();
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

    private void realizarReserva() {
        System.out.print("Ingrese su nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.print("Ingrese el destino: ");
        String destino = new Scanner(System.in).nextLine();
        System.out.print("Ingrese la fecha de viaje: ");
        String fecha = new Scanner(System.in).nextLine();
        System.out.print("Ingrese el número de asientos deseados: ");
        int numeroAsientos = new Scanner(System.in).nextInt();

        try {
            vuelo.reservarVuelo(nombre, destino, fecha, numeroAsientos);
        } catch (ReservaInvalidaException e) {
            System.out.println("Error de reserva: " + e.getMessage());
        }
    }

    private void consultarAsientosDisponibles() {
        int asientosDisponibles = vuelo.obtenerAsientosDisponibles();
        System.out.println("Asientos disponibles: " + asientosDisponibles);
    }
    
}

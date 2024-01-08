package main;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import models.Evento;
import util.Categoria;


//MartinDCantero

/* 02-Gestor de Eventos*/

 /*Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. 
    Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller"). 

    Implementa las siguientes operaciones utilizando Streams y Optionals:

    a) Filtra los eventos que están programados para una fecha específica.

    b) Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.

    c) Encuentra el evento más próximo en el tiempo utilizando Optionals
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Evento> eventos = Arrays.asList(
                new Evento("Reunión equipo técnico", LocalDate.of(2024, 1, 5), Categoria.REUNION),
                new Evento("Conferencia SoftSkills", LocalDate.of(2024, 1, 7), Categoria.CONFERENCIA),
                new Evento("Taller Java Avanzado", LocalDate.of(2024, 1, 7), Categoria.TALLER),
                new Evento("Presentación ventas", LocalDate.of(2024, 1, 8), Categoria.CONFERENCIA)
        );

        int opcion;
        do {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1. Filtrar eventos por fecha");
            System.out.println("2. Mostrar eventos por categoría");
            System.out.println("3. Cantidad eventos por categoría");
            System.out.println("4. Encontrar el evento más próximo");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // FILTRAR eventos para una fecha específica
                    LocalDate fechaEspecifica = LocalDate.of(2024, 1, 7);
                    List<Evento> eventosEnFechaEspecifica = eventos.stream()
                            .filter(evento -> evento.getFecha().equals(fechaEspecifica))
                            .collect(Collectors.toList());

                    System.out.println("Eventos para el " + fechaEspecifica + ":");
                    eventosEnFechaEspecifica.forEach(evento
                            -> System.out.println("\t" + evento.getNombre() + " - Categoría: " + evento.getCategoria()));
                    break;
                case 2:
                    // AGRUPAR eventos por categoría
                    Map<Categoria, List<Evento>> eventosPorCategoria = eventos.stream()
                            .collect(Collectors.groupingBy(Evento::getCategoria));

                    System.out.println("\nEventos agrupados por categoría:");
                    eventosPorCategoria.forEach((categoria, listaEventos) -> {
                        System.out.println("\t" + categoria + ":");
                        listaEventos.forEach(evento -> System.out.println("\t\t" + evento.getNombre()));
                    });
                    break;
                case 3:
                    // CONTAR eventos por categoría
                    Map<Categoria, Long> cantidadEventosPorCategoria = eventos.stream()
                            .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));

                    System.out.println("\nCantidad de eventos por categoría:");
                    cantidadEventosPorCategoria.forEach((categoria, cantidad)
                            -> System.out.println("\t" + categoria + ": " + cantidad));
                    break;
                case 4:
                    // ENCONTRAR el evento MÁS PRÓXIMO EN EL TIEMPO
                    Optional<Evento> eventoMasProximo = eventos.stream()
                            .min(Comparator.comparing(evento -> {
                                LocalDate fechaEvento = evento.getFecha();
                                LocalDate fechaActual = LocalDate.now();
                                return fechaEvento.compareTo(fechaActual);
                            }));

                    System.out.println("\nEl evento más próximo es:");
                    eventoMasProximo.ifPresentOrElse(
                            evento -> System.out.println("\t" + evento.getNombre() + " - Fecha: " + evento.getFecha() + " - Categoría: " + evento.getCategoria()),
                            () -> System.out.println("\tNo hay eventos próximos")
                    );
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Seleccione otra opción");
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }
}

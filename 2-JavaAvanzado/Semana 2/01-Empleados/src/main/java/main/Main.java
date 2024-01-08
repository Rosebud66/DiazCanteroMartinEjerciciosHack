package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import models.Empleado;
import util.Categoria;

//MartinDCantero

/* 01-Empleados
Crea una aplicación que maneje información sobre empleados. 
Cada empleado tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). 

    Implementa las siguientes operaciones utilizando Streams y Optionals

    a) Filtra los empleados cuyo salario sea mayor a cierto valor específico.

    b) Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.

    c) Encuentra al empleado con el salario más alto utilizando Optionals.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Pedro", 50000, Categoria.DESARROLLADOR),
                new Empleado("Alicia", 60000, Categoria.ANALISTA),
                new Empleado("Roberto", 75000, Categoria.GERENTE),
                new Empleado("María", 55000, Categoria.DESARROLLADOR),
                new Empleado("Sara", 70000, Categoria.GERENTE)
        );

        int opcion;
        do {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1. Filtrar empleados por salario mayor a cierto valor");
            System.out.println("2. Mostrar empleados por categoría");
            System.out.println("3. Calcular salario promedio por categoría");
            System.out.println("4. Encontrar empleado con el salario más alto");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // FILTRAR empleador por salario
                    double salarioFiltrar = 60000;
                    List<Empleado> empleadosSalarioSuperior = empleados.stream()
                            .filter(empleado -> empleado.getSalario() > salarioFiltrar)
                            .collect(Collectors.toList());
                    System.out.println("Los empleados con un salario mayor a " + salarioFiltrar + " son:");
                    empleadosSalarioSuperior.forEach(empleado -> System.out.println(empleado.getNombre()));
                    break;
                case 2:
                    // MOSTRAR empleados por categoría
                    Map<Categoria, List<Empleado>> empleadosPorCategoria = empleados.stream()
                            .collect(Collectors.groupingBy(Empleado::getCategoria));

                    System.out.println("\tEmpleados por categoría:");
                    empleadosPorCategoria.forEach((categoria, listaEmpleados) -> {
                        System.out.println(categoria + ":");
                        listaEmpleados.forEach(empleado -> System.out.println("\t" + empleado.getNombre()));
                    });
                    break;
                case 3:
                    // SALARIO PROMEDIO por categoría
                    Map<Categoria, Double> salarioPromedioPorCategoria = empleados.stream()
                            .collect(Collectors.groupingBy(
                                    Empleado::getCategoria,
                                    Collectors.averagingDouble(Empleado::getSalario)
                            ));
                    System.out.println("\nSalario promedio por categoría:");
                    salarioPromedioPorCategoria.forEach((categoria, salarioPromedio)
                            -> System.out.println(categoria + ": " + salarioPromedio));
                    break;
                case 4:
                    // Empleado con SALARIO MÁS ALTO
                    Optional<Empleado> empleadoMejorPagado = empleados.stream()
                            .max(Comparator.comparing(Empleado::getSalario));
                    empleadoMejorPagado.ifPresent(empleado
                            -> System.out.println("\nEl empleado con el salario más alto es " + empleado.getNombre()
                                    + " con salario: " + empleado.getSalario()));
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

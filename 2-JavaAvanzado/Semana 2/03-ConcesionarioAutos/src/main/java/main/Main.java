package main;

import java.util.List;
import java.util.Scanner;
import models.Auto;
import util.InventarioAutos;

//MartinDCantero

/* 03-Concesionario de Autos*/

 /*Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. 

    Crea una clase Auto con atributos como marca, modelo, año, y precio. 

    Implementa una clase utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:

    a) Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.

    b) Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.

    c) Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los autos en el inventario. 
 */

public class Main {

    public static void main(String[] args) {
        InventarioAutos<Auto> autos = new InventarioAutos<>();
        autos.agregarAuto(new Auto("Toyota", "Corolla", 2018, 15000.0));
        autos.agregarAuto(new Auto("Honda", "Civic", 2019, 18000.0));
        autos.agregarAuto(new Auto("Ford", "Focus", 2020, 22000.0));
        autos.agregarAuto(new Auto("Chevrolet", "Cruze", 2017, 14000.0));
        autos.agregarAuto(new Auto("Volkswagen", "Jetta", 2021, 25000.0));

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENÚ:");
            System.out.println("1. Agregar autos");
            System.out.println("2. Buscar autos por marca");
            System.out.println("3. Buscar autos por año");
            System.out.println("4. Calcular valor total autos");
            System.out.println("5. Listar autos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // AGREGAR autos
                    // MARCA
                    String marca = "";
                    while (marca.trim().isEmpty()) {
                        System.out.print("\nMarca del auto: ");
                        marca = scanner.nextLine();
                        if (marca.trim().isEmpty()) {
                            System.err.println("La marca no puede estar vacía.");
                        }
                    }
                    
                    // MODELO
                    String modelo = "";
                    while (modelo.trim().isEmpty()) {
                        System.out.print("Modelo del auto: ");
                        modelo = scanner.nextLine();
                        if (modelo.trim().isEmpty()) {
                            System.err.println("El modelo no puede estar vacío.");
                        }
                    }
                    
                    // AÑO
                    int año = 0;
                    while (año <= 1886 || año > obtenerAnyoActual()) {
                        System.out.print("Año del auto: ");
                        while (!scanner.hasNextInt()) {
                            System.err.println("Ingrese un año válido.");
                            scanner.next();
                        }
                        año = scanner.nextInt();
                        scanner.nextLine();
                        if (año <= 1886 || año > obtenerAnyoActual()) {
                            System.err.println("Ingrese un año válido superior a 1886.");
                        }
                    }

                    // PRECIO
                    double precio = 0;
                    while (precio <= 0) {
                        System.out.print("Precio del auto: ");
                        while (!scanner.hasNextDouble()) {
                            System.err.println("Ingrese un precio válido.");
                            scanner.next();
                        }
                        precio = scanner.nextDouble();
                        scanner.nextLine();
                        if (precio <= 0) {
                            System.err.println("Ingrese un precio válido mayor que cero.");
                        }
                    }

                    // Crear auto con datos usuario
                    Auto nuevoAuto = new Auto(marca, modelo, año, precio);
                    autos.agregarAuto(nuevoAuto);
                    System.out.println("Auto añadido con éxito.");
                    break;
                case 2:
                    // BUSCAR autos por marca
                    System.out.print("\nMarca a buscar: ");
                    String marcaBuscar = scanner.nextLine();
                    List<Auto> autosMarca = autos.autosPorMarca(marcaBuscar);
                    if (autosMarca.isEmpty()) {
                        System.out.println("No se han encontrado autos de esa marca.");
                    } else {
                        System.out.println("Autos encontrados:");
                        for (Auto auto : autosMarca) {
                            System.out.println(auto);
                        }
                    }
                    break;
                case 3:
                    // BUSCAR autos por año
                    int anyoBuscar = 0;
                    while (anyoBuscar < 1886 || anyoBuscar > obtenerAnyoActual()) {
                        System.out.print("\nAño a buscar: ");
                        while (!scanner.hasNextInt()) {
                            System.err.println("Ingrese un año válido.");
                            scanner.next();
                        }
                        anyoBuscar = scanner.nextInt();
                        scanner.nextLine();
                        if (anyoBuscar < 1886 || anyoBuscar > obtenerAnyoActual()) {
                            System.err.println("Ingrese un año válido entre 1886 y el actual.");
                        }
                    }

                    List<Auto> autosAño = autos.autosPorAnyo(anyoBuscar);
                    if (autosAño.isEmpty()) {
                        System.out.println("No se han encontrado autos de ese año.");
                    } else {
                        System.out.println("Autos encontrados:");
                        for (Auto auto : autosAño) {
                            System.out.println(auto);
                        }
                    }
                    break;
                case 4:
                    // VALOR TOTAL autos
                    double valorTotal = autos.valorTotalAutos();
                    System.out.println("\nValor total de los autos: $" + valorTotal);
                    break;
                case 5:
                    // LISTAR autos
                    List<Auto> todosLosAutos = autos.obtenerTodosLosAutos();
                    if (todosLosAutos.isEmpty()) {
                        System.out.println("No hay autos en el inventario.");
                    } else {
                        System.out.println("Lista de autos:");
                        for (Auto auto : todosLosAutos) {
                            System.out.println(auto);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Seleccione otra opción.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    // Método que devuelve el año actual
    private static int obtenerAnyoActual() {
        return java.time.Year.now().getValue();
    }
}

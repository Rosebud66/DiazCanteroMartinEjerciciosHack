package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import models.Mascota;
import util.RegistroMascotas;
import java.util.Scanner;
import util.Especie;

//MartinDCantero

/* 04-Veterinaria*/

 /*Una clínica veterinaria necesita un sistema para administrar su registro de mascotas, para ello, se solicita la definición de una clase genérica 
Mascota<T> con atributos como nombre, edad, y especie (no olvides el código o id de mascota para identificar a cada una). 

Crea una clase utilitaria propia llamada RegistroMascotas que cuente con métodos genéricos para:

    a) Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos para manipular colecciones como ArrayList o LinkedList 
        y agregar mascotas de distinto tipo al registro de la veterinaria (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).

    b) Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays junto con genéricos 
        para realizar búsquedas eficientes por nombre o especie dentro del registro de mascotas.

    c) Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener el tamaño de la colección 
        y contar la cantidad total de mascotas registradas en la veterinaria.

    d) Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  para generar datos aleatorios, 
        como nombres, edades o especies, para agregar mascotas al registro.
 */
public class Main {

    public static void main(String[] args) {
        RegistroMascotas<Integer> registro = new RegistroMascotas<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("---- Menú ----");
            System.out.println("1. Agregar mascota");
            System.out.println("2. Buscar mascota por nombre");
            System.out.println("3. Buscar mascotas por especie");
            System.out.println("4. Total mascotas");
            System.out.println("5. Generar datos aleatorios para mascotas");
            System.out.println("6. Listar mascotas");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // AGREGAR mascota
                    // NOMBRE
                    String nombre = "";
                    while (nombre.trim().isEmpty() || contieneNumeros(nombre)) {
                        System.out.print("Nombre: ");
                        nombre = scanner.nextLine();
                        if (nombre.trim().isEmpty()) {
                            System.err.println("El nombre no puede estar vacío.");
                        } else if (contieneNumeros(nombre)) {
                            System.err.println("El nombre no puede contener números.");
                        }
                    }

                    // EDAD
                    int edad = 0;
                    while (edad <= 0) {
                        try {
                            System.out.print("Edad: ");
                            while (!scanner.hasNextInt()) {
                                System.err.println("Ingrese una edad válida.");
                                scanner.next();
                            }
                            edad = scanner.nextInt();
                            scanner.nextLine();
                            if (edad <= 0) {
                                System.err.println("La edad debe ser un entero positivo.");
                            }
                        } catch (Exception e) {
                            System.err.println("Error al ingresar la edad.");
                            scanner.nextLine();
                        }
                    }

                    // ESPECIE
                    Especie especie = null;
                    while (especie == null) {
                        listarOpcionesEspecies();
                        String inputEspecie = scanner.nextLine().toUpperCase();
                        try {
                            especie = Especie.valueOf(inputEspecie);
                        } catch (IllegalArgumentException e) {
                            System.err.println("Ingrese una especie válida de entre las opciones.");
                        }
                    }

                    // ID
                    int idAleatorio = random.nextInt(90000) + 10000;

                    Mascota<Integer> nuevaMascota = new Mascota<>(idAleatorio, nombre, edad, especie);
                    registro.agregarMascota(nuevaMascota);
                    
                    System.out.println("Mascota agregada al registro con éxito.");
                    break;
                case 2:
                    // BUSCAR mascota por nombre
                    System.out.print("Nombre de la mascota a buscar: ");
                    String nombreBuscar = scanner.nextLine();

                    List<Mascota<Integer>> mascotasEncontradas = new ArrayList<>();
                    for (Mascota<Integer> mascota : registro.getRegistro()) {
                        if (mascota.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            mascotasEncontradas.add(mascota);
                        }
                    }

                    if (!mascotasEncontradas.isEmpty()) {
                        System.out.println("Mascotas encontradas con el nombre " + nombreBuscar + ":");
                        for (Mascota<Integer> mascota : mascotasEncontradas) {
                            System.out.println("Nombre: " + mascota.getNombre() + ", Edad: " + mascota.getEdad() + ", Especie: " + mascota.getEspecie());
                        }
                    } else {
                        System.err.println("No se han encontrado mascotas con ese nombre.");
                    }
                    break;
                case 3:
                    // BUSCAR mascota por especie
                    System.out.print("Especie de las mascotas a buscar: ");
                    listarOpcionesEspecies();
                    String especieInput = scanner.nextLine().toUpperCase();
                    Especie especieBuscar = null;
                    try {
                        especieBuscar = Especie.valueOf(especieInput);
                    } catch (IllegalArgumentException e) {
                        System.err.println("No se han encontrado mascotas con esa especie");
                        break;
                    }

                    List<Mascota<Integer>> mascotasPorEspecie = registro.buscarPorEspecie(especieBuscar);
                    if (!mascotasPorEspecie.isEmpty()) {
                        System.out.println("Mascotas encontradas de la especie " + especieBuscar + ":");
                        for (Mascota<Integer> mascota : mascotasPorEspecie) {
                            System.out.println("Nombre: " + mascota.getNombre() + ", Edad: " + mascota.getEdad());
                        }
                    } else {
                        System.out.println("No se han encontrado mascotas de esa especie.");
                    }
                    break;
                case 4:
                    // TOTAL mascotas
                    System.out.println("Total de mascotas: " + registro.cantidadTotalMascotas());
                    break;
                case 5:
                    // GENERAR mascotas aleatorias
                    System.out.print("Cantidad de mascotas aleatorias a generar: ");
                    int cantidad = scanner.nextInt();
                    registro.generarDatosAleatorios(cantidad);
                    System.out.println(cantidad + " mascotas aleatorias agregadas al registro.");
                    break;
                case 6:
                    // LISTADO mascotas
                    System.out.println("Listado de mascotas:");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("| ID     | Nombre          | Edad    | Especie            |");
                    System.out.println("-----------------------------------------------------------");
                    for (Mascota<Integer> mascota : registro.getRegistro()) {
                        System.out.printf("| %-6s | %-15s | %-7s | %-18s |\n", mascota.getId(), mascota.getNombre(), mascota.getEdad(), mascota.getEspecie());
                    }
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Seleccione otra opción.");
                    break;
            }
        }
        scanner.close();
    }

    // Método que valida si hay números
    private static boolean contieneNumeros(String cadena) {
        for (char c : cadena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    // Método para listas las opciones del enum Especie
    private static void listarOpcionesEspecies() {
        System.out.print("Opciones de especie: ");
        for (Especie especie : Especie.values()) {
            System.out.print(especie.name() + " ");
        }
        System.out.println();
    }

}

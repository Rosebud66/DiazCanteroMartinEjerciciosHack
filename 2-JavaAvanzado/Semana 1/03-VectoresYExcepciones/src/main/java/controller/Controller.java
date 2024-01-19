package controller;

import java.util.Scanner;


public class Controller {
    private static final int TAMANO_VECTOR = 5;
    private int[] vector = new int[TAMANO_VECTOR];
    private boolean salir;

    public void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                llenarVector();
                System.out.println("Vector llenado correctamente.");
                break;
            case 2:
                accederVector();
                break;
            case 3:
                salir = true;
                System.out.println("Saliendo de la aplicación.");
                break;
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                break;
        }
    }

    public boolean isSalir() {
        return salir;
    }

    private void llenarVector() {
        for (int i = 0; i < TAMANO_VECTOR; i++) {
            vector[i] = i * 2;
        }
    }

     private void accederVector() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un índice para acceder al vector: ");

        try {
            int indice = scanner.nextInt();
            int valor = vector[indice];
            System.out.println("El valor en la posición " + indice + " es: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Intentando acceder a una posición inválida en el vector.");
        }
    }
}


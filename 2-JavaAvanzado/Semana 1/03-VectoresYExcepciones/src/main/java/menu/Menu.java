package menu;

import controller.Controller;
import java.util.Scanner;

public class Menu {
    private Controller controlador;

    public Menu(Controller controlador) {
        this.controlador = controlador;
    }

    public void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            controlador.ejecutarOpcion(opcion);
        } while (!controlador.isSalir());
    }

    private void mostrarMenu() {
        System.out.println("------ Menú ------");
        System.out.println("1. Llenar el vector");
        System.out.println("2. Acceder al vector");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }
}

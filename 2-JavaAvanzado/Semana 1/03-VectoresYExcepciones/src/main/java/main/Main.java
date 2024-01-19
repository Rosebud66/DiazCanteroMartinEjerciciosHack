package main;

import controller.Controller;
import menu.Menu;

public class Main {
    public static void main(String[] args) {
        Controller controlador = new Controller();
        Menu menu = new Menu(controlador);

        menu.iniciarMenu();
    }
}

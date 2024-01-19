package com.mycompany.reservadevuelos.main;

import com.mycompany.reservadevuelos.models.Vuelo;
import com.mycompany.reservadevuelos.ui.Menu;

public class Main {
    
    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo(10);  // Crear un vuelo con 10 asientos disponibles
        Menu menu = new Menu(vuelo);
        menu.mostrarMenu();
    }
}

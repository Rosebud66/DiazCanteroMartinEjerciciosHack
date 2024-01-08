package util;

import models.Mascota;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//MartinDCantero

/* 04-Veterinaria*/

 /*Una clínica veterinaria necesita un sistema para administrar su registro de mascotas.

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

public class RegistroMascotas<T> {

    private List<Mascota<T>> registro;

    // Constructor
    public RegistroMascotas() {
        registro = new ArrayList<>();
    }

    // Getters
    public List<Mascota<T>> getRegistro() {
        return registro;
    }

    // Setters
    public void setRegistro(List<Mascota<T>> registro) {
        this.registro = registro;
    }

    // AGREGAR mascota al registro
    public void agregarMascota(Mascota<T> mascota) {
    registro.add(mascota);
    }


    // BUSCAR mascotas por nombre
    public Mascota<T> buscarPorNombre(String nombre) {
        List<Mascota<T>> mascotasEncontradas = new ArrayList<>();

        for (Mascota<T> mascota : registro) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                mascotasEncontradas.add(mascota);
            }
        }
        if (!mascotasEncontradas.isEmpty()) {
            return mascotasEncontradas.get(0);
        } else {
            return null;
        }
    }

    // BUSCAR mascotas por especie
    public List<Mascota<T>> buscarPorEspecie(Especie especie) {
        List<Mascota<T>> mascotasPorEspecie = new ArrayList<>();
        for (Mascota<T> mascota : registro) {
            if (mascota.getEspecie().equals(especie)) {
                mascotasPorEspecie.add(mascota);
            }
        }
        return mascotasPorEspecie;
    }

    // CANTIDAD TOTAL mascotas
    public int cantidadTotalMascotas() {
        return registro.size();
    }

    // GENERAR DATOS ALEATORIOS mascotas
    public void generarDatosAleatorios(int cantidad) {
        String[] nombres = {"Luna", "Max", "Simba", "Nala", "Toby", "Rex", "Rocky", "Coco", "Toby"};
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String nombreAleatorio = nombres[random.nextInt(nombres.length)]; // NOMBRE aleatorio          
            int edadAleatoria = random.nextInt(15) + 1; // EDAD aleatoria
            Especie especieAleatoria = Especie.values()[random.nextInt(Especie.values().length)];// ESPECIE aleatoria
            int idAleatorio = random.nextInt(90000) + 10000; // ID aleatorio
            
            Mascota<Integer> mascota = new Mascota<>(idAleatorio, nombreAleatorio, edadAleatoria, especieAleatoria);

            registro.add((Mascota<T>) mascota);
        }
    }

    
    

}

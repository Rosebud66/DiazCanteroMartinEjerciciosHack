package models;
import util.Categoria;

//MartinDCantero

/* 01-Empleados
Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario y una categoría 
(por ejemplo, "Desarrollador", "Analista", "Gerente"). 
*/
public class Empleado {
    
    // Atributos
    private String nombre;
    private double salario;
    private Categoria categoria;

    // Constructor vacío
    public Empleado() {
    }

    // Constructor
    public Empleado(String nombre, double salario, Categoria categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // ToString
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", categoria=" + categoria + '}';
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author matvelazquez
 */
/*
Miembro
- nombre: String
- libroPrestado: Libro

+ tomarPrestado(Libro libro)
+ devolverLibro()
+ mostrarInformacion()
 */
public class Miembro {

    private String nombre;
    private Libro libroPrestado;

    public Miembro(String nombre) {
        this.nombre = nombre;
        this.libroPrestado = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    @Override
    public String toString() {
        return "Miembro{" + "nombre=" + nombre + ", libroPrestado=" + libroPrestado + '}';
    }

    /*
    + tomarPrestado(Libro libro):  si el libro está disponible, lo asigna a libroPrestado y llama al método prestar() del libro.
    + devolverLibro(): marca el libro como disponible y asigna libroPrestado como null.
    
    juancito.tomarPrestado(RobinHood)
     */
    public void tomarPrestado(Libro libro) {
        if (libro.isDisponible()) {
            this.libroPrestado = libro;
            libro.prestar();
        } else {
            System.out.println("El Libro " + libro.getTitulo() + "No esta disponible");
        }
    }

    public void devolverLibro() {
        if (this.libroPrestado != null) {
            this.libroPrestado.devolver();
            this.libroPrestado = null;
        } else {
            System.out.println("No hay ningun libro para devolver");

        }
    }
}

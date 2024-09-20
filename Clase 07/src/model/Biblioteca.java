/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matvelazquez
 */
public class Biblioteca {

    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList();
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void mostraCatalogo() {
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
    }

    public void tomarPrestado(Libro libro) {
        // Verificar si el libro esta disponible para ser prestado y existe en mi biblioteca
        if (this.consultarDisponibilidad(libro.getTitulo()) && libro.isDisponible()) {
            // TO DO: Añadir libro prestado al cliente
            // Actualizar el estado del libro para no estar disponible
            libro.prestar();
             System.out.println("Se realizo el prestamo del libro " + libro.getTitulo());
            
        } else {
            System.out.println("El libro " + libro.getTitulo() + " no esta disponible");
        }
    }

    public void devolverLibro(Libro libro) {
        // Verifico que el libro realmente se presto y que existe en mi bilbioteca
        if (!libro.isDisponible() && this.consultarDisponibilidad(libro.getTitulo())) {
            libro.devolver();
            System.out.println("El libro " + libro.getTitulo() + " se devolvio correctamente");
        }else {
            System.out.println("El libro " + libro.getTitulo() + " no fue prestado, o no existe en la biblioteca");
        }
    }

    // consulta si el libro esta en la lista de libros
    public boolean consultarDisponibilidad(String titulo) {
        boolean disponible = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                disponible = true;
            }
        }
        return disponible;
    }

}

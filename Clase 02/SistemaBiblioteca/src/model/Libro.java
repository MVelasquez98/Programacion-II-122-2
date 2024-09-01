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
    Libro
- titulo: String
- autor: String
- disponible: boolean

+ mostrarInformación
+ prestar()
+ devolver()
    
 */
public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", disponible=" + disponible + '}';
    }

    /*
    + prestar()marca el libro como no disponible.
    + devolver()marca el libro como disponible
     */
    public void prestar() {
        if (disponible) {
            this.disponible = false;
        } else {
            System.out.println("El libro " + this.titulo + " no esta disponible para prestamo");
        }
    }

    public void devolver() {
        if (!disponible) {
            this.disponible = true;
        } else {
            System.out.println("El libro " + this.titulo + " ya esta disponible");
        }
    }

}

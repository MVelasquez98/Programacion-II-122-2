/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import model.Libro;
import model.Miembro;

/**
 *
 * @author matvelazquez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear instancias de libros
        Libro libro1 = new Libro("1984", "G. Orwell", true);
        Libro libro2 = new Libro("Robinson Crusoe", "D. Defoe", true);

        // crear instancias de Miembro
        Miembro miembro1 = new Miembro("Matias");
        Miembro miembro2 = new Miembro("Juan");

        System.out.println("Información inicial");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(miembro1);

        System.out.println("\nTomar prestado un Libro");
        miembro1.tomarPrestado(libro1);
        System.out.println(miembro1);

        System.out.println("\nIntentar Tomar prestado un Libro prestado");
        miembro2.tomarPrestado(libro1);
        System.out.println(libro1);

        System.out.println("\nDevolver un Libro");
        miembro1.devolverLibro();
        System.out.println(libro1);

        System.out.println("\nIntentar Tomar prestado un Libro");
        miembro2.tomarPrestado(libro1);
        System.out.println(libro1);
        System.out.println(miembro1);
        System.out.println(miembro2);

    }

}

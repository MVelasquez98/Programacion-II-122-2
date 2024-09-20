/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import model.Auto;
import model.Biblioteca;
import model.Cliente;
import model.ControladorDePedido;
import model.CuentaBancaria;
import model.Libro;
import model.Producto;

/**
 *
 * @author matvelazquez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Ejercicio 1
        System.out.println("Ejercicio 1");
        Producto producto = new Producto("Laptop", 1000.0, 10);
        ControladorDePedido controlador = new ControladorDePedido();
        controlador.confirmarPedido(producto, 11);
        System.out.println();
        //Ejercicio 2
        System.out.println("Ejercicio 2");
        Cliente cliente = new Cliente("Matias Velasquez");
        CuentaBancaria cuenta = new CuentaBancaria("123456", cliente);

        cuenta.depositar(200);
        System.out.println("Saldo actual: " + cuenta.consultarSaldo() + " Cliente:" + cuenta.getCliente().getNombre());

        System.out.println();
        //Ejercicio 3
        System.out.println("Ejercicio 3");
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("ISBN021234", "1984");
        Libro libro2 = new Libro("ISBN021235", "El Quijote");
        Libro libro3 = new Libro("ISBN021236", "La vuelta al mundo en 80 dias");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        System.out.println(biblioteca.consultarDisponibilidad("Robinson Crusoe"));
        System.out.println(biblioteca.consultarDisponibilidad("El Quijote"));
        System.out.println(biblioteca.consultarDisponibilidad("La vuelta al mundo en 80 dias"));

        biblioteca.tomarPrestado(libro1);
        biblioteca.tomarPrestado(libro1);
        biblioteca.tomarPrestado(libro3);

        biblioteca.devolverLibro(libro1);
        biblioteca.devolverLibro(libro3);

        biblioteca.tomarPrestado(libro1);

        System.out.println();
        //Ejercicio 4
        System.out.println("Ejercicio 4");
        Auto auto = new Auto("Toyota Corolla", 150);
        System.out.println(auto.toString());

    }

}

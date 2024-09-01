/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

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
        // crear instancias de la clase Producto
        Producto producto1 = new Producto("Laptop", "LPT123", 1200.500, 10);
        Producto producto2 = new Producto("Smartphone", "SMP456", 800.500, 20);
        Producto producto3 = new Producto("Tablet", "TBL789", 450.500, 15);

        // mostrar información de los productos
        System.out.println("Infromación inicial de los productos");
        System.out.println();
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);

        // Vender productos
        System.out.println("\nVender Productos");
        producto1.vender(3);
        producto2.vender(25);//No me deberia dejar
        producto3.vender(5);
        producto2.vender(-2);//no me deberia dejar

        System.out.println("\nRebastecer Productos");
        producto1.rebastecer(5);
        producto2.rebastecer(10);
        producto3.rebastecer(10);        
        producto3.rebastecer(-2);//no me deberia dejar

        
        System.out.println("\nInformación actualizada de los Productos");
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);

    }

}

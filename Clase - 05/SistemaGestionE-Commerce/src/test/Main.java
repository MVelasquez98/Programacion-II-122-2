/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import model.*;

/**
 *
 * @author matvelazquez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Matias", "matias@gmail.com", "Av. Siemprevivva 123");

        Producto producto = new Producto("Laptop", 1200.00, "P001");
        Producto producto2 = new Producto("Mouse", 25.00, "P002");

        Categoria categoriaElectro = new Categoria("Electronicos", "Dispositivos electronicos");
        categoriaElectro.agregarProducto(producto);
        categoriaElectro.agregarProducto(producto2);

        producto.aplicarDescuento(10);// descuento del 10%

        cliente.agregarProductosAlCarrito(producto, 1); // 1 Laptop
        cliente.agregarProductosAlCarrito(producto2, 2);// 2 Mouse

        Pedido pedido = cliente.realizarPedido("Calle Falsa 123");
        pedido.confirmar();
        
        System.out.println(pedido);

    }

}

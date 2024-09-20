/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author matvelazquez
 */
public class ControladorDePedido {

    public void confirmarPedido(Producto producto, int cantidad) {
        if (producto.hayStock(cantidad)) {
            System.out.println("Pedido confirmado");
        } else {
            System.out.println("Stock Insuficiente");
        }
    }

}

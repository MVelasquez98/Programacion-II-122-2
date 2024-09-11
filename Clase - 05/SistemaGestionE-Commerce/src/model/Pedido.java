/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author matvelazquez
 */
public class Pedido {

    private LocalDateTime fecha;
    private String estado; // Pendiente Enviado Cancelado Enum
    private String direccionEnvio;
    private CarritoDeCompras carrito;

    public Pedido(CarritoDeCompras carrito, String direccionEnvio) {
        this.fecha = LocalDateTime.now();
        this.estado = "Pendiente";
        this.direccionEnvio = direccionEnvio;
        this.carrito = carrito;
    }

    public void confirmar() {
        this.estado = "Enviado";
    }

    public void cancelar() {
        this.estado = "Cancelado";
    }

    @Override
    public String toString() {
        return "Pedido{" + "fecha=" + fecha + ", estado=" + estado + ", direccionEnvio=" + direccionEnvio + ", carrito=" + carrito + '}';
    }

}

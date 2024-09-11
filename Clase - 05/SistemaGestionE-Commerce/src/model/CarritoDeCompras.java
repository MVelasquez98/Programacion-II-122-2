/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author matvelazquez
 */
public class CarritoDeCompras {
    
    private ArrayList<Producto> productos;
    private Map<Producto, Integer> cantidades;

    @Override
    public String toString() {
        return "CarritoDeCompras{" + "productos=" + productos + ", cantidades=" + cantidades + '}';
    }

    public CarritoDeCompras() {
        this.productos = new ArrayList<Producto>();
        this.cantidades = new HashMap<>();
    }
    
    public void agregarProducto(Producto producto, int cantidad) {
           this.productos.add(producto);
           this.cantidades.put(producto, cantidad);// {Producto: leds, Cantidad: 1}
    }
    
    public void eliminarProducto(Producto producto){
        this.productos.remove(producto);
        this.cantidades.remove(producto);
    }
    
}

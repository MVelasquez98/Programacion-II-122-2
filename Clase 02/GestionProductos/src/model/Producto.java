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
Producto
- nombre: String
- codigo: String
- precio: double
- cantidad: int

+ vender(int cantidadVendida) : void
+ rebastecer(int cantidadRebastecida): void
 */
public class Producto {

    private String nombre;
    private String codigo;
    private double precio;
    private int cantidad;

    public Producto(String nombre, String codigo, double precio, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
        @Override
    public String toString() {
        return "Producto[" + "nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + ']';
    }

    /*
+ vender(int cantidadVendida) : void
    reduce la cantidad en stock según el número de unidades vendidas.
+ rebastecer(int cantidadRebastecida): void
     */
    public void vender(int cantidadVendida) {
        // Defensiva 
        if (cantidadVendida > 0 && cantidadVendida <= this.cantidad) {
            this.cantidad -= cantidadVendida;
        } else {
            System.out.println("No hay suficiente stock para vender " + cantidadVendida + " unidades de " + this.nombre + ".");
        }
    }

    // rebastecer(int cantidadRebastecida): void
    // aumenta la cantidad en stock según el número de unidades reabastecidas.
    public void rebastecer(int cantidadRebastecida) {
        if (cantidadRebastecida > 0) {
            this.cantidad += cantidadRebastecida;
        } else {
            System.out.println("No se puede rebastecer una cantidad negativa");
        }
    }

}

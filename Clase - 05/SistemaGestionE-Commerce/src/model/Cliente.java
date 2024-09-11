/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author matvelazquez
 */
public class Cliente {
    private String nombre;
    private String email;
    private String direccionEnvio;
    private CarritoDeCompras carrito;

    public Cliente(String nombre, String email, String direccionEnvio) {
        this.nombre = nombre;
        this.email = email;
        this.direccionEnvio = direccionEnvio;
        this.carrito = new CarritoDeCompras(); // releacion de composición
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }
    
    public void agregarProductosAlCarrito(Producto producto, int cantidad){
        carrito.agregarProducto(producto, cantidad);
    }
    
    // sobrecarga de metodos solucion
    
    public Pedido realizarPedido(String direccionDiferente){
        String direccionFinal = this.direccionEnvio; //direccion del cliente
        if (!direccionDiferente.isEmpty()){
            direccionFinal= direccionDiferente;
        }
        Pedido pedido = new Pedido(this.carrito, direccionFinal); // relación de agregación
        this.carrito = new CarritoDeCompras();// Resetear el carrito despues del pedido      
        return pedido;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author matvelazquez
 */
public class CuentaBancaria {

    private String numeroDeCuenta;
    private double saldo;
    private Cliente cliente;

    public CuentaBancaria(String numeroDeCuenta, Cliente cliente) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }
    
    public double consultarSaldo(){
      return this.saldo;
    }
    
}

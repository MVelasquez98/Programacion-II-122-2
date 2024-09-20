/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author matvelazquez
 */
public class Auto {
    private String modelo;
    private Motor motor;

    public Auto(String modelo, int potencia) {
        this.modelo = modelo;
        this.motor = new Motor(potencia); // Composición: el motor no existe sin el auto
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Auto{" + "modelo=" + modelo + ", motor=" + motor + '}';
    }   
    
}

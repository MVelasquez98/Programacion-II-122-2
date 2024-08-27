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

    // atributos (estado)
    private String nombre;
    private int anio;
    private String patente;
    private double velocidad;

    // Constructor
    public Auto(String nombre, int anio, String patente) {
        this.nombre = nombre;
        this.anio = anio;
        this.patente = patente;
        this.velocidad = 0.0; // Velocidad inicial
    }

    // Métodos (comportamiento)
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void acelerar(double incremento) {
        this.velocidad += incremento;
    }

    public void frenar(double decremento) {
        this.velocidad -= decremento;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
    }
}

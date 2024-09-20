/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author matvelazquez
 */
public class EmpleadoPorHora extends Empleado {

    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, String legajo, double salarioPorHora, int horasTrabajadas) {
        super(nombre, legajo);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", legajo=" + legajo + "salarioPorHora=" + salarioPorHora + "horasTrabajadas=" + horasTrabajadas + '}';
    }

    @Override
    public double calcularPago() {
        return this.salarioPorHora * this.horasTrabajadas;
    }
}
